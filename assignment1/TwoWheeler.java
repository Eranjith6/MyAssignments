package assignment1;

public class TwoWheeler {
       
	 int noOfWheels=2;
	 short noOfMirrors=2;
	 long chassisNumber=23456789L;
	 boolean isPunctured=true;
	 String bikeName="Royal Enfield";
	 double runningKM=580.987;
	 
public static void main(String[] args) {
	
	 TwoWheeler bike=new TwoWheeler();
	 System.out.println(bike.isPunctured);
	 System.out.println(bike.chassisNumber);
	 System.out.println(bike.noOfWheels);
	 System.out.println(bike.bikeName);
	 System.out.println(bike.runningKM);
	 System.out.println(bike.noOfMirrors);
	 
}
}