import java.util.ArrayList;
import java.util.Scanner;

public class TesteMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Caneta> ListaC = new ArrayList<>();
        ArrayList<Caneta> CanetaEscolhida = new ArrayList<>();
        ListaC.add(new Caneta("Esferográfica", "preta", 0.7F, 25, true));
        ListaC.add(new Caneta("Fina da BIC", "Azul", 0.5F, 50, true));
        ListaC.add(new Caneta("caneta com botão", "preta", 0.7F, 15, false));

        System.out.println("         BEM VINDO CLIENTE APRECIADOR DE CANETAS!!!");
        System.out.println();
        while (true) {
            int numeracao = 1;
            System.out.printf("               QUAL CANETA DESEJA COMPRAR?          %n");
            System.out.printf("|------------------------------------------------------------|%n");
            System.out.printf("|                  CANETAS DISPONÍVEIS                       |%n");
            System.out.printf("|------------------------------------------------------------|%n");
            System.out.printf("| %-6s | %-16s | %-6s | %-5s | %-13s |%n", "NÚMERO", "MODELO", "COR", "PONTA", "CARGA");
            System.out.printf("|------------------------------------------------------------|%n");
            for (Caneta caneta : ListaC) {
                System.out.printf("| %-6d | %-16s | %-6s | %-5.2f | %-13d |%n", (numeracao), caneta.getModelo(),
                        caneta.getCor(), caneta.getPonta(), caneta.getCarga());
                numeracao++;
            }
            System.out.printf("|------------------------------------------------------------|%n");
            System.out.println();
            System.out.println("Digite o número correspondente a caneta que deseja(de acordo com a lista acima)");
            int escolhaC = sc.nextInt();
            sc.nextLine();
            if (escolhaC >= 1 && escolhaC <= ListaC.size()) {
                Caneta seleCane = ListaC.get(escolhaC - 1);
                System.out.println("O livro que você selecionou foi " + seleCane.getModelo());
                CanetaEscolhida.add(new Caneta(seleCane.getModelo(), seleCane.getCor(), seleCane.getPonta(),
                        seleCane.getCarga(), seleCane.isTampada()));
            }else {
                System.out.println("ESSE NÚMERO É INVÁLIDO");
            }

            System.out.println("Você deseja escolher outra caneta?");
            System.out.println("Responda na seguinte forma:S/N");
            String resposta = sc.nextLine();
            if(resposta.equalsIgnoreCase("n")){
                break;
            }
        }
        System.out.println(        "AQUI ESTÁ A LISTA DE CANETAS ESCOLHIDAS       ");
        System.out.println();
        System.out.printf("|---------------------------------------------------|%n");
        System.out.printf("|                CANETAS ESCOLHIDAS                 |%n");
        System.out.printf("|---------------------------------------------------|%n");
        System.out.printf("| %-16s | %-6s | %-5s | %-13s | %n","MODELO","COR","PONTA","CARGA");
        System.out.printf("|---------------------------------------------------|%n");
        for(Caneta caneta : CanetaEscolhida ){
            System.out.printf("| %-16s | %-6s | %-5.2f | %-13d | %n",caneta.getModelo(),caneta.getCor(),
                    caneta.getPonta(),caneta.getCarga());

        }
        System.out.printf("|---------------------------------------------------|%n");
    }
}
