package heap;

public class Heap {
	/*
	 * En la cola lo primero que entra es lo primero en salir
	 */
	private int size;
	private Node first;
	private Node last;
	
	public Heap () {
		first = null;
		size = 0;
	}
	
	public Heap (Node node) {
		this.first = node;
		this.last = node;
		this.size = 1;
	}
	
	public Heap (int size, Node first, Node last) {
		this.size = size;
		this.first = first;
		this.last = last;
	}
	
	public boolean isEmpty() {
		if (size == 0) return true;
		else return false;
	}
	
	// Introduce los nodos en la cola
	public boolean push(Node node) {
		try {
			if (isEmpty()) { 
				first = node; 
				last = node;
			} else {
				last.setNext(node);
				last = node;	
			} size++; return true;
		} catch (Exception e) { System.out.println(e.toString());} 
		return false;
		
	}
	
	// Saca siempre el primer nodo introducido
	public Node pop() {
		try {
			if (!isEmpty()) {
				Node p = first;
				first = first.getNext();
				size--;
				return p;
			}	
		} catch (Exception e) {
			System.out.println(e.toString());		
		} return null;
	}
 	
	public void show() {
		Node p = first;
		for (int i = 0; i < size; i++) {
			System.out.println("[" + i + "] -> " + p.getContent());
			p = p.getNext();
		}
	}
	
	public Node getFirst() {
		return first;
	}
	
	public void setFirst(Node first) {
		this.first = first;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}

	public Node getLast() {
		return last;
	}

	public void setLast(Node last) {
		this.last = last;
	}
}
