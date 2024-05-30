package pack5;

public class AnonymousInnerEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new InnerB() {
			
			@Override
			public void viewInner() {
				// TODO Auto-generated method stub
				System.out.println("viewInner() 호출");
			}
		} .viewInner();
	}

}
