import java.util.Scanner;
public class atividade2lista6{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Double[] numeros = new Double[10];
        int i = 0;
        
        for(i = 0; i < 10; i++){
        System.out.println("Digite o " +(i+1)+ "° número.");
        numeros[i] = scanner.nextDouble();
        }

        System.out.println("Os números digitados em ordem inversa são: ");

        int j = 9;
        for(j = 9; j >= 0; j--){
        System.out.print( numeros[j] + ",");
        }

        
        scanner.close(); 
    }
}
