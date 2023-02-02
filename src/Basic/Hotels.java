package Basic;

import reservation.BedCollect;
import reservation.Bedbaguni;

public class Hotels {
	
	 private Hotels() {}
	 
	 public static Hotels getInstance()
	 {
		 if(instance == null)
		 {
			 instance = new Hotels();
		 }
		 
		 return instance;
	 }
	 
	 public void finalConfirm(String _name, String _address, String _number, String _date,
			 				String _roomType, int _personCnt, int _totalPrice, boolean _finish) 
	 {
		 m_hotelName  = _name;
		 m_hotelAdr   = _address;
		 m_hotelNum   = _number;
		 m_date 	  = _date;
		 m_roomType   = _roomType;
		 m_personCnt  = _personCnt;
		 m_totalPrice = _totalPrice;
		 m_finish	  = _finish;
	 }
	 
	 public String hotelInfo()
	 {
		 return "◎예약정보◎\n" 
			  + "\n◎호텔이름◎: " + m_hotelName
			  + "\n◎호텔주소◎: " + m_hotelAdr
			  + "\n◎호텔번호◎: " + m_hotelNum
			  + "\n◎예약날짜◎: " + m_date
			  + "\n◎룸 타입◎: " + m_roomType
			  + "\n◎인원 수◎: " + m_personCnt
		 	  + "\n◎총 가격◎: " + m_totalPrice;
		 
	 }
	
	 
//	 public final String HotelsName()  		{ return m_hotelName; }
//	 public final String HotelsAdr() 		{ return m_hotelAdr;  }
//	 public final String HotelsNum()  		{ return m_hotelNum;  }
//	 public final String HotelsDate()  		{ return m_date; 	  }
//	 public final String HotelsRoom()  		{ return m_roomType;  }
//	 public final int HotelsPersonCnt()  	{ return m_personCnt; }
//	 public final int HotelsTotalPrice()  	{ return m_totalPrice; }
	 public final boolean reservationed() 	{ return m_finish;    }
	 
	 
	 // Hotel varivable
	 private static Hotels instance;
	 private String m_hotelName;
	 private String m_hotelAdr;
	 private String m_hotelNum;
	 private String m_date;
	 private String m_roomType;
	 private int 	m_personCnt;
	 private int 	m_totalPrice;
	 private boolean m_finish = false;
}
