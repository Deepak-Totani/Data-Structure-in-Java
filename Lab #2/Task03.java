/*
Deepak from BSCS-III-E has written this program */


class Node{
    int data;
    Node next;
    Node perv; 
    Node(int data){
        this.data=data;
        this.next=null;
        this.perv=null;
    }
    
}
class DLL{
    Node temp;
    Node cur;
   public void LoopChecker(Node node){
       temp=node;
        cur=node;
       boolean LoopFound=false;
        
        while(temp!=null){
          
            temp=temp.next;
            
            if(temp!=null){
        
            	temp=temp.next;
                cur=cur.next;
            }
            
            if(temp==cur){
                
                LoopFound=true;
                break;
             }
           
     }
        
        if(LoopFound==true){
            System.out.println("CIRCLE EXIST");
        }
        else
            System.out.println("CIRCLE NOT EXIST");
        
    }
 	
}
 
 
public class  Task03{
    
    public static void main(String [] args){
        
        
        DLL list = new DLL();
        Node n1 = new Node(15);
        Node n2 = new Node(46);
        Node n3 = new Node(45);
        Node n4 = new Node(60);
        
        n1.next=n2;
        n1.perv=null;
 
        n2.next=n3;
        n2.perv=n1;
       
        n3.perv=n2;
        n3.next=n4;
      
        n4.perv=n3;
        n4.next=n1;
        
  
       list.LoopChecker(n1);
    }
}

