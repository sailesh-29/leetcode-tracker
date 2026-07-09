// Last updated: 7/9/2026, 10:07:19 AM
import java.util.HashMap;

class Node {
    int key;
    int value;
    Node prev;
    Node next;

    Node() {}

    Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

class LRUCache {

    private int capacity;
    private HashMap<Integer, Node> map;

    private Node head;
    private Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;

        map = new HashMap<>();

        head = new Node();
        tail = new Node();

        head.next = tail;
        tail.prev = head;
    }

    private void remove(Node node) {
        Node prevNode = node.prev;
        Node nextNode = node.next;

        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }

    private void insertAtEnd(Node node) {
        Node prevLast = tail.prev;

        prevLast.next = node;
        node.prev = prevLast;

        node.next = tail;
        tail.prev = node;
    }

    public int get(int key) {

        if (!map.containsKey(key)) {
            return -1;
        }

        Node node = map.get(key);

        remove(node);
        insertAtEnd(node);

        return node.value;
    }

    public void put(int key, int value) {

        if (map.containsKey(key)) {

            Node node = map.get(key);

            node.value = value;

            remove(node);
            insertAtEnd(node);

            return;
        }

        if (map.size() == capacity) {

            Node lru = head.next;

            remove(lru);
            map.remove(lru.key);
        }

        Node newNode = new Node(key, value);

        insertAtEnd(newNode);
        map.put(key, newNode);
    }
}