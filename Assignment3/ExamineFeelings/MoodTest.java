package ExamineFeelings;

import java.util.Scanner;

public class MoodTest {

    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
        Psychiatrist psychiatristObject=new Psychiatrist();
        Moody MoodyObject1=new Sad();
        Moody MoodyObject2=new Happy();


        psychiatristObject.examine(MoodyObject1);
        psychiatristObject.observe(MoodyObject1);

        psychiatristObject.examine(MoodyObject2);
        psychiatristObject.observe(MoodyObject1);

        System.out.println("Press enter to continue..........");
        sc.nextLine();



    }
}
