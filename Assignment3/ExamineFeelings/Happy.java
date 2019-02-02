package ExamineFeelings;

public class Happy extends Moody
{


    //returns a string indicating happy
    protected String getMood(){

        return "I am feeling happy";
    }


    //print laughter string: "hehehe...hahahah...HAHAHAHAHA!!!"
    public void expressFeelings()
    {
        System.out.println("hehehe...hahahah...HAHAHAHAHA!!!");

    }


    //returns message about self: "Subject laughs a lot"
    public String toString()
    {
        return "OBSERVATION: Subject laughs alot";

    }

}
