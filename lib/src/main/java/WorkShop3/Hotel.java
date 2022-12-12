package WorkShop3;

public class Hotel {
	// Class Based variables
	String hotelName;
	int rating;
	double RegularCustomerCost;

	// default contractor
	public Hotel() {

	}

	// parameterized constructor
	public Hotel(String hotelName, int rating, double RegularCustomerCost) {
		this.hotelName = hotelName;
		this.rating = rating;
		this.RegularCustomerCost = RegularCustomerCost;

	}

	// creating getter and setter methods.
	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public double getRegularCustomerCost() {
		return RegularCustomerCost;
	}

	public void setRegularCustomerCost(double RegularCustomerCost) {
		this.RegularCustomerCost = RegularCustomerCost;
	}

	// to string method to print the output as single line.
	@Override
	public String toString() {
		return "Hotels [hotelName=" + hotelName + ", rating=" + rating + ", RegularCustomerPrice=" + RegularCustomerCost
				+ "]";
	}
}