package school;
import java.util.*;
import java.time.LocalDateTime;    


public class Restaurant {
	public static void main(String args[]) {
		ArrayDeque<Order> orders = new ArrayDeque<Order>();
	}//main
	
	private static class Order {
		String customerName;
		LocalDateTime inTime;
		LocalDateTime outTime;
		String[] items;
		
		public Order(String cName, LocalDateTime iTime, LocalDateTime oTime, String[] itms) {
			customerName = cName;
			inTime = iTime;
			outTime = oTime;
			items = itms;
		}//constructor
	}//Order
}//Restaurant
