package reservation;

public class GetSet_CheckDate{
	String checkInDate;
	String checkOutDate;

	public String getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(String checkInDate) {
		this.checkInDate = checkInDate;
	}

	public String getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	
	@Override
	public String toString() {
		return "Check In Date : "+checkInDate+
				"\nCheck Out Date : "+checkOutDate+"\n";
	}
	
}
