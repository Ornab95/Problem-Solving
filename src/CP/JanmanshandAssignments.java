package CP;

import java.util.Scanner;

public class JanmanshandAssignments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            if (10-n>=3) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }

        }
        System.out.println();
    }
}
