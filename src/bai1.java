import java.util.Scanner;

public class bai1 {
    public static boolean isPrime(int num){
        if (num<2){
            return false;
        }
        for (int i=2;i<=Math.sqrt(num);i++){
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scanner.nextInt();
        for (int i = 0;i<num;i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
