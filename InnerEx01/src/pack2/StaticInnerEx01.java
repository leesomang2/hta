package pack2;

public class StaticInnerEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.Inner inner = new Outer.Inner();
		//System.out.println(inner.y1); //private;;
		System.out.println(inner.y2);
		
		inner.viewInner();
	}

}
