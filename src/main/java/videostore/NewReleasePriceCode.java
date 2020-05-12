package videostore;

public class NewReleasePriceCode extends PriceCode {
    public NewReleasePriceCode(int priceCode) {
        super(priceCode);
    }

    @Override
    double calculatePrice(int daysRented) {
        return daysRented * 3;
    }

    @Override
    int calculateFrequentRenterPoints(int daysRented) {
        int frequentRenterPoints = 1;
        if (daysRented > 1) {
            frequentRenterPoints = 2;
        }
        return frequentRenterPoints;
    }
}
