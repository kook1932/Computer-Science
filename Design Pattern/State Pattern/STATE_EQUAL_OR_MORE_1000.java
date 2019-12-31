
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
        vm.setMsgText("" + vm.getBalance()+ "���� ��ȯ�մϴ�");
        vm.setBalance(0);
        vm.setBalanceText();	
	}

	@Override
	public void selectBeverage() {
		String msg = "���Ḧ �������ϴ�. ���ⱸ�� Ȯ���ϼ���.";
        vm.minusBalance(1000);
        vm.setBalanceText();
        vm.setMsgText(msg);
        
        if (vm.getBalance() > 0) {
            msg = msg + " �Ž����� " + vm.getBalance()+ "���� ��ȯ�մϴ�.";
            vm.setMsgText(msg);
            vm.setBalance(0);
            vm.setBalanceText();
        }
        vm.state = vm.state_0;
	}

}