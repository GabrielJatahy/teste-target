import java.util.Scanner;

public class InversaoDeCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a string a ser invertida: ");
        String str = scanner.nextLine();
        
        char[] charArray = str.toCharArray();
        
        for (int i = 0, j = charArray.length - 1; i < j; i++, j--) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }
        
        String strInvertida = new String(charArray);
        
        System.out.println("String invertida: " + strInvertida);
    }
}
