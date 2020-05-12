package videostore;

public class Movie {

    public static final int  CHILDRENS = 2;
    public static final int  REGULAR = 0;
    public static final int  NEW_RELEASE = 1;

    private String title;
    private PriceCode priceCode;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = new PriceCode(priceCode);
    }

    public PriceCode getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int arg) {
        this.priceCode = new PriceCode(arg);
    }

    public String getTitle (){
        return title;
    };
}


