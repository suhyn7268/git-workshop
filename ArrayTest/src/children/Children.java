package children;
//java 06_pdf
//����02(��� ����- Ŭ����)
public class Children {
	
	
	int numOfCystal;
	
	void win(int Cystal) { //�̱涧
		numOfCystal += Cystal;
	}
	void lose(int Cystal) { //����
		numOfCystal -= Cystal;
	}
	void haveCystal() { //���纸������
		System.out.println("���� ������ ����:" + numOfCystal);
	}
	

}
