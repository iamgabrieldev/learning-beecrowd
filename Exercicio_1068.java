import java.io.IOException;
import java.util.Arrays;
import java.util.Stack;

public class Exercicio_1068 {

    public static void main(String[] expressoes) throws IOException {

        String[] respostas = new String[expressoes.length];
        for (int i = 0; i < expressoes.length; i++) {
            Stack<Character> pilha = new Stack<>();
            for (char c : expressoes[i].toCharArray()) {
                if (c == '(') {
                    pilha.push(c);
                } else if (c == ')') {
                    if (pilha.isEmpty()) {
                        respostas[i] = "incorrect";
                        break;
                    }
                    pilha.pop();
                }
            }
            if (respostas[i] == null) {
                respostas[i] = pilha.isEmpty() ? "correct" : "incorrect";
            }
        }

        Arrays.stream(respostas).forEach(System.out::println);
    }

}
