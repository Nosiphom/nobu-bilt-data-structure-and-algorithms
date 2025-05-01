package nobubilt.codesignal.interview.linkedlist;

class PurpleNode
{
	int val;
	PurpleNode next;
	PurpleNode(int v)
	{
		this.val = v;
	}
}
public class AddTwoLinkedLists {
	
	public static PurpleNode addTwoLinkNodes(PurpleNode l1, PurpleNode l2)
	{
		PurpleNode n1 = l1;
		PurpleNode n2 = l2;
		int l1Len = 0;
		int l2Len = 0;
		while(n1 != null)
		{
			n1 = n1.next;
			l1Len++;
		}
		while(n2 != null)
		{
			n2 = n2.next;
			l2Len++;
		}
		n1 = l1;
		n2 = l2;
		
		PurpleNode dummyHead = null;
		
		while(l1Len > 0 || l2Len > 0)
		{
			int val = 0;
			if(l1Len >= l2Len && l1Len > 0 && n1 != null)
			{
				val += n1.val;
				l1Len--;
				n1 = n1.next;
			}
			if(l1Len < l2Len && l2Len > 0 && n2 != null)
			{
				val += n2.val;
				l2Len--;
				n2 = n2.next;
			}
			PurpleNode temp = new PurpleNode(val);
			temp.next = dummyHead;
			dummyHead = temp;
		}
		
		PurpleNode currNode = dummyHead;
		dummyHead = null;
		int carry = 0;
		while(currNode != null)
		{
			int total = (carry + currNode.val);
			carry = total/10;
			PurpleNode temp = new PurpleNode(total%10);
			temp.next = dummyHead;
			dummyHead = temp;
			currNode = currNode.next;
		}
		
		if(carry > 0)
		{
			PurpleNode temp = new PurpleNode(carry);
			temp.next = dummyHead;
			dummyHead = temp;
		}
		return dummyHead;
	}
	
	public static PurpleNode addTwoLinkNodesForward(PurpleNode l1, PurpleNode l2)
	{
		PurpleNode sentinalNode = new PurpleNode(0);
		PurpleNode dummyHead = sentinalNode;
		int carry = 0;
		
		while(l1 != null || l2 != null )
		{
			int v1 = l1 != null ? l1.val : 0;
			int v2 = l2 != null ? l2.val : 0;
			int tot = v1 + v2 + carry;
			carry = tot/10;
			tot = tot%10;
			PurpleNode temp = new PurpleNode(tot);
			dummyHead.next = temp;
			dummyHead = temp;
			if(l1 != null) {l1 = l1.next;}
			if(l2 != null) {l2 = l2.next;}
		}
		
		if(carry > 0)
		{
			PurpleNode temp = new PurpleNode(carry);
			dummyHead.next = temp;
			dummyHead = temp;
		}
		
		return sentinalNode.next;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PurpleNode l1 = new PurpleNode(5);
		PurpleNode l1a = new PurpleNode(7);
		PurpleNode l1b = new PurpleNode(3);
		PurpleNode l1c = new PurpleNode(8);
		l1.next = l1a;
		l1a.next = l1b;
		l1b.next = l1c;
		
		printLinkNode(l1); //5 7 3 8
		System.out.println("**********");		
		PurpleNode l2 = new PurpleNode(5);
		PurpleNode l2a = new PurpleNode(5);
		PurpleNode l2b = new PurpleNode(5);
		l2.next = l2a;
		l2a.next = l2b;

		printLinkNode(l2); //5 5 5 
		System.out.println("**********");
		
		PurpleNode result = addTwoLinkNodes(l1, l2);
		System.out.println("*****Final summation*****");
		printLinkNode(result);  // 5 7 3 8 + 5 5 5 = 6 2 9 3
	
		PurpleNode forwardAddition = addTwoLinkNodesForward(l1, l2);
		printLinkNode(forwardAddition);  // 5 7 3 8 + 5 5 5 = 0 0 3 9 8
	}

	public static void printLinkNode(PurpleNode node)
	{
		while(node != null)
		{
			System.out.print(node.val + " ");
			node = node.next;
		}
		System.out.println();
	}
}
