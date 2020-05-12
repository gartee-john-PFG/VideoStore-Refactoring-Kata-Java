package videostore;

public abstract class PriceCode {
    private int priceCode;

    public PriceCode(int priceCode) {
        this.priceCode = priceCode;
    }

    public int getPriceCode() {
        return priceCode;
    }

    abstract double calculatePrice(int daysRented);

    abstract int calculateFrequentRenterPoints(int daysRented);
}
