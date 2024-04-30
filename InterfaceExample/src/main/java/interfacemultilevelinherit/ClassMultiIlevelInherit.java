package interfacemultilevelinherit;

public class ClassMultiIlevelInherit implements Interfacemulti2 {	

	@Override
	public void display() {		
		System.out.println("In interface2 abstract method");
	}

	@Override
	public void show() {	
		System.out.println("In interface1 abstract method");
	}
	
	public static void main(String[] args) {
		ClassMultiIlevelInherit cm1=new ClassMultiIlevelInherit();
		cm1.show();
		cm1.display();
	}
}
