package kadai_011;

public class __Prime_Chapter {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		boolean sosuuArray [] = new boolean [100];
		double warizann = 2; //割る数
		int cut = 2; //割られる数
		double hako = 0; //あまり
		
		while(cut != 101) {
			
			hako = cut % warizann;
			
			if(cut == warizann) {
				
				sosuuArray [cut-2] = true;
				System.out.println(cut);
				warizann =2;
				cut++;
				
			}else if(hako == 0) {
				sosuuArray [cut-2] = false;
				cut++;
				warizann = 2;
				
			}else {
				warizann ++;
			}
		}
				
	}
	}


