package doubleLinkedList;

public class DoubleLinkedList {
	private Node first;
	private int size;
	
	// Cuando la lista esta vacia
	public DoubleLinkedList() {
		this.first = null;
		this.size = 0;
	}
	
	// Cuando introducimos el primer dato
	public DoubleLinkedList(Node first) {
		this.first = first;
		this.size = 1;
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
	
	// Añadir sin posicion
	public boolean add (Node node) {
		try {		
			if (size == 0) first = node;
			else {
				Node p = first;
				for (int i = 1; i < size; i++) {
					p = p.getNext();
				} 
				// Cuando apunta al final se añade el nodo que le acabas de pasar por parametro
				p.setNext(node);
				node.setPrevious(p);
				// Sumamos 1 al tamaño porque lo hemos añadido	
			} size++; return true;
		} catch (Exception e) {
			System.out.println(e.toString());
			return false;
		}
	}
	
	// Para añadir en una posicion concreta (hay que programar insertar al principio,
		// en medio o al final).
		public boolean add (int position, Node node) {
			try {
				// Si lo queremos poner al principio, el nuevo nodo tiene que 
				// apuntar al que ahora es first
				if (position == 0) {
					node.setNext(first);
					first.setPrevious(node);
					first = node;
				// El add de arriba siempre lo añade al final, ya lo tenemos programado, 
				// asi que lo llamamos
				} else if (position == size) {
					return (add(node));
				} else {
					// Creamos el puntero que apunta al primero
					Node p = first;
					for (int i = 1; i < position; i++) {
						p = p.getNext();
					}
					node.setPrevious(p);
					node.setNext(p.getNext());
					p.getNext().setPrevious(node);
					p.setNext(node);	
				} size++; return true;
			} catch (Exception e) {
				System.out.println(e.toString());
				return false;
			}
		} 
		
		public boolean delete (int position) {
			try {
				// Si se quiere borrar el primer nodo
				if (position == 0) {
					// Asi el primer nodo queda desapuntado y se borra
					first = first.getNext();
					first.setPrevious(null);
				} // Si se quiere borrar el ultimo nodo 
				else if (position == size) {
					Node p = first;
					for (int i = 1; i < size; i++) {
						p = p.getNext();
					}
					p.getPrevious().setNext(null);
					p.setPrevious(null);		
				} // Si el nodo que se quiere eliminar esta en el medio  
				else {
					Node p = first;
					for (int i = 0; i < position - 1; i++) {
						System.out.println(p.getContent());
						p = p.getNext();
					}
					p.getNext().getNext().setPrevious(p);
					p.setNext(p.getNext().getNext());	
				} size--; return true;
			} catch (Exception e) {
				System.out.println(e.toString());
				return false;
			}
		}

		public Node get (int position) {
			try {
				// Comprobamos que la posicion sea correcta
				if (position >= 0 && position < size) {		
					Node p = first;
					for (int i = 1; i <= position; i++) {
						p = p.getNext();
					} return p;
				}
			} catch (Exception e) {
				System.out.println(e.toString());
			} return null;		
		}
		
		public void show() {
			Node p = first;
			for (int i = 0; i < size; i++) {
				System.out.println("[" + i + "] -> " + p.getContent());
				if(i != size - 1) p = p.getNext();
			}
			System.out.println("--------------------");
			for(int i = size - 1; i >= 0; i-- ) {
				System.out.println("[" + i + "] -> " + p.getContent());
				if (i != 0) p = p.getPrevious();
			}	
		}
}
