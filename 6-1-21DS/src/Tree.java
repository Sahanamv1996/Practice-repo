
public class Tree {
     Node1 root;
    public Tree() {}
	public Tree(Node1 root) {
		super();
		this.root = root;
	}
	public Node1 getRoot() {
		return root;
	}
	public void setRoot(Node1 root) {
		this.root = root;
	}
	@Override
	public String toString() {
		return "Tree [root=" + root + "]";
	}
	public Node1 findParent(String parebtData,Node1 root)
	{
		if(root==null)
			return root;
		if(root.getChildren().size()==0)
			return root;
		if(root.getData().equals(parebtData))
		for(Node1 temp:root.getChildren())
		{
			Node1 child=findParent(parentData,temp);
			if(child.getData().equals(root.getData()))
				return child;
		}
	}
    public void add(String parent,Node n1)
    {
    	if()
    	for(Node1 temp:root.getChildren())
        {
        	
        }
    	root=n1;
    	return;
    }
    Node parent=findParent(parentData, root);
    parent.getChildren().add(node);
    	}
}
    	
    public void traverse()
    {
    	if(root==null)
    	{
    		System.out.println("Nothing to display");
    		return;
        }
    }
    public void remove()
    {
    	
    }
}
