import java.util.ArrayList;
import java.util.Locale;

public class Features {
    public static boolean checkForDuplicate(String word, ArrayList<String> wordList){
        //true-> found
        //false-> didn't found

        System.out.println("_________________________\n" +
                "checkForDuplicate");

        for (int i=0;i< wordList.size();i++){
            System.out.println("Comparing : "+wordList.get(i)+ " with: "+word);

            if (wordList.get(i).equals(word)){
                System.out.println("Word found in list");
                return true;
            }
        }
        return false;
    }
    public static ArrayList<String> upperCase(ArrayList<String> wordList){
        for (int i=0;i<wordList.size();i++){
            wordList.set(i,wordList.get(i).toUpperCase());
        }
        return wordList;
    }
    public static ArrayList<String> lowerCase(ArrayList<String> wordList){
        for (int i=0;i<wordList.size();i++){
            wordList.set(i,wordList.get(i).toLowerCase());
        }
        return wordList;
    }
}
