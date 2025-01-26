package kadai_017;

 public class KatoTaroChapter17 extends KatoChapter17 {

	public void setGivenName() {
   	 this.givenName = "太郎"; //名前のセット
   }
	
    public void eachlntroduce() {
		System.out.println("javaが得意です\n"); //趣味の出力
	}
	
	public void execlntroduce() { //紹介の実行
		System.out.println("名前は" + familyName + givenName + "です");
		commonlntroduce();
        eachlntroduce();
	}


}
