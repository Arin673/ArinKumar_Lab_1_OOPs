import java.util.List;

class Room {
	private int roomId;
	private String occupancy;
	private boolean roomStatus;
	private String floor;
	private String AC;
	
	public Room(int RoomId,String occupancy,boolean roomStatus, String floor,String AC){
		this.roomId= RoomId;
		this.occupancy= occupancy;
		this.roomStatus = roomStatus;
		this.floor = floor;
		this.AC = AC;
	}

	public int getRoomId() {
		return roomId;
	}

	public String getOccupancy() {
		return occupancy;
	}

	public boolean isRoomStatus() {
		return roomStatus;
	}
	
	public void setRoomStatus(boolean roomStatus) {
		this.roomStatus = roomStatus;
	}

	public String getFloor() {
		return floor;
	}

	public String getAC() {
		return AC;
	}
	
}