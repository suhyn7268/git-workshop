package arr;

//java 08_pdf
//���� 1,4
public class Arr01 {

	public static void main(String[] args) {
// ���� 1
		int[] score = { 80, 87, 75, 45, 15, 20, 68 };

		int max = score[0];
		int min = score[0];

		for (int i = 1; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			}
			if (score[i] < min) {
				min = score[i];
			}
		}
		System.out.println("�ִ밪:" + max);
		System.out.println("�ּҰ�:" + min);

		/*
		 * ����4 int[]arr= { 80, 87, 75, 45, 15, 20, 68 };
		 * 
		 * for(int e: arr); System.out.println("�ִ밪");
		 */
	}
}
