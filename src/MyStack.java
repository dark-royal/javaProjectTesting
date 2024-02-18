import java.util.Stack;

public class MyStack {

    private  int size;
    private int numberOfElement = 0;
    private int[] elements;


    public MyStack(int size) {
        this.size = size;
        elements = new int [size];
    }

    public boolean isEmpty() {
        return numberOfElement == 0;
    }

    public void push(int element){
        if(numberOfElement == size) throw new StackOverflowError("Stack Overflow");
        elements[numberOfElement] = element;

        numberOfElement++;
    }


    public int pop() {

        if(isEmpty()) throw new IllegalArgumentException("ArrayIndexOutOfBoundsException");
        int popped = peek();
        numberOfElement--;
        return popped;
    }

    public int peek() {
        if(isEmpty()) throw new IllegalArgumentException("Error");
        return elements[numberOfElement - 1];

    }



}
