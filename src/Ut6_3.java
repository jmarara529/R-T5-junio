import java.util.Scanner;

public class Ut6_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra;

        do {
            palabra = sc.nextLine();
            if (!(palabra.toUpperCase().equals("FIN"))){
                if (palabra.isBlank()){
                    System.out.println("no se permiten caracteres en blanco");
                }else {

                }
            }
        }while (!(palabra.toUpperCase().equals("FIN")));

    }

}
