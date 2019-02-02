package ExamineFeelings;

import java.util.Scanner;

public class Psychiatrist {


    //asks a moody object about its mood
    public void examine(Moody  moodyObject)
    {
        System.out.println("How are you feeling today?\n");
        moodyObject.queryMood();
        moodyObject.expressFeelings();
        System.out.println("\n");
    }

    //a moodyObject is observed to either laugh or cry
    public void observe(Moody moodyObject)
    {
       System.out.println( moodyObject.toString());
        System.out.println("\n");
    }
}
