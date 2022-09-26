/*
Deepak has written this program
*/


class Node
{

	String name;
	Node prev,next;
	
	Node(String name)
	{
		this.prev = null;
		this.name = name;
		this.next = null;
	}
}
class DLL
{
	Node head;
	Node cur;
	
	public void insertAtBeginning( String Name){
	    
	        Node node = new Node(Name);
    
	       if(head==null){
	             head=node;
	        
	        }
	        else{
	            
	                 cur = head;  
	                 node.next=cur;
	                 node.prev=null;
	                 cur.prev=node;
	                 
	                 head=node;
	       
	          } 
	    }
	    
	   public void insertAtBeginning(Node node){
	       
	         if(head==null){
	             head=node;
	        
	        }
	        else{
	            
	                 cur = head;  
	                 node.next=cur;
	                 node.prev=null;
	                 cur.prev=node;    
	        
	                 head=node; 
	        } 
	   }
		   public void insertAtEnd(String name){
	 
	    Node node = new Node(name);
	        
	        if(head==null){
	             head=node;
	        
	        }
	        else{
	            
	            cur = head; 
	            while(cur.next!=null){
	                cur=cur.next;
	            }
	  
	                 cur.next=node;
	                 node.prev=cur; 
	        } 
	   }
	   
	     public void insertAtEnd(Node node){
	         
	         
	        if(head==null){
	             head=node;
	        
	        }
	        else{
	            
	            cur = head; 
	            while(cur.next!=null){
	                cur=cur.next;
	            }
  
	                 cur.next=node;
	                 node.prev=cur;  
	          
	            
	            
	        }
	     }
	        
	     void insertAfterName(String Name,Node node){
	        
	            cur = head; 
	                while(cur.next!=null){
	                
	         if (cur.name.equals(Name)) {
	             
	                node.next=cur.next;
	               cur.next.prev=node;
	               cur.next=node;
	               node.prev=cur;
	               
	               
	         } cur=cur.next;
	             
	   
	        }
	               
	                if (cur.name.equals(Name)) {
	             
	            cur.next=node;
	                 node.prev=cur;  }
	       
	        }
	     
	     void insertbeforeName(String Name,Node node){
	          
	         cur = head; 
	         
	                while(cur.next!=null){
	                
	         if (cur.name.equals(Name)) {
	             
	            
	                node.prev=cur.prev;
	               cur.prev.next=node;
	               node.next=cur;
	               
	               
	               
	         }
	         cur=cur.next;
	                }
	      
	         if (cur.name.equals(Name)) {
	 
	                        cur.prev.next=node;
	               node.next=cur;
	        }
	         
	     }
	   
	     public void makeCircular(){
	     
	            cur=head; 
	                while(cur.next!=null){
	                
	                    cur=cur.next;
	                }
	                
	                cur.next=head; 
	     } 
	    public void ShowAll(){
	                
	                cur=head; 
	          while(cur !=null){
	              
	              System.out.println(cur.name);
	              cur=cur.next;
	              
	          }
	  
	        
	    }
	
	}
	 
	public class Task1{
	    
	    public static void main(String [] args){
	    
	    DLL Dlist = new DLL();
	    
	    Node n1=new Node("Deepak");
	    Node n2 = new Node("Sunder");
	    Node n3 = new Node("Sagar");
	    Node n4 = new Node("Raja");
	    
	    Dlist.insertAtBeginning("xyz");
	    Dlist.insertAtBeginning("abc");
	    Dlist.insertAtBeginning(n1);

	    Dlist.insertAtEnd("Mithi");
	    Dlist.insertAtEnd("Hyderabad");
	    Dlist.insertAtEnd(n2);    

	    Dlist.insertAfterName("Mithi", n3);
	    Dlist.insertbeforeName("Hyderabad", n4);   
 
	    Dlist.makeCircular();

	    Dlist.ShowAll();
	            }
	    
	}