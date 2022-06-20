import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args){
        Scanner Notas = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String aluno = Notas.nextLine();
        System.out.println("Olá, " + aluno );

        System.out.println("Digite a primeira nota: ");
        Double Nota1 = Notas.nextDouble();
        System.out.println("Digite a segunda nota: ");
        Double Nota2 = Notas.nextDouble();
        System.out.println("Digite a terceira nota: ");
        Double Nota3 = Notas.nextDouble();

        double media = ((Nota1 + Nota2 + Nota3) /3) ;
        System.out.println("Sua média foi: " + media);

        //condicionais 

        if (media >= 5){
            System.out.println( aluno + "," + "Você colou bem, Parabéns");
        }else{
            System.out.println( aluno + "Você foi reprovado");
        }
    }
}
