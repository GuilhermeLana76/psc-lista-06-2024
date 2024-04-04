import java.util.Scanner;
public class atividade7lista6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];
    
        System.out.println("Digite os 5 digitos");

        for(int i =0; i < 5; i++){
        numeros[i] = scanner.nextInt();
        }

        System.out.println("Os números digitados foram: ");
        for(int j =0; j <5; j++){
        System.out.print(numeros[j] + " ");
        }

        int soma = numeros[0] + numeros[1] + numeros[2] + numeros[3] + numeros[4];
        int multi = numeros[0] * numeros[1] * numeros[2] * numeros[3] * numeros[4];

        System.out.println("\n" + "A Soma dos números é igual a " + soma);
        System.out.println("A Multiplicação dos números é igual a " + multi);




        scanner.close();
    }  
}
