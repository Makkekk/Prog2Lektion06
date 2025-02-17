package Opgave05;

public class Opgave05Main {
    public static void main(String[] args) {
        System.out.println(sfd(48, 18));
    }

    public static int sfd(int a, int b) {
        if (b <= a && a % b == 0) { //Når b er 0 er den største fælles division A
            return b;

        } else if (a < b) {
            return sfd(b, a);

        } else {
            return sfd(b, a % b);
        }
    }
}
