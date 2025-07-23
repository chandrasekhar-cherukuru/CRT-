package Collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {
    public static void main(String[] args) {
        List<Boolean> list = new ArrayList<Boolean>();
        list.add(true);
        list.add(false);
        list.add(null);
        System.out.println(list);
    }
}
