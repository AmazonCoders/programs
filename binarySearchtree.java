class testing{
    
    public static void main(String args[]){
        // creating a tree...
       tree t=new tree();
       ///inserting a new element
       t.insert(10);
       t.insert(20);
       t.insert(5);
                 
       
       
       //there are three ways of traversing ... inorder preorder postorder..
       t.preorder();
        }
        
        
    }
     
    
    

class tree{
    //the node class... if we create one object of this node class then one node is created with data, left AND right spaces.
    //any dbt means ask me
   private  class node{
        int data;
        node left,right;
     
        public node(){
            left=null;
            right=null;
            data=0;
        }
    }
   // node class ends
    private node root; // root of tree
    
    public void insert(int data){
        
        if(root==null)
        {
            root=new node();
            root.data=data;
        }
        else{
            node p=new node();
        
        p.data=data;
        insert(root,p);
        }
    }
    // this s tricky part of program... jus analyze for several minutes... THIS IS CALLED RECURSION
    private void insert(node r,node p){
        
        
          if(p.data<r.data)
          {
              if(r.left==null)
                  r.left=p;
              else
                insert(r.left,p);
          }
          else if(p.data>r.data)
          {
              
              if(r.right==null)
                  r.right=p;
              else
                  insert(r.right,p);
              
          }
    }
    
    
    /*
    first of all u woud have noted there are 2 functions with same names(fnction overloading )
    i used it like tat becoz it is clean implementation...
    v can simply can tree object and do operations...
    and root and other things are private so tat internal implementations are hidden..
    */
    
    
    public void preorder(){
        preorder(root);
    }
   private void preorder(node p){
       if(p!=null){
           System.out.println(p.data);
           preorder(p.left);
           preorder(p.right);
           
       }
   }
}
