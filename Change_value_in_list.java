import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ask6 {
    //String[] names= new String[]{"George","Katerina","...."};
    static ArrayList<String> nameList= new ArrayList<>(
            Arrays.asList("red","George","Katerina","John","Michael","Joe"));
    static Scanner input =new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Original List: "+nameList.toString());
        //Read user input
        System.out.println("Give index of name you want to change 0-"+(nameList.size()-1));
        int number=input.nextInt();
        System.out.println("Give name you want to insert instead of " +nameList.get(number));
        nameList.set(number,input.next());

        //Print all the values
        for (int i=0; i<nameList.size();i++){
            System.out.println(nameList.get(i));
        }
    }
}
