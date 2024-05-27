package estruturas_de_decisao;

import java.util.Scanner;

public class CategoriaAtleta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor infome a idade do atleta: ");
        Integer idade = scanner.nextInt();

        if (idade >= 10 && idade <= 12)
            System.out.println("O atleta pertence a categoria Mirim");
        else if (idade >= 13 && idade <= 15)
            System.out.println("O atleta percente a categoria Infantil");
        else if (idade >= 16 && idade <= 18)
            System.out.println("O atleta percente a categoria Juvenil");
        else
        System.out.println("A idade não corresponde a nenhuma categoria!");    
        
        scanner.close();
    }
}
