package _04InterfacesAndAbstraction._02Exercise._07CollectionHierarchy;

public class AddCollection extends Collection implements Addable {

    @Override
    public int add(String e) {
        items.add(e);

        return items.size() - 1;
    }
}
