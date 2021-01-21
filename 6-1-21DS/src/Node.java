public class Node{
	Student data;
	Node next;
	public Node(){}
	public Node(Student data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}
	public Student getData() {
		return data;
	}
	public void setData(Student string) {
		this.data = string;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
}