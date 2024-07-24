import java.util.*;

public class sumfirstn{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int defa = 0;
        int i = 1;
        while(i<=range){
            defa = defa + i;
            System.out.println(defa);
            i++;
        }
        sc.close();
 
    }
}