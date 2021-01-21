import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main_Queue {

	private static Queue q2;

	public static void main(String[] args) throws ParseException {
       Scanner sc=new Scanner(System.in);
       Node n1=new Node();
       Student student1=new Student();
       student1.setName("harry potter");
       student1.setId("123");
       SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
       student1.setDob(sdf.parse("10-02-2002"));
       
       n1.setData(student1);
       
       Queue q1=new Queue();
       q1.enqueue(n1);
       q1.traverse();
       
       Node n2=new Node();
       Student student2=new Student();
       student2.setName("harry potter");
       student2.setId("123");
       SimpleDateFormat sdf2=new SimpleDateFormat("dd-MM-yyyy");
       student2.setDob(sdf.parse("10-02-2002"));
       
       n2.setData(student1);
       
       
       q2.enqueue(n2);
       q2.traverse();
       
       System.out.println("===================");
       
       q1.dequeue();
       q1.traverse();
	}

}
