package videostore;

public class ChildrensPriceCode extends PriceCode {
    public ChildrensPriceCode(int priceCode) {
        super(priceCode);
    }

    @Override
    double calculatePrice(int daysRented) {
        double thisAmount = 0;
        thisAmount += 1.5;
        if (daysRented > 3)
            thisAmount += (daysRented - 3) * 1.5;
        return thisAmount;
    }

    @Override
    int calculateFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
