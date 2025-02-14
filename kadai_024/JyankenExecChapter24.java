package kadai_024;

public class JyankenExecChapter24 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		JyankenChapter24 jyanken = new JyankenChapter24();
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		//じゃんけんの手を入力する
		String pon2 = jyanken.getMyChoice();
		
		//相手の手の結果を取得する
		String aiteLesult2 =jyanken.getRandom();
		
		//入力した手とランダムで生成した手を比べじゃんけんの結果を表示する
		jyanken.playGame(pon2,aiteLesult2);
		

	}

}
