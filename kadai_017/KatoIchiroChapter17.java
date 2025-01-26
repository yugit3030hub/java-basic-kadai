package kadai_017;

public class KatoIchiroChapter17 extends KatoChapter17{
	
    public void setGivenName() {
    	this.givenName = "一郎";
	}
	
    public void eachlntroduce() {
		System.out.println("好きな食べ物はリンゴです\n");
	}
	
	public void execlntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		commonlntroduce();
        eachlntroduce();
	}

}
