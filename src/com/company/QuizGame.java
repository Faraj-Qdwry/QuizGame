package com.company;

import java.util.Scanner;

public class QuizGame {

    public static Cleaner cleaner;
    public static int countr, r, r1, count, i, n;
    public static float score;
    public static Scanner scanner;
    private static ScoreEditor scoreEditor;
    private static Game game;
    private static Help help;

    public static void main(String[] args) {

        char choice;
        String playername = "null";
        scanner = new Scanner(System.in);
        cleaner = new Cleaner();
        game = new Game();
        scoreEditor = new ScoreEditor();
        help = new Help();

        mainhome:
        while (true) {
            cleaner.clear();
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
            System.out.printf("\n\t\t > press H for showGuidelines            ");
            System.out.printf("\n\t\t > press Q to quit             ");
            System.out.printf("\n\t\t________________________________________\n\n");

            choice = Character.toUpperCase(scanner.next().charAt(0));

            if (choice == 'V') {
                scoreEditor.show_record();
                continue mainhome;
            } else if (choice == 'H') {
                help.showGuidelines();
                scanner.next();
                continue mainhome;
            } else if (choice == 'R') {
                scoreEditor.reset_score();
                scanner.next();
                continue mainhome;
            } else if (choice == 'Q') {
                System.exit(1);
            } else if (choice == 'S') {
                cleaner.clear();

                System.out.printf("\n\n\n\n\n\n\n\n\n\n\t\t\tResister your name:");
                playername = scanner.next();

                cleaner.clear();
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
                    cleaner.clear();
                    continue mainhome;
                }
            }


            cleaner.clear();
            count = 0;

            home:
            for (int i = 1; i <= 3; i++) {
                cleaner.clear();
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

                if (count <= 2) {
                    //break test;
                } else {
                    cleaner.clear();
                    System.out.printf("\n\nSORRY YOU ARE NOT ELIGIBLE TO PLAY THIS GAME, BETTER LUCK NEXT TIME");
                    scanner.next();
                    continue mainhome;
                }

                test:
                cleaner.clear();
                System.out.printf("\n\n\t*** CONGRATULATION %s you are eligible to play the Game ***", playername);
                System.out.printf("\n\n\n\n\t!Press any key to Start the Game!");
                if (Character.toUpperCase(scanner.next().charAt(0)) == 'p') {
                    //break game;
                }

                game.playGame();

                scoreEditor.score();

                go:
                System.out.println("\n\n Press Y if you want to play next game");
                System.out.println(" Press any key if you want to go main menu");
                if (Character.toUpperCase(scanner.next().charAt(0)) == 'Y')
                    break home;
                else {
                    scoreEditor.edit_score(score, playername);
                    break mainhome;
                }
            }
        }
    }
}
