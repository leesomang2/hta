package pack2;

public class MainEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//구현된상태에서 쓰기
		Fighter f = new Fighter();
		f.move(0, 0);
		f.attack();
		
		Fightable ft = new Fighter();
		ft.move(0, 0);
		ft.attack();
		
		Moveble m = new Fighter();
		m.move(0, 0);
		
		Attackable a = new Fighter();
		a.attack();
	}

}
