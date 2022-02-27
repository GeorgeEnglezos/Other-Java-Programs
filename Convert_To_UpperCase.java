import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static ArrayList<String> nameList = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {


        String names;
        while (true) {
            System.out.println("Give names: ");
            names = input.next();
            if (names.equals("stop")) {
                break;
            }
            nameList.add(names);
        }

        convertMyListToUpperCase(nameList);
        System.out.println(nameList);
    }

    public static ArrayList<String> convertMyListToUpperCase(ArrayList<String> nameList) {

        for (int i = 0; i < nameList.size(); i++) {
            String upper = nameList.get(i).toUpperCase(Locale.ROOT);
            nameList.set(i, upper);
        }
        return nameList;
    }
}

