package kadai_024;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class JyankenChapter24 {
	
	public String getMyChoice() {
		System.out.println("文字を入力してください");
		Scanner scanner = new Scanner(System.in);
		while(true) {
		String pon = scanner.nextLine();
		
		if(pon.equals("r") || pon.equals("s") || pon.equals("p")) {
			scanner.close();
			return(pon);
		}
		System.out.println("入力されたものが違います");
		continue;
		}
	}
	
	public String getRandom() {
	  ArrayList<String> list = new ArrayList<String>();
	  list.add("r");
	  list.add("s");
	  list.add("p");
	  
	  String aiteLesult = "";
	  
	  int aite = (int)Math.floor(Math.random()*4);
	  
	  switch(aite){
		  case 1 -> aiteLesult = list.get(0);
		  case 2 -> aiteLesult = list.get(1);
		  case 3 -> aiteLesult = list.get(2);
	  }
	  return(aiteLesult);
	}

	public void playGame(String pon, String aiteLesult) {
		HashMap<String,String> jyan = new HashMap<String,String>();
		jyan.put("r","グー");
		jyan.put("s","チョキ");
		jyan.put("p","パー");
		System.out.println("自分の手は" + jyan.get(pon) + "相手の手は" + jyan.get(aiteLesult));
		
		if(pon.equals("r") && aiteLesult.equals("r") || pon.equals("s") && aiteLesult.equals("s") || pon.equals("r") && aiteLesult.equals("r") ) {
			System.out.println("あいこです");
		} else if (pon.equals("r") && aiteLesult.equals("p") || pon.equals("s") && aiteLesult.equals("r") || pon.equals("p") && aiteLesult.equals("s") ){
			System.out.println("あなたの負けです");
		} else {
			System.out.println("あなたの勝ちです");
		}
	}
	
}
