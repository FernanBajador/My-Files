public class Supplies {
	public static void main(String[] args) {
		double book = 150;
		double pen = 10;
		double notebook = 25;
		
		double totalBookcost = book*3;
		double totalPencost = pen*5;
		double totalNotebookcost = notebook*3;
		
		double total= totalBookcost+totalPencost+totalNotebookcost;
		 System.out.println("Total cost: " + total);
	
		if(total>300){
			double discount=total*.15;
			System.out.println("Discount Amount:" + discount);
			double totalPayment=total-discount;
			System.out.println("Total Cost With Discount: " +totalPayment);
	
		}else{
			System.out.println("No Discount.");
							
	}
}
}