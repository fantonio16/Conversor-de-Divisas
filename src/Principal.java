import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();

        int opcion = 0;
        while (opcion != 7){
            System.out.println(
                    "ingrese la Opcion deseada\n"+
                    "1. Dolar a pesos argentinos\n" +
                    "2. Peso argentino a dolar \n" +
                    "3. Dolar a real brasileño \n" +
                    "4. Real brasileño a dolar \n" +
                    "5. Dolar a peso colombiano \n" +
                    "6. Peso colombiano a dolar \n" +
                    "7. Salir.");
            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion) {
                case 1:
                    ConvertirMoneda.convertir(monedaBase: "USD", monedaTarget: "ARS" , consulta, lectura);
                    break;
                case 2:
                    ConvertirMoneda.convertir(monedaBase:  "ARS", monedaTarget: "USD" , consulta, lectura);
                    break;
                case 3:
                    ConvertirMoneda.convertir(monedaBase: "USD", monedaTarget: "BRL" , consulta, lectura);
                    break;
                case 4:
                    ConvertirMoneda.convertir(monedaBase: "BRL", monedaTarget: "USD" , consulta, lectura);
                    break;
                case 5:
                    ConvertirMoneda.convertir(monedaBase: "USD", monedaTarget: "COP" , consulta, lectura);
                    break;
                case 6:
                    ConvertirMoneda.convertir(monedaBase: "COP", monedaTarget: "USD" , consulta, lectura);
                    break;
                case 7:
                    System.out.println("Gracias por usar nuestro servicio de conversion de monedas, hasta pronto.");;
                    break;
                default:
                    System.out.println("Opción no válida.");

            }

        }

    }
}
