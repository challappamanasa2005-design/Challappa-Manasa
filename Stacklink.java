import java.util.*;
public class Stacklink {
    static class Node{
        String str;
        Node next;
        Node(String str){
            this.str=str;
            this.null=null;
        }
    }
    static class StackOperations{
        Node top;
        int size;
        StackOperations(){
         this.top=null;
         this.size=0;
        }
        void push(String s){
            Node newnode=neW node(s);
            newnode.next=top;
            top=newnode;
            size++;
        }
        void pop(){
            top=top.next;
            size--;
        }
        void top(){
            System.out.println(top.s);
        }
        boolean isEmpty(){
            return top=null;
        }
        void empty(){
            System.out.println(isEmpty())
        }
        void size(){
          System.out.println(size);
        }
        void print(){
            if(isEmpty){
                System.out.println("stack is empty");
                return;
            }
            Node current=top;
            while(current!=null){
                System.out.print(current.str +" ");
                current =current.next;
            }
        }
    }
    
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter no of operations:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("enter your command:");
            String[] S=sc.nextLine().split(" ");
            switch(S[0]){
                case "push":
                push(S[1]);
                break;
                case pop:
                pop();
                break;
                case "top"

            }
        }
    }
}
