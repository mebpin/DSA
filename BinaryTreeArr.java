//program to implement binary tree using array
package dsa;
//code by Bipin Timalsina
import java.util.Scanner;
class BTArr{
    int d,a[],maxSize,root;
    
    BTArr (int d){
        this.d = d;
        maxSize= (int) Math.pow(2,d+1)-1;
        a = new int[maxSize];
        //-1 represents empty node
        for(int i=0;i<maxSize;i++){
            a[i]=-1;
        }
    }
    public int getMaxSize(){
        return maxSize;
    }
    public int getNodeData(int i){
        return a[i];
    }
    public void setRoot(int root){
        this.root = root;
        a[0] = root;
    }
    public void setLeftChild(int index,int val){
        a[index*2+1]= val;
    }
    public void setRightChild(int index,int val){
        a[index*2+2]= val;
    } 
    public void printTree(){
        for(int i: a){
            if(i!=-1)
              System.out.print(i + "\t");
        }          
    }   
}
public class BinaryTreeArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the depth of binary tree: "); 
        int d = sc.nextInt();
        BTArr bt = new BTArr(d);
        System.out.print("\n Enter the root element: ");
        int root = sc.nextInt();
        bt.setRoot(root);
        int i = 0;
        while(i<bt.getMaxSize()-Math.pow(2,d)){
            int parent= bt.getNodeData(i);
            if(parent!=-1){
                System.out.println("\n Enter Left Child of "+ parent+": (-1 if no)");
                int leftChild = sc.nextInt();
                bt.setLeftChild(i, leftChild);   
                System.out.println("\n Enter Right Child of "+ parent+" (-1 if no)");
                int rightChild = sc.nextInt();
                bt.setRightChild(i,rightChild);    
            }
          i++;   
        }
        System.out.println("The binary tree contains following data:");
        bt.printTree();
        System.out.println("\n---------------");
    } 
}
