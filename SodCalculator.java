/**The user will be asked for the yard length and width 
**(assume a rectangular yard). The program will then calculate 
**and display the number of sod squares needed to cover the yard. 
**Assume that sod squares are two-by-two feet.
**/
import java.util.Scanner;
public class SodCalculator {
    public static void main()
    { 
        int size=2;
   
    double []myArray;   //array to store width and length
    myArray = input();
    double total;  //total sod squares needed
    
    total = calculate(myArray);
    output(total);
}
    
         // Get input and convert to correct data type
    public static double []input()
         {   
             Scanner s = new Scanner(System.in);
    double [] myArray = new double [2];   //myArray contains width and length
    System.out.println("Enter the width: ");   //user width input
    myArray[0] = s.nextDouble();
    System.out.println("Enter the length: ");  //user length input
    myArray[1] = s.nextDouble();
    
    
         return myArray;
    }
    /** myArray contains length and width
    //calculation (length * width) / 4 
    */
    public static double calculate (double [] myArray ) 
    {
       
    Scanner s = new Scanner(System.in);
     double total;    //total sod squares needed
     double product=1;             //variable to store multiplication
      for (int i = 0; i < 2; i++)
     product*= myArray[i];
    total = product/4;  //total sod squares needed
    
    return total;
}
/** output method displays the result
 * */
 public static void output(double total)  
    {
        
    System.out.println(" The number of sod squares needed is " + total);//output of total sod squares needed
    }   
    }





