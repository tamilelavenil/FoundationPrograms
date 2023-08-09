package classRoomWeekdays;

public class check {

	public static  main(String[] args) {
		String inp = "2019-01-09";
		String[] arr = inp.split("-");
		int[] datearr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			datearr[i] = Integer.parseInt(arr[i]);
		}
		int year = datearr[0], month = datearr[1], day = datearr[2];
		int value = 30;
		
		if (month==1) {
			return day;
		}
		else if (month==2) {
			if (year % 4 == 0 || year % 400 == 0) {
				value -= 1;// it is a leap year
			}
			else {
				value -=2;
			}
		}
		else {
			value =31;
		}
		
		
		value -=day;
		int count = month;
		month *= 30;
		for (int i = 1; i <= count; i += 2) {
			month += 1;
		}

		if (year % 4 == 0 || year % 400 == 0) {
			month -= 1;// it is a leap year
		} else if (year % 100 == 0) {
			month -= 2;// it is not leap year
		} else {
			month -= 2;// it is not a leap year
		}

		System.out.println(month-value);
	}

}
