package children;

//java 06_pdf
//����02(��� ����-����)
public class ChildrenMain {

	public static void main(String[] args) {

		Children child1 = new Children();
		Children child2 = new Children();

		child1.numOfCystal = 15; //���1�ڻ�
		child2.numOfCystal = 9; //���2�ڻ�
		
		//1������
		child1.win(2);
		child2.lose(2);
		
		//2������                                                                                                                               
		child1.lose(7);
		child2.win(7);

		System.out.println("���1");
		child1.haveCystal();

		System.out.println("���2");
		child2.haveCystal();

	}

}
