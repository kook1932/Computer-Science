import javax.swing.JLabel;

public class Vending_machine {
    public State state;
    // Vending Machine은 모든 State를 관리함
	public State state_0;
    public State state_Less_500;
    public State state_500;
    public State state_Less_1000;
    public State state_Equal_or_More_1000;
    
    private int balance;
    
    private JLabel balanceLabel;
    private JLabel msgLabel;
    
    public Vending_machine(JLabel bl, JLabel ml)
    {
        
        state_0 = new STATE_0(this);
        state_Less_500 = new STATE_LESS_500(this);
        state_500 = new STATE_500(this);
        state_Less_1000 = new STATE_LESS_1000(this);
        state_Equal_or_More_1000 = new STATE_EQUAL_OR_MORE_1000(this);
        state = state_0;	// 초기 Vending Machine을 생성할 때는 돈이 없기 때문에 STATE_0이 된다.
        
        balance = 0;
        
        balanceLabel = bl;
        msgLabel = ml;
    }
    
    public void addHundred() { state.addHundred(); }
    public void addFiveHundred() { state.addFiveHundred(); }
    public void addThousand() { state.addThousand(); }
    public void returnChanges() { state.returnChanges(); }   
	public void selectBeverage() { state.selectBeverage(); }
    
    public int getBalance() { return balance; }
    public void setBalance(int bal) { this.balance = bal; }
    public void plusBalance(int bal) { this.balance += bal; }
    public void minusBalance(int bal) { this.balance -= bal; }
    
    public void setBalanceText() 
    {
        balanceLabel.setText("현재 투입 금액: " + balance + "원");
    }

    public void setMsgText(String msg) 
    {
        msgLabel.setText(msg);
    }

}
