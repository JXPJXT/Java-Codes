import java.util.*;

public class DoWhile{
    public static void main(String[] args){
        int counter = 0;
        do{
            System.out.println("Counter Check");
            counter++;
        }
        while(counter<=10);
        System.out.println("Value of counter is: "+counter);
    } 
}