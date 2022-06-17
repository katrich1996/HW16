import java.util.*;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import jdk.internal.access.SharedSecrets;
import jdk.internal.util.ArraysSupport;

public class MyArrayList<E> extends AbstractList<E>
        implements List<E>, RandomAccess, Cloneable, java.io.Serializable {
    @java.io.Serial
    private static final long serialVersionUID = 8683452581122892189L;

    private static final int DEFAULT_CAPACITY = 10; //// Стандартная величина ArrayList

    private static final Object[] EMPTY_ELEMENTDATA = {}; /// Object[] ElementData  - внутренний массив

    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};

    transient Object[] elementData;


    private int size; ///Хранит текущий размер ArrayList


    public MyArrayList(int initialCapacity) { /////Конструктор, который назначает начальный размер ArrayList
        if (initialCapacity > 0) {
            this.elementData = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            this.elementData = EMPTY_ELEMENTDATA;
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " +
                    initialCapacity);
        }
    }


    public MyArrayList() {
        this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public E get(int index) {
        return null;
    }


    public MyArrayList(Collection<? extends E> c) { ////Копирует элементы из пердыдущей коллекции в новую,
        /////если места не в предыдущем массиве не хватает
        Object[] a = c.toArray();
        if ((size = a.length) != 0) {
            if (c.getClass() == java.util.ArrayList.class) {
                elementData = a;
            } else {
                elementData = Arrays.copyOf(a, size, Object[].class);
            }
        } else {
            // replace with empty array.
            elementData = EMPTY_ELEMENTDATA;
        }
    }

    public void trimToSize() {  ///Уменьшает объем ArrayList
        modCount++;
        if (size < elementData.length) {
            elementData = (size == 0)
                    ? EMPTY_ELEMENTDATA
                    : Arrays.copyOf(elementData, size);
        }
    }


    public void ensureCapacity(int minCapacity) { ///Рассширяет объем ArrayList
        if (minCapacity > elementData.length
                && !(elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA
                && minCapacity <= DEFAULT_CAPACITY)) {
            modCount++;
            grow(minCapacity);
        }
    }

    private void grow(int minCapacity) {
    }
}