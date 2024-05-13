package abstractClasses;

import java.io.InputStream;

class NetworkCurrencyLoader extends AbstractCurrencyLoader {

	public static void main(String[] args)
	@Override
    protected InputStream getInputStream() {
        try {
            return new java.net.URL("http://www.usman.cloud/banking/exchange-rate.csv").openStream();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}