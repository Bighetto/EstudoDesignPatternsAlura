package http;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class JavaHttpClient implements HttpAdapter{

    @Override
    public void post(String url, Map<String, Object> dados) {
        try {
            URL urlDaApi = new URL(url);
            URLConnection connection = urlDaApi.openConnection();
            connection.connect();
        } catch (MalformedURLException e) {
            throw new RuntimeException("Erro ao enviar requisicao HTTP!",e);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
