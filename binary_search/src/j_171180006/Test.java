package j_171180006;

import java.util.Scanner;

public class Test {

	public static void main(String []args) {
	
		
	int c;
	Scanner s = new Scanner(System.in);
	Node root= null;
	binarysearch a= new binarysearch();
	int x=0 ;
	System.out.println("de�erleri giriniz:");
	System.out.println("sonland�rmak icin (-1)bas�n�z!"); 
	
	
	c= s.nextInt();
	root= new Node(c); 
	
	while(x!=-1) {
	x=s.nextInt();
	if(x!=-1)
	a.inserting(root, x);
	}
	System.out.println(root.data);
			
	System.out.println("inorder s�ralama:");
	a.inorder(root);
	System.out.println();
	System.out.println("postorder s�ralama:");
	a.postorder(root);
	System.out.println();
	System.out.println("preorder s�ralama:");
	a.preorder(root);
	System.out.println();
	System.out.print("silmek istedi�iniz say�y� giriniz:");
	x=s.nextInt();
	a.delete(root, x);
	System.out.println();
	System.out.println("inorder s�ralama:");
	a.inorder(root);
	System.out.println();
	System.out.println("postorder s�ralama:");
	a.postorder(root);
	System.out.println();
	System.out.println("preorder s�ralama:");
	a.preorder(root);
	System.out.println();
	System.out.print("aramak istedi�iniz de�eri giriniz:");
	x=s.nextInt();
	System.out.print( a.search(root, x));
	System.out.println();
	System.out.print("inorder s�ralamadaki yeri :");
	a.inorderbul(root, x);
	System.out.println();
	System.out.print("postorder s�ralamadaki yeri:");
	a.postorderbul(root, x);
	System.out.println();
	System.out.print("preorder s�ralamadaki yeri:");
	a.preorderbul(root, x);
	System.out.println();
	
	System.out.println("derinlik:"+a.depth(root,x));
	System.out.print("parent:" );
	a.parent(root, x);
	System.out.println();
	System.out.print("child:");
	a.child(root,x);
	
	
	
	
	
	}
	
	
}