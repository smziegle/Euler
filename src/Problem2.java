/**
 * Created with IntelliJ IDEA.
 * User: Scott Ziegler
 * Date: 11/9/13
 * Time: 4:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class Problem2 {
    public static void main(String[] args){
        int pre=0;
        int cur=1;
        int nex=0;
        int sum=0;
        while(nex<4000000){
            nex=pre+cur;
            if(cur%2==0){
                sum=cur+sum;
            }
            pre=cur;
            cur=nex;


        }
    System.out.println(sum);

    }
}
