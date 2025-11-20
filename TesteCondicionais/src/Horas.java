import java.util.Scanner;

public class Horas {
         public static void main(String[] args){


      Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Insira a hora: ");
        double horas = sc.nextDouble();
       if (horas >= 6 && horas <=12) {
         System.out.println("Bom dia");
        } 
        else if (horas >= 12.1 && horas <= 18){
        System.out.println("Boa tarde.");
        }else {
            System.out.println("Boa Noite.");
        }
       
        sc.close();
    }
}
