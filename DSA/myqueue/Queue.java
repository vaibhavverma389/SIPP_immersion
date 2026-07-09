public class Queue{
    int front=0;
    int rear=0;
    int size=0;
    int[] arr;
    public Queue(){
        arr= new int[5];
    }
    public Queue(int n){
        arr= new int[n];
    }
    public void enqueue(int data)
    {
        if(arr.length==rear)
        {
            System.out.print("Queue are Full");
            return;
        }
        arr[rear]=data;
        rear++;
        size++;
    }

    public int dequeue()
    {
        if(front==rear)
        {
            System.err.println("Queue Are Empty");
            return Integer.MIN_VALUE;
        }
        int data=arr[front];
        front++;
        size--;
        return data;
    }
    public void display(){
        for(int i= front;i<rear;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Queue q= new Queue(6);
        q.enqueue(11);
        q.enqueue(24);
        q.enqueue(36);
        q.enqueue(1);
        q.enqueue(4);
        q.enqueue(6);
        q.display();

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}