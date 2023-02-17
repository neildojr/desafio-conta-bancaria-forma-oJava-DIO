import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
     String cliente, agencia;
     int conta;
     double saldo;
     Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Óla,Seja Bem vindo ao seu Banco DIO!");
        System.out.println("Digite o seu nome: ");
            cliente = scanner.nextLine();
        System.out.println("Óla "+cliente+",  bem vindo ao seu banco!");
        System.out.println("Digite o número da sua Agência e o número da conta");
            agencia = scanner.nextLine();
            conta = scanner.nextInt();
        System.out.println(cliente+", conta da agencia "+agencia+" Numero da conta"+conta);
        System.out.println("Quanto você deseja depositar?");
            saldo = scanner.nextDouble();
        System.out.println(cliente+", obrigado por criar uma conta em nosso banco! Sua agência é "+agencia+", com a conta de número "+ conta+", seu saldo atual é de R$ "+saldo+ " e já está disponível para saque e transferência.");
    }
}







/*         Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        //TODO: Conhecer e importar a classe scanner
        //Exibis as mensagens para o nosso usuario

        //Obter pela Scanner os valores digitados no terminal

        //Exibis a mensagem cona criada

        System.out.println("Óla, Bem vindo ao seu Banco!");
        System.out.println("Óla, Digite seu numero");
        cliente = entrada.nextLine();
    }
}
*/