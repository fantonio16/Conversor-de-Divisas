import java.util.Scanner;

public class conversor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("******************************************************************");

        System.out.println("******* bienvenido a su conversor favorito ********");


        System.out.println("1. Dolar a pesos argentinos \n" +
                "2. Peso argentino a dolar \n" +
                "3. Dolar a real brasileño \n" +
                "4. Real brasileño a dolar \n" +
                "5. Dolar a peso colombiano \n" +
                "6. Peso colombiano a dolar \n" +
                "7. Salir.");

        System.out.println("Elija la opcion deseada por favor: ");
        int opcion = scanner.nextInt();

        System.out.print("Ingresa el valor a convertir: ");
        int valor = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Seleccionaste la Opción 1 con valor: " + valor);
                break;
            case 2:
                System.out.println("Seleccionaste la Opción 2 con valor: " + valor);
                break;
            case 3:
                System.out.println("Seleccionaste la Opción 3 con valor: " + valor);
                break;
            case 4:
                System.out.println("Seleccionaste la Opción 4 con valor: " + valor);
                break;
            case 5:
                System.out.println("Seleccionaste la Opción 5 con valor: " + valor);
                break;
            case 6:
                System.out.println("Seleccionaste la Opción 6 con valor: " + valor);
                break;
            case 7:
                System.out.println("Seleccionaste la Opción 7 con valor: " + valor);
                break;
            default:
                System.out.println("Opción no válida.");

        }

        scanner.close();

        System.out.println("******************************************************************");

    }
}
