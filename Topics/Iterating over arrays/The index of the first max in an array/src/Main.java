import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] nums = new int[len];
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < len; i++) {
            nums[i] = sc.nextInt();
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        System.out.println(index);
    }
}

//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int arrayL = scanner.nextInt();
//        int[] array = new int[arrayL];
//        int biggestIndex = 0;
//        for (int i = 0; i < array.length; i++) {
//            array[i] = scanner.nextInt();
//            if (i == 0) {
//                continue;
//            } else {
//                biggestIndex = array[i] > array[biggestIndex] ? i : biggestIndex;
//            }
//        }
//        System.out.println(biggestIndex);
//
//    }
//}


//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//         max();
//        }
//
//        public static void max() {
//            int max = 0;
//            Scanner scanner = new Scanner(System.in);
//            int length = scanner.nextInt();
//            int[] array = new int[length];
//            for (int i = 0; i < length; i++) {
//                array[i] = scanner.nextInt();
//            }
//
//            for (int var : array) {
//                if (max < var) {
//                    max = var;
//                }
//            }
//            for (int i = 0; i < length; i++) {
//                if (array[i] == max) {
//                    System.out.println(i);
//                    break;
//                }
//            }
//    }
//}
