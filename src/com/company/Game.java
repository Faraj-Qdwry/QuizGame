package com.company;

import static com.company.QuizGame.*;

public class Game {
    public static void playGame() {
        game:
        countr = 0;
        for (int i = 1; i <= 10; i++) {
            cleaner.clear();
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
                        break;
                    }
            }
        }
    }
}
