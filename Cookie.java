//    @formatter:off
//
//    Cookie.java
//
//    Carlos Valdez
//    McDaniel College
//    CSC-3365-01  Intermediate Java Programming
//    Spring 2018
//
//    Cookie extends dessertitem 
//    3/9/18
//
//    The Cookie class derives from the DessertItem class.  
//    A Cookie item has a number and a price per dozen to figure out its cost.  
//    Round the cost the nearest cent.  
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

public class Cookie extends DessertItem
   {
      private int amountc;
      private int ppd;


      public Cookie (String name, int amountc, int ppd)
         {
            super (name);
            this.amountc = amountc;
            this.ppd = ppd;
         }


      public int getAmountC ()
         {
            return amountc;
         }//GetAmoutC


      public int getPpd ()
         {
            return ppd;
         }//getPpd


      public int getCost ()
         {
            int cost = (int) Math.round (amountc * ppd / 12);
            return cost;
         }//getCost

   }//class Cookie