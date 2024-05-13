package abstractClasses;

class FileCurrencyLoader extends AbstractCurrencyLoader {

    @Override
    protected InputStream getInputStream() {
        try {
            return getClass().getClassLoader().getResourceAsStream("currencies.csv");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}