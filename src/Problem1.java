/**
 * Created with IntelliJ IDEA.
 * User: Scott Ziegler
 * Date: 11/9/13
 * Time: 4:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class Problem1 {
    public static void main(String[] args){
        int sum=0;
        for(int i=1; i<1000; i++){

            if(i%3==0 && i%5==0){
                sum=i+sum;
            }
            else if (i%3==0){
                sum=i+sum;
            }
            else if (i%5==0){
                sum=i+sum;
            }

        }
        System.out.println("Sum is:" + sum);
    }
}
