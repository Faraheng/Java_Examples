package packexample_6;

public class SubClass_2 extends BaseClass {
	 SubClass_2()
	 {
		 super("From SubClass_2 constructor");
		 //super() is added in each class constructor automatically by compiler if there is no super() or this()
        System.out.println("Constructing a SubClass_2.");
     }
	 int a = 200;
	    void Show()
	    {
	        super.Show();
	        System.out.println(a);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new SubClass_2().Show();

	}

}
