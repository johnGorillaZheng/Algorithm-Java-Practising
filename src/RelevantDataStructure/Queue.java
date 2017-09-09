package RelevantDataStructure;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * 名称：数据结构 -- 队列
 * @author zhengzixuan
 *
 * @param <Item>
 */
public class Queue<Item> implements Iterable<Item> {

	private int size;
	private Node<Item> first;
	private Node<Item> last;
	
	/**
	 * 名称：定义队列中每个元素
	 * 	    每个元素包括一个指向下一个节点的指针
	 *      以及本身属性
	 * @author zhengzixuan
	 *
	 * @param <Item>
	 */
	private class Node<Item> {
		private Item item;
		private Node<Item> nextNode;
	}
	
	/**
	 * 名称：队列的实例化
	 */
	public Queue() {
		size = 0;
		first = null;
		last = null;
	}
	
	/**
	 * 名称：队列入队
	 * 方法：1.生成一个新的节点
	 *      2.如果队列为空，指定头节点为新节点
	 *      3.将队列尾节点的指针指向新节点
	 *      4.队列节点数+1
	 * @param item
	 */
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
	
	/**
	 * 名称：队列退队
	 * 方法：1.将头节点指定为第二个节点
	 *      2.队列数量-1
	 *      3.返回头节点
	 * @return the first item of the queue
	 */
	public Item dequeue() {
		Item result = this.first.item;
		this.first = this.first.nextNode;
		this.size --;
		return result;
	}
	
	/**
	 * 名称：判断队列是否为空
	 * @return empty or not
	 */
	public boolean isEmpty() {
		return this.size() == 0;
	}
	
	/**
	 * 名称：得到队列容量
	 * @return size
	 */
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

        public boolean hasNext() { 
        	return current != null;                     
        }
        public void remove() { 
        	throw new UnsupportedOperationException();  
        }

        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.nextNode; 
            return item;
        }
    }
}
