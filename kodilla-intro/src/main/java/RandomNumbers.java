import java.util.Random;

public class RandomNumbers {

    public int CountRandomNumbers(){
        Random random=new Random();
        int result=0;
        int sum=0;
        int a=5000;
        int x=31;
        while(sum<a){
            int temp=random.nextInt();
            sum=sum+temp;
            result++;
        }
        return result;
    }
}