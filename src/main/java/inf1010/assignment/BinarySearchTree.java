package inf1010.assignment;

import java.util.Iterator;
import inf1010.lib.two.IfiCollection;

public class BinarySearchTree<E extends Comparable<E>> implements
		IfiCollection<E> {


	class Node {
	    E element;



	}
	
	Node root;

	BinarySearchTree(Node newNode) {
	    this.root = newNode;
	}
	
	public boolean add(E e) {
		throw new UnsupportedOperationException();
	}

	public boolean contains(E e) {
		throw new UnsupportedOperationException();
	}

	public boolean remove(E e) {
		throw new UnsupportedOperationException();
	}

	public int size() {
		throw new UnsupportedOperationException();
	}

	public boolean isEmpty() {
		throw new UnsupportedOperationException();
	}

	public void clear() {
		throw new UnsupportedOperationException();
	}

	public E get(E e) {
		throw new UnsupportedOperationException();
	}

	public E[] toArray(E[] a) {
		throw new UnsupportedOperationException();
	}
	
	public Iterator<E> iterator() {
		throw new UnsupportedOperationException();
	}
}
