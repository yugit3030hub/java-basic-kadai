package kadai_017;

 abstract public class KatoChapter17 {
	public String familyName  = "加藤";
	public String givenName = "";
	public String address = "東京都中野区〇×";
	
	public void commonlntroduce(){
		System.out.println("名前は" + this.familyName + this.givenName + "です");
		System.out.println("住所は" + this.address + "です"); //住所の出力
	}
	
	abstract public void eachlntroduce(); //趣味の出力
	
	public void execlntroduce() {
		commonlntroduce();
		eachlntroduce(); //紹介の実行
	}

}

 