package Eksempel;

public class Eksempel {
    public static void main(String[] args) {
        countDown(10);
    }

    private static void countDown(int count) {
        System.out.println(count);
        if (count == 0) {
            System.out.println("Liftoff");
            return;
        }
        count--;
        countDown(count);

    }
}
