import java.util.Scanner;

public class SequenciaFibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        int fibo1 = 0;
        int fibo2 = 1;
        boolean pertence = false;

        while (fibo2 < num) {
            int temp = fibo2;
            fibo2 = fibo1 + fibo2;
            fibo1 = temp;

            if (fibo2 == num) {
                pertence = true;
                break;
            }
        }

        if (pertence) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }

        sc.close();
    }
}





