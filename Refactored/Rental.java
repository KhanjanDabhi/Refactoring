

public class Rental {

    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
	this.movie = movie;
	this.daysRented = daysRented;
    }

    double charge() {
		
		return movie.charge(daysRented);

	}

	public int frequentRenterPoints() {
		
		
		if (movie.isNewRelease() && daysRented > 1) return 2;
        else return 1;
		
	}

	public String rentalLine(Report report) {
		return report.rentalLine(daysRented,movie.getTitle(),charge());
		
	}
    
}

