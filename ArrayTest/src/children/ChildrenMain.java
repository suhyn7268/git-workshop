package children;

//java 06_pdf
//문제02(어린이 구슬-메인)
public class ChildrenMain {

	public static void main(String[] args) {

		Children child1 = new Children();
		Children child2 = new Children();

		child1.numOfCystal = 15; //어린이1자산
		child2.numOfCystal = 9; //어린이2자산
		
		//1차게임
		child1.win(2);
		child2.lose(2);
		
		//2차게임                                                                                                                               
		child1.lose(7);
		child2.win(7);

		System.out.println("어린이1");
		child1.haveCystal();

		System.out.println("어린이2");
		child2.haveCystal();

	}

}
