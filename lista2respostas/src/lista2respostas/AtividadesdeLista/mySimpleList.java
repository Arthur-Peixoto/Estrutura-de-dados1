package lista2respostas.AtividadesdeLista;

public class mySimpleList<T> implements myInterfaceList<T> {

	class Node{
		T data;
		Node next;
		
		public Node(T data) {
			this.data = data;
			this.next = null;
		}
	}
	
	private Node head;
	private Node tail;
	int size;
	
	public mySimpleList() {
		head = null;
		tail = null;
		size = 0;
	}
	
	public void addFirst(T value) {
		Node nova = new Node(value);
		
		if(head == null) {
			head = nova;
			tail = nova;
		}else {
			nova.next = head;
			head = nova;	
		}
		
		size++;
	}

	public void addLast(T value) {
		Node novo = new Node(value);
		
		if(head == null) {
			head = novo;
			tail = novo;
		}else {
			tail.next = novo;
			tail = novo;
		}
		
		size++;
	}

	
	public void addAfter(T dado, T value) {
		Node p = searchNode(value);
		
		if(p == null) {
			System.out.println("critério inválido");
		}else {
			Node novo = new Node(value);
		
			if(p.next == null) {
				tail = novo;
			}
			
			novo.next = p.next;
			p.next = novo;
			
			size++;
		}
		
		
	}

	public T peekFirst() {
		if(head == null) {
			System.out.println("Lista Vazia!! \n");
			return null;
		}else {
			return head.data;
		}
	}

	public T peekLast() {
		if(tail == null) {
			System.out.println("Lista Vazia!! \n");
			return null;
		}else {
			return tail.data;
		}
	}
	
	private Node searchBefore(T value) {
		Node p = head;
		Node anterior = null;
		
		while(p!=null) {
			anterior = p;
			p = p.next;
			
			if(p != null && p.data.equals(value)) {
				return anterior;
			}
		}
		return null;
	}
	
	private Node searchNode(T value) {
		Node p = head;
		
		while(p != null) {
			if(p.data.equals(value)) {
				return p;
			}
			p = p.next;
		}
		return null;
	}

	public T search(T value) {
		Node p = searchNode(value);
		
		if(p == null) {
			return null;
		}else {
			return p.data;
		}
	}

	public T removeFirst() {
		Node p = head;
		T dadoRetorno = null;
		
		if(head == null) {
			System.out.println("Lista vazia!! \n");
		} else {
			dadoRetorno = head.data;
			
			if (head == tail) {
				System.out.println("Remove único elemento");
				head = null;
				tail = null;
			} else {
				System.out.println("Remove o primeiro elemento, mas existem outros!!\n ");
				head = head.next;
			}
			
			p.next = null;
			
			size--;	
		}
	
		return dadoRetorno;
	}

	public T removeLast() {
		
		T dadoRetorno = null;
		
		if(tail == null) {
			System.out.println("Lista vazia!! \n");
			return null;
		} else {
			dadoRetorno = tail.data;
			
			if (head == tail) {
				System.out.println("Remove único elemento");
				head = null;
				tail = null;
			} else {
				System.out.println("Remove o primeiro elemento, mas existem outros!!\n ");
				Node p = tail;
				
				while(p.next != tail) {
					p = p.next;
				}
				
				tail = p;
				tail.next = null;
			}
			
			size--;	
		}
	
		return dadoRetorno;
	}

	@Override
	public T remove(T value) {
		Node anterior = null;
		Node removido = null;
		
		if(head == null) {
			System.out.println("Lista vazia!! \n");
			return null;
		}
		anterior = searchBefore(value);
		if(anterior == null) {
			if(head.data.equals(value) == false) {
				System.out.println("critério não existe!!\n");
				return null;
			} else {
				return removeFirst();
			}
		}else {
			System.out.println("remove elemento meio ou último\n");
			
			removido = anterior.next;
			
			if(removido == tail) {
				System.out.println("remove último \n");
				return removeLast();
			}else {
				System.out.println("remove meio \n");
				anterior.next = removido.next;
				removido.next = null;
				size--;
				
				return removido.data;
			}
		}
	
	}

	public void show() {
		Node p = head;	
		
		if(p == null) {
			System.out.println("Lista vazia!! \n");
		}
		else {
			while(p != null) {
				System.out.println("Dado: " + p.data);
				p = p.next;
			}
		}
		System.out.println("size = " + size);
	}

	@Override
	public void showReverse() {
		// TODO Auto-generated method stub
		
	}
	
}
