package edu.questlink.sequence;

/**
 * A static sequence interface must provide the following operations:
 * build(x): being able to build a sequence from an iterable (linear time O(n))
 * len(): being able to return the size of the sequence
 * STATIC OPERATIONS:
 * get_at(i): return the i-th item from the sequence (constant time O(1))
 * set_at(i, X): set the i-th item equal to X (constant time O(1))
 */
public interface StaticSequence<E> extends Iterable<E> {

    // how to declare a sequence in the memory?

    // signature methods
    int size();
    E getAt(int position);
    E setAt(int position, E value);

}
