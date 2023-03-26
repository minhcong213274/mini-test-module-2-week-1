
import java.util.Arrays;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr= new int[10];
        System.out.println("enter the array:");
        for (int i = 0;i<10;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
