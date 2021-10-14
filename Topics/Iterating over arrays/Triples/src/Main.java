import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
            
        int len = scanner.nextInt();
        int[] arr = new int[len];
        int count = 0;
        
        for (int i = 0; i < len; i++) {
            arr[i] = scanner.nextInt();
        }
        //1 4 7 5 4 3
        // 1 2 4 5 6 7
        for (int i = 2; i < len; i++) {
            if (arr[i - 1] - arr[i - 2] == 1 && arr[i] - arr[i - 1] == 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
