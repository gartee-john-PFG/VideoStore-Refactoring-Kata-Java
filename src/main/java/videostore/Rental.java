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
        return priceCode.calculatePrice(daysRented);
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
