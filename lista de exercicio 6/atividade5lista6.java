import java.util.Scanner;
public class atividade5lista6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int [20];
        int[] par = new int [20];
        int[] impar = new int [20];
        //contador par
        int pa = 0;
        //contador impar
        int imp = 0;

        System.out.println("Digite 20 números inteiros");

        for(int i = 0; i < 20; i++){
        numeros[i] = scanner.nextInt();

        if(numeros[i] % 2 == 0){
        par[pa] = numeros[i];
        pa++;

        }else{ 
        impar[imp] = numeros[i];
        imp++; 
        }
    }
    
    System.out.println("\n" + "Números pares digitados: ");

    for(int k = 0; k < 20; k++){
    System.out.print(par[k] + " ");
    }

    System.out.println("\n" + "Números impares digitados: ");

    for(int l = 0; l < 20; l++){
    System.out.print(impar[l] + " ");
    }
    
        scanner.close();
    }
    
}
