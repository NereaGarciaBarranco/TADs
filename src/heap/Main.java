package heap;

public class Main {
	public static void main(String[] args) {
		Heap cola = new Heap();
		Node n1 = new Node(1, null);
		cola.push(n1);
		Node n2 = new Node(2, null);
		Node n3 = new Node(3, null);
		cola.push(n2);
		cola.push(n3);
		cola.show();
		System.out.println("-------");
		Node nBorrado = cola.pop();
		System.out.println(nBorrado);
		cola.show();
	}	
}
