package interfacepract;

public class Circle implements Drawable{

	@Override
	public void draw() {
		System.out.println("drawing circle");		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable d= new Circle();
		d.draw();
		Drawable d1= new Rectangle();
		d1.draw();
	}
}
