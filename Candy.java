//    @formatter:off
//
//    Candy.java
//
//    Carlos Valdez
//    McDaniel College
//    CSC-3365-01  Intermediate Java Programming
//    Spring 2018
//
//    Candy extends dessertitem 
//    3/9/18
//
//    The Candy class derives from the DessertItem class.
//    A Candy item has a weight and a price per pound to figure out its cost..  
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

public class Candy extends DessertItem
   {
      private double weight;
      private int    ppl;


      public Candy (String name, double weight, int ppl)
         {
            super (name);
            this.weight = weight;
            this.ppl = ppl;
         }


      public double getWeight ()
         {
            return weight;
         }// get weight


      public int getPpl ()
         {
            return ppl;
         }// get price per pound


      public int getCost ()
         {
            int cost = (int) Math.round (ppl * weight);
            return cost;
         }//get Cost

   }// class Candy
