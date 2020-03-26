/**
 * Factory para elegir la implementacion de PriorityQueue a utilizar
 */

import java.util.PriorityQueue;

public class FactoryPriorityQueue<E extends Comparable<E>> {

    public iPriorityQueue<E> getPriorityQueue(String type){
        if(type.equals("vector")){
            return new VectorHeap<E>();
        }

        else if(type.equals("jcf")){
            //return new PriorityQueue<E>();
        }
        
        else{
            //return new myTreeMap<K,V>();
        }
        return null;
    }
}