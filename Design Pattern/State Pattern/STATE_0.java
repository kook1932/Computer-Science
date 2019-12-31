
public class STATE_0 extends State{
	Vending_machine vm;
	
	public STATE_0(Vending_machine vm)
	{
		this.vm = vm;
	}
	
	@Override
	public void addHundred() {
		vm.plusBalance(100);
		vm.state = vm.state_Less_500;        
        vm.setBalanceText();
        vm.setMsgText("");
	}

	@Override
	public void addFiveHundred() {
		vm.plusBalance(500);
        vm.state = vm.state_500;
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
        vm.setMsgText("반환할 잔액이 없습니다.");
        vm.setBalanceText();		
	}

	@Override
	public void selectBeverage() {
        vm.setMsgText("돈을 넣은 후에 눌러주세요");		
	}

}
