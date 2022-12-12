package WorkShop3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HotelReservationTest {

	@Test//true test-case
	public void givenHotelDetails_WhenValuesEnteredAreCorrect_ShoulReturnTrue() throws InvalidHotelDetailsException {
		// create a object of HotelReservation service class.
		HotelReservation hotelReservationService = new HotelReservation();
		// create a boolean variable to assign
		try {
		boolean isValidHotel_1 = hotelReservationService.addHotel("Lakewood", 3);
		Assertions.assertTrue(isValidHotel_1);//true
		}catch (InvalidHotelDetailsException e){//handle exception
            System.out.println("Invalid hotel details" + e);
        }
	}
	@Test//false test-case
	public void givenHotelDetails_WhenValuesEnteredAreCorrect_ShoulReturnfalse() throws InvalidHotelDetailsException {
		// create a object of HotelReservation service class.
		HotelReservation hotelReservationService = new HotelReservation();
		// create a boolean variable to assign
		try {
		boolean isValidHotel_1 = hotelReservationService.addHotel("Haritha", 5);
		Assertions.assertFalse(isValidHotel_1);
		}catch (InvalidHotelDetailsException e){//handle exception
            System.out.println("Invalid hotel details" + e);
        }
	}

}
