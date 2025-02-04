package kadai_020;

import java.util.HashMap;

public class DictionaryChapter20 {
	
	public void word(String [] Englishword) {
		
		HashMap<String,String> dictionary = new HashMap<String,String>();
	
		dictionary.put("apple","りんご");
		dictionary.put("peach","桃");
		dictionary.put("banana","バナナ");
		dictionary.put("lemon","レモン");
		dictionary.put("pear","梨");
		dictionary.put("kiwi","キウィ");
		dictionary.put("strawberry","いちご");
		dictionary.put("grape","ぶどう");
		dictionary.put("muscat","マスカット");
		dictionary.put("cherry","さくらんぼ");
		
		for(int i = 0; i < Englishword.length; i++) {
			if(dictionary.containsKey(Englishword[i])) {
				System.out.println(Englishword[i] + "の意味は" + dictionary.get(Englishword[i]));
			} else {
				System.out.println(Englishword[i] + "は辞書に含まれていません");
			}
		}
	
	}
}
