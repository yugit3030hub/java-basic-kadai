package kadai_17;

  public class KatoExecChapter17 extends KatoTaroChapter {

	public static void main(String[] arg) {
		KatoTaroChapter taro = new KatoTaroChapter();
		KatoIchiroChapter17 itiro = new KatoIchiroChapter17();
		KatoHanakoChapter17 hanako = new KatoHanakoChapter17();
		
		taro.setGivenName(); //名前のセット
		taro.execlntroduce(); //名前の紹介
		taro.commonlntroduce(); //住所の紹介
		taro.eachlntroduce(); //趣味特技の紹介
		
		itiro.setGivenName();
		itiro.execlntroduce();
		itiro.commonlntroduce();
		itiro.eachlntroduce();
		
		hanako.setGivenName();
		hanako.execlntroduce();
		hanako.commonlntroduce();
		hanako.eachlntroduce();
		
	}

}
