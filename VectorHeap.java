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

    @Override
    public E getFirst() {
        if(data.size()>0){
            return data.get(0);
        }else{
            return null;
        }
    }

    @Override
    public E remove() {
        return data.remove(0);
    }

    @Override
    public void add(E value) {
        if(data.isEmpty()){
            data.add(value);
        }else{
            int index = 0;
            //for(int i=0; i<data.size()-1; i++){
            //    if((value.compareTo(data.get(index)) < 0 && index == -1) || ){
            //        index = i;
            //    }
            //}
            while(value.compareTo(data.get(index)) > 0 && index < data.size()){
                index++;
            }
            Vector<E> newData = new Vector<E>();
            for(int i=0; i<data.size(); i++){
                if(i != index){
                    newData.add(data.get(i));
                }else{
                    newData.add(value);
                    newData.add(data.get(i));
                }
            }
            this.data = newData;
        }
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public void clear() {
        data.clear();
    }

}