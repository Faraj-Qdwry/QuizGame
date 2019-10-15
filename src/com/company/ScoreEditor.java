package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

import static com.company.QuizGame.*;
import static com.company.QuizGame.score;

public class ScoreEditor {
    static void reset_score() {
        try {
            FileWriter fw = new FileWriter("score.txt");
            PrintWriter pw = new PrintWriter(fw);
            pw.print("");
            pw.close();

        } catch (Exception e) {
        }
    }

    static void edit_score(float score, String plnm) {
        cleaner.clear();
        try {
            FileWriter fw = new FileWriter("score.txt");
            PrintWriter pw = new PrintWriter(fw);
            pw.print(plnm + " : " + score);
            pw.close();

        } catch (Exception e) {
        }
    }

    public static void score() {
        score:
        cleaner.clear();
        score = (float) countr * 100000;
        if (score > 0.00 && score < 1000000) {
            System.out.printf("\n\n\t\t**************** CONGRATULATION *****************");
            System.out.printf("\n\t You won $%.2f", score);
        } else if (score == 1000000.00) {
            System.out.printf("\n\n\n \t\t**************** CONGRATULATION ****************");
            System.out.printf("\n\t\t\t\t YOU ARE A MILLIONAIRE!!!!!!!!!");
            System.out.printf("\n\t\t You won $%.2f", score);
            System.out.printf("\t\t Thank You!!");
        } else {
            System.out.printf("\n\n\t******** SORRY YOU DIDN'T WIN ANY CASH ********");
            System.out.printf("\n\t\t Thanks for your participation");
            System.out.printf("\n\t\t TRY AGAIN");
        }
    }

    static void show_record() {
        cleaner.clear();
        File file = new File("score.txt");
        float score;
        float max = 0;
        String s = null;
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (scanner.hasNextLine()) {

            String[] str = scanner.nextLine().split(":");
            String part1 = str[0];
            String part2 = str[1];


            score = Float.parseFloat(part2);

            if (score > max) {
                max = score;
                s = part1;
            }
            System.out.println("------------------------------------------------------");

            System.out.println(part1.toUpperCase() + " has secured the Highest Score with " + part2);

        }
        System.out.println("------------------------------------------------------");

        System.out.println(" ");
        System.out.println("*****************************************************");
        System.out.println("Overall highest score is by " + s.toUpperCase() + " with score " + max);
        System.out.println("*****************************************************");
    }
}
