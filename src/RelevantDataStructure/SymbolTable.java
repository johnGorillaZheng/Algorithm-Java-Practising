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
	 * 名称：插入一个新节点
	 * 方法：1.如果键为空，则抛出异常
	 *      2.如果值为空且键不为空，则删除对应键上的值
	 *      3.其余情况，找到表中对应该键的节点，将值赋予此节点
	 *      4.如果表为空表，将该元素赋予表的头元素
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
	 * 名称：获取键对应的值
	 * 方法：1.如果键为空，则抛出异常
	 *      2.遍历找到表中对应键的节点，返回值
	 *      3.如果没有，返回null
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
	 * 名称：删除节点
	 * 方法：1.如果键为空，则抛出异常
	 *      2.遍历找到对应键的节点，将此节点的前一节点的nextNode指针指向此节点的下一节点
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
