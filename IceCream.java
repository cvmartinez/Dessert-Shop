//    @formatter:off
//
//    IceCream.java
//
//    Carlos Valdez
//    McDaniel College
//    CSC-3365-01  Intermediate Java Programming
//    Spring 2018
//
//    IceCream extends dessertitem 
//    3/9/18
//
//    The IceCream class derives from the DessertItem class.   
//    An IceCream item simply has a cost. 
//    
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

public class IceCream extends DessertItem
   {
      private int cost;


      public IceCream (String name, int cost)
         {
            super (name);
            this.cost = cost;
         }//Ice Cream 


      public int getCost ()
         {
            return cost;
         }//getCost

   }// class IceCream
