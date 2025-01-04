package kadai_014;

public class CarChapter14 {
		private int gear = 1; //ギアを示す
		private int speed = 10; //ギアチェンジ後の速度
		
		public CarChapter14( int gear, int speed) {
			this.gear   = gear;
			this.speed  = speed;
			
		}


	public  void gearChange(final int afterGear) {
		System.out.println("ギア" + this.gear + "から" + afterGear + "へ切り替わりました");
		this.gear = afterGear;
		switch(afterGear) {
		case 1 -> {
			this.speed = 10;
		}
		case 2 -> {
			this.speed = 20;
		}
		case 3 -> {
			this.speed = 30;
		}
		case 4 -> {
			this.speed = 40;
		}
		case 5-> {
			this.speed = 50;
		}
		default -> {
			this.speed = 10;
		}
		}
	}

	public void run() {
		System.out.println("速度は時速" + this.speed + "kmです");
	}

	}


