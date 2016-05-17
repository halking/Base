package com.hal.Queue;

/**
 * @author hal
 */
public class Queue_Array implements Queue {
     protected  int capacity;
     protected Object[] Q;
     protected int f=0;
     protected int r=0;
     /**
	 * 
	 */
	public Queue_Array() {
		// TODO Auto-generated constructor stub
		this(CAPACITY);
	}
	public Queue_Array(int cap){
		capacity =cap;
		Q = new Object[capacity];
	}
  /* 
	 * @see com.hal.Queue.Queue#getSize()
	 *@return
	 */
	@Override
	public int getSize() {

		return (r-f+CAPACITY)%CAPACITY;
	}

	/* 
	 * @see com.hal.Queue.Queue#isEmpty()
	 *@return
	 */
	@Override
	public boolean isEmpty() {

		return (f==r);
	}

	/* 
	 * @see com.hal.Queue.Queue#front()
	 *@return
	 *@throws ExceptionQueueEmpty
	 */
	@Override
	public Object front() throws ExceptionQueueEmpty {
      if (isEmpty()) {
		throw new ExceptionQueueEmpty("队空了！");
	}
		return Q[f];
	}

	/* 
	 * @see com.hal.Queue.Queue#enqueue(java.lang.Object)
	 *@param object
	 *@throws ExceptionQueueFull
	 */
	@Override
	public void enqueue(Object object) throws ExceptionQueueFull {
		   if (getSize()==CAPACITY-1) {
				throw new ExceptionQueueFull("队满了！") ;
			}
			   Q[r] = object;
			   r = (r+1)%CAPACITY;
	}

	/* 
	 * @see com.hal.Queue.Queue#dequeue()
	 *@return
	 *@throws ExceptionQueueEmpty
	 */
	@Override
	public Object dequeue() throws ExceptionQueueEmpty {
    if (isEmpty()) {
		throw new ExceptionQueueEmpty("队里没元素了！");
	}
		return Q[f];
	}

	/* 
	 * @see com.hal.Queue.Queue#Traversal()
	 */
	@Override
	public void Traversal() {
		for (int i = f; i < r; i++) {
			System.out.print(Q[i]+" ");
		}
		System.out.println();
	}

}
