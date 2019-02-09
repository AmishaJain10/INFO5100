
public class IndexOfFirstNonRepatingcharinString {
    public static void main(String args[]) {
        String str = "AMISHA JAIN";
        int index = getIndex(str);
        System.out.println("Index of first non repeating character is: " +index);
    }

    static int getIndex(String str) {
        char[] charArray=str.toCharArray();
        int[] asciiCount=new int[256]; //Considering all ascii characters


        if (str == "" || str == null) {
            System.out.println("String is empty, Enter a valid string");
            return -1;
        }
        for (char c : charArray) {
            asciiCount[c]++; //increment count by 1 in every character ascii index;
        }

        for(int i=0;i<charArray.length;i++){
            if(asciiCount[charArray[i]]==1){
                return i;
            }
        }
       return -1;
    }
}
