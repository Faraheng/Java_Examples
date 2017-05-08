package packexample_1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassVariables obj1 = new ClassVariables();
        
        ClassVariables obj2 = new ClassVariables();
         
        //accessing class variables through obj1
         
        System.out.println(obj1.i);      //Output : 10
         
        System.out.println(obj1.s);      //Output : STATIC
         
        //accessing class variables through obj2
         
        System.out.println(obj2.i);      //Output : 10
         
        System.out.println(obj2.s);      //Output : STATIC
         
        //Making changes to class variables through obj2
         
        obj2.i = 20;
         
        obj2.s = "STATIC - STATIC";
         
        //accessing class variables through obj1
         
        System.out.println(obj1.i);      //Output : 20
                 
        System.out.println(obj1.s);      //Output : STATIC - STATIC
                 
        //accessing class variables through obj2
                 
        System.out.println(obj2.i);      //Output : 20
                 
        System.out.println(obj2.s);      //Output : STATIC - STATIC
	}

}
