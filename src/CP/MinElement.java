package CP;

public class MinElement {
    public static void main(String[] args) {
        int[] myNum = {10, 20, 30, 40};
        int min = myNum[0];
        for (int i = 0; i < myNum.length; i++) {
            if (myNum[i] < min) {
                min = myNum[i];
            }
        }
        System.out.println(min);
    }
}
