package kadai_020;

public class DictonaryExecChapter21 {

    public static void main(String[] args) {
        DictionaryChapter20 dictionary = new DictionaryChapter20();
        
    	String [] kudamonoArray = {"apple","banana","grape","orange"};
    	
    	for(String kudamono : kudamonoArray) {
    		dictionary.word(kudamono);
    	}
    }    
}