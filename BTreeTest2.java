class tree 
	{
		public int x;
		public tree left;
		public tree right;
	}
class BTree
	{
		public tree t;
		BTree()
		{
			t=null;
		}
		public void insert(int v)
		{
			t=insert(t,v);
		}
		public void showLNR()
		{
			System.out.println("LNR(IN-ORDER):");
			LNR(t);
		}
		public void showLRN()
		{
			System.out.println("LRN(POST-ORDER):");
			LRN(t);
		}
		public void showNLR()
		{
			System.out.println("NLR(PRE-ORDER):");
			NLR(t);
		}
		tree insert(tree t,int v)
		{
			if(t==null)
			{
				t=new tree();
				t.x=v;
				t.left=null;
				t.right=null;
			}
			else
			if(v<t.x)
			t.left=insert(t.left,v);
			else
			if(v>t.x)
			t.right=insert(t.right,v);
			return t;
		}
		public void LNR(tree t)
		{
			if(t!=null)
			{
				LNR(t.left);
				System.out.println(+t.x);
				LNR(t.right);
			}
		}
		public void LRN(tree t)
		{
			if(t!=null)
			{
				LRN(t.left);
				LRN(t.right);
				System.out.println(+t.x);
			}
		}
		public void NLR(tree t)
		{
			if(t!=null)
			{
				System.out.println(+t.x);
				NLR(t.left);
				NLR(t.right);
			}
		}
	}
class BTreeTest2
	{
		public static void main(String args[])
		{
			BTree t1=new BTree();
			t1.insert(400);
			t1.insert(300);
			t1.insert(200);
			t1.insert(500);
			t1.insert(450);
			t1.insert(600);
			t1.insert(650);
			t1.insert(350);
			t1.showLNR();
			t1.showNLR();
			t1.showLRN();
		}
	}