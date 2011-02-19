package inf1010.assignment;

import java.util.Iterator;
import inf1010.lib.two.IfiCollection;

public class SinglyLinkedList<E extends Comparable<E>> implements
		IfiCollection<E> {
    
    // internal list-element class
    class Element<E> {
	public E data;
	public Element<E> next;
    }
    
    public Element<E> first, last;

    public boolean add(E e) {
    	throw new UnsupportedOperationException();

	Element<E> elem = new Element<E>();
	elem.data = e;

	if(this.first == null) {
	    first = elem;
	    last = elem;
	    return true;
	} else if(first.next == null) {
	    int cmpt = first.data.compareTo(e);
	    
	    if(cmpt < 0) {
		first.next = elem;
		return true;
	    } else if(cmpt > 0) {
		elem.next = first;
		first = elem;
		return true;
	    }
	} else {
	    Element<E> elemN = first.next;

	    for(Element<E> elemF = elemN.next; elemF != null; elemF = elemF.next) {
		int cmpt = elemF.data.compareTo(e);

		if(cmpt < 0) {
		    if(elemF.next == null) {
			e.next = elemF.next;
			elemF.next = e;
		    }
		} else if(cmpt > 0) {
		    if(elemF.next == null) 
		}
	    }
	}

    } // add()

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
