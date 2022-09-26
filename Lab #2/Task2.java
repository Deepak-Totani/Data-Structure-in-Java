/*
This program is written by Deepak from BSCS-III-E*/




	class Node{
	    String Name;
	    Node next;
	    Node prev;
	    
	    Node(String Name){
	        this.Name=Name;
	        this.next=null;
	        this.prev=null;
	    }
	    
	}
	 
	class DLL{
	    
	    Node head;
	    Node tail;
	    Node cur;    
	    
	    
	    public void insertAtBeginning( String Name){
	    
	        Node node = new Node(Name);
	        
	        if(head==null){
	             head=node;
	             tail=node;
	        }
	        else{
            
	                 cur = head;  
	                 node.next=cur;
	                 node.prev=null;
	                 cur.prev=node;
	                 
	                 head=node;
	                 
	                 tail.prev=cur;         
	                 
	            
	        } 
	    }
	    
	   public void insertAtBeginning(Node node){
	       
	       if(head==null){
	             head=node;
	             tail=node;
	        
	        }
	        else{
	            
	                 cur = head;  
	                 node.next=cur;
	                 node.prev=null;
	                 cur.prev=node;    
	        
	                 head=node;
	                 tail.prev=cur;
	            
	        } 
	   }
	   
	   public void insertAtEnd(String name){
	 
	    Node node = new Node(name);
	        
	     
	        if(head==null){
	             head=node;
	             tail=node;
	        }
	        else{
	            
               tail.next=node;
	                node.prev=tail;
	                tail=node;
	         
	        } 
	   }
	   
	     public void insertAtEnd(Node node){
	         
	         
	        if(head==null){
	             head=node;
	             tail=node;
	        }
	        else{
	            
	                    tail.next=node;
	                node.prev=tail;
	                tail=node;
	            
	            
	        }
	           
	     }     
	     
	     public void Removebeg(){
	         
	         cur=head;
	         
	         head=cur.next;
	         
	         cur= null;    
	     }
	     
	     public void RemoveEnd(){
	         
	         Node temp;
	         temp=tail;
	         
	         tail=temp.prev;
	         
	         tail.next=null;
	     }
	   
	    public void ShowAll(){
	                
	               cur=head; 
	      
	          while(cur.next!=null){
	              
	              System.out.println(cur.Name);
	              cur=cur.next;
	              
	          }
	          
	          System.out.println(cur.Name);
	          
	    }
	    
	}
	   
	public class Task2{
	  
	    public static void main(String [] args){
	    
	        Node node = new Node("Deepak totani");
	        Node node1 = new Node("BSCS");
	        Node node2 = new Node("IBA");
	        
	        DLL list = new DLL();
	        
	        list.insertAtBeginning("SUKKUR");
	        list.insertAtBeginning("IBA");
	        list.insertAtBeginning(node);
	       
	        list.insertAtEnd("Data structure");
	        list.insertAtEnd("SUKKUR");
	        list.insertAtEnd(node1);
	        
	        list.Removebeg();  
	        list.RemoveEnd();
	        
	        list.ShowAll();
	   } 
	}
