public class WindowFactory extends Window{
	private volatile static WindowFactory inst = new WindowFactory();
	private WindowFactory() { }
	
	public static WindowFactory getInstance() {
		if (inst == null) {
			synchronized (WindowFactory.class) {
				if (inst == null) {
					inst = new WindowFactory();
				}
			}
		}
		
	return inst;
	}

	@Override
	public productWindow create(String type) {
		PWindow = null;
		if(type.equals("TextFieldWindow"))
		{
			PWindow = new TextFieldWindow("TextField Window", 250, 350, 600, 200);
		}
		else if(type.equals("LabelWindow"))
		{
			PWindow = new LabelWindow("Label Window", 250, 600, 600, 200);
		}
		else
			System.out.println("잘못된 입력");
		return PWindow;
	}
	
}
