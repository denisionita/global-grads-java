package task2;

public class InvalidNationalIdException extends Exception{
    public InvalidNationalIdException(int id){
            super("Id not found");
    }
}
