package AT2;
import java.util.Scanner;

public class jogodavelha {
    public static void main(String[] args) {
        
    
    Campo[][] velha = new Campo[3][3];
    char simboloAtual = 'x';
    Boolean game =true;
    String vitoria = "";
    Scanner scan =new Scanner(System.in);

        iniciaJogo(velha);

        while(game){
        desenhaJogo(velha);
        vitoria = verificaVitoria(velha);
        if (!vitoria.equals("")) {
            System.out.printf("Jogador %s venceu",vitoria);
            break;
            }
        try {
            if (verificaJogada(velha,jogar(scan, simboloAtual),simboloAtual)) {
                if (simboloAtual=='X') {
                    simboloAtual='O';
                }else{
                    simboloAtual = 'X';
                }
                
            }

            
        } catch (Exception e) {
            System.out.printf("Erro");
        }    
        }
        System.out.printf("Fim de jogo");
    }

public static void desenhaJogo(Campo[][] velha) {
    //limparTela();
    System.out.println("        0     1    2");
    System.out.printf("0   %c | %c | %c %n", velha[0][0].getSimbolo(),velha[0][1].getSimbolo(),velha[0][2].getSimbolo());
    System.out.println("    ------------------------   ");
    System.out.printf("0   %c | %c | %c %n", velha[1][0].getSimbolo(),velha[1][1].getSimbolo(),velha[1][2].getSimbolo());
    System.out.println("    ------------------------   ");
    System.out.printf("0   %c | %c | %c %n", velha[2][0].getSimbolo(),velha[2][1].getSimbolo(),velha[2][2].getSimbolo());    
    }

    public static void limparTela() {
        for(int cont=0;cont<200;cont++){
            System.out.println("");
        }
    }

    public static int[] jogar(Scanner scan, char simboloAtual) {
        int[] p = new int[2];
        System.out.printf("%s %c%n", "Quem joga: ",simboloAtual);
        System.out.print("Informa a Linha: ");
        p[0] = scan.nextInt();
        System.out.print("Informa a Coluna: ");
        p[1] = scan.nextInt();
        return p; 
    }

    public static Boolean verificaJogada(Campo[][] velha, int p[],char simboloAtual){   
        if(velha[p[0]][p[1]].getSimbolo()==' '){
            velha[p[0]][p[1]].setSimbolo(simboloAtual);
            return true;
        }
        else{
            return false;
        }
    }   
        
    public static void iniciaJogo(Campo[][] velha) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                velha[i][j] = new Campo();
            }
        }
    }

    public static String verificaVitoria(Campo[][] velha) {
        return "";
        
    }
}
