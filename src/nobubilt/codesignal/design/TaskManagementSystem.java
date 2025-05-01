package nobubilt.codesignal.design;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class TaskManagementSystem {
	
	/**
	 * Welcome to the enhancement of our in-memory ticket managing system. 
	 * Initially, we have developed a system capable of handling ticket sales, 
	 * data aggregation, and providing insights into travel patterns. Our system 
	 * supports operations such as selling individual and group tickets, issuing 
	 * refunds, and analyzing sales data.

Your challenge is to expand the functionality of the TicketManagementSystem class 
by adding advanced features for merging and splitting ticket entities, ensuring 
full functionality and backward compatibility with the existing features.

To get started, here are the initial methods available in the system, along with 
their definitions:

String sellTicket(String journeyId, double price): - Sells an individual ticket 
for a specific journey, assigning it a unique transaction ID, and returns this ID. 
The journey ID and price are recorded.
List<String> sellGroupTicket(String journeyId, int numTickets, double 
pricePerTicket): - Sells multiple tickets for a group on the same journey, 
assigns each ticket a unique transaction ID, and returns a list of these IDs. 
Each ticket within the group shares the same price.
boolean refundTicket(String transId): - Refunds a ticket identified by its 
transaction ID, removing it from the system. Returns true if successful, false 
otherwise.
Map<String, Object> getTransactionInfo(String transId): - Retrieves the ticket 
information for a given transaction ID. Returns the ticket details or null if the 
transaction ID does not exist.
double totalSales(): - Calculates the total sales revenue from all tickets.
Map<String, Integer> journeySalesSummary(): - Generates a summary of ticket sales 
by journey ID, returning a map where keys are journey IDs and values are the counts 
of tickets sold.
Implement the following functionalities to enhance the system:

String mergeTickets(List<String> transIds): - Merges two or more tickets, 
identified by their transaction IDs, into a single ticket entity, creating a 
new "individual ticket" rather than forming a new group. This operation is only 
valid if all tickets share the same journeyId; otherwise, it should return null. 
Recalculates the total price and generates a new unique transaction identifier 
for the merged entity, setting an isMerged key to true. The original transaction IDs 
are invalidated. Returns the new transaction ID or null if any of the provided 
transaction IDs do not exist or have different journey IDs.
List<String> splitTicket(String transId, int numSplits): - Splits an existing 
ticket into multiple smaller ticket entities, invalidating the original 
transaction ID. The total price of the original ticket is evenly distributed
 across the new tickets. Each new ticket is assigned a unique transaction ID 
 and is considered an individual ticket, not part of a group. Returns a list of
  new transaction IDs or null if the original transaction ID does not exist or 
  the number of splits is less than 2.
Adjustments to the existing methods might be necessary to properly handle the merged and split tickets. Ensure that the methods for ticket information retrieval and refund processes accommodate these new types of ticket entities.
	 */
	
	 private Map<String, Map<String, Object>> tickets;
	    private static final boolean NOT_GROUP = false;
	    private static final boolean IS_GROUP = true;

	    public TaskManagementSystem() {
	        this.tickets = new HashMap<>();
	    }
	    
	    public String mergeTickets(List<String> transIds)
	    {
	        String combinedJourneyId = findJourneyId(transIds);
	        if(combinedJourneyId == null){return null;}
	        double totalPrice = calculateTotalPrice(combinedJourneyId, transIds);
	        
	        String combinedTransationId = sellTicket(combinedJourneyId, totalPrice);
	        tickets.get(combinedTransationId).put("isMerged", true);
	        return combinedTransationId;   
	    }
	    
	    public double calculateTotalPrice(String finalJourneyId, List<String> transIds)
	    {
	        double total = 0.0;
	        for(String transactionId : transIds)
	        {
	            if(tickets.get(transactionId).get("journeyId").equals(finalJourneyId))
	            {
	                total += (double)tickets.get(transactionId).get("price");    
	                if(!refundTicket(transactionId))
	                {
	                    return 0.0;
	                }          
	            }
	        }
	        return total;
	    }
	    
	    protected String findJourneyId(List<String> transIds)
	    {
	        String finalJourneyId = null;
	        Set<String> currentJourneys = new HashSet<>();
	        for(String transactionId : transIds)
	        {
	            currentJourneys.add((String)tickets.get(transactionId).get("journeyId"));
	        } 
	        if(currentJourneys.size() > 1)
	        {
	            return null;
	        }
	        Iterator<String> iter = currentJourneys.iterator();
	        while(iter.hasNext())
	        {
	            finalJourneyId = (String)iter.next();
	            break;
	        }
	        return finalJourneyId;
	    }
	    
	    public List<String> splitTicket(String transId, int numSplits)
	    {
	        List<String> splitTransactionIds =  new ArrayList<>();
	        if(numSplits < 2){return splitTransactionIds;}
	        double currentTotalPrice = (double)tickets.get(transId).get("price");
	        String journeyId = (String)tickets.get(transId).get("journeyId");
	        for(int counter = 0; counter < numSplits; counter++)
	        {
	            String splitTransactionId = sellTicket(journeyId, currentTotalPrice/numSplits);
	            if(splitTransactionId != null)
	            {
	                splitTransactionIds.add(splitTransactionId);
	            }
	        }
	        if(splitTransactionIds.size() != numSplits)
	        {
	            return new ArrayList<>();
	        }
	        
	        if(!refundTicket(transId))
	        {
	            return new ArrayList<>();
	        }
	        return splitTransactionIds;
	    }

	    public String sellTicket(String journeyId, double price) {
	        String transId = UUID.randomUUID().toString();
	        tickets.put(transId, createTicket(journeyId, price, NOT_GROUP, new ArrayList<>()));
	        return transId;
	    }

	    public List<String> sellGroupTicket(String journeyId, int numTickets, double pricePerTicket) {
	        List<String> transIds = new ArrayList<>();
	        for (int i = 0; i < numTickets; i++) {
	            String transId = sellTicket(journeyId, pricePerTicket);
	            tickets.get(transId).put("isGroup", IS_GROUP);
	            transIds.add(transId);
	        }
	        for (String transId : transIds) {
	            tickets.get(transId).put("groupTransIds", transIds);
	        }
	        return transIds;
	    }

	    public boolean refundTicket(String transId) {
	        if (tickets.containsKey(transId)) {
	            tickets.remove(transId);
	            return true;
	        }
	        return false;
	    }

	    public Map<String, Object> getTransactionInfo(String transId) {
	        return tickets.getOrDefault(transId, null);
	    }

	    public double totalSales() {
	        return tickets.values().stream()
	                .mapToDouble(ticket -> (double) ticket.get("price"))
	                .sum();
	    }

	    public Map<String, Integer> journeySalesSummary() {
	        Map<String, Integer> summary = new HashMap<>();
	        for (Map<String, Object> ticket : tickets.values()) {
	            String journeyId = (String) ticket.get("journeyId");
	            summary.put(journeyId, summary.getOrDefault(journeyId, 0) + 1);
	        }
	        return summary;
	    }

	    private Map<String, Object> createTicket(String journeyId, double price, boolean isGroup, List<String> groupTransIds) {
	        Map<String, Object> ticket = new HashMap<>();
	        ticket.put("journeyId", journeyId);
	        ticket.put("price", price);
	        ticket.put("isGroup", isGroup);
	        ticket.put("groupTransIds", groupTransIds);
	        return ticket;
	    }

}
