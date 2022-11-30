/**
 * AT4
 */
public class AT4 {

    public static void main(String[] args) {
        int matriz[][] = new int [10][10];
        int matriz2[][] = new int [10][10];
        int vet[] = new int[10];
        int vet2[] = new int[10];
        int i,j;

        for (i= 0; i< 10; i++) {
            for ( j = 0; j < 10; j++) {
                matriz[i][j] = ((i+3)+(j+2));
                System.out.print(matriz[i][j]+"|");
            }
            System.out.println("\n ");
        }

        System.out.println("====================================\n");
        

        for (i= 0; i< 10; i++) {
            for ( j = 0; j < 10; j++) {
                matriz2[i][j] = ((i+3)+(j+2));
                System.out.print(matriz2[i][j]+"|");
            }
            System.out.println("\n");
        }

        for (i= 0; i< 10; i++) {
            for ( j = 0; j < 10; j++) {
                if(i+j==9){
                vet[i] = matriz[i][j];
                }
            }
            System.out.println("|");
        }

        System.out.println("====================================\n");

        for (i= 0; i< 10; i++) {
            for ( j = 0; j < 10; j++) {
                if(i+j==9){
                vet2[i] = matriz2[i][j];
                }
            }
        }

        for(i=0;i<10;i++){
            for(j=0;j<10;j++){
                if(i==j){
                matriz[i][j]=vet2[i];
                }
                if(i+j==9){
                matriz2[i][j]=vet[i];
                }
            }
            }
            
            //imprimir resultado
        System.out.print("PRIMEIRA MATRIZ\n\n");
        for(i=0;i<10;i++){
        for(j=0;j<10;j++){

        System.out.print(matriz[i][j]+"|");
        }   
        System.out.print("\n\n");
        }
        System.out.print("SEGUNDA MATRIZ\n\n");
        for(i=0;i<10;i++){
        for(j=0;j<10;j++){

            System.out.print( matriz2[i][j]+"|");
        }
        System.out.print("\n\n");

        }
        return;

     }
    }