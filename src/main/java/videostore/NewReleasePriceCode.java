package videostore;

public class NewReleasePriceCode extends PriceCode {
    public NewReleasePriceCode(int priceCode) {
        super(priceCode);
    }

    @Override
    double calculatePrice(int daysRented) {
        double thisAmount = 0;
        switch (getPriceCode()) {
            case Movie.REGULAR:
                thisAmount += 2;
                if (daysRented > 2)
                    thisAmount += (daysRented - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                thisAmount += daysRented * 3;
                break;
            case Movie.CHILDRENS:
                thisAmount += 1.5;
                if (daysRented > 3)
                    thisAmount += (daysRented - 3) * 1.5;
                break;
        }
        return thisAmount;
    }

    @Override
    int calculateFrequentRenterPoints(int daysRented) {
        int frequentRenterPoints = 1;
        switch (getPriceCode()) {
            case Movie.REGULAR:
                break;
            case Movie.NEW_RELEASE:
                if (daysRented > 1) {
                    frequentRenterPoints = 2;
                }
            case Movie.CHILDRENS:
                break;
        }
        return frequentRenterPoints;
    }
}
