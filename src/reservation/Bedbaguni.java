package reservation;

import java.awt.Menu;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Bedbaguni {

	private static Bedbaguni instance;

	// 장바구니역할을 해줄 배열방.
	public static ArrayList<BedMenu> buylist = new ArrayList<BedMenu>();

	// 각 메뉴의 갯수를 정할 수 있는 수량설정값, 1~9까지 조작가능
	public static int person = 1;
	public static int count1 = 0;
	public static int count2 = 0;
	public static int count3 = 0;
	public static int count4 = 0;

	// 해당 클래스의 객체를 갖고갑니다
	public static Bedbaguni getMyMenu() {
		if (instance == null) {
			instance = new Bedbaguni();
		}
		return instance;
	}

	// 장바구니에 담는 메서드
	public static void add(BedMenu m) {
		buylist.add(m);
		JOptionPane.showMessageDialog(null, m.getName() + "을 장바구니에 담았습니다.");
	}

	// 장바구니를 비우는 메서드
	public static void clear() {
		buylist.clear();
		JOptionPane.showMessageDialog(null, "장바구니를 비웠습니다.");
	}

	public static void countmenu1(int c) {
		count1 = c; // single
	}

	public static void countmenu2(int c) {
		count2 = c; // double
	}


	public static void countmenu3(int c) {
		count3 = c; // queen
	}

	public static void countmenu4(int c) {
		count4 = c; // king
	}

	public static void person(int c) {
		person = c;
	}

	// 모든 count 초기화
	public static void resetcount() {
		Bedbaguni.count1 = 0;
		Bedbaguni.count2 = 0;
		Bedbaguni.count3 = 0;
		Bedbaguni.count4 = 0;
        Bedbaguni.person = 1;
	}

}
