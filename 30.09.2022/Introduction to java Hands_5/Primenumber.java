/* A java program for printing all the prime number from 1 to 150  */
package assignments;

public class Primenumber {

	public static void main (String[] args)
	   {		
	       int i =0;
	       int num =0;
	       //Empty String
	       String  primeNumbers = "";

	       for (i = 1; i <= 150; i++)    //running loop for chechecking till 150     
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     } }
		  if (counter ==2)
		  {
		     //Appended the Prime number to the String
		     primeNumbers = primeNumbers + i + " ";
		  }	 }	
	       System.out.println("Prime numbers from 1 to 150 are :");
	       System.out.println(primeNumbers);
	   }}


