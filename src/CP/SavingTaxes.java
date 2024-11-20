package CP;

import java.util.*;

public class SavingTaxes {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = Math.max(0,x-y);
            System.out.println(x-y);
        }

    }
}