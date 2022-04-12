//    @formatter:off
//
//    Sundae.java
//
//    Carlos Valdez
//    McDaniel College
//    CSC-3365-01  Intermediate Java Programming
//    Spring 2018
//
//    Sundae extends Ice Cream 
//    3/9/18
//
//    The Sundae class derives from the IceCream class. The cost of a Sundae  
//    is the cost of the IceCream plus the cost of the topping.
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

public class Sundae extends IceCream
   {
      private String nametopping;
      private int    costtopping;


      public Sundae (String nameIceCream, int costIcecream, String nametopping,
                     int costtopping)
         {
            super (nameIceCream, costIcecream);
            this.nametopping = nametopping;
            this.costtopping = costtopping;
         }// Sundae


      public String getNametopping ()
         {
            return nametopping;
         }// get name topping


      public int getCost ()
         {
            return super.getCost () + costtopping;
         }// get cost


   }// class Sundae