package assignment2;

public class Mobile {
     
	String mobileBrand="Samsung";
	char mobileLogo='s';
	short noOfMobilePiece=1;
	int modelNumber=71;
	long mobileImeiNumber=2643853466573L;
	float mobilePrice=186.73F;
	boolean isDamaged=false;

public static void main(String[] args) {
	
	Mobile android=new Mobile();
	System.out.println(android.mobileBrand);
	System.out.println(android.mobileLogo);
	System.out.println(android.noOfMobilePiece);
	System.out.println(android.modelNumber);
	System.out.println(android.mobileImeiNumber);
	System.out.println(android.mobilePrice);
	System.out.println(android.isDamaged);
}	
	
	
}
