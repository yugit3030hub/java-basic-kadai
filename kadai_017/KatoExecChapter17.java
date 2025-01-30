package kadai_017;

  public class KatoExecChapter17 extends KatoTaroChapter17 {

	public static void main(String[] arg) {
		KatoTaroChapter17 taro = new KatoTaroChapter17();
		KatoIchiroChapter17 itiro = new KatoIchiroChapter17();
		KatoHanakoChapter17 hanako = new KatoHanakoChapter17();
		
		taro.setGivenName(); //名前のセット
		taro.execlntroduce(); //紹介の実行
		
		itiro.setGivenName();
		itiro.execlntroduce();
		
		hanako.setGivenName();
		hanako.execlntroduce();
		
	}

}
