package j_171180006;

public class binarysearch {
	
	
	int depth =0;
	int sayac1=0;
	int sayac2=0;
	int sayac3=0;
	
	
	public  Node inserting(Node root, int n) {
		
		if(root== null) {				//yeni node olusturulur
			return new Node(n);
		}
	
		if(n<root.data) {			//eklenen de�er root de�erinden kucukse sol node'a buyukse sa� node'a yerlestirilir
			root.left= inserting(root.left,n);
		}
		else {
			root.right=inserting(root.right, n);
		}
	
		return root;
		
	}
	
	public void inorder(Node root) {
		
		if(root== null) {
			return;
		}
		inorder(root.left);				//en soldaki node dan baslayarak sonra root node ve en son sa� node s�ralamas�yla 
												// t�m node'lar� dolas�r
		System.out.print(root.data+" ");
			
		inorder(root.right);
		
		
		
	}
	
	public void postorder(Node root) {
		if(root==null) {
			return;							//en soldaki node dan baslar sonra sa� node ve en son root node s�ralamas� ile
											// t�m node'lar� dolas�r	
			}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
		
	}
	public void preorder(Node root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	
	}

	
	
	
	
	public Node minimum(Node root) {  // root un silinmesi durumunda kullanmak �zere en k���k left child bulunur.
		if(root.left==null)
			return root;
		else
			return(minimum(root.left));
		
	}

	public Node delete( Node root, int n) {
		if(root==null) {
			return null;
		}
		if(root.data<n) {				// silinecek de�er k�kten b�y�kse bu right child d�r 
			root.right= delete(root.right,n);
		}
		else if(root.data>n) {			//silinecek de�er k�kten k���k ise left child d�r
			root.left= delete(root.left,n);
		}
		else {
			if(root.left!=null && root.right!=null) {	//e�er silinecek de�erin sa� ve sol node lar� doluysa minimum 
														//fonksiyonu kullan�larak silinecek olan root'un sa��ndaki en kucuk eleman bulunur
														// ve silinen eleman yerine ge�er
				Node minimumr= minimum(root.right);
				root.data= minimumr.data;
				root.right=delete(root.right,minimumr.data);
			}
				
			else if (root.right!=null) {
				root=root.right;
			}
			else if(root.left!=null) {
				root=root.left;
			}
			else
				root=null;
			
		
		}
			return root;
	
	
	}

	public boolean search(Node root,int n) {
	
		
		if(root==null) 
			return false;

		if ((int)root.data==n) {
			
			return true;
		}
			if(root.data<n) {
				
			return search(root.right,n);
			}
				else if(root.data>n) {
					
					return search(root.left,n);
				}
		
				return false;
	

	
	}
	public void inorderbul(Node root,int n) {
		
		if(root==null)
			return;
		
			
			
			inorderbul(root.left,n);
			sayac1++;
			if(root.data==n)
				System.out.print(sayac1);
			inorderbul(root.right,n);
			
				}
		
	public void postorderbul (Node root,int n) {
		
		if(root==null)
			return;
		
			postorderbul(root.left,n);
			postorderbul(root.right,n);
			sayac2 ++;
			if(root.data==n)
				System.out.print(sayac2);
			
			
		}
	
	public void preorderbul(Node root, int n) {
		
		if(root==null)
			return;
		
		
		sayac3 ++;
		if(root.data==n)
			System.out.print(sayac3);
	
		preorderbul(root.left,n);
		preorderbul(root.right,n);
	
	}
	
	
	
	
	
	public int depth(Node root,int n)  
    { 
		
        if(root.data<n) {
        	
        	 depth++;
        	 depth(root.right,n); 
        	
         }
         else if(root.data>n) {
        	 depth++;
        	 depth(root.left,n);
        	  
         }
         
         return depth;      
		
      } 

	public void parent(Node root,int n) {
		
		if(root.data>n) {
		System.out.print(root.data+" ");
		parent(root.left,n);
		
		}
		else if(root.data<n) {
			System.out.print(root.data+" ");
			parent(root.right,n);
		}
		
	}
	
	
	
	public void child(Node root,int n) {				
		
		if(root==null)
			return;
		
		
		
		if(root.data==n) {
		
		if(root.left!=null&&root.right!= null) {		
		System.out.print(root.left.data+" ");
		System.out.print(root.right.data+" ");
		child(root.left,n);
		child(root.right,n);
		}
		else if(root.left!=null) {
			System.out.print(root.left.data+" ");
			child(root.left,n);
		}
		else if(root.right!=null) {
			System.out.print(root.right.data+" ");
			child(root.right,n);
		}
		
		else
			System.out.println();
	
		}
		else if(root.data<n) {
			child(root.right,n);
			
		}
		else if(root.data>n) {
			child(root.left,n);
		}
		
			
	
	}
	





}
