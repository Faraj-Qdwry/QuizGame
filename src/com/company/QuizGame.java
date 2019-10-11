package com.company;

import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class QuizGame {

    public static void clear() {
        final String operatingSystem = System.getProperty("os.name");
        try {
            if (operatingSystem.contains("Windows")) {
                Runtime.getRuntime().exec("cls");
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (IOException e) {
        }
    }

    public static void main(String[] args) {

        int countr, r, r1, count, i, n;
        float score;
        char choice;
        String playername = "null";
        Scanner scanner = new Scanner(System.in);

        mainhome:
        while (true) {
            clear();
            System.out.printf("\t\t\tC PROGRAM QUIZ GAME\n");
            System.out.printf("\n\t\t________________________________________");

            System.out.printf("\n\t\t\t   WELCOME ");
            System.out.printf("\n\t\t\t      to ");
            System.out.printf("\n\t\t\t   THE GAME ");
            System.out.printf("\n\t\t________________________________________");
            System.out.printf("\n\t\t________________________________________");
            System.out.printf("\n\t\t   BECOME A MILLIONAIRE!!!!!!!!!!!    ");
            System.out.printf("\n\t\t________________________________________");
            System.out.printf("\n\t\t________________________________________");
            System.out.printf("\n\t\t > Press S to start the game");
            System.out.printf("\n\t\t > Press V to view the highest score  ");
            System.out.printf("\n\t\t > Press R to reset score");
            System.out.printf("\n\t\t > press H for help            ");
            System.out.printf("\n\t\t > press Q to quit             ");
            System.out.printf("\n\t\t________________________________________\n\n");

            choice = Character.toUpperCase(scanner.next().charAt(0));

            if (choice == 'V') {
                show_record();
                break mainhome;
            } else if (choice == 'H') {
                help();
                scanner.next();
                break mainhome;
            } else if (choice == 'R') {
                reset_score();
                scanner.next();
                break mainhome;
            } else if (choice == 'Q') {
                System.exit(1);
            } else if (choice == 'S') {
                clear();

                System.out.printf("\n\n\n\n\n\n\n\n\n\n\t\t\tResister your name:");
                playername = scanner.next();

                clear();
                System.out.printf("\n ------------------  Welcome %s to C Program Quiz Game --------------------------", playername);
                System.out.printf("\n\n Here are some tips you might wanna know before playing:");
                System.out.printf("\n -------------------------------------------------------------------------");
                System.out.printf("\n >> There are 2 rounds in this Quiz Game,WARMUP ROUND & CHALLANGE ROUND");
                System.out.printf("\n >> In warmup round you will be asked a total of 3 questions to test your");
                System.out.printf("\n    general knowledge. You are eligible to play the game if you give atleast 2");
                System.out.printf("\n    right answers, otherwise you can't proceed further to the Challenge Round.");
                System.out.printf("\n >> Your game starts with CHALLANGE ROUND. In this round you will be asked a");
                System.out.printf("\n    total of 10 questions. Each right answer will be awarded $100,000!");
                System.out.printf("\n    By this way you can win upto ONE MILLION cash prize!!!!!..........");
                System.out.printf("\n >> You will be given 4 options and you have to press A, B ,C or D for the");
                System.out.printf("\n    right option.");
                System.out.printf("\n >> You will be asked questions continuously, till right answers are given");
                System.out.printf("\n >> No negative marking for wrong answers!");
                System.out.printf("\n\n\t!!!!!!!!!!!!! ALL THE BEST !!!!!!!!!!!!!");
                System.out.printf("\n\n\n Press Y  to start the game!\n");
                System.out.printf("\n Press any other key to return to the main menu!");

                if (Character.toUpperCase(scanner.next().charAt(0)) == 'Y') {
                    //break home;
                } else {
                    clear();
                    break mainhome;
                }
            }


            clear();
            count = 0;

            home:
            for (i = 1; i <= 3; i++) {
                clear();
                r1 = i;

                switch (r1) {
                    case 1:
                        System.out.printf("\n\nWhich of the following is a Palindrome number?");
                        System.out.printf("\n\nA.42042\t\tB.101010\n\nC.23232\t\tD.01234");
                        if (Character.toUpperCase(scanner.next().charAt(0)) == 'C') {
                            System.out.printf("\n\nCorrect!!!");
                            count++;
                            scanner.next();
                            break;
                        } else {
                            System.out.printf("\n\nWrong!!! The correct answer is C.23232");
                            scanner.next();
                            break;
                        }

                    case 2:
                        System.out.printf("\n\n\nThe country with the highest environmental performance index is...");
                        System.out.printf("\n\nA.France\t\tB.Denmark\n\nC.Switzerland\t\tD.Finland");
                        if (Character.toUpperCase(scanner.next().charAt(0)) == 'C') {
                            System.out.printf("\n\nCorrect!!!");
                            count++;
                            scanner.next();
                            break;
                        } else {
                            System.out.printf("\n\nWrong!!! The correct answer is C.Switzerland");
                            scanner.next();
                            break;
                        }

                    case 3:
                        System.out.printf("\n\n\nWhich animal laughs like human being?");
                        System.out.printf("\n\nA.Polar Bear\t\tB.Hyena\n\nC.Donkey\t\tD.Chimpanzee");
                        if (Character.toUpperCase(scanner.next().charAt(0)) == 'B') {
                            System.out.printf("\n\nCorrect!!!");
                            count++;
                            scanner.next();
                            break;
                        } else {
                            System.out.printf("\n\nWrong!!! The correct answer is B.Hyena");
                            scanner.next();
                            break;
                        }

                    case 4:
                        System.out.printf("\n\n\nWho was awarded the youngest player award in Fifa World Cup 2006?");
                        System.out.printf("\n\nA.Wayne Rooney\t\tB.Lucas Podolski\n\nC.Lionel Messi\t\tD.Christiano Ronaldo");
                        if (Character.toUpperCase(scanner.next().charAt(0)) == 'B') {
                            System.out.printf("\n\nCorrect!!!");
                            count++;
                            scanner.next();
                            break;
                        } else {
                            System.out.printf("\n\nWrong!!! The correct answer is B.Lucas Podolski");
                            scanner.next();
                            break;
                        }

                    case 5:
                        System.out.printf("\n\n\nWhich is the third highest mountain in the world?");
                        System.out.printf("\n\nA.Mt. K2\t\tB.Mt. Kanchanjungha\n\nC.Mt. Makalu\t\tD.Mt. Kilimanjaro");
                        if (Character.toUpperCase(scanner.next().charAt(0)) == 'B') {
                            System.out.printf("\n\nCorrect!!!");
                            count++;
                            scanner.next();
                            break;
                        } else {
                            System.out.printf("\n\nWrong!!! The correct answer is B.Mt. Kanchanjungha");
                            scanner.next();
                            break;
                        }

                    case 6:
                        System.out.printf("\n\n\nWhat is the group of frogs known as?");
                        System.out.printf("\n\nA.A traffic\t\tB.A toddler\n\nC.A police\t\tD.An Army");
                        if (Character.toUpperCase(scanner.next().charAt(0)) == 'D') {
                            System.out.printf("\n\nCorrect!!!");
                            count++;
                            scanner.next();
                            break;
                        } else {
                            System.out.printf("\n\nWrong!!! The correct answer is D.An Army");
                            scanner.next();
                            break;
                        }
                }

                if (count >= 2) {
                    //break test;
                } else {
                    clear();
                    System.out.printf("\n\nSORRY YOU ARE NOT ELIGIBLE TO PLAY THIS GAME, BETTER LUCK NEXT TIME");
                    scanner.next();
                    break mainhome;
                }

                test:
                clear();
                System.out.printf("\n\n\t*** CONGRATULATION %s you are eligible to play the Game ***", playername);
                System.out.printf("\n\n\n\n\t!Press any key to Start the Game!");
                if (Character.toUpperCase(scanner.next().charAt(0)) == 'p') {
                    //break game;
                }

                game:
                countr = 0;
                for (i = 1; i <= 10; i++) {
                    clear();
                    r = i;

                    switch (r) {
                        case 1:
                            System.out.printf("\n\nWhat is the National Game of England?");
                            System.out.printf("\n\nA.Football\t\tB.Basketball\n\nC.Cricket\t\tD.Baseball");
                            if (Character.toUpperCase(scanner.next().charAt(0)) == 'C') {
                                System.out.printf("\n\nCorrect!!!");
                                countr++;
                                scanner.next();
                                break;
                            } else {
                                System.out.printf("\n\nWrong!!! The correct answer is C.Cricket");
                                scanner.next();
                                //break score;
                                break;
                            }

                        case 2:
                            System.out.printf("\n\n\nStudy of Earthquake is called............,");
                            System.out.printf("\n\nA.Seismology\t\tB.Cosmology\n\nC.Orology\t\tD.Etimology");
                            if (Character.toUpperCase(scanner.next().charAt(0)) == 'A') {
                                System.out.printf("\n\nCorrect!!!");
                                countr++;
                                scanner.next();
                                break;
                            } else {
                                System.out.printf("\n\nWrong!!! The correct answer is A.Seismology");
                                scanner.next();
                                //break score;
                                break;
                            }

                        case 3:
                            System.out.printf("\n\n\nAmong the top 10 highest peaks in the world, how many lie in Nepal? ");
                            System.out.printf("\n\nA.6\t\tB.7\n\nC.8\t\tD.9");
                            if (Character.toUpperCase(scanner.next().charAt(0)) == 'C') {
                                System.out.printf("\n\nCorrect!!!");
                                countr++;
                                scanner.next();
                                break;
                            } else {
                                System.out.printf("\n\nWrong!!! The correct answer is C.8");
                                scanner.next();
                                //break score;
                                break;
                            }

                        case 4:
                            System.out.printf("\n\n\nThe Laws of Electromagnetic Induction were given by?");
                            System.out.printf("\n\nA.Faraday\t\tB.Tesla\n\nC.Maxwell\t\tD.Coulomb");
                            if (Character.toUpperCase(scanner.next().charAt(0)) == 'A') {
                                System.out.printf("\n\nCorrect!!!");
                                countr++;
                                scanner.next();
                                break;
                            } else {
                                System.out.printf("\n\nWrong!!! The correct answer is A.Faraday");
                                scanner.next();
                                //break score;
                                break;
                            }

                        case 5:
                            System.out.printf("\n\n\nIn what unit is electric power measured?");
                            System.out.printf("\n\nA.Coulomb\t\tB.Watt\n\nC.Power\t\tD.Units");
                            if (Character.toUpperCase(scanner.next().charAt(0)) == 'B') {
                                System.out.printf("\n\nCorrect!!!");
                                countr++;
                                scanner.next();
                                break;
                            } else {
                                System.out.printf("\n\nWrong!!! The correct answer is B.Power");
                                scanner.next();
                                //break score;
                                break;
                            }

                        case 6:
                            System.out.printf("\n\n\nWhich element is found in Vitamin B12?");
                            System.out.printf("\n\nA.Zinc\t\tB.Cobalt\n\nC.Calcium\t\tD.Iron");
                            if (Character.toUpperCase(scanner.next().charAt(0)) == 'B') {
                                System.out.printf("\n\nCorrect!!!");
                                countr++;
                                scanner.next();
                                break;
                            } else {
                                System.out.printf("\n\nWrong!!! The correct answer is B.Cobalt");
                                //break score;
                                scanner.next();
                                break;
                            }

                        case 7:
                            System.out.printf("\n\n\nWhat is the National Name of Japan?");
                            System.out.printf("\n\nA.Polska\t\tB.Hellas\n\nC.Drukyul\t\tD.Nippon");
                            if (Character.toUpperCase(scanner.next().charAt(0)) == 'D') {
                                System.out.printf("\n\nCorrect!!!");
                                countr++;
                                scanner.next();
                                break;
                            } else {
                                System.out.printf("\n\nWrong!!! The correct answer is D.Nippon");
                                scanner.next();
                                //break score;
                                break;
                            }

                        case 8:
                            System.out.printf("\n\n\nHow many times a piece of paper can be folded at the most?");
                            System.out.printf("\n\nA.6\t\tB.7\n\nC.8\t\tD.Depends on the size of paper");
                            if (Character.toUpperCase(scanner.next().charAt(0)) == 'B') {
                                System.out.printf("\n\nCorrect!!!");
                                countr++;
                                scanner.next();
                                break;
                            } else {
                                System.out.printf("\n\nWrong!!! The correct answer is B.7");
                                scanner.next();
                                //break score;
                                break;
                            }

                        case 9:
                            System.out.printf("\n\n\nWhat is the capital of Denmark?");
                            System.out.printf("\n\nA.Copenhagen\t\tB.Helsinki\n\nC.Ajax\t\tD.Galatasaray");
                            if (Character.toUpperCase(scanner.next().charAt(0)) == 'A') {
                                System.out.printf("\n\nCorrect!!!");
                                countr++;
                                scanner.next();
                                break;
                            } else {
                                System.out.printf("\n\nWrong!!! The correct answer is A.Copenhagen");
                                scanner.next();
                                //break score;
                                break;
                            }

                        case 10:
                            System.out.printf("\n\n\nWhich is the longest River in the world?");
                            System.out.printf("\n\nA.Nile\t\tB.Koshi\n\nC.Ganga\t\tD.Amazon");
                            if (Character.toUpperCase(scanner.next().charAt(0)) == 'A') {
                                System.out.printf("\n\nCorrect!!!");
                                countr++;
                                scanner.next();
                                break;
                            } else {
                                System.out.printf("\n\nWrong!!! The correct answer is A.Nile");
                                scanner.next();
                                break;
                                //break score;
                            }

                        case 11:
                            System.out.printf("\n\n\nWhat is the color of the Black Box in aeroplanes?");
                            System.out.printf("\n\nA.White\t\tB.Black\n\nC.Orange\t\tD.Red");
                            if (Character.toUpperCase(scanner.next().charAt(0)) == 'C') {
                                System.out.printf("\n\nCorrect!!!");
                                countr++;
                                scanner.next();
                                break;
                            } else {
                                System.out.printf("\n\nWrong!!! The correct answer is C.Orange");
                                scanner.next();
                                break;
                                //break score;
                            }

                        case 12:
                            System.out.printf("\n\n\nWhich city is known at 'The City of Seven Hills'?");
                            System.out.printf("\n\nA.Rome\t\tB.Vactican City\n\nC.Madrid\t\tD.Berlin");
                            if (Character.toUpperCase(scanner.next().charAt(0)) == 'A') {
                                System.out.printf("\n\nCorrect!!!");
                                countr++;
                                scanner.next();
                                break;
                            } else {
                                System.out.printf("\n\nWrong!!! The correct answer is A.Rome");
                                scanner.next();
                                break;
                                //break score;
                            }

                        case 13:
                            System.out.printf("\n\n\nName the country where there no mosquitoes are found?");
                            System.out.printf("\n\nA.Japan\t\tB.Italy\n\nC.Argentina\t\tD.France");
                            if (Character.toUpperCase(scanner.next().charAt(0)) == 'D') {
                                System.out.printf("\n\nCorrect!!!");
                                countr++;
                                scanner.next();
                                break;
                            } else {
                                System.out.printf("\n\nWrong!!! The correct answer is D.France");
                                scanner.next();
                                break;
                                //break score;
                            }

                        case 14:
                            System.out.printf("\n\n\nWho is the author of 'Pulpasa Cafe'?");
                            System.out.printf("\n\nA.Narayan Wagle\t\tB.Lal Gopal Subedi\n\nC.B.P. Koirala\t\tD.Khagendra Sangraula");
                            if (Character.toUpperCase(scanner.next().charAt(0)) == 'A') {
                                System.out.printf("\n\nCorrect!!!");
                                countr++;
                                scanner.next();
                                break;
                            } else {
                                System.out.printf("\n\nWrong!!! The correct answer is A.Narayan Wagle");
                                scanner.next();
                                break;
                                //break score;
                            }

                        case 15:
                            System.out.printf("\n\n\nWhich Blood Group is known as the Universal Recipient?");
                            System.out.printf("\n\nA.A\t\tB.AB\n\nC.B\t\tD.O");
                            if (Character.toUpperCase(scanner.next().charAt(0)) == 'B') {
                                System.out.printf("\n\nCorrect!!!");
                                countr++;
                                scanner.next();
                                break;
                            } else {
                                System.out.printf("\n\nWrong!!! The correct answer is B.AB");
                                scanner.next();
                                //break score;
                                break;
                            }

                        case 16:
                            System.out.printf("\n\n\nWhat is the unit of measurement of distance between Stars?");
                            System.out.printf("\n\nA.Light Year\t\tB.Coulomb\n\nC.Nautical Mile\t\tD.Kilometer");
                            if (Character.toUpperCase(scanner.next().charAt(0)) == 'A') {
                                System.out.printf("\n\nCorrect!!!");
                                countr++;
                                scanner.next();
                                break;
                            } else {
                                System.out.printf("\n\nWrong!!! The correct answer is A.Light Year");
                                scanner.next();
                                //break score;
                                break;
                            }


                        case 17:
                            System.out.printf("\n\n\nThe country famous for Samba Dance is........");
                            System.out.printf("\n\nA.Brazil\t\tB.Venezuela\n\nC.Nigeria\t\tD.Bolivia");
                            if (Character.toUpperCase(scanner.next().charAt(0)) == 'A') {
                                System.out.printf("\n\nCorrect!!!");
                                countr++;
                                scanner.next();
                                break;
                            } else {
                                System.out.printf("\n\nWrong!!! The correct answer is A.Brazil");
                                scanner.next();
                                //break score;
                                break;
                            }

                        case 18:
                            System.out.printf("\n\n\nWind speed is measure by__________?");
                            System.out.printf("\n\nA.Lysimeter\t\tB.Air vane\n\nC.Hydrometer\t\tD.Anemometer\n\n");
                            if (Character.toUpperCase(scanner.next().charAt(0)) == 'D') {
                                System.out.printf("\n\nCorrect!!!");
                                countr++;
                                scanner.next();
                                break;
                            } else {
                                System.out.printf("\n\nWrong!!! The correct answer is D.Anemometer");
                                scanner.next();
                                //break score;
                                break;
                            }

                        case 19:
                            System.out.printf("\n\n\nWhich city in the world is popularly known as The City of Temple?");
                            System.out.printf("\n\nA.Delhi\tB.Bhaktapur\n\nC.Kathmandu\tD.Agra\n\n");
                            if (Character.toUpperCase(scanner.next().charAt(0)) == 'C') {
                                System.out.printf("\n\nCorrect!!!");
                                countr++;
                                scanner.next();
                                break;
                            } else {
                                System.out.printf("\n\nWrong!!! The correct answer is C.Kathmandu");
                                scanner.next();
                                //break score;
                                break;
                            }

                        case 20:
                            System.out.printf("\n\n\nWhich hardware was used in the First Generation Computer?");
                            System.out.printf("\n\nA.Transistor\t\tB.Valves\n\nC.I.C\t\tD.S.S.I");
                            if (Character.toUpperCase(scanner.next().charAt(0)) == 'B') {
                                System.out.printf("\n\nCorrect!!!");
                                countr++;
                                scanner.next();
                                break;
                            } else {
                                System.out.printf("\n\nWrong!!! The correct answer is B.Valves");
                                scanner.next();
                                //break score;
                                break;
                            }

                        case 21:
                            System.out.printf("\n\n\nOzone plate is being destroyed regularly because of____ ?");
                            System.out.printf("\n\nA.L.P.G\t\tB.Nitrogen\n\nC.Methane\t\tD. C.F.C");
                            if (Character.toUpperCase(scanner.next().charAt(0)) == 'D') {
                                System.out.printf("\n\nCorrect!!!");
                                countr++;
                                scanner.next();
                                break;
                            } else {
                                System.out.printf("\n\nWrong!!! The correct answer is D. C.F.C");
                                scanner.next();
                                //break score;
                                break;
                            }

                        case 22:
                            System.out.printf("\n\n\nWho won the Women's Australian Open Tennis in 2007?");
                            System.out.printf("\n\nA.Martina Hingis\t\tB.Maria Sarapova\n\nC.Kim Clijster\t\tD.Serena Williams");
                            if (Character.toUpperCase(scanner.next().charAt(0)) == 'D') {
                                System.out.printf("\n\nCorrect!!!");
                                countr++;
                                scanner.next();
                                break;
                            } else {
                                System.out.printf("\n\nWrong!!! The correct answer is D.Serena Williams");
                                scanner.next();
                                //break score;
                                break;
                            }

                        case 23:
                            System.out.printf("\n\n\nWhich film was awarded the Best Motion Picture at Oscar in 2010?");
                            System.out.printf("\n\nA.The Secret in their Eyes\t\tB.Shutter Island\n\nC.The King's Speech\t\tD.The Reader");
                            if (Character.toUpperCase(scanner.next().charAt(0)) == 'C') {
                                System.out.printf("\n\nCorrect!!!");
                                countr++;
                                scanner.next();
                                break;
                            } else {
                                System.out.printf("\n\nWrong!!! The correct answer is C.The King's Speech");
                                scanner.next();
                                //break score;
                                break;
                            }
                    }
                }

                score:
                clear();
                score = (float) countr * 100000;
                if (score > 0.00 && score < 1000000) {
                    System.out.printf("\n\n\t\t**************** CONGRATULATION *****************");
                    System.out.printf("\n\t You won $%.2f", score);
                    //break go;
                } else if (score == 1000000.00) {
                    System.out.printf("\n\n\n \t\t**************** CONGRATULATION ****************");
                    System.out.printf("\n\t\t\t\t YOU ARE A MILLIONAIRE!!!!!!!!!");
                    System.out.printf("\n\t\t You won $%.2f", score);
                    System.out.printf("\t\t Thank You!!");
                } else {
                    System.out.printf("\n\n\t******** SORRY YOU DIDN'T WIN ANY CASH ********");
                    System.out.printf("\n\t\t Thanks for your participation");
                    System.out.printf("\n\t\t TRY AGAIN");
                    //break go;
                }

                go:
                System.out.println("\n\n Press Y if you want to play next game");
                System.out.println(" Press any key if you want to go main menu");
                if (Character.toUpperCase(scanner.next().charAt(0)) == 'Y')
                    break home;
                else {
                    edit_score(score, playername);
                    break mainhome;
                }
            }
        }

    }

    static void show_record() {
        clear();
        File file=new File("score.txt");
        float score;
        float max=0;
        String s=null;
        Scanner scanner=new Scanner(file);
        
        while(scanner.hasNextLine()){
        
            String [] str= scanner.nextLine().split(":");
            String part1=str[0];
            String part2=str[1];
  
            
             score=Float.parseFloat(part2);
            
                if (score>max) {
                 max=score;
                 s=part1;
              }
                System.out.println("------------------------------------------------------");
                
                System.out.println(part1.toUpperCase()+" has secured the Highest Score with "+part2);
               
        }
             System.out.println("------------------------------------------------------");
                  
             System.out.println(" ");
             System.out.println("*****************************************************");
             System.out.println("Overall highest score is by "+s.toUpperCase()+" with score "+max);
             System.out.println("*****************************************************");
    }

    static void reset_score() {
        try {
            FileWriter fw = new FileWriter("score.txt");
            PrintWriter pw= new PrintWriter(fw);
            pw.print("");
            pw.close();
            
        } catch (Exception e) {
        }
    }

    static void help() {
        clear();
        System.out.printf("\n\n                              HELP");
        System.out.printf("\n -------------------------------------------------------------------------");
        System.out.printf("\n ......................... C program Quiz Game...........");
        System.out.printf("\n >> There are two rounds in the game, WARMUP ROUND & CHALLANGE ROUND");
        System.out.printf("\n >> In warmup round you will be asked a total of 3 questions to test your general");
        System.out.printf("\n    knowledge. You will be eligible to play the game if you can give atleast 2");
        System.out.printf("\n    right answers otherwise you can't play the Game...........");
        System.out.printf("\n >> Your game starts with the CHALLANGE ROUND. In this round you will be asked");
        System.out.printf("\n    total 10 questions each right answer will be awarded $100,000.");
        System.out.printf("\n    By this way you can win upto ONE MILLION cash prize in USD...............");
        System.out.printf("\n >> You will be given 4 options and you have to press A, B ,C or D for the");
        System.out.printf("\n    right option");
        System.out.printf("\n >> You will be asked questions continuously if you keep giving the right answers.");
        System.out.printf("\n >> No negative marking for wrong answers");

        System.out.printf("\n\n\t*********************BEST OF LUCK*********************************");
        System.out.printf("\n\n\t*****C PROGRAM QUIZ GAME is developed by CODE WITH C TEAM********");
    }

    static void edit_score(float score, String plnm) {
        clear();
        try {
            FileWriter fw = new FileWriter("score.txt");
            PrintWriter pw= new PrintWriter(fw);
            pw.print("");
            pw.close();
            
        } catch (Exception e) {
        }
    }

}
