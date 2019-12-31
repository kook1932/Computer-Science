
public class STATE_500 extends State{
	Vending_machine vm;
	
	public STATE_500(Vending_machine vm)
	{
		this.vm = vm;
	}
	
	@Override
	public void addHundred() {
		vm.plusBalance(100);
        vm.state = vm.state_Less_1000;
		
        vm.setBalanceText();
        vm.setMsgText("");
	}

	@Override
	public void addFiveHundred() {
		vm.plusBalance(500);
        vm.state = vm.state_Equal_or_More_1000;
		
        vm.setBalanceText();
        vm.setMsgText("");		
	}

	@Override
	public void addThousand() {
		vm.plusBalance(1000);
        vm.state = vm.state_Equal_or_More_1000;
        		
        vm.setBalanceText();
        vm.setMsgText("");		
	}

	@Override
	public void returnChanges() {
        vm.setMsgText("" + vm.getBalance()+ "원을 반환합니다");
        vm.setBalance(0);
        vm.setBalanceText();	
	}

	@Override
	public void selectBeverage() {
        vm.setMsgText("1000원 이상을 넣은 후에 눌러주세요");
	}

}
