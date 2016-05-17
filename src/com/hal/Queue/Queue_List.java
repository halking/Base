package com.hal.Queue;

import com.hal.linked.Node;

/**
 * @author hal
 */
public class Queue_List implements Queue {
	protected Node  head;
	protected Node tail;
	protected int size;
 
	 /**
	 * 
	 */
	public Queue_List() {
		// TODO Auto-generated constructor stub
		head=tail=null;
		size=0;
	}
	/* 
	 * @see com.hal.Queue.Queue#getSize()
	 *@return
	 */
	@Override
	public int getSize() {

		return size;
	}

	/* 
	 * @see com.hal.Queue.Queue#isEmpty()
	 *@return
	 */
	@Override
	public boolean isEmpty() {

		return (0==size)?true:false;
	}

	/* 
	 * @see com.hal.Queue.Queue#front()
	 *@return
	 *@throws ExceptionQueueEmpty
	 */
	@Override
	public Object front() throws ExceptionQueueEmpty {

		return null;
	}

	/* 
	 * @see com.hal.Queue.Queue#enqueue(java.lang.Object)
	 *@param object
	 *@throws ExceptionQueueFull
	 */
	@Override
	public void enqueue(Object object) throws ExceptionQueueFull {
		Node  node = new Node();
		node.setElement(object);
		node.setNext(null);
		if (0==size)  head = node;
		else  tail = node;
		size++;
	}

	/* 
	 * @see com.hal.Queue.Queue#dequeue()
	 *@return
	 *@throws ExceptionQueueEmpty
	 */
	@Override
	public Object dequeue() throws ExceptionQueueEmpty {
        if(0==size) 
        	throw new ExceptionQueueEmpty("队空！");
        Object oldObject = head.getElement();
        head = head.getNext();
        size--;
        if(0==size) tail =null;
		return oldObject;
	}

	/* 
	 * @see com.hal.Queue.Queue#Traversal()
	 */
	@Override
	public void Traversal() {
		Node p = head;
		while(null!=p){
			System.out.print(p.getElement()+" ");
			p=p.getNext();
		}
	}

}
