

public class Node1 {
	   String data;
	    public Node1() {
	    	
	    }
		public Node1(String data) {
			super();
			this.data = data;
		}
		public String getData() {
			return data;
		}
		public void setData(String data) {
			this.data = data;
		}
		@Override
		public String toString() {
			return "Node1 [data=" + data + "]";
		}
}
