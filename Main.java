import java.util.Scanner;
public class Main{
    public static void main (String[] args){
        boolean running = true;
        Scanner input = new Scanner(System.in);
        int totalEleitores;
        System.out.println("Digite os nomes dos eleitores\nDigite -1 para finalizar");

        // Adicionar eleitores
        for (int i = 0;;i++){
            String nomeDoEleitor = input.nextLine();
            if (nomeDoEleitor.equals("-1")){
                totalEleitores = i;
                break;
            }
            Urna.novoEleitor(nomeDoEleitor, i);
        }
        // Mostrar todos os eleitores possíveis
        System.out.println("Que comece a votação!");
        for (int i = 0;i < totalEleitores;i++){
            if (i == 0){
                System.out.print("|");
            }

            System.out.print(i + " = " + Urna.eleitores.get(i) + " | ");
            
        }
        // Votação dos eleitores
        while (running){
            break;

        }
        input.close();
    }
}
