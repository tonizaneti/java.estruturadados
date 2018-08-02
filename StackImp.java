package estrutura;

import java.util.Random;
import java.util.Stack;

public class StackImp.java {

    public static void main(String[] args) {
        // TODO code application logic here

        Stack stack = new Stack<>();

        Random random = new Random();

        int i = 5;

        while (i != 0) {
            System.out.println("Push " + stack.push(random.nextInt(50)));
            i--;

        }
        System.out.println("------");
        while (!stack.isEmpty())
        {

 //       for (int c = 0; c < 5; c++) {
            System.out.println("Pop " + stack.pop());
        }
        
//        System.out.println(stack.get(0));

    }
}
