package apicalls.catalog;

import apicalls.ApiBaseCall;
import dtos.catalog.SearchOfferedProductsByResponse;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.ssl.SSLContextBuilder;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

public class SearchOfferedProductsByCall extends ApiBaseCall {

    private String path = "/api/v0.1/searchOfferedProductsBy";

    SearchOfferedProductsByResponse searchOfferedProductsByResponse = new SearchOfferedProductsByResponse();

    public SearchOfferedProductsByResponse findProduct(){
        setupGETCallForHost(getCatalogHost(), path + "?page=1&per_page=5");

        try {

            HttpResponse response = setupSSLIgnoreClient().execute(get);

            System.out.println("SearchOfferedProductsBy call: " + response.getStatusLine().toString());

            searchOfferedProductsByResponse = retrieveResourceFromResponse(response, SearchOfferedProductsByResponse.class);
        } catch(Exception e){e.getStackTrace();}

        return searchOfferedProductsByResponse;
    }

    public HttpClient setupSSLIgnoreClient(){
        HttpClient client = HttpClientBuilder.create().build();
        try {
            HttpClientBuilder b = HttpClientBuilder.create();

            SSLContext sslContext = new SSLContextBuilder().loadTrustMaterial(null, new TrustStrategy() {
                public boolean isTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {
                    return true;
                }
            }).build();
            b.setSslcontext(sslContext);

            // or SSLConnectionSocketFactory.getDefaultHostnameVerifier(), if you don't want to weaken
            HostnameVerifier hostnameVerifier = SSLConnectionSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER;

            SSLConnectionSocketFactory sslSocketFactory = new SSLConnectionSocketFactory(sslContext, hostnameVerifier);
            Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory>create()
                    .register("http", PlainConnectionSocketFactory.getSocketFactory())
                    .register("https", sslSocketFactory)
                    .build();

            // allows multi-threaded use
            PoolingHttpClientConnectionManager connMgr = new PoolingHttpClientConnectionManager(socketFactoryRegistry);
            b.setConnectionManager(connMgr);

            client = b.build();
            return client;
        }catch(Exception e){e.getStackTrace();}

        return client;
    }

}
