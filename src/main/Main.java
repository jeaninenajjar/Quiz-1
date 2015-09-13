package main;

import java.util.Scanner;
public class Main {
	  @SuppressWarnings("resource")
   //Jeanine Najjar    Lab section 21
		public static void main(String[] args) {
	   
		Scanner input = new Scanner(System.in);
	    
		 System.out.print("Enter number of passing attempts ") ;
	     double ATT = input.nextDouble();
	     System.out.print("Enter number of completions ") ;
	     double COMP = input.nextDouble();
	     System.out.print("Enter number of passing yards ") ;
	     double YDS = input.nextDouble();
	     System.out.print("Enter number of touchdown passes ") ;
	     double TD = input.nextDouble();
	     System.out.print("Enter number of interceptions ") ;
	     double INT = input.nextDouble();

	     
	   /* ATT = Number of passing attempts
	     COMP = Number of completions
	     YDS = Passing yards
	     TD = Touchdown passes
	     INT = Interceptions  */
	     
	     
	     double a;
	     a = (COMP/ATT - .3) * 5;
	     double b;
	     b = (YDS/ATT - 3) * .25;
	     double c;
	     c = (TD / ATT) * 20;
	     double d;
	     d =  2.375 - (INT/ATT * 25) ;
	     double passerRating;
	     passerRating = ((a + b + c + d) / 6) * 100 ;
	     
      	System.out.println(passerRating);

	
		} }


