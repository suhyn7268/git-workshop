package arr;

//java 08_pdf
public class ArryTest {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		int[] ref;
		ref = addAllArray(arr, 7);

		if (arr == ref) {
			System.out.println("같은 배열 참조");
		} else {
			System.out.println("다른 배열 참조");
		} // if end
		
		System.out.println("===========");
		System.out.println("arr배열의 요소 출력");
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("===========");
		System.out.println("ref배열의 요소 출력");
		
		for(int i=0; i<ref.length; i++) {
			System.out.println(ref[i]);
		}
	}

	// 특정int[] 배열과 증가값을 받아 ->매개변수
	// 배열의 각 요소에 값을 증가시키고, ->처리
	// 처리한 배열을 다시 반환하는 메소드 구성->반환

	static int[] addAllArray(int[] arr, int addNum) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] + addNum; // arr[i] += addNum;
		}
		return arr;
	}

}
