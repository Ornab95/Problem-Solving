package CP;

import java.util.Scanner;

public class ClearDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rainy = sc.nextInt();
        int cloudy = sc.nextInt();
        int clear = (rainy + cloudy)-7;
        System.out.println(clear);


    }
}
