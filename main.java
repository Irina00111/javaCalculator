import java.util.*;
/**The Main Menu will display four choices: Fence Calculator, Sod Calculator, 
 * Patio Pavers Calculator and Exit. 
 * It will accept the user selection hoice and launch the appropriate program
 * or exit. 
 *After completing the chosen program, the user will be presented with the 
 *main menu and allowed to select a new program or exit.
 */
public class main 
{  
    public static void main(String args[]) throws Exception {
     Scanner s = new Scanner(System.in);// declare scanner
     FenceCalculator f = new FenceCalculator();   //declare a fence object
     SodCalculator sod = new SodCalculator();         //declare a sod object
     PatioPaverCalculator p = new PatioPaverCalculator();     //declare a paver object
     String selection; // a string to hold user choice
     
    System.out.print("\f");  //clear console
    do{      
    displayMenu();
    selection = s.nextLine();
        switch (selection) 
    {
        case "1":
        f.main () ;
        break;
        case "2":
        sod.main();
        break;
        case "3":
        p.main();
        break;
        case "4":
            System.out.println ("You selected Exit");
        break;
        default:
        System.out.println ( "Invalid selection" );
        
        }//end of switch
    }while (!selection.equals ("4"));//end of loop
 
}// end of main
    public static void displayMenu() //end of menu class
    {
    System.out.println("\n\n\tMenu\n");
    System.out.println("1. Fence"); 
    System.out.println("2. Sod"); 
    System.out.println("3. Patio Paver"); 
    System.out.println("4. Exit\n"); 
    
    System.out.print("Please make a selection: ");
    }
}



