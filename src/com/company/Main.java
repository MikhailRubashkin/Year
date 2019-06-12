package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean datecorrect = false;
        while (!datecorrect) {
            System.out.println("Ведите день: ");
            int day = scanner.nextInt();
            System.out.println("Ведите месяц: ");
            int mon = scanner.nextInt();
            System.out.println("Ведите год: ");
            int year = scanner.nextInt();

            boolean leapyear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
            int maxday[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if (leapyear) {
                maxday[1] = 29;
            }
            boolean monok = ((mon > 0) & (mon < 13));
            if (monok) {
                datecorrect = (day <= maxday[mon - 1]);
            }

            if (!datecorrect) {
                System.out.println("Такой даты не существует");
            } else
                day++;
            if (day > maxday[mon - 1]) {
                day = 1;
                mon++;
                if (mon > 12) {
                    day = 1;
                    mon = 1;
                    year++;
                    System.out.println(dayuot(day, mon, year));
                } else System.out.println(dayuot(day, mon, year));

            } else System.out.println(dayuot(day, mon, year));
        }

    }
static String dayuot ( int day, int mon, int year){
        String put2 = day + "." + mon + "." + year;
        return put2;
        }
        }
