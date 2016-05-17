package com.hal.Queue;

/**
 * @author hal
 */
public interface Queue {
	public static final int CAPACITY = 1000;
    public int getSize();
    public boolean isEmpty();
    public Object front() throws ExceptionQueueEmpty;
    public void enqueue(Object object) throws ExceptionQueueFull;
    public Object dequeue() throws ExceptionQueueEmpty;
    public void Traversal();
}
