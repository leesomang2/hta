package pack1;

public class Tank extends Unit {

	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Tank[x=" + x +", y="+y+"]" );
	}
	void changeMode() {
		System.out.println("공격모드를 변환한다");
	}

}
