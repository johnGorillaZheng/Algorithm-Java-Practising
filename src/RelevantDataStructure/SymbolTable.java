package RelevantDataStructure;

/**
 * 
 * @author zhengzixuan
 *
 * @param <Key>
 * @param <Value>
 */
public class SymbolTable <Key, Value> {
	private int size;
	private Node first;
	
	/**
	 * 对于表中节点的定义
	 * 包含元素为：
	 * 1.键 ->值
	 * 2.指向下一个元素的指针
	 * @author zhengzixuan
	 *
	 */
	private class Node {
		private Key key;
		private Value value;
		private Node nextNode;
		
		public Node (Key key, Value value, Node nextNode) {
			this.key = key;
			this.value = value;
			this.nextNode = nextNode;
		}
	}
	
	/**
	 * 初始化一张空表
	 */
	public SymbolTable() {
	}
	
	/**
	 * 
	 * @param key
	 * @param val
	 */
	public void put(Key key, Value val) {
		if (key == null) throw new IllegalArgumentException("argument to put() is null");
		if (val == null) {
			this.delete(key);
			return;
		}
		
		for (Node x = first; x != null; x = x.nextNode) {
			if (key.equals(x.key)) {
				x.value = val;
				return;
			}
		}
		this.first = new Node(key,val,first);
		this.size ++;
		return;
		
	}
	
	/**
	 * 
	 * @param key
	 * @return
	 */
	public Value get(Key key) {
		if(key == null) throw new IllegalArgumentException("argument to get() is null");
		for (Node x = first; x != null; x = x.nextNode) {
			if (key.equals(x.key)) {
				return x.value;
			}
		}
		return null;
	}
	
	/**
	 * 
	 * @param key
	 */
	public void delete(Key key) {
		if (key == null) throw new IllegalArgumentException("argument to delete() is null");
		for (Node x = first; x != null; x = x.nextNode) {
			if (key.equals(x.nextNode.key)) {
				x.nextNode = x.nextNode.nextNode;
				return;
			}
		}
	}
	
	/**
	 * 
	 * @param key
	 * @return
	 */
	public boolean contains(Key key) {
		for (Node x = first; x != null; x = x.nextNode) {
			if (key.equals(x.key)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return this.size() == 0;
	}
	
	/**
	 * 
	 * @return
	 */
	public int size() {
		return size;
	}
	
    public Iterable<Key> keys()  {
        Queue<Key> queue = new Queue<Key>();
        for (Node x = first; x != null; x = x.nextNode)
            queue.enqueue(x.key);
        return queue;
    }
}
