import java.util.Scanner;

public class Repeticao {
    //Laços//
    public static void main(String[] args) {
       /*  double x = 1;
        System.out.println(x);
        double y = x + 1;
        System.out.println(y);
        double z = y + 1;
        System.out.println(z);*/

        /*double x = 1;
        while(x < 10){
            System.out.println(x);
            x = x + 1;*/

        //Façam um programa que exiba os números de 1 a 100
        //Faça um programa que exiba os números de 50 a 100
        //faça uma programa para escrever a contagem regressiva do lançamento de um foquete. o programa de imprimir 10, 9, 8, .., 1, 0 
            double x = 1;
            while (x <= 100){
                System.out.println(x);
                x = x + 1;}

            double y = 50;
            while (y <= 100){
                System.out.println(y);
                y = y + 1;
            }
            double z = 10;
            while(z >= 0){
            System.out.println(z);
            z = z - 1;
            if(z == -1){
                System.out.println("Fogo");
            }
            }
            //Faça um programa que imprima de 1 até o número digitado pelo usuário, mas, apenas os números pares.
            Scanner numero = new Scanner(System.in);

            System.out.println("Digite um numero: ");
            double par = numero.nextDouble();
            double a = 1;
            while(a <= par){
                if(a % 2 == 0){
                    System.out.println(a);
                }
                a = a + 1;
            }
        }
    }
    
