package reservation;


import java.util.ArrayList;

public class BedCollect {
	
	public static String Bedinformation;
	
	private static ArrayList<BedMenu> single = new ArrayList<BedMenu>();
	private static ArrayList<BedMenu> two = new ArrayList<BedMenu>();
	private static ArrayList<BedMenu> Queen = new ArrayList<BedMenu>();
	private static ArrayList<BedMenu> king = new ArrayList<BedMenu>();
	
	public static ArrayList<BedMenu> single(){
		Bedinformation="[1인가격 :60000 원]"
				+ "\r\n싱글베드! \r\n"
	            +"혼자자기 너무좋은 사이즈\r\n"
				+"지금바로 예약하세요!\r\n";
		
		BedMenu m1 = new BedMenu("싱글베드" ,60000,"\n혼자옵서예? 이거하이소!");
		single.add(m1);
		return single;
	}
	public static ArrayList<BedMenu> two(){
		Bedinformation="[1인가격 :120000 원]"
				+"\r\nTwoBed사이즈!\r\n"+"사이즈가 셋도들어가겠다 싶은 사이즈!\r\n";
		BedMenu m1 = new BedMenu("투베드",120000,"\n투베드 여기가 제일싸요!");
		two.add(m1);
		return two;
		
	}
	public static ArrayList<BedMenu> Queen(){
		Bedinformation="[1인가격 :200000 원]"
				+"\r\n퀸 사이즈 침대!\r\n"+"퀸이랑 킹이랑 헷갈릴정도로 큰사이즈!\r\n"+"이거 하쉴?\r\n";
		BedMenu m1 = new BedMenu("퀸사이즈",200000,"\n킹같은 퀸사이즈! \n하지만 킹은 아니란거~");
		Queen.add(m1);
		return Queen;
	}
	public static ArrayList<BedMenu> king(){
		Bedinformation="[1인가격 :250000 원]"
				+"\r\n진짜 거대하다 킹사이즈!\r\n"+"비교할수없는 푹신함은 덤!\r\n침대는 킹싸이즈 아입니까~\r\n";
		BedMenu m1 = new BedMenu("킹사이즈",250000,"\n 쪼매 비싸도 진짜 킹이에요잉~");
		king.add(m1);
		return king;
	}
}
