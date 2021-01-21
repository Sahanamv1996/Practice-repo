
public class Student_Stack{
	int data;
	Node next;
	public Student_Stack() {}
	public Student_Stack(int data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	@Override
	public String toString() {
		return "Student_Stack [data=" + data + ", next=" + next + "]";
	}
	

}
