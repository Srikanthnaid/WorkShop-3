package WorkShop3;

public class HotelReservation {
	// create an object of hotel class
	Hotel hotels = new Hotel();;

	public Boolean addHotel(String hotelName, int rating, double RegularCustomerCost) {
		// set method using to set the values of variables
		hotels.setHotelName(hotelName);
		hotels.setRating(rating);
		hotels.setRegularCustomerCost(RegularCustomerCost);
		return true;
	}

	public static void main(String[] args) {
		System.out.println("-----------Welcome to HotelReservatio-------------- ");

	}
}
