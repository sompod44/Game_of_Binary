package Game_of_Binary;

/*
       This program creator Sompod.
       Date : 10/11/2017

 */
import java.util.Scanner;

public class Binary_Number {

    private void Game(int[] array) { // This is method
        int l = array.length;
        int n = 0, j;
        for (int i = n; i < l; i++) {
            int zero = 0, one = 0;
            if (0 == array[i]) {
                for (j = i; j < l; j++) {
                    if (0 == array[j]) {
                        ++zero;
                    } else if (1 == array[j]) {
                        break;
                    }
                }
                System.out.print("(" + zero + ",0)");
                i = j - 1;
            } else if (1 == array[i]) {

                for (j = i; j < l; j++) {
                    if (1 == array[j]) {
                        ++one;
                    } else if (0 == array[j]) {
                        break;
                    }
                }
                System.out.print("(" + one + ",1)");
                i = j - 1;

            }
            if (i != l - 1) {
                System.out.print(",");
            }
        }
    }

    public static void main(String[] args) {
        try ( //This is main Method
                Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter your Binary numbers : ");
            String str;
            str = scan.nextLine();

            char[] ch = str.toCharArray();
            int l = ch.length;
            int[] bg = new int[l];
            for (int i = 0; i < l; i++) {
                bg[i] = Integer.parseInt(String.valueOf(ch[i]));
            }

            Binary_Number BN = new Binary_Number(); // Here BN Object

            BN.Game(bg);
            //String s = scan.next();
        }

    }
}
