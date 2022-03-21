import java.util.Scanner;

//by aulaenlanube.com
public class recurAlberto {

    public static int recursivo(int num, int numGirado) {
        int digito = 0;// declaro variable para almacenar el segundo número
        digito = num % 10; // recorro el numero y almaceno el resto de la div entre 10
        numGirado = numGirado * 10 + digito;  //>>5
        // System.out.println(numGirado);
        num = num / 10;  //--> 54145   >> 5414

        //comparar primero con ultimo
        System.out.println(num);
        if (num == 0)
            return numGirado;
        else
            return recursivo(num, numGirado);  // 5414 ,5   ---> 541,54  ---> 54,541 ---> 5,5414
    }   

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un nùmero :");
        int num = teclado.nextInt();

        int numGirado = 0; 

        int segundoNum = recursivo(num, numGirado);

        if (num == segundoNum) {
            System.out.println("Es simetrico");
        } else
            System.out.println("No es simetrico");

       
       
    }
    
}
