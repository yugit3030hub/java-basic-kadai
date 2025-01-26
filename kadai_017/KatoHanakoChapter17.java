package kadai_017;

public class KatoHanakoChapter17 extends KatoChapter17 {
    public void setGivenName() {
    	this.givenName = "花子";
	}
	
	public void eachlntroduce() {
		System.out.println("趣味は読書です\n");
	}
	
	public void execlntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		commonlntroduce();
        eachlntroduce();
	}

}
