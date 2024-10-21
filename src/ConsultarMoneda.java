import com.google.gson.Gson;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.URI;
import java.net.http.HttpResponse;


public class ConsultarMoneda {
    public Moneda buscarmonedas(String monedaBase, String monedaTrget ) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/f2c7fd146338c765dfbf03c4/latest/USD" + monedaBase + "/" + monedaTrget);



        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("direccion"))
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        }
        catch (Exception e){
            throw new RuntimeException("NO se encontro la moneda seleccionada");
        }

    }
}
