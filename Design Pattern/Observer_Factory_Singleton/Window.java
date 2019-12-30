public abstract class Window {
	public productWindow PWindow;
	public abstract productWindow create(String type);
}

// 팩토리 클래스는 최상위의 팩토리 메소드를 구현하는 클래스임
// 최상위 클래스는 Product와 팩토리 메소드를 갖고 있다.