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

        System.out.println("Dona'm un text:");
        String textazo = Lecture.nextLine();

        if (textazo.isEmpty()) {
            System.out.println("El text està buit. Fi del programa.");
        } else {
            System.out.println("Dona'm una paraula a trobar:");
            String palabra = Lecture.nextLine();

            if (textazo.contains(palabra)) {
                System.out.println("La paraula '" + palabra + "' s'ha localitzat al text.");
            } else {
                System.out.println("La paraula '" + palabra + "' NO s'ha localitzat al text.");
            }
        }

        //Exercici 5 Tasca 1

        String[] catalogo = {"Los muertos vivientes", "Brevísima historia del tiempo", "La clave secreta del universo","Mi universo", "Patria", "De mayor quiero ser feliz", "Empieza por los zapatos"};
                //Insert code here
        System.out.println("Què llibre estàs buscant?");
        String llibre = Lecture.nextLine();

        String resultat = "El llibre no està a la biblioteca";

        for (int i = 0; i < catalogo.length; i++) {
            if (catalogo[i].equalsIgnoreCase(llibre)) {
                resultat = "El llibre està a la biblioteca";
            }
        }
        System.out.println(resultat);

        }
}