package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        availableSeats();
        price();
    }
    public static void price() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();
        int totalSeats = row * seats;
        if (totalSeats <= 60) {
            int profit = seats *  row * 10;
            System.out.println("Total income: " + "$" + profit);
        } else if (totalSeats > 60 && row % 2 == 0) {
            int profit = (seats * row * 9) ;
            System.out.println("Total income: " + "$" + profit);
        } else {
            row = row/2;
            int profit = seats * ((row * 10) + (row * 8 + 8));
            System.out.println("Total income: " + "$" + profit);

        }
    }
    public static void availableSeats() {
        System.out.println("Cinema:");
        System.out.print(" ");
        for (int i = 1; i <= 8; i++) {
            System.out.print(" " +  i);
        }
        System.out.println();
        for (int i = 1; i <= 7; i++) {
                System.out.println(i + " S" + " S" + " S" + " S" + " S" + " S" + " S" + " S");
        }
        System.out.println();
    }
}