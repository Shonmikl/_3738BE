package _08_12_2022.srcs.mock;

public class SimpleAuditService implements AuditService {

    @Override
    public void logNewTrade(Trade trade){
        throw new RuntimeException("Implements in SimpleAuditService");
    }
}
