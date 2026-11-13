package edu.questlink.sequence;

/**
 * Support static sequence operations plus:
 * insert_at(i,X): insert X at index i and shift items accordingly
 * delete_at(i): delete X at index i and shift remaining items accordingly
 * @param <E>
 */
public interface DynamicSequence<E> extends StaticSequence, Iterable {

    void insertAt(int position, E value);
    void deleteAt(int position);

}
