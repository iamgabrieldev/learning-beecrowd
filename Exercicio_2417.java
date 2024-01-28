import java.util.Scanner;

public class Exercicio_2417 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        var leitura = scan.nextLine().split(" ");

        var array = new int[6];

        for (int i = 0; i < leitura.length; i++) {
            array[i] = Integer.parseInt(leitura[i]);
        }

        int cormegoPontos, cormegoSaldo, flamithiansPontos, flamithiansSaldo = 0;

        cormegoPontos = array[0] * 3 + array[1];
        cormegoSaldo = array[2];

        flamithiansPontos = array[3] * 3 + array[4];
        flamithiansSaldo = array[5];

        if (cormegoPontos > flamithiansPontos) {
            System.out.println("C");
        } else if (cormegoPontos < flamithiansPontos) {
            System.out.println("F");
        } else {
            if (cormegoSaldo > flamithiansSaldo) {
                System.out.println("C");
            } else if (cormegoSaldo < flamithiansSaldo) {
                System.out.println("F");
            } else {
                System.out.println("=");
            }
        }

        scan.close();

    }

}