package kadai_020;

import java.util.HashMap;

public class DictionaryChapter20 {
	
	public void word(String EnglishWord) {
		
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
		
	if(dictionary.containsKey(EnglishWord)) {
		System.out.println(EnglishWord + "の意味は" + dictionary.get(EnglishWord) );
	} else {
		System.out.println(EnglishWord + "は辞書に存在しません");
	}
	
	}
}
