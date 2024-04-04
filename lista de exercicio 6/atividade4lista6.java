import java.util.Scanner;
public class atividade4lista6 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] caracteres = new char[10];
    int contador = 0;

    System.out.println("Digite 10 caracteres");

    for( int i = 0; i < 10; i++){
    caracteres[i] = scanner.next().charAt(0);
    }

    for(char c : caracteres){
        if (ehConsoante(c)){
        contador++;
        System.out.println(c + " ");
        }
    }

    System.out.println("Quantidade de consoantes lidas é de " + contador);

        scanner.close();
    }
    
public static boolean ehConsoante(char c){
    c = Character.toUpperCase(c);

    return c >= 'B' && c <= 'Z' && c != 'E' && c!= 'I' && c!= 'O' && c!= 'U';
   
    }
}   

