import java.util.* ;
import java.io.*; 
public class Deque{
    int n;
    int[] arr;
    int front;
    int rear;
    public Deque(int n){
        this.n=n;
        front=-1;
        rear=-1;
        arr=new int[n];
    }
    public boolean pushFront(int x){
        if(isFull()){
            return false;
        }
        else if(isEmpty()){
            front=rear=0;
            arr[front]=x;
        }
        else{
            front=(front-1+n)%n;
            arr[front]=x;
        }
        return true;
    }
    public boolean pushRear(int x){
        if(isFull()){
            return false;
        }
        else if(isEmpty()){
            front=rear=0;
            arr[rear]=x;
        }
        else{
            rear=(rear+1)%n;
            arr[rear]=x;
        }
        return true;
    }
    public int popFront(){
        int temp;
        if(isEmpty()){
            return -1;
        }
        else if(front==rear){
            temp=arr[front];
            front=rear=-1;
        }
        else{
            temp=arr[front];
            front=(front+1)%n;
        }
        return temp;
    }
    public int popRear(){
        int temp;
        if(isEmpty()){
            return -1;
        }
        else if(rear==front){
            temp=arr[rear];
            front=rear=-1;
        }
        else{
            temp=arr[rear];
            rear=(rear-1+n)%n;
        }
        return temp;
    }
    public int getFront(){
        if(isEmpty()){
            return -1;
        }
        return arr[front];
    }
    public int getRear(){
        if(isEmpty()){
            return -1;
        }
        return arr[rear];
    }
    public boolean isEmpty(){
        if(front==-1){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if((rear+1)%n==front){
            return true;
        }
        return false;
    }
}
