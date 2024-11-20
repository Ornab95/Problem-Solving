package CP;

import java.util.Scanner;

public class MasterchefFinals {
    public static void main(String[] args) {
        {
            // your code goes here
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int X = sc.nextInt();
                if (X<=10 && X>=1) System.out.println("YES");
                else System.out.println("NO");

            }

        }
    }
}
