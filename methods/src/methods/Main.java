package methods;

public class Main {

	public static void main(String[] args) {
 
		findNumber();

	}
	public static void findNumber() {
		
		int[] numbers= new int[]{2,20,8,24,89,4};
		int number=4;
		boolean found=false;
		for(int i=0;i<numbers.length;i++) {
			if(number==numbers[i]) {
				found=true;
				break;
			}
		}
		if(found) {
			messageSend(number);
		}
		else {
			System.out.println("Sayý bulunamadý...");
		}
		
	}
	public static void messageSend(int number) {
		System.out.println("Sayý bulundu:"+number);
		
	}

}
