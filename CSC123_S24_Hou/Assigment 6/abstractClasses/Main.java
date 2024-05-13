package abstractClasses;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        AbstractCurrencyLoader fileLoader = new FileCurrencyLoader();
        Map<String, MyCurrency> fileCurrencies = fileLoader.loadCurrencies();
        System.out.println("File currencies:");
        printCurrencies(fileCurrencies);

        AbstractCurrencyLoader networkLoader = new NetworkCurrencyLoader();
        Map<String, MyCurrency> networkCurrencies = networkLoader.loadCurrencies();
        System.out.println("\nNetwork currencies:");
        printCurrencies(networkCurrencies);
    }

    private static void printCurrencies(Map<String, MyCurrency> currencies) {
        for (Map.Entry<String, MyCurrency> entry : currencies.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().getExchangeRate());
        }
    }
}