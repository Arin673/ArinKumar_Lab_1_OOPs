public class BookingRequest {
	private String occupancy;
	private String amenityName;
	private String floor;
	
	

	public BookingRequest(String occupancy, String amenityName, String floor) {
		this.occupancy = occupancy;
		this.amenityName = amenityName;
		this.floor=floor;
	}

	public String getOccupancy() {
		return occupancy;
	}

	public String getAmenityName() {
		return amenityName;
	}
	
	public String getFloor() {
		return floor;
	}
	
}