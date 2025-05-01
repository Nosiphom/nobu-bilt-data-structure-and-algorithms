package nobubilt.codesignal.hashmap;

import java.util.ArrayList;
import java.util.Objects;

public class VanderMapNodeImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VanderHashMap<String, Integer> map = new VanderHashMap<String, Integer>();
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

class VanderMapNode<K, V>
{
	K key;
	V value;
	int hashCode;
	VanderMapNode(K k, V v, int hash)
	{
		this.key = k;
		this.value = v;
		this.hashCode = hash;
	}
	VanderMapNode<K, V> next;
}

class VanderHashMap<K, V>
{
	ArrayList<VanderMapNode<K, V>> vanderHashMap;
	int capacity;
	int size;
	VanderHashMap()
	{
		capacity = 10;
		size = 0;
		vanderHashMap = new ArrayList<>();
		
		for(int inx  = 0; inx < capacity; inx++)
		{
			vanderHashMap.add(null);
		}
	}
	
	boolean isEmpty() {return size == 0;}
	
	int getHashCode(K key)
	{
		return Objects.hashCode(key);
	}
	
	int getIndex(K key)
	{
		int index = getHashCode(key) % capacity;
		index = index < 0 ? (index * -1) : index;
		return index;
	}
	
	V remove(K key)
	{
		int currentIndex = getIndex(key);
		VanderMapNode<K, V> head = vanderHashMap.get(currentIndex);
		
		VanderMapNode<K, V> prev = null;
		while(head != null)
		{
			if(head.key == key && head.hashCode == getHashCode(key))
			{
				break;
			}
			prev = head;
			head = head.next;
		}
		if(head == null)
		{
			return null;
		}
		--size;
		if(prev != null)
		{
			prev.next = head.next;			
		}
		else
		{
			vanderHashMap.set(currentIndex, head.next);
		}

		return head.value;
	}
	
	V get(K key)
	{
		int currentIndex = getIndex(key);
		VanderMapNode<K, V> currentHashNode = vanderHashMap.get(currentIndex);
		
		while(currentHashNode != null)
		{
			if(currentHashNode.key == key && currentHashNode.hashCode == getHashCode(key))
			{
				break;
			}		
			currentHashNode = currentHashNode.next;
		}
		if(currentHashNode == null)
		{
			return null;
		}
		return currentHashNode.value;
	}
	
	K add(K key, V value)
	{
		int hashCode = getHashCode(key);
		int index = getIndex(key);
		VanderMapNode<K, V> head = vanderHashMap.get(index);
		while(head != null)
		{
			if(head.key == key && head.hashCode == hashCode)
			{
				head.value = value;
				return head.key;
			}
			head = head.next;
		}
		
		++size;
		head = vanderHashMap.get(index);
		VanderMapNode<K, V> newNode = new VanderMapNode<K, V>(key, value, hashCode);
		newNode.next = head;
		vanderHashMap.set(index, newNode);
			
		if((1.0 * size)/capacity >=  0.7)
		{
			ArrayList<VanderMapNode<K, V>> temp = vanderHashMap;
			capacity = capacity * 2;
			vanderHashMap = new ArrayList<VanderMapNode<K, V>>();
			for(int inx = 0; inx < capacity; inx++)
			{
				vanderHashMap.add(null);
			}
			
			for(VanderMapNode<K, V> currentNode : temp)
			{
				while(currentNode != null)
				{
					add(currentNode.key, currentNode.value);					
					currentNode = currentNode.next;
				}
			}
		}
		return newNode.key;
	}
}