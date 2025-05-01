package nobubilt.codesignal.concurrency.doublechecked.deadlock;

import java.util.concurrent.atomic.AtomicReference;

public class LockFreeStack<T> {
   private final AtomicReference<LockFreeNode<T>> head;

    public LockFreeStack() {
        // TODO: Initialize the head of the stack using AtomicReference.
        this.head = new AtomicReference<>(null);     
    }

    public void push(T value) {
        // TODO: Implement the push() method to add a new element to the stack.
        // 1. Create a new node with the given value.
        // 2. Use a loop and CAS (Compare-And-Swap) to update the head pointer.
        //    - Set the new node's next to point to the current head.
        //    - Use CAS to update the head pointer to the new node.
        while(true)
        {
            LockFreeNode<T> newNode = new LockFreeNode<>(value);
            LockFreeNode<T> first = head.get();
            if(first == head.get())
            {
                if(newNode.next.compareAndSet(null, first))
                {
                    head.compareAndSet(first, newNode);
                    break;
                }  
            }   
        }
        
    }

    public T pop() {
        // TODO: Implement the pop() method to remove and return the top element from the stack.
        // 1. Use a loop and CAS to update the head pointer.
        // 2. If the stack is empty (head is null), return null.
        // 3. Otherwise, return the value of the current head and set the head to the next node.
        while(true)
        {       
            LockFreeNode<T> first = head.get();
            if(first == null)
            {
                return null;
            }
            LockFreeNode<T> next = first.next.get();
            if(first == head.get())
            {
                T currValue = first.value;
                head.compareAndSet(first, next);
                return currValue;
            }
        }
    }

}
