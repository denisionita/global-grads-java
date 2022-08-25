package task2;

public class Account {
    private String accountNo;
    private float amount;
    private int nationalId;

    public Account() {
    }

    public void deposit(int amount){
        if(amount>0){
            this.amount += amount;
        }
    }

    public void withdraw(int amount) throws NotEnoughMoneyException {
        if(this.amount < amount){
            throw new NotEnoughMoneyException(this.amount);
        }else{
            this.amount -= amount;
        }
    }

    public void linkToNationalId(int nationalId) throws InvalidNationalIdException {
        if(String.valueOf(nationalId).length() < 10) {
            throw new InvalidNationalIdException(nationalId);
        }else{
            System.out.println(this);
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNo=" + accountNo +
                ", amount=" + amount +
                ", nationalId=" + nationalId +
                '}';
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public int getNationalId() {
        return nationalId;
    }

    public void setNationalId(int nationalId) {
        this.nationalId = nationalId;
    }
}
