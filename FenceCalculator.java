/**The user will be asked for the number of sides to a yard to fence. 
 * The program will then ask for the length of each of the sides. 
 * The program will then 
 * calculate and display the number of fence panels needed to complete the job.
 * Assume that panel is  6 feet wide.
 sum of all lengths / 6
 */ 

import java.util.Scanner;
import java.io.*;
public class FenceCalculator
{
    public static void main() throws Exception
    {
          // variable for array size here.
         int numberOfSides;
       
        Scanner s = new Scanner(System.in); //declare scanner
         FileWriter fw = new FileWriter("fencepanels.txt", true);   //Declare filewriter
        
        PrintWriter pw = new PrintWriter(fw);  //declare printwriter
       System.out.print("\f");
      
     
      System.out.println("What is the number of sides?");  //ask user the number of sides
      numberOfSides = s.nextInt();
 int lengthArray [] = new int [numberOfSides];  //assign array length
        // Use this integer variable as a loop index.
        int loopIndex =0; 

        // Use this variable to store the number input by user.
      int length;

 // Use these variables to store the total.
        int total; 
         

        // Write a loop to get numbers from user and assign to array.System.out.println(" Enter number of sides:"); numberOfSidesString  = s.nextLine();  numberOfSides = Integer.parseInt (numberOfSidesString);
        int sum = 0;
        
      for(loopIndex = 0; loopIndex < numberOfSides; loopIndex++)
          {
              System.out.print("What is the lengths of the side?");
         length = s.nextInt();
         
         
          lengthArray [loopIndex]  = length; //Assign value to array.
       sum = sum + lengthArray[loopIndex];   //get sum of the elements
        System.out.println("sum is " + sum);
        

          
}
        total = sum/6;  //culculations
        System.out.println("Number of fence panels needed is " + total);
            pw.println("Number of fence panels needed is " + total );    // Print total. 
           
System.out.println("\n");
        pw.close();
       System.exit(0);
    }//end of main
}



