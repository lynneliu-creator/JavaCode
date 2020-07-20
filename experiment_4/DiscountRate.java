package project3;

public class DiscountRate {
	
	private static double serviceDiscountPremium=0.2;
	private static double serviceDiscountGold=0.15;
	private static double serviceDiscountSilver=0.1;
	private static double productDiscountPremium=0.1;
	private static double productDiscountGold=0.1;
	private static double productDiscountSilver=0.1;
	
	static String t1="Premium";
	static String t2="Gold";
	static String t3="Silver";
	
	public static double getServiceDiscountRate(String type) {
		if(t1.equals(type)) {
			return serviceDiscountPremium;		
		}
		else if(t2.equals(type)) {
			return serviceDiscountGold;
		}
		else if(t3.equals(type)) {
			return serviceDiscountSilver;
		}
		else 
			return 1;
	}
	
	public static double getProductDiscountRate(String type) {
		if(t1.equals(type)) {
			return productDiscountPremium;		
		}
		else if(t2.equals(type)) {
			return productDiscountGold;
		}
		else if(t3.equals(type)) {
			return productDiscountSilver;
		}
		else return 1;
	}

}
