package demo;
public class demo {
    public static void main(String[] args) {
	        subdemo obj=new subdemo();
	        real obj1=new real();
	        obj.display();
	        obj1.display();
	    }
	}
	class subdemo
	{
	    int a=10;
	    void display()
	    {
	        System.out.println("this is subdemo context");
	      
	    }
	}
class real extends subdemo{
	protected void display()
	{
		System.out.println("The value of a is "+a);
	}
}
