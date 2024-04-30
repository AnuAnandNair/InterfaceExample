//Single inheritance using Interface

package interfaceeg.singlelevelinherit;

public class InterfaceClassEg implements Interface_Eg1 {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("display method of interface");	
		System.out.println("The value of a: "+a);
		System.out.println("The value of b: "+b);
	}
	
	public static void main(String[] args) {
		//display() can be called using obj of the class or interface obj created using class
		//Calling display() using object of the class
		 /* InterfaceClassEg i1=new InterfaceClassEg();
		i1.display();
		System.out.println();*/
		
		//interface cannot be instantiated but interface object can be created with the help of class
		//interfacename objectname=new Classname();//Syntax
		Interface_Eg1 e1=new InterfaceClassEg();
		System.out.println("Printing using interface obj");
		e1.display();
	}	
}
