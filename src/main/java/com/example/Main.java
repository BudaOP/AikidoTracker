package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AikidoTracker tracker = new AikidoTracker();

        while (true) {
            System.out.println("\nAikido practice tracker");
            System.out.println("1. add practice session");
            System.out.println("2. view total practice time");
            System.out.println("3. check graduation eligibility");
            System.out.println("4. exit");
            System.out.print("\nChoose option: ");

            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.print("\nEnter session duration in minutes: ");
                int minutes = scanner.nextInt();
                tracker.addSession(minutes);
                System.out.println("\nsession added");
            } else if (choice == 2) {
                System.out.println("\ntotal practice time: " + tracker.getTotalTime() + " minutes");
            } else if (choice == 3) {
                if (tracker.checkEligibility()) {
                    System.out.println("\nyou are eligible for kyu graduation!");
                } else {
                    System.out.println("\nnot eligible yet");
                }
            } else if (choice == 4) {
                System.out.println("\nexiting...");
                break;
            } else {
                System.out.println("\ninvalid choice, try again");
            }
        }
        scanner.close();
    }
}
