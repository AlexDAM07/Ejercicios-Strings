import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Exercici 1:

        double d = 858.48;
        String s = String.valueOf(d);
        int dot = s.indexOf('.');
        System.out.println(dot+" digits before decimal point");
        System.out.println((s.length()-dot-1)+" digits after decimal point");

        System.out.println("La resposta és la següent: Fa ús del String.valueOf, del indexOf i el s.length(). El primer mètode és estàtic i els altres dos són instant.");
        System.out.println("El mètode del valueOf agafa la variable d i la posa a dins del del String s. El mètode del indexOf indica la posició. El .length() mira i agafa tots els nombres/caràcters d'una variable.");
        System.out.println("El codi indica per posició quin és el digit que va abans del punt i també el que li va abans.");
        System.out.println("Hi ha dos paràmetres d'entrada: la variable 'd' i la variable '.' que serveixen per donar instruccions al programa.");

        //Exercici 2

        String path = "home/user/index.html";
        //insert code here
        int punt = path.lastIndexOf(".");
        String extension = String.valueOf(punt);
        String formato = path.substring(punt + 1);
        System.out.println("L'extensió del fitxer és: " + formato);
        System.out.println("El nom del fitxer és: " + path);

        //Exercici 3

        Scanner Lecture = new Scanner(System.in);
        System.out.println("Dame un texto. Da igual si es en mayúsculas o minúsculas.");
        String texto = Lecture.nextLine();
        System.out.println("En mayúsculas: " + texto.toUpperCase());
        System.out.println("En minúsculas: " + texto.toLowerCase());

        //Exercici 4

        System.out.println("Dame un texto:");
        String textazo = Lecture.nextLine();

        if (textazo.isEmpty()) {
            System.out.println("El texto está vacío. Fin del programa.");
        } else {
            System.out.println("Dame una palabra a buscar:");
            String palabra = Lecture.nextLine();

            if (textazo.contains(palabra)) {
                System.out.println("La palabra \"" + palabra + "\" se ha localizado en el texto.");
            } else {
                System.out.println("La palabra \"" + palabra + "\" NO se ha localizado en el texto.");
            }
        }
    }

}