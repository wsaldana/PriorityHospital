/**
 * @author Walter Saldaña #19897
 * Factory para elegir la implementacion de PriorityQueue a utilizar
 */

public class FactoryPriorityQueue<E extends Comparable<E>> {

    public iPriorityQueue<E> getPriorityQueue(String type){
        if(type.equals("vector")){
            return new VectorHeap<E>();
        }

        else if(type.equals("jcf")){
            return new JFC_PriorityQueue<E>();
        }
        
        else{
            return new VectorHeap<E>();
        }
    }
}