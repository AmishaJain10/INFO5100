package Assignment6.PartA;

public class MreviewMain {
    public static void main(String args[]) {
        Mreview obj = new Mreview("harry Potter");
        obj.addRating(5);
        obj.addRating(6);
        obj.addRating(7);
        String str=obj.toString();
        System.out.println(str);

    }
}
