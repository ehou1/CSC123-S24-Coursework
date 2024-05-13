package abstractClasses;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

abstract class AbstractCurrencyLoader {

    public Map<String, MyCurrency> loadCurrencies() {
        Map<String, MyCurrency> currencies = new HashMap<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String currencyCode = parts[0];
                    double exchangeRate = Double.parseDouble(parts[1]);
                    MyCurrency currency = new MyCurrency(currencyCode, exchangeRate);
                    currencies.put(currencyCode, currency);
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return currencies;
    }

    protected abstract String getInputStream();
}
