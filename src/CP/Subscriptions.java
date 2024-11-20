package CP;

import java.util.Scanner;

//https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/SUBSCRIBE_
public class Subscriptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            double num = Math.ceil(n/6.0);
//            System.out.println(num);
            int z =(int)num*x;
            System.out.println(z);
        }
        System.out.println();
    }
}
