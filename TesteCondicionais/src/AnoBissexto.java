import java.util.Scanner;

public class AnoBissexto {
      public static void main(String[] args){


      Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Insira o ano: ");
        int ano = sc.nextInt();
       if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))) {
         System.out.println("O ano é bissexto.");
        } else {
        System.out.println("O ano é normal.");
        }
       
        sc.close();
    }
      }

