import java.util.Scanner;
public class atividade1lista6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];
        int i = 0;
        for( i = 0; i < 5; i++ ){
        System.out.println("Digite o " + (i + 1) + "º número");
        numeros[i] = scanner.nextInt();
        }
        
        System.out.println("Números lidos: ");

        for( i =0; i < 5; i++){
        System.out.print(numeros[i] + ",");
        }
       
        
        scanner.close();
    }  
}

