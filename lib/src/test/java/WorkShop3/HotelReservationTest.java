package WorkShop3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HotelReservationTest {

	@Test
	public void givenHotelDetails_WhenValuesEnteredAreCorrect_ShoulReturnTrue() {
		// create a object of HotelReservation service class.
		HotelReservation hotelReservationService = new HotelReservation();
		// create a boolean variable to assign
		boolean isValidHotel_1 = hotelReservationService.addHotel("Lakewood", 3, 110);
		// assertTrue method is check program is working based on required condition
		Assertions.assertTrue(isValidHotel_1);
		boolean isValidHotel_2 = hotelReservationService.addHotel("Bridgewood", 4, 16);
		Assertions.assertTrue(isValidHotel_2);
		boolean isValidHotel_3 = hotelReservationService.addHotel("Ridgewood", 5, 220);
		Assertions.assertTrue(isValidHotel_3);
	}

}
