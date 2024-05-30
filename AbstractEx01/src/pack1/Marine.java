package pack1;

public class Marine extends Unit {

	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Marine[x=" + x +", y="+y+"]" );
		
	}
	void stimPack() {
		System.out.println("스팀팩 사용");
	}

}
