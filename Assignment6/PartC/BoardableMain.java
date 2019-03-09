package Assignment6.PartC;

public class BoardableMain {
    public static void main(String args[]){
        Cat cat=new Cat("Tom","Bob","Black","short");
        cat.setSex(1);
        System.out.println(cat.toString());
        cat.setBoardStart(2,20,2019);
        cat.setBoardEnd(3,20,2019);
        if(cat.boarding(2,25,2019)){
            System.out.println("Cat is boarded for this date already");
        }else{
            System.out.println("Cat is not boarded for this date");

        }
        Dog dog=new Dog("Spot","Susan","white","medium");
        dog.setSex(2);
        dog.setSex(1);
        System.out.println(dog.toString());
        dog.setBoardStart(2,20,2019);
        dog.setBoardEnd(3,20,2019);
        if(dog.boarding(4,25,2019)){
            System.out.println("Dog is boarded for this date already");
        }else{
            System.out.println("Dog is not boarded for this date");

        }

    }
}
