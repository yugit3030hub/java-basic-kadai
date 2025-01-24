package kadai_17;

 abstract public class KatoChapter17 {
	public String familyName  = "加藤";
	public String givenName = "";
	public String address = "東京都中野区〇×";
	
	public void commonlntroduce(){
		System.out.println("住所は" + address + "です");
	}
	
	abstract public void eachlntroduce();
	
	public void execlntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
	}

}

 