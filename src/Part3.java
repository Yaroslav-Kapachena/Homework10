import java.util.Scanner;

public class Part3 {
    public static void main(String[] args) {
        int n;
        int count = 0;
        System.out.print("Введите число - ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.println("Число " + n + " делится на - " );
        for(int i = 1; i <= n; i++){
            if ((n % i) == 0){
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println("Количество делителей - " + count);
    }
}
