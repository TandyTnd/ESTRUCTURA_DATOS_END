package LISTAS;


/**
 *
 * @author Julio Arriaga
 */
public interface StackInterface<T> {

    void push(T newEntry);

    T pop();

    T peek();

    boolean isEmpty();

    void clear();

    int size();

}