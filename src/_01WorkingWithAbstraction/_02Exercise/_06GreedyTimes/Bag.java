package _01WorkingWithAbstraction._02Exercise._06GreedyTimes;

import java.util.*;
import java.util.stream.Collectors;

public class Bag {
    private List<Item> items;
    private long capacity;

    public Bag(long capacity) {
        this.items = new ArrayList<>();
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        StringBuilder bagBuilder = new StringBuilder();
        Map<String, Long> itemsAmountByType = new LinkedHashMap<>();

        itemsAmountByType.put("Gold", getAmount(ItemType.GOLD));
        itemsAmountByType.put("Gem", getAmount(ItemType.GEM));
        itemsAmountByType.put("Cash", getAmount(ItemType.CASH));

        itemsAmountByType = itemsAmountByType.entrySet().stream()
                .filter(e -> e.getValue() != 0)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        itemsAmountByType.entrySet().stream()
                .sorted((f, s) -> (int) (s.getValue() - f.getValue()))
                .forEach(e -> {
                    //Get Amount By Item Type
                    bagBuilder.append(String.format("<%s> $%d", e.getKey(), getAmount(ItemType.valueOf(e.getKey().toUpperCase()))));
                    bagBuilder.append(System.lineSeparator());

                    //Get Items By Item Type
                    List<Item> itemsByType = items.stream()
                            .filter(item -> {
                                return item.getItemType().equals(ItemType.valueOf(e.getKey().toUpperCase()));
                            })
                            .collect(Collectors.toList());

                    //Sort Items By Item Type
                    itemsByType.sort(new ItemsByTypeComparator());

                    //Print Items By Item Type
                    itemsByType.forEach(item -> {
                        bagBuilder.append(String.format("##%s - %d", item.getItemName(), item.getAmount()));
                        bagBuilder.append(System.lineSeparator());
                    });
                });

        return bagBuilder.toString();
    }

    public void put(Item item) {
        //Is this a valid item?
        //Can I store it?

        if(canWeStore(item)) {
            //check if we should update value or create a new one
            Item currentItem = items.stream().filter(e -> e.getItemName().equals(item.getItemName())).findFirst().orElse(null);

            if(currentItem != null) {
                currentItem.setAmount(currentItem.getAmount() + item.getAmount());
            } else {
                items.add(item);
            }
        }
    }

    private boolean canWeStore(Item item) {
        if (capacity < getTotalAmount() + item.getAmount()) {
            return false;
        }

        switch (item.getItemType()) {
            case GEM:
                if (getAmount(ItemType.GEM) + item.getAmount() > getAmount(ItemType.GOLD)) {
                    return false;
                }
                break;
            case CASH:
                if (getAmount(ItemType.CASH) + item.getAmount() > getAmount(ItemType.GEM)) {
                    return false;
                }
                break;
        }

        return true;
    }

    public long getTotalAmount() {
        return getAmount(ItemType.GOLD) + getAmount(ItemType.GEM) + getAmount(ItemType.CASH);
    }

    public long getAmount(ItemType itemType) {
        return this.items.stream()
                .filter(e -> e.getItemType().equals(itemType))
                .mapToLong(Item::getAmount)
                .sum();
    }
}
