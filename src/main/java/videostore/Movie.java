package videostore;

public class Movie {

    public static final int  CHILDRENS = 2;
    public static final int  REGULAR = 0;
    public static final int  NEW_RELEASE = 1;

    private String title;
    private PriceCode priceCode;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.setPriceCode(priceCode);
    }

    public PriceCode getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int arg) {
        switch (arg) {
            case Movie.REGULAR:
                this.priceCode = new RegularPriceCode(arg);
                break;
            case Movie.NEW_RELEASE:
                this.priceCode = new NewReleasePriceCode(arg);
                break;
            case Movie.CHILDRENS:
                this.priceCode = new ChildrensPriceCode(arg);
                break;
        }
    }

    public String getTitle (){
        return title;
    };
}


