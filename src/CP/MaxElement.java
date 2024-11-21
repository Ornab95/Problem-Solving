package CP;

public class MaxElement {
    public static void main(String[] args) {
        int[] myNum = {10, 20, 30, 40};
        int max = myNum[0];
//        System.out.println(max);
        for (int i = 1; i < myNum.length; i++) {
            if (myNum[i] > max) {
                max = myNum[i];
            }
        }
        System.out.println(max);
    }
}
