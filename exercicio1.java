import java.util.Scanner;

public class exercicio1 {
    public static void main (String[] args){
        //1
        Scanner Atividade = new Scanner(System.in);

        System.out.println("Me informe 2 numeros inteiros para eu fazer a soma: ");
        int numero1 = Atividade.nextInt();
        int numero2 = Atividade.nextInt();
        int soma = numero1 + numero2;
        System.out.println("Resultado da soma foi: " + soma);

        //2
        System.out.println("Me informe um valor em metros para eu converter em centimetros: ");
        double metros = Atividade.nextDouble();
        double centimetros = metros*100;
        System.out.println("O resultado foi: " + centimetros + " cm");

        //3
        System.out.println("Me informe um numero:");
        int par = Atividade.nextInt();
        if (par % 2 == 0) {
            System.out.println("Seu numero é par");
        }else{
            System.out.println("Seu numero é impar");
        }

        //4
        System.out.println("Qual a velocidade do seu carro?");
        int velocidade = Atividade.nextInt();
        int calculo = ((velocidade - 80) * 5);
        if(velocidade <= 80){
            System.out.println("Você está no limite certo de velocidade");
        }else{
            System.out.println("Você está em alta velocidade, sua multa foi: " + calculo + " Reais");
        }
    }
}
