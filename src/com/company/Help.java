package com.company;

import static com.company.QuizGame.cleaner;

public class Help {
    static void showGuidelines() {
        cleaner.clear();
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

}
