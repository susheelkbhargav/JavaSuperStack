package com.company;


public class Stack {
    private int maxSize;
    private long[] stackArray;
    private int top;

    public void showAll(){
        for( int i=top; i>=0; i-- ) {
            System.out.println(stackArray[i]);
        }
    }

    public Stack(int s) {
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;
    }

    public void inc(int e, int k){
        for(int i=0;i<e;i++){
            stackArray[i]+=k;
        }
    }
    public void push(int j) {
        stackArray[++top] = j;
    }
    public long pop() {
        return stackArray[top--];
    }
    public long peek() {
        return stackArray[top];
    }
    public boolean isEmpty() {
        return (top == -1);
    }
    public boolean isFull() {
        return (top == maxSize - 1);
    }

}
