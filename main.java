import java.util.Scanner;

public class metode6 {
    public static void main(String[] args){
        int opcion=0;
        int area=0;
        int h=0;
        int radi=0;
        opcion = EscullOpcio();

        switch (opcion) {
            case 1:
                radi= demanarradi();
                h= demanarh();
                double resultata = calculararea(radi, h);
                System.out.println("La area és: "+resultata);
                break;
            case 2:
                radi= demanarradi();
                h= demanarh();
                double resultatv = calcularvolume(radi, h);
                System.out.println("El volumen és: "+resultatv);

                break;
            default:
                System.out.println("Opció invàlida.");
        }
    }

    private static int EscullOpcio() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("OPCIONS:");
        System.out.println("1-Area");
        System.out.println("2-Volum");
        System.out.println("Escull una opció: ");
        return scanner.nextInt();
    }

    private static int demanarradi( ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el radio: ");
        return scanner.nextInt();
    }
    private static int demanarh() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la altura: ");
        return scanner.nextInt();

    }

    private static double calculararea(int radi, int h) {
        return 2*Math.PI*radi*(radi+h);
    }

    private static double calcularvolume(int radi, int h){
        return Math.PI*(radi*radi)*h;
    }
}
