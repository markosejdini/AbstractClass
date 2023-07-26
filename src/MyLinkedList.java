public class MyLinkedList implements NodeList {

    ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return null;
    }

    @Override
    public boolean addItem(ListItem item) {
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {

    }
/*   -  It implements NodeList.

    -  It has one field of type ListItem called root.

    -  A constructor that takes a ListItem and initialises the field root with the newly
     passed in parameter. */



    /*  -  And four methods:

        -  getRoot(), getter for root.

        -  addItem(), takes a ListItem and returns true if it was added successfully or false otherwise.
        If the item is already present, it doesn't get added. Use compareTo() to place the item in
         its proper order.

        -  removeItem(), takes a ListItem and returns true if it was removed successfully
        or false otherwise.

        -  traverse(), takes the root as an argument and does not return anything. If the
        root is null it prints out: The list is empty, otherwise print each
         value on a separate line.*/


}
