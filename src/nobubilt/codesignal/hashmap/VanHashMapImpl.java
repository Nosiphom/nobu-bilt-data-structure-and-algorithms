package nobubilt.codesignal.hashmap;

import java.util.ArrayList;
import java.util.Objects;

public class VanHashMapImpl {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PinkNodeHashMap<String, Integer> map = new PinkNodeHashMap<String, Integer>();
		System.out.println("map.isEmpty():: "+ map.isEmpty());
		map.add("summer", 1);
		System.out.println("map.get(summer):: "+ map.get("summer"));
		map.add("winter", 2);
		map.add("summer", 3);
		map.add("fall", 4);
		System.out.println("map.isEmpty():: "+ map.isEmpty());
		System.out.println("map.get(london):: "+ map.get("london"));
		System.out.println("map.get(summer):: "+ map.get("summer"));
		System.out.println("map.remove(london):: "+ map.remove("london"));
		System.out.println("map.get(fall):: "+ map.get("fall"));
	}
}


class PinkNodeHashMap<K,V>
{
	int capacity;
	int size;
	ArrayList<PinkNode<K,V>> list;
	 PinkNodeHashMap()
	{
		this.capacity = 10;
		this.size = 0;
		this.list = new ArrayList<>();
		for(int inx = 0; inx < capacity; inx++)
		{
			list.add(null);
		}
	}
	public V remove(K key)
	{
		int currHash = getHashcode(key);
		int currIndex= getIndex(key);
		PinkNode<K,V> head = list.get(currIndex);
		PinkNode<K,V> prev = null;
		while(head != null)
		{
			if(head.hashCode == currHash)
			{
				break;
			}
			prev = head;
			head = head.next;
		}
		if(head == null) {return null;}
		V valToReturn = head.val;
		--size;
		if(prev != null)
		{
			prev.next = head.next;
		}
		else
		{
			list.set(currIndex, head.next);
		}
		return valToReturn;
	}
	public V get(K key)
	{
		int currHash = getHashcode(key);
		int currIndex = getIndex(key);
		PinkNode<K,V> head = list.get(currIndex);
		while(head != null)
		{
			if(head.hashCode == currHash)
			{
				break;
			}
			head = head.next;
		}
		if(head == null) {return null;}
		return head.val;
	}
	public K add(K key, V value)
	{
		int currHash = getHashcode(key);
		int currIndex = getIndex(key);
		PinkNode<K,V> head = null;
	//	if(!list.isEmpty() && currIndex < list.size())
	//	{
		    head = list.get(currIndex);
			while(head != null)
			{
				if(head.key == key &&  head.hashCode == currHash)
				{
					head.val = value;
					return head.key;
				}
				head = head.next;
			}
			head = list.get(currIndex);
	//	}	
		++size;
		PinkNode<K,V> newNode = new PinkNode<K,V>(key, value, currHash);
		newNode.next = head;
		list.set(currIndex, newNode);
		
		if((1.0 * size)/capacity >= 0.7)
		{
			ArrayList<PinkNode<K,V>> temp = list;
			capacity = capacity * 2;
			list = new ArrayList<>();
			for(int inx = 0; inx < list.size(); inx++)
			{
				list.add(null);
			}
			
			for(PinkNode<K,V> node : temp)
			{
				while(node != null)
				{
					add(node.key, node.val);
					node = node.next;
				}
			}
		}
		return newNode.key;
	}
	public boolean isEmpty() {return size ==0;}
	
	public int getIndex(K key)
	{
		int hashcode = getHashcode(key);
		int index = hashcode%capacity;
		index = index < 0 ? (index * -1) : index;
		return index;
	}
	public int getHashcode(K key)
	{
		return Objects.hashCode(key);
	}
	
	
}
class PinkNode<K,V>
{
	K key;
	V val;
	int hashCode;
	PinkNode<K,V> next;
	public PinkNode(K k, V v, int hash)
	{
		this.key = k;
		this.val = v;
		this.hashCode = hash;
	}
}