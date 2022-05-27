package stack;

public class Stack {
	/*
	 * En las pilas (stack) lo ultimo que se añade se pone encima de lo
	 * ultimo que se ha guardado, por eso el puntero apunta al ultimo.
	 */
	private int size;
	private Node last;
	
	public Stack () {
		last = null;
		size = 0;
	}
	
	public Stack (Node last) {
		this.size = 1;
		this.last = last;
	}
	
	public Stack (int size, Node last) {
		this.size = size;
		this.last = last;
	}
	
	
	public boolean isEmpty() {
		if (last == null) return true;
		else return false;
	}
	
	/*
	 * La primera vez lo mete en el primer hueco disponible, despues debemos
	 * imaginar que se van colocando uno encima de otro, siempre sobre el
	 * ultimo. Una vez que introducimos un Nodo tenemos que indicarle cual
	 * es su last. Si no hay nada last apuntara a null. 
	 */
	public boolean push(Node node) {
		try {
			if (isEmpty()) last = node;
			else {
				node.setNext(last);
				last = node;		
			} size++; return true;
		} catch (Exception e) { System.out.println(e.toString());} 
		return false;
	}
	
	// Elimina el ultimo nodo introducido
	public Node pop() {
		try {
			if (!isEmpty()) {
				Node p = last;
				last = last.getNext();
				size--;
				return p;
			}	
		} catch (Exception e) {
			System.out.println(e.toString());		
		} return null;
	}
	
	public void show() {
		Node p = last;
		for (int i = 1; i <= size; i++) {
			System.out.println("[" + i + "] -> " + p.getContent());
			p = p.getNext();
		}
	}
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int content) {
		this.size = content;
	}
	
	public Node getLast() {
		return last;
	}
	
	public void setLast(Node last) {
		this.last = last;
	}
}
