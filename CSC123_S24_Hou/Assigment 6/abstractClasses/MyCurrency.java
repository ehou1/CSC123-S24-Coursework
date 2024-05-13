package abstractClasses;

class MyCurrency {
    private String currencyCode;
    private double exchangeRate;

    public MyCurrency(String currencyCode, double exchangeRate) {
        this.currencyCode = currencyCode;
        this.exchangeRate = exchangeRate;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }
}