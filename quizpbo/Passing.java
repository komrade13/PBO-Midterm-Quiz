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
public class Passing implements Android, Web {
    Scanner scan = new Scanner(System.in);
    
    public void entry1() {
                  System.out.println("=======================");
                  System.out.print("Input Student Number : ");
                  String nim = scan.nextLine();
                  System.out.print("Input Name : ");
                  String name = scan.nextLine();
                  System.out.print("Input Writing Score : ");
                  double wrisco = scan.nextDouble();
                  System.out.print("Input Coding Score : ");
                  double codsco = scan.nextDouble();
                  System.out.print("Input Interview Score : ");
                  double intsco = scan.nextDouble();
                  
                  System.out.println("=======================================");
                  System.out.println("Android - MAIN MENU");
                  System.out.println("=======================================");
                  System.out.println("1. Edit Scores");
                  System.out.println("2. Check Qualification");
                  System.out.println("3. Exit");
                  System.out.print("Option : ");
                  int menu2 = scan.nextInt();    
                  
                  switch(menu2) {
                        case 1:
                              System.out.print("Input New Writing Score : ");
                                wrisco = scan.nextDouble();
                                System.out.print("Input New Coding Score : ");
                                codsco = scan.nextDouble();
                                System.out.print("Input New Interview Score : ");
                                intsco = scan.nextDouble();
                                this.entry1();
                              break;

                        case 2:  
                                      double finscore;
        
                                finscore = (0.2 * wrisco) + (0.5 * codsco) + (0.3 *intsco);

                                if (finscore >= 85) {
                                    String verd = "SUCCESS!";
                                    String verdmsg = "Congratulation " + name + "! You are accepted to the Android subdivision.";

                                    System.out.println("Final Score : " + finscore);
                                    System.out.println("Verdict : " + verd);
                                    System.out.println(verdmsg);
                                    this.entry1();
                                }

                                else {
                                    String verd = "FAILED!";
                                    String verdmsg = "Apologies, " + name + ". You are not accepted to the Android subdivision.";

                                    System.out.println("Final Score : " + finscore);
                                    System.out.println("Verdict : " + verd);
                                    System.out.println(verdmsg);
                                    this.entry1();
                                }
                              break;

                        case 3:  System.out.println("Thank you for using this program!");
                              System.exit(menu2);
                              break;

                       default:  System.out.println("Please choose a valid choice!");
                              break;
                            }
  }
    
    public void entry2() {
                  System.out.println("=======================");
                  System.out.print("Input Student Number : ");
                  String nim = scan.nextLine();
                  System.out.print("Input Name : ");
                  String name = scan.nextLine();
                  System.out.print("Input Writing Score : ");
                  double wrisco = scan.nextDouble();
                  System.out.print("Input Coding Score : ");
                  double codsco = scan.nextDouble();
                  System.out.print("Input Interview Score : ");
                  double intsco = scan.nextDouble();
                  
                  System.out.println("=======================================");
                  System.out.println("Android - MAIN MENU");
                  System.out.println("=======================================");
                  System.out.println("1. Edit Scores");
                  System.out.println("2. Check Qualification");
                  System.out.println("3. Exit");
                  System.out.print("Option : ");
                  int menu2 = scan.nextInt();    
                  
                  switch(menu2) {
                        case 1:
                              System.out.print("Input New Writing Score : ");
                                wrisco = scan.nextDouble();
                                System.out.print("Input New Coding Score : ");
                                codsco = scan.nextDouble();
                                System.out.print("Input New Interview Score : ");
                                intsco = scan.nextDouble();
                                this.entry2();
                              break;

                        case 2:  
                                      double finscore;
        
                                finscore = (0.4 * wrisco) + (0.35 * codsco) + (0.25 *intsco);

                                if (finscore >= 85) {
                                    String verd = "SUCCESS!";
                                    String verdmsg = "Congratulation " + name + "! You are accepted to the Android subdivision.";

                                    System.out.println("Final Score : " + finscore);
                                    System.out.println("Verdict : " + verd);
                                    System.out.println(verdmsg);
                                    this.entry2();
                                }

                                else {
                                    String verd = "FAILED!";
                                    String verdmsg = "Apologies, " + name + ". You are not accepted to the Android subdivision.";

                                    System.out.println("Final Score : " + finscore);
                                    System.out.println("Verdict : " + verd);
                                    System.out.println(verdmsg);
                                    this.entry2();
                                }
                              break;

                        case 3:  System.out.println("Thank you for using this program!");
                              System.exit(menu2);
                              break;

                       default:  System.out.println("Please choose a valid choice!");
                              break;
                            }
  }
    
    @Override
    public void checkAnd() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void checkWeb() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
