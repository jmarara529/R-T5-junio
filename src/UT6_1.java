import java.util.ArrayList;
import java.util.Scanner;

public class UT6_1 {

    public static void main(String[] args) {
        ArrayList<Integer> numUser = new ArrayList<>();
        ArrayList<Integer> numMaquina = new ArrayList<>();
        ArrayList<Integer> numRep = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int numeroUser, numeroMaquina;

        for (int i = 10; i > 0 ; i--){

            do{

                System.out.println("quedan "+i+":");
                numeroUser = sc.nextInt();

                if (numeroUser < 1 || numeroUser > 100){

                    System.out.println("No valido, Introduce otro");

                } else if (numUser.contains(numeroUser)){

                    System.out.println("Repetido, introduce otro");

                }
            }while (numeroUser < 1 || numeroUser > 100 || numUser.contains(numeroUser));
            numUser.add(numeroUser);

        }
        System.out.println("tus numeros");
        for (int numero : numUser){
            System.out.println(numero);
        }

        for (int i = 0; i < 20; i++){
            do {
                numeroMaquina = (int) (Math.random()*100+1);
            }while (numMaquina.contains(numeroMaquina));
            numMaquina.add(numeroMaquina);
        }
        System.out.println("numeros de la maquina:");
        for (int numero : numMaquina){
            System.out.println(numero);
        }

        for (int numerogenerado:numMaquina){
            if (numUser.contains(numerogenerado)){
                numRep.add(numerogenerado);
            }
        }
        System.out.println("numeros que coinciden:");
        for (int numero:numRep){
            System.out.println(numero);
        }

    }
}


