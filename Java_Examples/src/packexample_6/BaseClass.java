package packexample_6;

class BaseClass {
	BaseClass()
	{
		System.out.println("BaseClass is created");
	}
	
	BaseClass(String arg)
	{
		
        System.out.println("Constructing : " + arg);
        
    }
	int a = 100;
	
	 void Show()
	    {
	        System.out.println(a);
	    }
}
