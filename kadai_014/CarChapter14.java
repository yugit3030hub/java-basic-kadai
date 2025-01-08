package kadai_014;

public class CarChapter14 {
	    public int gear = 0; //ギアを示す
		public int speed = 0; //ギアチェンジ後の速度


	public  void gearChange(final int afterGear) {
		System.out.println("ギア" + this.gear + "から" + afterGear + "へ切り替わりました");
		this.speed = switch(afterGear) {
		case 1 -> 10;
		
		case 2 -> 20;
		
		case 3 -> 30;
		
		case 4 -> 40;
		
		case 5-> 50;
		
		default -> 10;
		};
		
	}

	public void run() {
		System.out.println("速度は時速" + this.speed + "kmです");
	}

	}


