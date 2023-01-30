import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Third {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("Красный");
        list.add("Оранжевый");
        list.add("Желтый");
        list.add("Зеленый");
        list.add("Голубой");
        list.add("Синий");
        list.add("Фиолетовый");
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            list.set(i,list.get(i).concat("!"));
        }

        list.add(0,"Чёрный!");
        int ind = 4;
        System.out.println(list.get(4));
        list.set(ind, "Белый!");
        list.remove(2); //третий элемент это элемент с индексом 2
        System.out.println(list);
        System.out.println(list.indexOf("Синий!"));

        List<String> list2 = new ArrayList();
        ListIterator<String> it = list.listIterator();
        while (it.hasNext()) {
            String temp = it.next();
            if (temp.length() > 7) {
                list2.add(temp);
            }
        }
        System.out.println(list2);

        for (int i = list.size() - 1; i >= 0; i--) {
            if (!list2.contains(list.get(i))) {
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}

