import java.util.Random;

class Fact implements Runnable{
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
    }
}

class Sum implements Runnable{
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
    }
}
public class FactSumRunnable {
    public static void main(String[] args) {
        Random random=new Random();
        int r=random.nextInt(10)+1;
        System.out.println("Random number is : "+r);
        if(r%2==0){
            Fact fact=new Fact(r);
            Thread t1=new Thread(fact);
            t1.start();
        }
        else{
            Sum sum=new Sum(r);
            Thread t2=new Thread(sum);
            t2.start();
        }
    }
}
