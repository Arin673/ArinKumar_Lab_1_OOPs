import java.util.List;

class Hotel {
	private String hotelName;
	private String address;
	private int totalfloor;
	private int totalroom;
	private float rating;
	private String catgoryOfHotel;
	
	private List<Room> rooms;

	private Booking booking;
	
	public Hotel(String hotelName,String address,int totalfloor,int totalroom,  float rating, String catgoryOfHotel ) {
		this.totalroom = totalroom;
		this.totalfloor = totalfloor;
		this.rating = rating;
		this.catgoryOfHotel = catgoryOfHotel;
		this.hotelName = hotelName;
		this.address = address;
	}
	
	public int getTotalroom() {
		return totalroom;
	}

	public int getTotalfloor() {
		return totalfloor;
	}

	public float getRating() {
		return rating;
	}

	public String getCatgoryOfHotel() {
		return catgoryOfHotel;
	}

	public String getHotelName() {
		return hotelName;
	}

	public String getAddress() {
		return address;
	}



	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	} 
	
	public List<Room> getRooms() {
		return rooms;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	
	
	

}