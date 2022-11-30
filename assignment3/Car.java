package assignment3;

public class Car {

	 public void applyBreak() {
		System.out.println("Apply the break");
	 }
	 public void applyGear() {
		System.out.println("Raise the gear");
	 }
	 public void switchOnAc() {
		System.out.println("Switch on the Ac");
	 }
	 public void applyAccelerate() {
		System.out.println("Raise the accelerator");
		

	}

	

public static void main(String[] args) {
	Car car=new Car();
	car.applyBreak();
	car.applyGear();
	car.switchOnAc();
	car.applyAccelerate();
}

}

