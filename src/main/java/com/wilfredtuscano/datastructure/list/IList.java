package com.wilfredtuscano.datastructure.list;

public interface IList<T> {

    /**
     * Appends the specified value to the list.
     * @param value to add.
     * @return true if added.
     */
    boolean add(T value);

    /**
     * Removes the specified value from the list.
     * @param value to remove.
     * @return true if removed.
     */
    boolean remove(T value);

    /**
     * Removes all the elements from this list.
     */
    void clear();

    /**
     * Returns true if and only if the list contains at least one given element.
     * @param value element whose presence in this list is to be tested.
     * @return true if this list contains the specified element.
     */
    boolean contains(T value);

    /**
     * Returns the number of elements in this list.
     * @return the number of elements in this list.
     */
    int size();

}
