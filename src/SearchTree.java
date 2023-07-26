public class SearchTree implements NodeList {

    ListItem root ;

    public SearchTree(ListItem root) {
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

    private void performRemoval (ListItem toRemove, ListItem parent) {

    }
    /*     -  It implements NodeList.

    -  It has one field of type ListItem called root.

    -  A constructor that takes a ListItem and initialises the field root with the newly
     passed in parameter.*/


    /* -  And five methods:

        -  getRoot(), getter for root.

        -  addItem(), same as MyLinkedList.

        -  removeItem(), same as MyLinkedList.

        -  performRemoval(), takes two ListItems, the item to be removed and its parent. It doesn't
        return anything and is declared as private. Call this method from removeItem() when
        the item is found.

        -  traverse(), takes the root as an argument and does not return anything. It uses
        recursion to visit all the branches in the tree (Inorder). Print each
         value on a seperated line.*/
}
