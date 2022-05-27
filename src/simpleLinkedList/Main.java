package simpleLinkedList;

public class Main {
	
	public static void main(String[] args) {
		SimpleLinkedList l = new SimpleLinkedList();
		Node n1 = new Node(1, null);
		l.add(n1);
		l.show();
		System.out.println("------------");
		Node n2 = new Node (2, null);
		Node n3 = new Node (3, null);
		l.add(n2);
		l.add(n3);
		l.show();
		System.out.println("------------");
		// Ahora hay que añadir un 6 entre el 1 y el 2
		Node n6 = new Node (6, null);
		l.add(1, n6);
		l.show();
		System.out.println("------------");
		// Probamos el metodo delete
		// Primero borramos la posicion 1
		l.delete(0);
		l.show();
		System.out.println("------------");
		l.delete(2);
		l.show();
		System.out.println("------------");
		// Añadimos uno en medio para poder probarlo
		l.add(n3);
		l.show();
		System.out.println("------------");
		l.delete(1);
		l.show();
		System.out.println("Metodo get:");
		Node nGet = l.get(1);
		System.out.println(nGet.toString());
		Node nPrueba = l.get(1300);
		if (nPrueba != null) {
			System.out.println(nPrueba.toString());
		} else {
			System.out.println("Este nodo es null");
		}
		
	}
}
