import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class Main
 * 1) loop 5 φορες
 * 2) String -> List
 *
 * Class Features:
 * 1) UpperCase()
 * 2) LowerCase()
 * 3) checkForDuplicate(String value, Arraylist)
 *
 */

public class Main {
    public static void main(String[] args) {
        ArrayList<String> wordList=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        int i=0;
        while(i<5){
            System.out.println("Give Word");
            String word=input.next();

            //true-> found
            //false-> didn't found

            // if ( condition ) // if (condition==true)
            // if ( !condition ) // if (condition==false)

            if (!Features.checkForDuplicate(word,wordList)){
                //if (!Features.checkForDuplicate(word,wordList)) = if (Features.checkForDuplicate(word,wordList)==false)
                wordList.add(word);
            }

            wordList=Features.upperCase(wordList);//returns ArrayList<String>
            System.out.println(wordList.get(0));

            wordList=Features.lowerCase(wordList);//returns ArrayList<String>
            System.out.println(wordList.get(wordList.size()-1 ));
        }
    }
}
