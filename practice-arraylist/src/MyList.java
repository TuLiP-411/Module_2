import java.util.Arrays;
import java.util.Iterator;

import static com.sun.tools.javac.util.ArrayUtils.ensureCapacity;

public class MyList<E> {
    private static final int INITIAL_CAPACITY = 0;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(int index, E element) {
        ensureCapacity();
// Move the elements to the right after the specified index
        for (int i = size - 1; i >= index; i--) elements[i + 1] = elements[i];
// Insert new element to data[index]
        elements[index] = element;
// Increase size by 1
        size++;
    }

    public E remove(int index) {
        checkIndex(index);

        E e = (E) elements[index];

        // Shift data to the left
        for (int j = index; j < size - 1; j++)
            elements[j] = elements[j + 1];

        elements[size - 1] = null; // This element is now null

        // Decrement size
        size--;
        return e;
    }

    public void clear() {
        elements = (E[]) new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public boolean contains(E e) {
        for (int i = 0; i < size; i++)
            if (e.equals(elements[i]))
                return true;
        return false;
    }

    public E get(int index) {
        checkIndex(index);
        return (E) elements[index];

    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException
                    ("index " + index + " out of bounds");
    }


    public int indexOf(E e) {
        for (int i = 0; i < size; i++)
            if (e.equals(elements[i])) return i;
        return -1;
    }

    public int lastIndexOf(E e) {

        for (int i = size - 1; i >= 0; i--) if (e.equals(elements[i])) return i;
        return -1;
    }

    public void printArray() {
        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
        }
    }
}


