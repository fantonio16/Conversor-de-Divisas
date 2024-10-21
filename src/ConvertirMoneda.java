import java.util.Scanner;

public class ConvertirMoneda {
    public static  void convertir (String monedaBase, String monedaTarget, ConsultarMoneda consulta, Scanner lectura){
    double cantidad;
    double cantidadConvertida;

    Moneda moneda = consulta.buscarmonedas(monedaBase,monedaTarget);
        System.out.println("La tasa de cambio para el dia de hoy es\n " + monedaBase + "=" + moneda.conversion_rate() + " "+ monedaTarget);
        System.out.println("ingrese la cantidad de " + monedaBase);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * moneda.conversion_rate();
        System.out.println(cantidad + " " + monedaBase + " " + cantidadConvertida + " " + moneda.target_code());

    }
    public static void convertirOtraMoneda(ConsultarMoneda consulta, Scanner lectura){
            System.out.println("ingrese el codigo de la moneda base: " );
            String monedaBase = lectura.nextLine().toUpperCase();
            System.out.println("ingrese la moneda objetivo:  " );
            String monedaObjetivo = lectura.nextLine().toUpperCase();
            convertir(monedaBase, monedaObjetivo, consulta, lectura);

    }
}
