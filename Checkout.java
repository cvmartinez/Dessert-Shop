//    @formatter:off
//
//    Check.java
//
//    Carlos Valdez
//    McDaniel College
//    CSC-3365-01  Intermediate Java Programming
//    Spring 2018
//
//    Checkout list
//    3/9/18
//
//    Checkout list provides methods to enter dessert items into the cash 
//    register, clear the cash register, get the number of items, get the
//    total cost of the items (before tax), get the total tax for the items, 
//     and get a String representing a receipt for the dessert items.
//
//    ************ McDaniel Honor Code ***********************
//
//    I have neither given nor received unauthorized aid on
//    this piece of work, nor have I knowingly tolerated any
//    violation of the Honor Code.
//
//    ****************** History *****************************
//
//    original coding                  CVM      3/9/18
//    change implemented               CVM      3/10/18
//
//    @formatter:on

public class Checkout
   {
      public static int      numberOfItems = 0;
      private DessertItem [] itemArray;


      //Add new array
      public Checkout ()
         {
            this.itemArray = new DessertItem [100];
         }// array


      //Entering new Item
      public void enterItem (DessertItem newItem)
         {
            itemArray [numberOfItems] = newItem;
            numberOfItems++ ;
         }// new item

      // Clear cart
      public void clear ()
         {
            itemArray = new DessertItem [100];
            numberOfItems = 0;
         }// clear cart


      //Amount of items
      public int numberOfItems ()
         {
            return numberOfItems;
         }// number of items


      //Total cost of items
      public int totalCost ()
         { // without tax
            int cost = 0;
            for (int i = 0 ; i < numberOfItems ; i++ )
               {
                  cost += itemArray [i].getCost ();
               }
            return cost;
         }// total cost


      //Total of tax
      public int totalTax ()
         {
            return (int) Math.round (totalCost () * DessertShoppe.TAX_RATE /
                                     100);
         }// total Tax


      //Print out Receipt 
      public java.lang.String toString ()
         {
            String s = "";
            // Formating: set column widths
            String leftColumn = "%-" + DessertShoppe.MAX_ITEM_NAME_SIZE + "s";
            String rightColumn = "%" + DessertShoppe.COST_WIDTH + "s";
            int recieptWidth = DessertShoppe.MAX_ITEM_NAME_SIZE +
                               DessertShoppe.COST_WIDTH;

            // Name of store underlined by row of dashes
            String storeName = DessertShoppe.STORE_NAME;
            String dashes = "";
            // create string of dashes equal to length of store name
            for (int i = 0 ; i < storeName.length () ; i++ )
               {
                  dashes += "-";
               }// for
          
            String padding =
                           "%" + (recieptWidth - storeName.length ()) / 2 + "s";
            s += String.format (padding + "%s\n" + padding + "%s\n\n", "",
                                storeName, "", dashes);

            // Item names and prices
            for (int i = 0 ; i < numberOfItems ; i++ )
               {
                  String itemName = itemArray [i].getName ();
                  String itemCost =
                                  DessertShoppe.cents2dollarsAndCents 
                                  (itemArray [i].getCost ());
                 
                  //Candy array
                  if (itemArray [i] instanceof Candy)
                     {
                        double candyWeight =
                                           ((Candy) itemArray [i]).getWeight ();
                        String candyCost =
                                         DessertShoppe.cents2dollarsAndCents 
                                         ( ((Candy) itemArray [i]).getPpl ());
                        s += String.format ("%,.2f lbs. @ %s /lb.\n",
                                            candyWeight, candyCost);
                     }//if
                  
                  //Cookie array
                  if (itemArray [i] instanceof Cookie)
                     {
                        int amountc =
                                       ((Cookie) itemArray [i]).getAmountC ();
                        String cookieCost =
                                          DessertShoppe.cents2dollarsAndCents 
                                          ( ((Cookie) itemArray [i]).getPpd ());
                        s += String.format ("%d @ %s /dz.\n", amountc,
                                            cookieCost);
                     }//if
                  
                  //Sundae array
                  if (itemArray [i] instanceof Sundae)
                     {
                        String nametopping =
                                     ((Sundae) itemArray [i]).getNametopping ();
                        s += String.format ("%s Sundae with\n", nametopping);
                     }//if
                  s += String.format (leftColumn + rightColumn + "\n", itemName,
                                      itemCost);
               }// for

            // Tax
            String tax = DessertShoppe.cents2dollarsAndCents (totalTax ());
            s += String.format (leftColumn + rightColumn + "\n", "Tax", tax);

            // Total
            String total = DessertShoppe.cents2dollarsAndCents (totalTax () +
                                                                totalCost ());
            s += String.format (leftColumn + rightColumn + "\n", "Total Cost",
                                total);

            return s;
         } // to String
   }// class Checkout