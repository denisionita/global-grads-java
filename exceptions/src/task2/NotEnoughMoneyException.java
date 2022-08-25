package task2;

public class NotEnoughMoneyException extends Exception{

    public  NotEnoughMoneyException(float amount){
        super("Withdrawal refused. You only have " + amount);
    }
}
