package nl.yacht.books.designpatterns.composite.iterator;

import nl.yacht.books.designpatterns.composite.Tree;

import java.util.Iterator;

public class TreeIterator implements Iterator<Integer> {

    private Tree tree;

    public TreeIterator(Tree tree) {
        this.tree = tree;
    }


    @Override
    public boolean hasNext() {
        return tree.right != null;
    }

    @Override
    public Integer next() {
        int result = this.tree.value;

        this.tree = this.tree.right;

        return result;
    }
}
