package children;
//java 06_pdf
//문제02(어린이 구슬- 클래스)
public class Children {
	
	
	int numOfCystal;
	
	void win(int Cystal) { //이길때
		numOfCystal += Cystal;
	}
	void lose(int Cystal) { //질때
		numOfCystal -= Cystal;
	}
	void haveCystal() { //현재보유구슬
		System.out.println("현재 보유한 구슬:" + numOfCystal);
	}
	

}
