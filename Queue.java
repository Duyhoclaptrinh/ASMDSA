public class Queue {
    int head; 
    int last; 
    int size;
    int capacity;
    Message messages[];

    public Queue(int capacity) {
        this.capacity = capacity;
        head = this.size = 0;
        last = capacity - 1;
        messages = new Message[this.capacity];
    }

    public boolean isFull(Queue queue) {
        return (queue.size == queue.capacity);
    }


    public boolean isEmpty(Queue queue) {
        return (queue.size == 0);
    }

    
    void enqueue(Message item) {
        if (isFull(this)) {
            System.out.println("Queue is full!");
            return;
        }
        this.last = (this.last + 1) % this.capacity;
        this.messages[this.last] = item;
        this.size = this.size + 1;
        System.out.println("Enqueue Successfully!");
    }

    
    Message delete() {
        if (isEmpty(this)) {
            System.out.println("Queue is empty!");
            return null;
        }
        Message item = this.messages[this.head];
        this.head = (this.head + 1) % this.capacity;
        this.size = this.size - 1;
        System.out.println("Delete Successfully!");
        return item;
    }

    
    void display() {
        int a;
        if (isEmpty(this)) {
            System.out.println("No Message");
            return;
        }
        System.out.println("All the message you just input");
        System.out.println("---------------------------------");
        for (a = head; a <= last; a++) {
            System.out.println(
                    "Message from " + messages[a].getHuman() + " and the message is: " + messages[a].getData());
        }
        System.out.println("");
        return;
    }
}
