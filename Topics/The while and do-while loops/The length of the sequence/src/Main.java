import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;

        while (scanner.hasNext()) {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            count++;
        }
        System.out.println(count);

    }
}