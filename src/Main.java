import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("1. Aggiungi auto");
            System.out.println("2. Visualizza auto");
            System.out.println("3. Esci");
            int scelta = in.nextInt();
            switch (scelta) {
                case 1:
                    System.out.println("Inserisci marca:");
                    String marca = in.next();
                    System.out.println("Inserisci modello:");
                    String modello = in.next();
                    System.out.println("Inserisci prezzo:");
                    double prezzo = in.nextDouble();
                    Auto a = new Auto(marca, modello, prezzo);
                    break;
                case 2:
                    System.out.println(Auto.getAuto());
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Scelta non valida");
                    break;
            }
        }
    }
}