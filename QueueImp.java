package estrutura;

/**
 *
 * @author azaneti
 */

import java.util.LinkedList;
import java.util.Queue;

public class QueueImp {
    public static void main(String [] args){
        Queue queue = new LinkedList<>();
        System.out.println("Push: "+queue.add("a"));
        System.out.println("Push: "+queue.add("b"));
        
        System.out.println("Push: "+queue.element());
        
        System.out.println("Element:" +queue.poll());
        System.out.println("Push: "+ queue.element());
        System.out.println("Element:" +queue.poll());
        System.out.println("Push: "+queue.add("c"));
        System.out.println("Push: "+ queue.element());
        System.out.println("Push: "+ queue.peek());
    }
    
}
