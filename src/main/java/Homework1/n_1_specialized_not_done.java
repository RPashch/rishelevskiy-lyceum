package Homework1;

import java.util.Scanner;

public class n_1_specialized_not_done {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Сколько лет вашей собаке сейчас?");

        int x = in.nextInt();

        System.out.println("Сколько ему(ей) месяцев?");

        int z = in.nextInt();

        System.out.println("Сколько лет вы хотите прибавить?");

        int y = in.nextInt();

        System.out.println("Сколько месяцев вы хотите ему прибавить?");

        int f = in.nextInt();

        if (x + y < 5)

            System.out.println("Так у вас же ещё щенок! Ему и 5 лет даже нету – ему всего лишь 3 годика.");

        else {

            if (z == 0 & f == 0) {

                if ((x + y) % 10 >= 5 || (x + y) % 10 == 0 || (x + y) % 100 == 11) {

                    if (y % 10 >= 5 || y % 10 == 0 || y % 100 == 11) {

                        System.out.println("Через " + y + " лет вашей собаке будет " + (x + y) + " лет");

                    } else {

                        System.out.println("Через " + y + " год вашей собаке будет " + (x + y) + " лет");

                    }

                } else {

                    if (y % 10 >= 5 || y % 10 == 0 || y % 100 == 11) {

                        System.out.println("Через " + y + " лет вашей собаке будет " + (x + y) + " год");

                    } else {

                        System.out.println("Через " + y + " год вашей собаке будет " + (x + y) + " год");

                    }

                }

            } else {

                if (((z + f) % 12) % 10 >= 5 || ((z + f) % 12) % 10 == 0 || ((z + f) % 12) % 100 == 11) {

                    if (f % 10 >= 5 || f % 10 == 0 || f % 100 == 11) {

                        if ((x + y) % 10 >= 5 || (x + y) % 10 == 0 || (x + y) % 100 == 11) {

                            if (y % 10 >= 5 || y % 10 == 0 || y % 100 == 11) {


                                System.out.printf("Через %d лет и %d месяцев вашей собаке будет %d лет и %d месяцев",
                                        y, f, x + y + (z + f) / 12, (z + f) % 12);

                            } else {

                                System.out.printf("Через %d год и %d месяцев вашей собаке будет %d лет и %d месяцев",
                                        y, f, x + y + (z + f) / 12, (z + f) % 12);

                            }

                        } else {

                            if (y % 10 >= 5 || y % 10 == 0 || y % 100 == 11) {

                                System.out.printf("Через %d лет и %d месяцев вашей собаке будет %d год и %d месяцев",
                                        y, f, x + y + (z + f) / 12, (z + f) % 12);

                            } else {

                                System.out.printf("Через %d год и %d месяцев вашей собаке будет %d год и %d месяцев",
                                        y, f, x + y + (z + f) / 12, (z + f) % 12);

                            }

                        }

                    } else {

                        if (f % 10 >= 1 & f <= 4) {

                            if ((x + y) % 10 >= 5 || (x + y) % 10 == 0 || (x + y) % 100 == 11) {

                                if (y % 10 >= 5 || y % 10 == 0 || y % 100 == 11) {


                                    System.out.printf("Через %d лет и %d месяца вашей собаке будет %d лет и %d месяцев",
                                            y, f, x + y + (z + f) / 12, (z + f) % 12);

                                } else {

                                    System.out.printf("Через %d год и %d месяцев вашей собаке будет %d лет и %d месяцев",
                                            y, f, x + y + (z + f) / 12, (z + f) % 12);

                                }

                            }

                        }else{

                            System.out.printf("Через %d лет и %d месяца вашей собаке будет %d лет и %d месяца",
                                    y, f, x + y + (z + f) / 12, (z + f) % 12);

                        }

                    }

                }else{

                    System.out.printf("Через %d лет и %d месяц вашей собаке будет %d лет и %d месяца",
                            y, f, x + y + (z + f) / 12, (z + f) % 12);

                }

            }

        }

    }

}


