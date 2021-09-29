import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int group1  = scanner.nextInt();
        int group2  = scanner.nextInt();
        int group3  = scanner.nextInt();

        int numberOfStudents = group1 + group2 + group3;
        int numberOfDesk = numberOfStudents/2;
        if (numberOfStudents % 2 != 0) {
            numberOfDesk += 1;
        }
        System.out.println(numberOfDesk);
    }
}