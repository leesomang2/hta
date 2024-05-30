package pack1;

public class Dropship extends Unit {

	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Dropship[x=" + x +", y="+y+"]" );
	}
	void load() {
		System.out.println("선택된 대상을 태운다");
	}
	void unload() {
		System.out.println("선택된 대상을 내린다");
	}
}
