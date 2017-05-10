package packexample_7;

class BaseClassData {
	//this used to differentiate the instance variable from the local variable, when both use the same name.
	int no;  
	String name;  
	float weight;
	
	BaseClassData(int no,String name,float weight){  
	this.no=no;  
	this.name=name;  
	this.weight=weight;  
	}  
	
	void displayno()
	{
		System.out.println(no);
	}  
	
	
	void display()
	{
		this.displayno();
		//If you don't use the this keyword, compiler automatically adds this keyword while invoking the method
		System.out.println(name+" "+weight);
	}

}
