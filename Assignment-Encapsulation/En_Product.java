package Task;

public class En_Product {
   private int stock;
   private int quantity;
   
 public void setStock(int NewStock) {
	 
	 this.stock = NewStock;
 }
 public int getStock() {
	 
	 return stock;
	 
 } public void setquantity(int Newquantity) {
	 
	 this.quantity = Newquantity;
 }
 public int getquantity() {
	 
	 return quantity;
	 
 }
 public int  purchase() {
	 return stock-quantity;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       En_Product obj = new En_Product();
       
       obj.setStock(21);
       obj.setquantity(13);
       
       System.out.println("Remaining Stock = "+obj.purchase());
	}

}
