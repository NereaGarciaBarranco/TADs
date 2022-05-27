package stack;

public class Main {
	public static void main(String[] args) {
		Stack pila = new Stack();
		Node n1 = new Node(1, null);
		pila.push(n1);
		Node n2 = new Node(2, null);
		Node n3 = new Node(3, null);
		pila.push(n2);
		pila.push(n3);
		pila.show();
		System.out.println("-------");
		System.out.println("Nodo que vamos a extraer:");
		Node n = pila.pop();
		System.out.println(n.getContent());
		System.out.println("-------");
		pila.show();
	}	
}
