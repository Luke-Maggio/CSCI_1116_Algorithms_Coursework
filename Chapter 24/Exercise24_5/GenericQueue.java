package exercise24_5;

public class GenericQueue<E> extends java.util.LinkedList<E> {

  public void enqueue(E e) {
    this.addLast(e);
  }

  public E dequeue() {
    return removeFirst();
  }

  public int getSize() {
    return size();
  }

  @Override
  public String toString() {
    return "Queue: " + toString();
  }
}
