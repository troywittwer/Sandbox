package sandbox;

import java.util.ArrayList;

public class GenericStack<T> {

  // private int maxsize; // not needed because ArrayLists are dynamic
  private int top;
  private ArrayList<T> items = new ArrayList<>();  // instead of private int[] items;

  public GenericStack() {  // no longer a need for int maxsize
    // no longer a need for if since not using maxsize
    top = 0;
  }

  public void push(T item) {  // T is like a variable for the datatype
    items.add(item);  // instead of items[top] = item;
    top++;
  }

  public T pop() {
    if (isEmpty()) {
      throw new GenericStackException("Underflow Error");
    }
    return items.remove(--top);
  }

  public boolean isEmpty() {
    return (top == 0);
  }

  public static class GenericStackException extends RuntimeException {

    public GenericStackException(String message) {
      super(message);
    }
  }

  public static void main(String[] args) {
    GenericStack<Integer> stack = new GenericStack<>();
    stack.push(1);
    stack.push(2);
    stack.push(3);
//stack.push(4); //overflow error
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());

    GenericStack<String> stringStack = new GenericStack<>();
    stringStack.push("1");
    stringStack.push("2");
    stringStack.push("3");
//stringStack.push("4"); //overflow error
    System.out.println(stringStack.pop());
    System.out.println(stringStack.pop());
    System.out.println(stringStack.pop());
  }
}