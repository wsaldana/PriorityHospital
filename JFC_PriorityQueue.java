/**
 * @author Walter Saldaña #19897
 * @since 26/03/2020
 * Clase que implementa un Priority Queue del Java Collections Framework
 * @param <E> tipo de dato que almacena el queue
 */

import java.util.PriorityQueue;

public class JFC_PriorityQueue<E extends Comparable<E>> implements iPriorityQueue<E>{

    private PriorityQueue<E> queue;

    /**
     * Constructor sin parametros
     * Crea un Priority Queue con la implementacion de JCF
     */
    public JFC_PriorityQueue(){
        this.queue = new PriorityQueue<E>();
    }

    @Override
    public E getFirst() {
        return this.queue.peek();
    }

    @Override
    public E remove() {
        return queue.remove();
    }

    @Override
    public void add(E value) {
        queue.add(value);
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public void clear() {
        queue.clear();
    }

}