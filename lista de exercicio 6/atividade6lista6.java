import java.util.Scanner;
public class atividade6lista6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double[] notas = new Double[4];
        Double[] medias = new Double[10];
        int contador= 0;

    for(int i =0; i < 10; i++){
        System.out.println("Ensira as 4 notas do " + (i + 1) + "º aluno");
 
    for(int j =0; j < 4; j++){
        notas[j] = scanner.nextDouble();

    if (notas[j] < 0 || notas[j] > 10) {
        System.out.println("Nota inválida, Ensira um valor de 0 a 10.");
        notas[j] = scanner.nextDouble();   
    }}

        medias[i] = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;

    if (medias[i] >= 7) {
        contador++; 
    }
}
    System.out.print("o números de alunos com nota maior ou igual a 7 é de: " + contador);
    

        scanner.close();
    }
}
