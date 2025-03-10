package co.gabrielli;

import java.util.Scanner;

public class UserInput {
    private static final Scanner scanner = new Scanner(System.in);

    public static String readString(String message){
        System.out.println(message);
        return scanner.nextLine();
    }

    public static int readInt(String message){
        while(true){
            try{
                System.out.println(message);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("Entrada informada inválida!Digite um número inteiro válido");
            }
        }
    }
    public static void closeScanner(){
        scanner.close();
    }
}
