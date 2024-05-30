package pack1;

public class InstanceInnerEx01 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		// System.out.println(outer.x1); // private;
		System.out.println(outer.x2);

		// Inner클래스 생성
		Outer.Inner inner = outer.new Inner();
		// System.out.println(inner.y1); // private;
		System.out.println(inner.y2);
		
		inner.viewInner();

	}
}
