package arr;

//java 08_pdf
public class ArryTest {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		int[] ref;
		ref = addAllArray(arr, 7);

		if (arr == ref) {
			System.out.println("���� �迭 ����");
		} else {
			System.out.println("�ٸ� �迭 ����");
		} // if end
		
		System.out.println("===========");
		System.out.println("arr�迭�� ��� ���");
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("===========");
		System.out.println("ref�迭�� ��� ���");
		
		for(int i=0; i<ref.length; i++) {
			System.out.println(ref[i]);
		}
	}

	// Ư��int[] �迭�� �������� �޾� ->�Ű�����
	// �迭�� �� ��ҿ� ���� ������Ű��, ->ó��
	// ó���� �迭�� �ٽ� ��ȯ�ϴ� �޼ҵ� ����->��ȯ

	static int[] addAllArray(int[] arr, int addNum) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] + addNum; // arr[i] += addNum;
		}
		return arr;
	}

}
