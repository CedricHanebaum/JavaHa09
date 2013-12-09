package zahlenwoerter;

public class TestClass {

	public static void main(String[] args) {
		int[] testDeutsch = {1, 10, 11, 12, 16, 17, 20, 38, 69, 70, 131, 195, 2345};
		int[] testEnglish = {10, 11, 12, 13, 15, 18, 20, 35, 51, 80, 103, 1067};
		
		for(int i: testDeutsch){
			ZahlenwortDeutsch deutsch = new ZahlenwortDeutsch(i);
			System.out.println(deutsch);	
		}
		
		System.out.println();
		
		for(int i: testEnglish){
			ZahlenwortEnglisch english = new ZahlenwortEnglisch(i);
			System.out.println(english);	
		}
	}

}
