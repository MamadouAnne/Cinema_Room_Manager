package cinema;

public class Cinema {

    public static void main(String[] args) {
        availableSeats();
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