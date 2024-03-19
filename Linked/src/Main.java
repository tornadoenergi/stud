import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void findIndex(LinkedList<String> MyList, String search){
        int temp = -1;
        for (int i = 0; i<MyList.size();i++){
            if(MyList.get(i).contains(search)){
                int index = i+1;
                System.out.println("Element found at index: " + index);
                temp = 0;
            }
        }
        if (temp == -1) {
            System.out.println("Element not found");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> MyList = new LinkedList<>();
        MyList.add("ewq");
        MyList.add("yhg");
        MyList.add("fdg");
        MyList.add("hgt");
        MyList.add("asd");
        MyList.add("klj");

        String search = scanner.nextLine();
        findIndex(MyList,search);
    }

}