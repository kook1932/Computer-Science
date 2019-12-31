
public class STATE_EQUAL_OR_MORE_1000 extends State{
	Vending_machine vm;
	
	public STATE_EQUAL_OR_MORE_1000(Vending_machine vm)
	{
		this.vm = vm;
	}
	
	@Override
	public void addHundred() {
		vm.plusBalance(100);
        vm.setBalanceText();
        vm.setMsgText("");
	}

	@Override
	public void addFiveHundred() {
		vm.plusBalance(500);		
        vm.setBalanceText();
        vm.setMsgText("");		
	}

	@Override
	public void addThousand() {
		vm.plusBalance(1000);        		
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
		String msg = "음료를 내보냅니다. 배출구를 확인하세요.";
        vm.minusBalance(1000);
        vm.setBalanceText();
        vm.setMsgText(msg);
        
        if (vm.getBalance() > 0) {
            msg = msg + " 거스름돈 " + vm.getBalance()+ "원을 반환합니다.";
            vm.setMsgText(msg);
            vm.setBalance(0);
            vm.setBalanceText();
        }
        vm.state = vm.state_0;
	}

}
