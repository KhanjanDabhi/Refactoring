

public class TextReport implements Report{
	public String footerLine(double totalAmount, int frequentRenterPoints) {
		String result = "Total = $" + totalAmount + "\n";
		result += "Frequent renter points = " + frequentRenterPoints + "\n";
		return result + "---\n";
	}
	//start from step 11 in project 2
	public String headerLine(String name2) {
		return "Rentals: " + name2 + "\n";
	}
	public String rentalLine(int daysRented, String title, double charge) {
		return daysRented +
				" days of '" + title +
				"' $" + charge + "\n";
	}
	

}
