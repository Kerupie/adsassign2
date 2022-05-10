public class BST <K extends Comparable<K>, V>{
    private Node root;
    private class Node
    {
        private K key;
        private V val;
        private Node left, right;
        public Node(K key, V val)
        {
            this.key = key;
            this.val = val;
        }
        public Node insertionBST(Node root, K key, V value) {
            if (root == null) {
                Node newNode = new Node(key, value);
                root = newNode;
                return root;
            }
            if (key.compareTo(root.key) < 0) {
                root.left = insertionBST(root.left, key, value);
            }
            else if (key.compareTo(root.key) > 0) {
                root.right = insertionBST(root.right, key, value);
            }
            return root;
        }

        public V get(K key)
        {
            Node currentNode = root;
            while (currentNode != null)
            {
                if(key.compareTo(currentNode.key) == 0) return currentNode.val;
                if(key.compareTo(currentNode.key) < 0) currentNode = currentNode.left;
                else currentNode = currentNode.right;
            }
            System.out.println("There's no such key in the BinarySearchTree");
            return null;
        }

        public void delete(K key)
        {

        }

        //got from lecture5
        public Iterable<K> iterator()
        {
            MyQueue<K> theQueue = new MyQueue<K>();
            inorder(root, theQueue);
            return (Iterable<K>) theQueue;
        }

        private void inorder(Node x, MyQueue<K> theQueue)
        {
            if(x == null) return;
            inorder(x.left, theQueue);
            theQueue.enqueue(x.key);
            inorder(x.right, theQueue);
        }
    }
}
