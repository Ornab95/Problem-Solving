package CP;

import java.util.Scanner;

public class GreaterAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            double avg = (a+b)/2.0;
//            System.out.println(avg);
            if (avg >=c ) {
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
