package kadai_014;

public class __Car_chapter14 {
	private int gear = 1; //ギアを示す
	private int speed = 10; //ギアチェンジ後の速度
	
	public __Car_chapter14( int gear, int speed) {
		this.gear   = gear;
		this.speed  = speed;
		
	}


public  void gearChange(final int gearspeed) {
	System.out.println("ギア" + this.gear + "から" + gearspeed + "へ切り替わりました");
	this.gear = gearspeed;
}

public void run(final int gearspeed) {
	switch(gearspeed) {
	case 1 -> {
		this.speed = 10;
		System.out.println("速度は時速" + this.speed + "kmです");
	}
	case 2 -> {
		this.speed = 20;
		System.out.println("速度は時速" + this.speed + "kmです");
	}
	case 3 -> {
		this.speed = 30;
		System.out.println("速度は時速" + this.speed + "kmです");
	}
	case 4 -> {
		this.speed = 40;
		System.out.println("速度は時速" + this.speed + "kmです");
	}
	case 5-> {
		this.speed = 50;
		System.out.println("速度は時速" + this.speed + "kmです");
	}
	default -> {
		this.speed = 10;
		System.out.println("速度は時速" + this.speed + "kmです");
	}
	}
}

}