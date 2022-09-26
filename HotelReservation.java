import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class HotelReservation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hotel hotel = new Hotel("RAMBAGH PALACE","Jaipur",2,7,4.5f,"5 Star");
	    
		Room room1 = new Room(101,"Single",false,"1","AC");
		Room room2 = new Room(102,"Double",false,"1","AC");
		Room room3 = new Room(103,"Double",false,"1","nonAC");
		Room room4 = new Room(201,"Single",false,"2","AC");
		Room room5 = new Room(202,"Single",false,"2","nonAC");
		Room room6 = new Room(203,"Double",false,"2","AC");
		Room room7 = new Room(204,"Triple",false,"2","AC");
		
		hotel.setRooms(Arrays.asList(room1,room2,room3,room4,room5,room6,room7));
		
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("");
			System.out.println("Welcome to RAMBAGH PALACE!");
		
			System.out.println("Which type of occupency are you looking for ?");
			String input1 = in.next();
			
			System.out.println("Do you need AC or nonAC room ?");
			String input2 = in.next();
			
			System.out.println("Which floor: any/1/2 ?");
			String input3 = in.next();
			
			BookingRequest booking = new BookingRequest(input1,input2,input3);
			
			List<Room> rooms=hotel.getRooms();
			boolean isAvailable =true;
			for(Room room:rooms) {
				if ((booking.getFloor().equals(room.getFloor()) && booking.getOccupancy().equals(room.getOccupancy()))) {
					if(room.isRoomStatus()==false && booking.getAmenityName().equals(room.getAC())) {
						Booking bookings = new Booking(room.getRoomId(),room.getFloor(),room.getOccupancy(),room.getAC());
						hotel.setBooking(bookings);;
						Booking book = hotel.getBooking();
						System.out.println("Room number: "+book.getRoomId()+", floor no: " +book.getFloor()+", "+book.getAC()+", "+ book.getOccupancy()+" Occupancy, estimated cost:- "+ book.estimatedprice(room.getOccupancy(),room.getAC()));
						room.setRoomStatus(true);
						isAvailable =true;
						break;
						}
					else {
						isAvailable =false;
					}
					
					}
				else if(booking.getFloor().equals("any")) {
					if ((booking.getOccupancy().equals(room.getOccupancy()))) {
						if(room.isRoomStatus()==false && booking.getAmenityName().equals(room.getAC())) {
							Booking bookings = new Booking(room.getRoomId(),room.getFloor(),room.getOccupancy(),room.getAC());
							hotel.setBooking(bookings);;
							Booking book = hotel.getBooking();
							System.out.println("Room number: "+ book.getRoomId()+", floor no:"+book.getFloor()+", "+book.getAC()+", "+ book.getOccupancy()+" Occupancy, estimated cost:- "+ book.estimatedprice(room.getOccupancy(),room.getAC()));
							room.setRoomStatus(true);
							isAvailable =true;
							break;
							}
						else {
							isAvailable =false;
						}
						}
					
					}
				else {
					isAvailable =false;
				}
				
				}
			if(isAvailable==false) {
				System.out.println("Sorry, according to your preference,  " +booking.getOccupancy() + " occupany room is not avaliable in "+ hotel.getHotelName()+" Hotel");
			}
			}
		}
}