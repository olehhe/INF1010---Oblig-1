package inf1010.assignment;

public class Node<E extends Compareable<E>> {
    
    E elem;
    Node left, right;

    Node() {
	this.left = null;
	this.right = null;
    }
}
