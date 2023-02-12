import java.util.Scanner;
import java.util.ArrayList;
public class Input{

	public ArrayList<Datab> main(Scanner scan, ArrayList<Datab> data) {
		// TODO Auto-generated method stub
		String type = new String();
		do {
			System.out.print("Input type [Car | Motorcycle]: ");
			type = scan.nextLine();
		} while (!(type.equals("Car") || type.equals("Motorcycle")));
		if (type.equals("Car")) {
			Car car = new Car();
			car.type = type;
			do {
				System.out.print("Input brand [>= 5]: ");
				car.brand = scan.nextLine();
			} while (car.brand()==0);
			do {
				System.out.print("Input name [>= 5]: ");
				car.name = scan.nextLine();
			} while (car.name()==0);
			do {
				System.out.print("Input license: ");
				car.license = scan.nextLine();
			} while (car.license()==0);
			do {
				System.out.print("Input top speed [100 <= topSpeed <= 250]: ");
				car.speed = Integer.parseInt(scan.nextLine());
			} while (car.speed()==0);
			do {
				System.out.print("Input gas capacity [30 <= gasCap <= 60]: ");
				car.gas = Integer.parseInt(scan.nextLine());
			} while (car.gas()==0);
			do {
				System.out.print("Input wheel [4 <= wheel <= 6]: ");
				car.wheel = Integer.parseInt(scan.nextLine());
			} while (car.wheel()==0);
			do {
				System.out.print("Input type [SUV | Supercar | Minivan]: ");
				car.tipe = scan.nextLine();
			} while (car.tipe()==0);
			do {
				System.out.print("Input entertainment system amount [>= 1]: ");
				car.entsys = Integer.parseInt(scan.nextLine());
			} while (car.entsys()==0);
			
			Datab keep = new Datab();
			keep.type = car.type;
			keep.brand = car.brand;
			keep.name = car.name;
			keep.license = car.license;
			keep.speed = car.speed;
			keep.gas = car.gas;
			keep.wheel = car.wheel;
			keep.tipe = car.tipe;
			keep.entsys = car.entsys;
			keep.helm = 0;
			keep.price = 0;
			data.add(keep);
		}
		else if (type.equals("Motorcycle")) {
			Motor motor = new Motor();
			motor.type = type;
			do {
				System.out.print("Input brand [>= 5]: ");
				motor.brand = scan.nextLine();
			} while (motor.brand()==0);
			do {
				System.out.print("Input name [>= 5]: ");
				motor.name = scan.nextLine();
			} while (motor.name()==0);
			do {
				System.out.print("Input license: ");
				motor.license = scan.nextLine();
			} while (motor.license()==0);
			do {
				System.out.print("Input top speed [100 <= topSpeed <= 250]: ");
				motor.speed = Integer.parseInt(scan.nextLine());
			} while (motor.speed()==0);
			do {
				System.out.print("Input gas capacity [30 <= gasCap <= 60]: ");
				motor.gas = Integer.parseInt(scan.nextLine());
			} while (motor.gas()==0);
			do {
				System.out.print("Input wheel [2 <= wheel <= 3]: ");
				motor.wheel = Integer.parseInt(scan.nextLine());
			} while (motor.wheel()==0);
			do {
				System.out.print("Input type [Automatic | Manual]: ");
				motor.tipe = scan.nextLine();
			} while (motor.tipe()==0);
			do {
				System.out.print("Input helm amount [>= 1]: ");
				motor.helm = Integer.parseInt(scan.nextLine());
			} while (motor.helm()==0);
			
			Datab keep = new Datab();
			keep.type = motor.type;
			keep.brand = motor.brand;
			keep.name = motor.name;
			keep.license = motor.license;
			keep.speed = motor.speed;
			keep.gas = motor.gas;
			keep.wheel = motor.wheel;
			keep.tipe = motor.tipe;
			keep.helm = motor.helm;
			keep.entsys = 0;
			keep.price = 0;
			data.add(keep);
		}
		System.out.println("Data berhasil dimasukkan.");
		return data;
	}

}
