import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) {
        puzzle();
    }
    static void puzzle (){
        double i = 1d;
        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sum = 1;
        do{
            sum = sum +(1/i) ;
            i++;
        }while(i<=n);
            System.out.println("sum = "+sum);

    }
}
