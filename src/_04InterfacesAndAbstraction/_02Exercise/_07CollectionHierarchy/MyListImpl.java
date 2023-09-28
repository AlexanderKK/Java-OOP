package _04InterfacesAndAbstraction._02Exercise._07CollectionHierarchy;

public class MyListImpl extends Collection implements MyList {

    @Override
    public int add(String e) {
        items.add(0, e);

        return 0;
    }

    @Override
    public String remove() {
        return items.remove(0);
    }

    @Override
    public int getUsed() {
        return items.size();
    }

}
