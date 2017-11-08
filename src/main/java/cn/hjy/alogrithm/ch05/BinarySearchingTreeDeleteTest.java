package cn.hjy.alogrithm.ch05;

/**
 * Created by hjy on 17-8-29.
 */
public class BinarySearchingTreeDeleteTest {

    public static void main(String[] args) {
        BinarySearchingTree tree = new BinarySearchingTree(null);
        tree.insert(42);
        tree.insert(14);
        tree.insert(65);
        tree.insert(9);
        tree.insert(23);
        tree.insert(55);
        tree.insert(72);
        tree.insert(1);
        tree.insert(68);
        tree.insert(88);
        tree.insert(70);

        System.out.println(tree.search(9).getData());
        System.out.println(tree.search(1).getData());
        System.out.println(tree.search(24));

        tree.delete(65);
        tree.inOrder(tree.getRoot());

    }


}
