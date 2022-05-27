package simpleLinkedList;

// Un ArrayList es una lista enlazada simple
// Un ejercicio posible es pedir que se puedan añadir dos nodos a la vez o borrar dos nodos a la vez

public class SimpleLinkedList {
	private Node first;
	private int size;
	
	// Cuando la lista esta vacia
	public SimpleLinkedList() {
		this.first = null;
		this.size = 0;
	}
	
	// Cuando introducimos el primer dato
	public SimpleLinkedList(Node first) {
		this.first = first;
		this.size = 1;
	}
	
	// Para mandar varios nodos de golpe que estén entrelazados entre si
	// Esto simplifica bastante
//	public SimpleLinkedList (Node first, int numeroNodos) {
//		this.first = first;
//		size = numeroNodos;
//	}

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
	
	// Añadir simple como el del ArrayList que lo añadia en la ultima posicion
	public boolean add (Node node) {
		try {		
			// Asi se añade el primer nodo
			if (size == 0) {
				// First apunta al nodo que le estas dando, eso es añadir el primer elemento
				first = node;
			} else {
				// Creamos un puntero que apunta exactamente a donde apunta first
				// Lo vamos a ir desplazando hasta que llegue al ultimo punto de la lista enlazada
				// First no lo podemos mover, por eso creamos un puntero
				Node p = first;
				// Con este bucle el puntero se mueve al final y apunta al ultimo nodo
				for (int i = 1; i < size; i++) {
					p = p.getNext();
				} 
				// Cuando apunta al final se añade el nodo que le acabas de pasar por parametro
				p.setNext(node);
				// Sumamos 1 al tamaño porque lo hemos añadido
				
			} size++;
			return true;
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
				first = node;
			// El add de arriba siempre lo añade al final, ya lo tenemos programado, 
			// asi que lo llamamos
			} else if (position == size) {
				return (add(node));
			} 	
			/*
			 * Cuando lo añadimos en el medio, con p tenemos que buscar el indice
			 * donde hay que añadirlo -1. Tenemos que tener en cuenta que un nodo
			 * si no esta apuntado, Java lo borra. El nodo que queremos añadir
			 * lo apuntamos a su siguiente, habrá dos nodos apuntando al mismo.
			 * Luego ya le cambias al nodo anterior su next por el nodo que quieres
			 * meter nuevo.
			 */
			else {
				// Creamos el puntero que apunta al primero
				Node p = first;
				for (int i = 1; i < position; i++) {
					p = p.getNext();
				}
				// Cogemos el next de p
				node.setNext(p.getNext());
				// Cambiamos el next de p a node
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
			if(position == 0) {
				// Asi el primer nodo queda desapuntado y se borra
				first = first.getNext();
			} // Si se quiere borrar el ultimo nodo 
			else if (position == size) {
				Node p = first;
				for (int i = 1; i < size -1; i++) {
					p = p.getNext();
				}
				p.setNext(null);
			} // Si el nodo que se quiere eliminar esta en el medio  
			else {
				Node p = first;
				for (int i = 0; i < position - 1; i++) {
					p = p.getNext();
				}
				p.setNext(p.getNext().getNext());
			} size--; return true;
		} catch (Exception e) {
			System.out.println(e.toString());
			return false;
		}
	}
	
	// Metodo get, como el ArrayList que le pides el get(i), el puntero se mueve hasta ese nodo
	// y en ese momento devuelve p, si no esta en la lista porque es mas pequeña o esta vacia
	// el return es null
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
			p = p.getNext();
		}
	}
	
}
