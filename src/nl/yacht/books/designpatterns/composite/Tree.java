package nl.yacht.books.designpatterns.composite;

import nl.yacht.books.designpatterns.composite.iterator.TreeIterator;

import java.util.Iterator;

public class Tree implements Iterable<Integer>{

    public Integer value;

     public Tree left;
     public Tree right;


    public void add(int value) {
        if(this.value == null) {
            this.value = value;
            left = new Tree();
            right = new Tree();
        }
        else {
            if(value <= this.value) {
                left.add(value);
            }
            else {
                right.add(value);
            }
        }
    }

    public void pp()  {
        if(left != null) {
            left.pp();
        }
        if(this.value != null) {
            System.out.println(this.value);
        }
        if(this.right != null) {
            right.pp();
        }
    }

    public int size() {
        if(this.value == null) {
            return 0;
        }
        else {
            return 1+left.size()+right.size();
        }
    }

    public int sum() {
        if(this.value == null) {
            return 0;
        }
        else {
            return this.value + left.sum()+right.sum();
        }
    }


    @Override
    public Iterator<Integer> iterator() {
       return new TreeIterator(this);
    }
}
