package Ex;

class Tv {
	// tv의 속성 (멤버변수)
	String color; // 색상
	boolean power; // 전원상태(on/off)
	int channel; // 채널

	void power() {
		power = !power;
	} // tv를 켜거나 끄는 기능을 하는 메서드

	void channelUp() {
		++channel;
	} // tv의 채널을 높이는 기능을 하는 메서드

	void channelDown() {
		--channel;
	} // tv의 채널을 낮추는 기능을 하는 메서드
}

public class Ex6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t ; //tv인스턴스를 참조하기 위한 변수 t를 선언
		t = new Tv(); //tv의 인스턴스를 생성
		t.channel = 7 ; //tv인스턴스의 멤버변수 channel의 값을 7로설정
		t.channelDown(); //tv인스턴스의 메서드 channelDown()을 호출한다
		System.out.println("현재 채널은"+t.channel +"입니다."); //7에서 채널다운 호출로 인하여 6출력 
	}

}
