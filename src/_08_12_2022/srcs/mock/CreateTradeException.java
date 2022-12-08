package _08_12_2022.srcs.mock;

public class CreateTradeException extends RuntimeException{
    public CreateTradeException(){
        super("Cannot create such trade");
    }
}
