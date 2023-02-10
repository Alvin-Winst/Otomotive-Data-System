
abstract class Vehicle {
	protected String type;
	protected String brand;
	protected String name;
	protected String license;
	protected int speed;
	protected int gas;
	protected int wheel;
	protected String tipe;
	protected int entsys;
	protected int helm;
	protected int price;
	
	public int brand() {
		if(brand.length()>=5) return 1;
		else return 0;
	}
	public int name() {
		if(name.length()>=5) return 1;
		else return 0;
	}
	public int license() {
		int a = license.length();
		int b = license.indexOf(" ", 2);
		if(b==-1) return 0;
		char c = license.charAt(0);
		int d = Integer.parseInt(license.substring(2, b));
		int e = a-b-1;
		int boole = 1;
		for (int i = b+1; i < license.length(); i++) {
			if(license.charAt(i)<'A' || license.charAt(i)>'Z') {
				boole = 0;
				break;
			}
		}
		if(boole==0) return 0;
		if(a>=5 && a<=10 && c>='A' && c<='Z'
				&& d>0 && d<10000 && e>0 && e<4) return 1;
		else return 0;
	}
	public int speed() {
		if(speed>=100 && speed<=250) return 1;
		else return 0;
	}
	public int gas() {
		if(gas>=30 && gas<=60) return 1;
		else return 0;
	}
}

class Car extends Vehicle{
	public int entsys() {
		if(entsys>=1) return 1;
		else return 0;
	}
	public int tipe() {
		if(tipe.equals("SUV") || tipe.equals("Supercar")
				|| tipe.equals("Minivan")) return 1;
		else return 0;
	}
	public int wheel() {
		if(wheel>=4 && wheel<=6) return 1;
		else return 0;
	}
}

class Motor extends Vehicle{
	public int helm() {
		if(helm>=1) return 1;
		else return 0;
	}
	public int tipe() {
		if(tipe.equals("Automatic")
				|| tipe.equals("Manual")) return 1;
		else return 0;
	}
	public int wheel() {
		if(wheel>=2 && wheel<=3) return 1;
		else return 0;
	}
}

class Datab extends Vehicle{
	
}