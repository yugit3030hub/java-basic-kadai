package kadai_008;

public class __Price_Chapter08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int userAge = 35;
		int serviceCost = 0;
		
		System.out.println(userAge);
		
		serviceCost = switch(userAge/10) {
		case 1 -> 1000;
		case 2 -> 2000;
		case 3 -> 3000;
		case 4 -> 4000;
		case 5 -> 5000;
		case 6 -> 6000;
		case 7 -> 7000;
		case 8 -> 8000;
		default -> 500;
		};
		
		String userAge2 = "";
		userAge2 = switch(userAge/10) {
		case 1 -> "10代";
		case 2 -> "20代";
		case 3 -> "30代";
		case 4 -> "40代";
		case 5 -> "50代";
		case 6 -> "60代";
		case 7 -> "70代";
		case 8 -> "80代";
		default -> "子供またはシニア";
		};
		
		
		System.out.println(userAge2 + "の料金は" + serviceCost + "円");

	}

}
