import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(2);
        list.add(67);
        list.add(3);
        list.add(7);
        list.add(8);
        int size = 2;
        List<List<Integer>> Sublist = new ArrayList<>();
        for(int i = 0 ; i<=list.size(); i+= size){
            Sublist.add(list.subList(i,Math.min(i+size,list.size())));
        }

    }
}
