package packexample_2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVariables obj1 = new InstanceVariables();
        
        InstanceVariables obj2 = new InstanceVariables();
         
        //obj1 instance variables
         
        System.out.println(obj1.i);       //Output : 10
         
        System.out.println(obj1.s);       //Output : NON-STATIC
         
        //obj2 instance variables
         
        System.out.println(obj2.i);       //Output : 10
         
        System.out.println(obj2.s);       //Output : NON-STATIC
         
        //changing obj1 instance variables
         
        obj1.i = 20;
         
        obj1.s = "INSTANCE VARIABLE";
         
        //obj1 instance variables
         
        System.out.println(obj1.i);       //Output : 20
                 
        System.out.println(obj1.s);       //Output : INSTANCE VARIABLE
                 
        //obj2 instance variables
                 
        System.out.println(obj2.i);       //Output : 10
                 
        System.out.println(obj2.s);       //Output : NON-STATIC

	}

}
