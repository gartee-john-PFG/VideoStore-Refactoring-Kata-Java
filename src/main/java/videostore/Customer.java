package videostore;

import java.util.Vector;

class Customer {
    private String name;
    private Vector<Rental> rentals = new Vector<Rental>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.addElement(arg);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        String result = "Rental Record for " + getName() + "\n";
        for (Rental rental : rentals) {
            double thisAmount = rental.determineAmount();

            frequentRenterPoints += determineFrequentRenterPoints(rental);

            result += "\t" + rental.getMovie().getTitle() + "\t" +
                    String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;

        }
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) +
                " frequent renter points";
        return result;
    }

    private int determineFrequentRenterPoints(Rental rental) {
        if ((rental.getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
                rental.getDaysRented() > 1)
            return 2;
        return 1;
    }

}