import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leitor = new
            Scanner(System.in);
        
        int num = 20;
        int vet[] = new int [num];
        
        for (int i = 0; i < num; i++) {
            vet[i] = Integer.parseInt(leitor.nextLine());
        }
        for (int i = 0; i < num / 2; i++) {
            int aux = vet[i];
            vet[i] = vet[num - 1 - i];
            vet[num - 1 - i] = aux;
        }
        for (int i = 0; i < num; i++) {
            System.out.println("N["+ i +"] = " + vet[i]);
        }
    }
}
