public class DequeImplementation {
    public int[] arr;
    public int front;
    public int rear;
    public int size;
    public int capacity;

    public DequeImplementation(int k) {
        arr = new int[k];
        capacity = k;
        front = 0;
        rear = 0;
        size = 0;
    }

    public boolean insertFront(int value) {
        if (size == capacity) return false;
        front = (front - 1 + capacity) % capacity;
        arr[front] = value;
        size++;
        return true;
    }

    public boolean insertLast(int value) {
        if (size == capacity) return false;
        arr[rear] = value;
        rear = (rear + 1) % capacity;
        size++;
        return true;
    }

    public boolean deleteFront() {
        if (size == 0) return false;
        front = (front + 1) % capacity;
        size--;
        return true;
    }

    public boolean deleteLast() {
        if (size == 0) return false;
        rear = (rear - 1 + capacity) % capacity;
        size--;
        return true;
    }

    public int getFront() {
        if (size == 0) return -1;
        return arr[front];
    }

    public int getRear() {
        if (size == 0) return -1;
        return arr[(rear - 1 + capacity) % capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public static void main(String[] args) {
        DequeImplementation deque = new DequeImplementation(5);

        System.out.println("Insert Last 10: " + deque.insertLast(10));
        System.out.println("Insert Last 20: " + deque.insertLast(20));
        System.out.println("Insert Front 5: " + deque.insertFront(5));
        System.out.println("Get Front: " + deque.getFront()); // Expected: 5
        System.out.println("Get Rear: " + deque.getRear());   // Expected: 20
        System.out.println("Delete Front: " + deque.deleteFront());
        System.out.println("Delete Rear: " + deque.deleteLast());
        System.out.println("Is Empty: " + deque.isEmpty());   // Expected: false
        System.out.println("Is Full: " + deque.isFull());     // Expected: false
    }
}
