import java.util.Scanner;

public class ReceberDados {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o seu nome: ");
        String aluno = entrada.nextLine();
        System.out.println("Olá, " + aluno );

        System.out.println("Digite a sua nota: ");
        double nota1 = entrada.nextDouble();
        System.out.println("Sua nota foi " + nota1);

        double media = nota1*0.5;
        System.out.println("Sua média é: " + media);
    }
}

//Fçam um código que leia 3 notas e exiba a média