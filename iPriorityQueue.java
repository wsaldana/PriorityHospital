/**
 * @author Walter Saldaña #19897
 * Contrato de comportamiento de un PriorityQueue
 * Referencias: Duane A. Bailey. (2007). Java Structures. 7ma edicion.
 */
public interface iPriorityQueue<E extends Comparable<E>>{

    /**
     * @return valor minimo en el priority queue
     */
    public E getFirst();
    
    /**
     * Elimina el valor minimo
     * @return valor minimo antes de eliminarlo
     */
	public E remove();
    
    /**
     * Agrega un valor a la priority queue
     * @param value nuevo valor a agregar
     */
	public void add(E value);
    
    /**
     * @return true si no hay elementos en el priority queue
     * @return false si hay elementos en el priority queue
     */
	public boolean isEmpty();
    
    /**
     * @return numero de elementos guardados
     */
	public int size();
    
    /**
     * Elimina todos los elementos 
     */
	public void clear();
}