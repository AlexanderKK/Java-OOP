package _04InterfacesAndAbstraction._02Exercise._07CollectionHierarchy;

public class AddRemoveCollection extends Collection implements AddRemovable {

    @Override
    public int add(String e) {
        items.add(0, e);

        return 0;
    }

    @Override
    public String remove() {
        return items.remove(items.size() - 1);
    }

}
