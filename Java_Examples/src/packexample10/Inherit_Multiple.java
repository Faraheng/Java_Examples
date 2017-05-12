package packexample10;

class Inherit_Multiple implements BaseInterface,BaseInterface2,BaseInterface3,BaseInterface4 {
String str;
	
Inherit_Multiple() {
		
		str = str1.concat(str2).concat(str3).concat(str4);
	}
	
	void display() {
		
		System.out.println(str);
	}

}
