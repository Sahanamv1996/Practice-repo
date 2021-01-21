
public class Main {
   public static void main(String [] args)
   {
	   Node n1=new Node();
	   n1.setData("A");
	   Node n2=new Node();
	   n2.setData("America");
	   Node n3=new Node();
	   n3.setData("Argentina");
	   Node n4=new Node();
	   n4.setData("B");
	   Node n5=new Node();
	   n5.setData("Belgium");
	   Node n6=new Node();
	   n6.setData("Bangladesh");
	   Node n7=new Node();
	   n7.setData("C");
	   Node n8=new Node();
	   n8.setData("Canada");
	   
	   Tree tree=new Tree();
	   tree.add(null, n1);
	   
	   tree.add("A",n2);
	   tree.add("A", n3);
	   
	   tree.add("A", n4);
	   tree.add("B", n5);
	   tree.add("B", n6);
	   
	   tree.add("A", n7);
	   tree.add("C",n8);
   }
}
