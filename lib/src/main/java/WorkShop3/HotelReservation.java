package WorkShop3;

import java.util.*;

public class HotelReservation {
	static List<Hotel> list = new ArrayList<>();

	// create an object of hotel class
	Hotel hotels = new Hotel();;

	public Boolean addHotel(String hotelName, int rating) throws InvalidHotelDetailsException {
		// set method using to set the values of variables
		hotels.setHotelName(hotelName);
		hotels.setRating(rating);
		// adding to list.
		list.add(hotels);
		boolean result = true;// initialize result variable
		if (!result) {
			throw new InvalidHotelDetailsException("Invalid hotel details");// throw invalid exception
		} else {
			return true;
		}

	}

	public static void main(String[] args) {
		System.out.println("-----------Welcome to HotelReservatio-------------- ");
		
	}
}
