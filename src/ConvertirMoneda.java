import java.util.Scanner;

public class ConvertirMoneda {

    public static void convertir(double tasaCambio) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de USD: ");
        String input = scanner.nextLine();

        // Validar que el input no esté vacío
        if (input.isEmpty()) {
            System.out.println("Error: no se ha ingresado ninguna cantidad.");
            return;
        }

        try {
            double cantidadUSD = Double.parseDouble(input);
            double cantidadBRL = cantidadUSD * tasaCambio;
            System.out.println(cantidadUSD + " USD son " + cantidadBRL + " BRL.");
        } catch (NumberFormatException e) {
            System.out.println("Error: la cantidad ingresada no es un número válido.");
        }
    }

    public static void main(String[] args) {
        double tasaCambio = 0.0; // Este valor debería ser actualizado según la tasa de cambio actual
        System.out.println("La tasa de cambio para el día de hoy es USD=" + tasaCambio + " BRL");

        convertir(tasaCambio);
    }

    public static void convertir(String ars, String usd, ConsultarMoneda consulta, Scanner lectura) {
    }
}