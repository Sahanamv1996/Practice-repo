
public class Queue {
Node front;
Node rear;
public Queue() {}

public Queue(Node front, Node rear) {
	super();
	this.front = front;
	this.rear = rear;
}

public Node getFront() {
	return front;
}

public void setFront(Node front) {
	this.front = front;
}

public Node getRear() {
	return rear;
}

public void setRear(Node rear) {
	this.rear = rear;
}
@Override
public String toString() {
	return "Queue [front=" + front + ", rear=" + rear + "]";
}

public void enqueue(Node n) {
	if(this.rear == null) {
		this.setFront(n);
		this.setRear(n);
	}else {
		this.getRear().setNext(n);
		this.setRear(n);
	}
}
public void dequeue() {
	//1.Check if queue is empty
	//2.Check if front==rear
	if(this.getFront()==null) {
		System.out.println("Queue is empty");
	}
	else if(this.getFront().equals(this.getRear())) {
		System.out.println("Only one element is present");
		Node temp = this.getFront();
		this.setFront(null);
		this.setRear(null);
		temp=null;
	}
	else {
		Node temp=this.getFront();
		this.setFront(temp.getNext());
		temp=null;
	}
}
public void traverse() {
	Node temp=getFront();
	while(true) {
		System.out.println(temp);
		temp=temp.getNext();
		if(temp == null)
			break;
	}
  }
}
