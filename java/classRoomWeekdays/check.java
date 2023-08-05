package classRoomWeekdays;

public class check {

	public static void main(String[] args) {
		int inp[]={1,2,4,7,10};
		int sum = 0, avg =0;
		for(int i: inp) {
			if (i%2==0 && i%3==0) {
				sum += i;
				avg++;
			}
		}
		
		System.out.println(sum/avg);

	}

}
