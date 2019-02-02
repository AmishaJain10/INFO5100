public class ReverseWordsinString {


    public static void main(String args[]) {

        String initial = "     MY      NAME     IS AMISHA JAIN";
        String[] array = initial.split("\\s+");

        System.out.println("Reverse String is: ");

        for (int i = array.length-1; i >= 0; i--) {

            System.out.print(array[i]+" ");

        }
    }
}




