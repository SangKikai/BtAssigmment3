package BT_Assigment;

import java.util.Random;

public class BT3 {
    public static void main(String[] args) {
        Random rd = new Random();
        int so = rd.nextInt(78) + 3; // 3 → 80

        System.out.println("So: " + so);
        if (so % 2 == 0) {
            System.out.println("day la so chan");
        } else {
            System.out.println("day la so le");
        }
    }
}
