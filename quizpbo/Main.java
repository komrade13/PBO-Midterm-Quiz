/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizpbo;
import java.util.Scanner;
        
/**
 *
 * @author alfaa
 */
public class Main extends Passing {

    /**
     * @param args the command line arguments
     */
    
    private Main(){
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Passing pawn = new Passing();
        /*Balok callB = new Balok();
        Tabung callT = new Tabung();
        Lingkaran callL = new Lingkaran();
        PersegiPanjang callPP = new PersegiPanjang();*/
        
        System.out.println("=======================================");
        System.out.println("REGISTRATION FORM PT.MICROHORSE WINDOWS");
        System.out.println("=======================================");
        System.out.println("1. Android Development");
        System.out.println("2. Web Development");
        System.out.println("3. Exit");
        System.out.print("Option : ");
        int menu = scan.nextInt();
        
	    switch(menu)
	    {
	    case 1:
            {
                pawn.entry1();
            }

	    case 2:  
                  pawn.entry2();
                  break;
                  
            case 3:  System.out.println("Thank you for using this program!");
		  break;
                  
	   default:  System.out.println("Please choose a valid choice!");
        
    }
  }
}
