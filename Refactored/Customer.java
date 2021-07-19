

import java.util.*;

public class Customer {
    private String name;
    @SuppressWarnings("rawtypes")
	private List rentals = new ArrayList();

    public Customer(String name) {
	this.name = name;
    }
    public String getName() {
	return name;
    }
    
	public void addRental(Rental arg) {
	rentals.add(arg);
    }
	public String statement() {
		return statement(new TextReport());
	}
    public String statement(Report report) {
	double totalAmount = 0;
	int frequentRenterPoints = 0;
	
	
	String result = report.headerLine(getName());
	for(
	Iterator rentalIterator = rentals.iterator();rentalIterator.hasNext();) {
	
	    double charge = 0;
	    Rental rental = (Rental) rentalIterator.next();

	    //determine amounts for each line
	    charge = rental.charge();
	    // add frequent renter points
	    frequentRenterPoints += rental.frequentRenterPoints();

	    

	    //show figures for this rental

	    result += rental.rentalLine(report);
	    totalAmount += charge;
	}
	//add footer lines
	
	return result+report.footerLine(totalAmount, frequentRenterPoints);
	
    }
    public String htmlStatement() {
    	return statement(new HtmlReport());}
	

}

