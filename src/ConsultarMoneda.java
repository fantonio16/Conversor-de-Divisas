import com.google.gson.Gson;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.URI;
import java.net.http.HttpResponse;

public class ConsultarMoneda {

    // Reemplaza 'tu-api-key' con tu propia clave de la API de exchangerate-api
    private static final String API_KEY = "f2c7fd146338c765dfbf03c4";

    // Método para buscar la tasa de cambio entre dos monedas
    public Moneda buscarMonedas(String monedaBase, String monedaTarget) {
        // Construir la URL correcta para la API con la moneda base y de destino
        String url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/" + monedaBase + "/" + monedaTarget;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        try {
            // Enviar la solicitud y obtener la respuesta en formato JSON
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            // Parsear el JSON de la respuesta en un objeto Moneda usando Gson
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("No se encontró la moneda seleccionada", e);
        }
    }
}






