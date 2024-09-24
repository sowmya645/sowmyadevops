
public class ArrayStack {
    private int maxSize;//store max number of elements
    private int size;//current number of elements
    private int top;//index of top element
    private int[] stackArray;//arraystack
    public ArrayStack(int userDefinedSize) {
        maxSize=userDefinedSize;
        size=0;
        top=-1;
        stackArray=new int[maxSize];
        
    }
    //isempty:boolean
    public boolean isEmpty() {
        return (size==0);
    }
    //isfull:boolean
    public boolean isFull() {
        return (size==maxSize);
    }
    //push:void
    public void push(int value) {
        if(!isFull()) {
           stackArray[++top]=value;
           System.out.println("added" +value);
           size++;
        }
        else {
            System.out.println("stack is full");
            return;
        }
        
    }
    //pop:int
    public int pop() {
        if(!isEmpty()) {
            int element=stackArray[top];
            top=top-1;
            size--;
            return element;
        }
        else {
            System.out.println("stack is empty");
            return -1;
        }
    }
    //peek:int
    public int peek() {
        if(!isEmpty()) {
            int element=stackArray[top];
            
            return element;
        }
        else {
            System.out.println("stack is empty");
            return -1;
        }
    }
    //size:int
    public int size() {
        return size;
        
    }
    }
    class display {
        public static void main() {
            ArrayStack x=new ArrayStack(5);
            System.out.println("inserting elements in stack");
            x.push(10);
            x.push(10);	
            x.push(10);
            x.push(10);
            x.push(10);
            System.out.println("size"+x.size());
            System.out.println("popped element"+x.pop());
            System.out.println("popped element"+x.pop());
            System.out.println("top element"+x.peek());
            System.out.println("size"+x.size());
            
        }
    }