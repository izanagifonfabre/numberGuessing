import java.util.Scanner;

public class Main {

    //Función para implementar el juego
    public static void adivinaElNumero() {
        //Inicializamos el Scanner
        Scanner scanner = new Scanner(System.in);

        //Generamos el numero y declaramos las variables que utilizaremos
        int numero = 1 + (int)(100 * Math.random());
        int input;
        int intentos = 5;
        int i;
        int nuevosIntentos;

        System.out.println("Se ha generado un número de 1 a 100. Tienes 5 intentos para adivinarlo ¡Mucha suerte!");

        //Escribimos el loop del juego
        for (i = 0; i < intentos; i++){
            System.out.println("Ingrese un número:");
            input = scanner.nextInt();
            if (input == numero){
                System.out.println("¡Felicidades! ¡Acertaste!");
                break;
            } else if (input > numero && i != intentos - 1){
                System.out.println("El número secreto es menor a " + input + ".");
                nuevosIntentos = (intentos - (i + 1));
                System.out.println("Te queda(n) " + nuevosIntentos + " intento(s)");
            } else if (input < numero && i != intentos - 1){
                System.out.println("El número secreto es mayor a " + input + ".");
                nuevosIntentos = (intentos - (i + 1));
                System.out.println("Te queda(n) " + nuevosIntentos + " intento(s)");
            }
        }
        if (intentos == i){
            System.out.println("Te quedaste sin intentos. El número era: " + numero);
        }
    }

    public static void main(String[] args){
        adivinaElNumero();
    }
}