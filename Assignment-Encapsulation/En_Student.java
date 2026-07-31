package Task;

public class En_Student {
private float mark;

public void setMark(float NewMark) {
	
	if(NewMark >= 50 ) {
	this.mark = NewMark;
	}
	else {
		System.out.println("Invalid Mark");
	}

}
public float getMark() {
	return mark;
}

void display() {
	System.out.println("Stored Mark ="+mark);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        En_Student obj = new En_Student();
        
        obj.setMark(49);
        
        obj.display();
	}

}
