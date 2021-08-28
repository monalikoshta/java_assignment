import java.util.*;
import java.lang.*;

class extendThread extends Thread
{
    public void sleep(){
        try{
            Thread.sleep(5000);
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
    public void run(){
        System.out.println("Thread is implementing with Thread class.");
    }
}

class implementsThread implements Runnable
{
    public void sleep(){
        try{
            Thread.sleep(10000);
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
    public void run(){
        System.out.println("Thread is implementing with Runnable interface.");
    }
}


class ThreadSleep
{
    public static void main(String[] args){
        extendThread fetchData = new extendThread();
        implementsThread processData = new implementsThread();
        System.out.println("Threads created!");
        
        System.out.println("fetchData thread is undergoing a sleep of 5000 ms.");
        fetchData.sleep();
        fetchData.run();
        System.out.println("fetchData thread completed a sleep of 5000 ms.");

        System.out.println("processData thread is undergoing a sleep of 10000 ms.");
        processData.sleep();
        processData.run();
        System.out.println("processData thread completed a sleep of 10000 ms.");
        
        System.out.println("Execution Finished!");
    }
}