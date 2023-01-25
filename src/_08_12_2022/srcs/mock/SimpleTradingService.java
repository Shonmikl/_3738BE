package _08_12_2022.srcs.mock;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SimpleTradingService implements TradingService {
    TradeRepository tradeRepository;
    AuditService auditService;


    @Override
    public Long createTrade(Trade trade) {
        Long id = tradeRepository.createTrade(trade);
        auditService.logNewTrade(trade);
        return id;
    }
}
