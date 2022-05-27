package doubleLinkedList;

public class Main {
	
	public static void main(String[] args) {
		DoubleLinkedList l = new DoubleLinkedList();
		System.out.println("A�adimos el primer nodo:");
		Node n1 = new Node(1, null, null);
		l.add(n1);
		l.show();
		System.out.println("------------");
		System.out.println("A�adimos dos nodos m�s:");
		Node n2 = new Node (2, null, null);
		Node n3 = new Node (3, null, null);
		l.add(n2);
		l.add(n3);
		l.show();
		System.out.println("------------");
		System.out.println("A�adimos 100 al principio:");
		Node n4 = new Node (100, null, null);
		l.add(0, n4);
		l.show();
		System.out.println("------------");
		System.out.println("A�adimos 500 al final:");
		Node n5 = new Node(500, null, null);
		l.add(4, n5);
		l.show();
		System.out.println("------------");
		System.out.println("A�adimos 1000 en la posicion 2:");
		Node n6 = new Node(1000, null, null);
		l.add(2, n6);
		l.show();
		System.out.println("------------");
		System.out.println("Borramos el primero:");
		l.delete(0);
		l.show();
		System.out.println("------------");
		System.out.println("Borramos el ultimo: ");
		l.delete(5);
		l.show();
		System.out.println("------------");
		System.out.println("Borramos la posicion 2:");
		l.delete(2);
		l.show();
		
	}
	
}
