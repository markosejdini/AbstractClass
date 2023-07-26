public class MyLinkedList implements NodeList {
    /*   -  It implements NodeList.

        -  It has one field of type ListItem called root.

        -  A constructor that takes a ListItem and initialises the field root with the newly
         passed in parameter. */
    ListItem root;


    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root== null) { this.root=newItem; }
        ListItem currentItem = root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(newItem);
            if (comparison < 0) {
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(newItem);
                    return true;
                }
            } else if (comparison > 0) {
                if (currentItem.previous() != null) {
                    currentItem = currentItem.previous();
                } else {
                    currentItem.setPrevious(newItem);
                    return true;
                }
            } else {
                // Duplicate items are not allowed
                return false;
            }
        }
        return false;




    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {

    }




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
