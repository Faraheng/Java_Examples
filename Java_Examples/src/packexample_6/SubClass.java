package packexample_6;

public class SubClass extends BaseClass{
	//super() is provided by the compiler implicitly
	
	int a = 200;
    void Show()
    {
    	System.out.println(a);
        System.out.println(super.a);
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SubClass().Show();
	}

}
