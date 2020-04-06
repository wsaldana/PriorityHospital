package JUnit;

import static org.junit.Assert.*;  
import com.javatpoint.logic.*;  
import org.junit.Test;  

public class TestVectorHeap {

    @Test  
    public void testAdd(){
        VectorHeap<String> vh = new VectorHeap<String>();
        vh.add("b");
        vh.add("a");
        vh.add("c");
        assertEquals("a", vh.getFirst()); 
    } 

    @Test  
    public void testRemove(){
        VectorHeap<String> vh = new VectorHeap<String>();
        vh.add("b");
        vh.add("a");
        vh.add("c");
        assertEquals("a", vh.remove()); 
    } 

    @Test  
    public void testClear(){
        VectorHeap<String> vh = new VectorHeap<String>();
        vh.add("b");
        vh.add("a");
        vh.add("c");
        vh.clear();
        assertEquals(0, vh.size()); 
    } 

    @Test  
    public void testSize(){
        VectorHeap<String> vh = new VectorHeap<String>();
        vh.add("b");
        vh.add("a");
        vh.add("c");
        assertEquals(3, vh.size()); 
    } 

}