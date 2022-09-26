class Booking{
	private int roomId;
	private String floor;
	private String occupancy;
	private String AC;
	
	public Booking(int roomId, String floor, String occupancy,String AC) {
		this.roomId = roomId;
		this.floor = floor;
		this.occupancy = occupancy;
		this.AC= AC;
	}
	
	public int getRoomId() {
		return roomId;
	}
	public String getFloor() {
		return floor;
	}
	public String getOccupancy() {
		return occupancy;
	}
	
	public String getAC() {
		return AC;
	}
	
	
	
	public int estimatedprice(String occupancy,String AC) {
		int addcharges;
		if(AC.equals("AC"))
			addcharges=1000;
		else
			addcharges=0;
		switch(occupancy) {
		case "Single": return 2000+addcharges;
		case "Double": return 3000+addcharges;
		case "Triple": return 4000+addcharges;
		}
		return 0;
	}

}