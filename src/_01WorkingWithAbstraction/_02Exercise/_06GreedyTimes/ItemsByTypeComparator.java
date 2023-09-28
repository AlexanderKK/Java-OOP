package _01WorkingWithAbstraction._02Exercise._06GreedyTimes;

import java.util.Comparator;

public class ItemsByTypeComparator implements Comparator<Item> {

    @Override
    public int compare(Item f, Item s) {
        int result = s.getItemName().compareTo(f.getItemName());

        if(result == 0) {
            result = (int) (f.getAmount() - s.getAmount());
        }

        return result;
    }
}
