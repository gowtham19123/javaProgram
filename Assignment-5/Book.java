package Task;

public class Book {
	String B_name;
	int total_page;
	
	Book(String B_name,int total_page){
		this.B_name = B_name;
		this.total_page = total_page;
	}
	
   Book(Book obj){
	   this.B_name = obj.B_name;
		this.total_page = obj.total_page;
   }
   void display() {
	   System.out.println("Book Name :"+B_name+"\n"+"total_page :"+total_page);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Book obj1 = new Book("NCRT",380);
          obj1.display();
          
          Book obj2 = new Book(obj1);
          obj2.display();
	}

}
