package abstractClasses;

import java.io.Closeable;
import java.io.InputStream;

class NetworkCurrencyLoader extends AbstractCurrencyLoader {

    @Override
    protected Closeable getInputStream() {
        try {
            return new java.net.URL("http://www.usman.cloud/banking/exchange-rate.csv").openStream();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}