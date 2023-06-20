/**The user will be asked for the tile size. 
 * 
 The user will then be asked for the length and width of the patio to 
 *be paved. The program will then calculate and display the number of 
 *pavers needed to create the patio. Assume that there are 3 paver sizes, 
 *0.75' x 0.5', 1' x 0.5' and 1' x 2' (these measurements are in feet = ').  
*/
import java.io.*;

public class PatioPaverCalculator 
{
    public static void main() throws Exception
    {
        FileReader fr = new FileReader("paverinfo.txt"); //declare a file reader
        BufferedReader br = new BufferedReader(fr);            //declare a bufferedreader to read the file
        String line; //to hold user choise
        String name;
        double width;
        double length;
        int selectedPaver;
        double paversNeeded;
        double widthNeeded;
        double lengthNeeded;
        double[][] parevSize = {{0.75, 0.5},{1.0,0.5},{2.0,1.0},{2.0,2.0}};
        
        //dispaly info for user
        System.out.print("\f");        //clear console
        System.out.println("\tPatio Paver Calculator\n\n");    // t\tabs\n new line
        System.out.println("This are the patios jobs that have been ordered: \n");
        System.out.println("The paverSizes available are: \n"+
                            "t\1)"+ parevSize[0][0]+" x " + parevSize[0][1] +"\n"+
                            "t\2)"+ parevSize[1][0]+"x " + parevSize[1][1] +"\n"+
                            "t\3)"+ parevSize[2][0]+ "x " + parevSize[2][1] +"\n"+
                            "t\4)"+ parevSize[3][0]+ "x " + parevSize[3][1] +"\n");
                            
        //read from file
        while( (line = br.readLine())!= null){
            name = line;                                            //save the name
            line = br.readLine();               //read the file
            selectedPaver = Integer.parseInt(line);             //save the tile size
            line = br.readLine();                                   //save  file
            length = Double.parseDouble(line);                  //save the length
            line = br.readLine();                               //save the file
            width = Double.parseDouble(line);               //save the width
            
            //calculate pavers needed
             lengthNeeded = length / parevSize[selectedPaver-1][0];
             //need if atatement if I need extra paver
        widthNeeded = width / parevSize[selectedPaver-1][1];
           paversNeeded = lengthNeeded * widthNeeded;
        System.out.println("The "+name+"patio, with a length of "+ length + "and a width" + width +
        "/nusing pavers " + parevSize[selectedPaver-1][0] +"x" +  parevSize[selectedPaver-1][1] + " will need" + paversNeeded 
        + "to complete the job\n");
        }
    }
}   

