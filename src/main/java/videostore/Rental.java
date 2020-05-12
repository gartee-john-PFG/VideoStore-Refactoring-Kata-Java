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
        return priceCode.calculateFrequentRenterPoints(daysRented);
    }

}
