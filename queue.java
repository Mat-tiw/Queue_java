public class queue {
    int cap;
    int size;
    int F;
    int R;
    int array[];

    public queue(int cap) {
        this.cap = cap;
        this.size = 0;
        this.F = 0;
        this.R = 0;
        array = new int[cap];
    }

    public boolean isFull() {
        if (size == cap) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public void enqueue(int data) {
        if (!isFull()) {
            array[R] = data;
            size++;
            R = (R + 1) % cap;
        }
    }
    public int dequeue(){
        if(!isEmpty()){
            int data = array[F];
            size--;
            F = (F + 1) % cap;
            return data;
        }
        System.out.println("Queue is underflow");
        return -1;
    }

    public void show() {
        for (int i = 0; i < this.size; i++) {
            int index = (i + F) % cap;
            System.out.print(this.array[index] + " ");
        }
        System.out.println();
    }
}
