import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        while (scanner.hasNext()) {
            int input = scanner.nextInt();
            if (input % 4 == 0 && max < input) {
                max = input;
            }
        }
        System.out.println(max);
    }
}