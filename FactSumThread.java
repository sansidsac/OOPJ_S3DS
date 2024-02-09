import java.util.Random;

class Fact extends Thread{
    int n;
    Fact(int n){
        this.n=n;
    }
    public void run(){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println("Factorial is : "+fact);
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

class Sum extends Thread{
    int n;
    Sum(int n){
        this.n=n;
    }
    public void run(){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("Sum is : "+sum);
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException i){
            i.printStackTrace();
        }
    }
}
public class FactSumThread {
    public static void main(String[] args) {
        Random random=new Random();
        int r=random.nextInt(10)+1;
        System.out.println("Random number is : "+r);
        if(r%2==0){
            Fact fact=new Fact(r);
            fact.start();
        }
        else{
            Sum sum=new Sum(r);
            sum.start();
        }
    }
}
