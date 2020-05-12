package videostore;

public class RegularPriceCode extends PriceCode {
    public RegularPriceCode(int priceCode) {
        super(priceCode);
    }

    @Override
    double calculatePrice(int daysRented) {
        double thisAmount = 2;
        if (daysRented > 2)
            thisAmount += (daysRented - 2) * 1.5;
        return thisAmount;
    }

    @Override
    int calculateFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
