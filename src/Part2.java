import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
        puzzle2();
    }
    static  void puzzle2 (){
        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i;
        int sum = 0;
        for (i = 1;i<=number;i++){
            sum += i;
        }
        System.out.println(sum);
    }

}
