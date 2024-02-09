import java.util.*;

class IntPrint extends Thread{
    int limit;
    IntPrint(int limit){
        this.limit=limit;
    }
    public void run(){
        for(int i=1;i<=limit;i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            if(i%2==0){
                System.out.println(i*i);
            }
            else{
                System.out.println(i*i*i);
            }
        }
    }
        
    
}

public class Multithread {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the limit");
        int limit=sc.nextInt();
        IntPrint ip=new IntPrint(limit);
        Thread t1=new Thread(ip);
        Thread t2=new Thread(ip);
        Thread t3=new Thread(ip);
        Thread t4=new Thread(ip);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        try{
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        sc.close();
    }
}
