package nobubilt.codesignal.design;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class TaskManagementSystemTestSuite {
	 public void testSellIndividualTickets() {
	        TaskManagementSystem system = new TaskManagementSystem();
	        List<String> ticketsSold = new ArrayList<>();
	        for (int i = 0; i < 3; i++) {
	            ticketsSold.add(system.sellTicket("NYC-MIA", 120.00));
	        }
	        assertEquals(3, ticketsSold.size());
	        assertEquals(3, new HashSet<>(ticketsSold).size());
	    }

	    @Test
	    public void testSellGroupTickets() {
	        TaskManagementSystem system = new TaskManagementSystem();
	        int groupTicketCount = 5;
	        List<String> groupTicketTransIds = system.sellGroupTicket("NYC-LAX", groupTicketCount, 200.00);
	        assertEquals(groupTicketCount, groupTicketTransIds.size());
	        for (String transId : groupTicketTransIds) {
	            Map<String, Object> ticketInfo = system.getTransactionInfo(transId);
	            assertTrue((boolean) ticketInfo.get("isGroup"));
	        }
	    }

	    @Test
	    public void testMergeTickets() {
	        TaskManagementSystem system = new TaskManagementSystem();
	        List<String> ticketsSold = Arrays.asList(
	                system.sellTicket("NYC-SFO", 150.00),
	                system.sellTicket("NYC-SFO", 150.00)
	        );
	        String mergedTransId = system.mergeTickets(ticketsSold);
	        assertNotNull(mergedTransId);
	        assertNotEquals(ticketsSold.get(0), mergedTransId);
	        assertNotEquals(ticketsSold.get(1), mergedTransId);
	        Map<String, Object> mergedInfo = system.getTransactionInfo(mergedTransId);
	        assertTrue((boolean) mergedInfo.get("isMerged"));
	    }

	    @Test
	    public void testSplitTickets() {
	        TaskManagementSystem system = new TaskManagementSystem();
	        String ticketSold = system.sellTicket("NYC-ATL", 300.00);
	        List<String> splitTicketTransIds = system.splitTicket(ticketSold, 3);
	        assertEquals(3, splitTicketTransIds.size());
	        for (String newTransId : splitTicketTransIds) {
	            Map<String, Object> splitInfo = system.getTransactionInfo(newTransId);
	            assertEquals(100.00, (double) splitInfo.get("price"));
	        }
	    }

	    @Test
	    public void testTotalSalesAndSummary() {
	        TaskManagementSystem system = new TaskManagementSystem();
	        system.sellTicket("NYC-MIA", 120.00);
	        system.sellGroupTicket("NYC-LAX", 5, 200.00);
	        double totalSales = system.totalSales();
	        Map<String, Integer> journeySalesSummary = system.journeySalesSummary();
	        assertEquals(1120.00, totalSales);
	        Map<String, Integer> expectedSummary = new HashMap<>();
	        expectedSummary.put("NYC-LAX", 5);
	        expectedSummary.put("NYC-MIA", 1);
	        assertEquals(expectedSummary, journeySalesSummary);
	    }
}
