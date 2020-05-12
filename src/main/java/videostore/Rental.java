package videostore;

class Rental {
    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }
    public int getDaysRented() {
        return daysRented;
    }
    public Movie getMovie() {
        return movie;
    }

    double determineAmount() {
        PriceCode priceCode = getMovie().getPriceCode();
        int daysRented = getDaysRented();
        return calculatePrice(priceCode, daysRented);
    }

    private double calculatePrice(PriceCode priceCode, int daysRented) {
        double thisAmount = 0;
        switch (priceCode.getPriceCode()) {
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

    int determineFrequentRenterPoints() {
        PriceCode priceCode = getMovie().getPriceCode();
        int daysRented = getDaysRented();
        return calculateFrequentRenterPoints(priceCode, daysRented);
    }

    private int calculateFrequentRenterPoints(PriceCode priceCode, int daysRented) {
        int frequentRenterPoints = 1;
        switch (priceCode.getPriceCode()) {
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
