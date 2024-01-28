import java.util.Scanner;
import java.util.Stack;

public class Main {

    static Stack<Character> pilha = new Stack<Character>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expressao = scanner.nextLine();

        for (int i = 0; i < expressao.length(); i++) {
            char c = expressao.charAt(i);
            if (c == '(') {
                pilha.push(c);
            } else if (c == ')') {
                if (pilha.isEmpty()) {
                    System.out.println("incorrect");
                    return;
                }
                pilha.pop();
            }
        }
        if(!pilha.isEmpty()) {
            System.out.println("incorrect");
            return;
        }

        System.out.println("correct");
        scanner.close();
    }
}
