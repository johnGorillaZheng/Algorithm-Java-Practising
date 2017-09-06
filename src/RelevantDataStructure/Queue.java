package RelevantDataStructure;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Queue<Item> implements Iterable<Item> {

	private int size;
	private Node<Item> first;
	private Node<Item> last;
	
	/**
	 * 
	 * @author zhengzixuan
	 *
	 * @param <Item>
	 */
	private class Node<Item> {
		private Item item;
		private Node<Item> nextNode;
	}
	
	/**
	 * 
	 */
	public Queue() {
		size = 0;
		first = null;
		last = null;
	}
	
	public void enqueue(Item item) {
		Node<Item> newNode = new Node<Item>();
		newNode.item = item;
		newNode.nextNode = null;
		if (this.isEmpty()) {
			this.first = newNode;
			this.last = newNode;
		} else {
			this.last.nextNode = newNode;
			this.last = this.last.nextNode;
		}
		size ++;
	}
	
	public Item dequeue() {
		Item result = this.first.item;
		this.first = this.first.nextNode;
		this.size --;
		return result;
	}
	
	public boolean isEmpty() {
		return this.size() == 0;
	}
	
	public int size() {
		return size;
	}
	
	
	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new ListIterator<Item>(first);  
	}
	
    private class ListIterator<Item> implements Iterator<Item> {
        private Node<Item> current;

        public ListIterator(Node<Item> first) {
            current = first;
        }

        public boolean hasNext()  { return current != null;                     }
        public void remove()      { throw new UnsupportedOperationException();  }

        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.nextNode; 
            return item;
        }
    }
}
