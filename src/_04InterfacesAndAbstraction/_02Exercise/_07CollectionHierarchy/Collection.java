package _04InterfacesAndAbstraction._02Exercise._07CollectionHierarchy;

import java.util.ArrayList;
import java.util.List;

public abstract class Collection {
    protected final int maxSize = 100;

    protected List<String> items;

    public Collection() {
        this.items = new ArrayList<>();
    }
}
