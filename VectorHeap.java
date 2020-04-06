import java.util.Vector;

/**
 * @author Walter Saldaña #19897
 * @since 26/03/2020 VectorHeap, cola que implementa un PriorityQueue
 */

public class VectorHeap<E  extends Comparable<E>> implements iPriorityQueue<E>{

    private Vector<E> data;
    /**
     * Metodo constructor sin parametros
     * Crea un objeto VectorHeap
     */
    public VectorHeap(){
        this.data = new Vector<E>();
    }

    /**
     * @return valor minimo en el priority queue
     */
    @Override
    public E getFirst() {
        if(data.size()>0){
            return data.get(0);
        }else{
            return null;
        }
    }

    /**
     * Elimina el valor minimo
     * @return valor minimo antes de eliminarlo
     */
    @Override
    public E remove() {
        return data.remove(0);
    }

    /**
     * Agrega un valor a la priority queue
     * @param value nuevo valor a agregar
     */
    @Override
    public void add(E value) {
        //Si no hay mas elementos, solo so agrega
        if(data.isEmpty()){
            data.add(value);
            //Si ya hay elementos, verificar donde colocarlo
        }else{
            int index = 0;
            //Buscar el indice en el que pertenece
            while(value.compareTo(data.get(index)) > 0 && index < data.size()){
                index++;
            }
            //Crear nuevo vector agregando el valor nuevo
            Vector<E> newData = new Vector<E>();
            for(int i=0; i<data.size(); i++){
                if(i != index){
                    newData.add(data.get(i));
                }else{
                    newData.add(value);
                    newData.add(data.get(i));
                }
            }
            //Cambiar el viejo vector con el nuevo que tiene el item agergado
            this.data = newData;
        }
    }

    /**
     * @return true si no hay elementos en el priority queue
     * @return false si hay elementos en el priority queue
     */
    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    /**
     * @return numero de elementos guardados
     */
    @Override
    public int size() {
        return data.size();
    }

    /**
     * Elimina todos los elementos 
     */
    @Override
    public void clear() {
        data.clear();
    }

}