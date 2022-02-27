import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    static Scanner input =new Scanner(System.in);
    static ArrayList<String> numberList=new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("1=Sum\n" +
                "2=mult\n" +
                "3=div");


        //User input
        int choice;
        Boolean flag=false;
        do {
            choice= input.nextInt();
            System.out.println(choice);
            if (choice>0 && choice<=3){
                flag=true;
            }
        }while(!flag);


        //Menu
        switch (choice){
            case 1:
                returnUserInput();
                int printValue=sum(numberList);
                System.out.println(printValue);
                break;
            case 2:
                returnUserInput();
                System.out.println(mult(numberList));
                break;
            case 3:
                System.out.printf("Give number 1:");
                int number1=input.nextInt();
                System.out.printf("Give number 2:");
                int number2=input.nextInt();
                System.out.println(div(number1,number2));
                break;
        }


    }

    private static void returnUserInput(){
        while(true){
            System.out.printf("Give number:");
            String number=input.next();
            if (number.equals("stop")){
                break;
            }
            numberList.add(number);
        }
    }

    private static int sum(ArrayList<String> newList){
        int total=0;

        for (int i=0;i<newList.size();i++){
            total+=Integer.parseInt(newList.get(i));
        }

        /**
        //Iterator 1: το arr στην ουσία παίρνει το newList.get(i)
        for (String arr: newList){
            total+=Integer.parseInt(arr);
        }

        //Iterator 2: Ομοίως
        Iterator it= newList.iterator();
        while (it.hasNext()){
            String value=(String) it.next();
            total+=Integer.parseInt(value);
        }
         */


        return total;
    }
    private static int mult(ArrayList<String> newList){
        int total=1;

        for (int i=0;i<newList.size();i++){
            total*=Integer.parseInt(newList.get(i));
        }

        return total;
    }
    private static int div(int n1, int n2){
        return n1/n2;
    }
}
