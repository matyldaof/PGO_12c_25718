package cwiczenia1.zad6;
import java.util.Random;
import java.util.Arrays;
public class zad6 {

    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = randomBetween(100, 1000);
        }


        System.out.println("Generated array: " + Arrays.toString(arr));
        sort(arr);
        System.out.print("Sorted array: " + Arrays.toString(arr));
    }

    static int randomBetween(int start, int end) {
        Random random = new Random();
        int x = random.nextInt(end - start + 1);
        int y = x + start;
        return y;
    }

    public static int[] sort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
}

