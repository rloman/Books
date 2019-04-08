package nl.yacht.books.designpatterns.iterator;

import java.math.BigInteger;
import java.util.Iterator;

public class PrimeIterator implements Iterable<Long>, Iterator<Long> {

    private long next;
    private long max;

    public PrimeIterator(long min, long max) {
        this.next = min - 1 > 0 ? min - 1 : min;
        this.max = max;
    }


    @Override
    public boolean hasNext() {
        next = BigInteger.valueOf(this.next).nextProbablePrime().longValue();

        return next <= max;
    }

    @Override
    public Long next() {
        return next;
    }

    @Override
    public Iterator<Long> iterator() {
        return this;
    }
}