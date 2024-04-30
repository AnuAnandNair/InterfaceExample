//Class implements interface1, interface2

package interfacemultipleinherit;

public class InterfaceClass2 implements Interface_Eg1,Inteface_Eg2 {

	@Override
	public void display2() {//defining abstract method of interface2
		// TODO Auto-generated method stub
		System.out.println("Accessing display method of Inteface_Eg2");
	}

	@Override
	public void display() {//defining abstract method of interface1
		// TODO Auto-generated method stub
		System.out.println("Interface1");		
		System.out.println("The value of a: "+a);
		System.out.println("The value of b: "+b);
	}

	public static void main(String[] args) {
		InterfaceClass2 interface2=new InterfaceClass2();//creating object of child class
		interface2.display();
		interface2.display2();
	}
}
