import java.util.Scanner;
public class atividade3lista6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double[] notas = new Double[4]; 
        int i = 0;

        for( i = 0; i < 4; i++){
        System.out.println("Ensira a " +(i+1)+ "° nota");   
        notas[i] = scanner.nextDouble(); 
        }

        System.out.print("as notas enseridas foram: ");

        int j = 0;
        for( j = 0; j < 4; j++){
        System.out.print(notas[j] +", ");
        }

        Double media = (notas[0] + notas[1] + notas[2] + notas[3]) /3;
        System.out.println("\n" + "A media das notas é: " +media);



    
        scanner.close();
    
    }

}
