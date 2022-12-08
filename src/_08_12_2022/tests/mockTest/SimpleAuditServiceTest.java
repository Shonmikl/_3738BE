package _08_12_2022.tests.mockTest;

import _08_12_2022.srcs.mock.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class SimpleAuditServiceTest {

    @Mock
    private TradeRepository tradeRepository;

    @Mock
    private AuditService auditService;

    @Test
    public void testAuditLogEntryMadeFortNewTrade() throws Exception {
        Trade trade  = new Trade("Ref _ 1", "Desc");
        Mockito.when(tradeRepository.createTrade(trade)).thenReturn(anyLong());

        TradingService tradingService = new SimpleTradingService(tradeRepository, auditService);
        tradingService.createTrade(trade);

        verify(auditService).logNewTrade(trade);
    }
}
