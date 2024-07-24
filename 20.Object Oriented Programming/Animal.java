public class MultiLevel_Inheritance{
        public static void main(String args[]){
            Animal dog  = new Animal();
            dog.eat();
        }
}
public class Animal{
        String color;
        void eat(){
            System.out.println("eats");
        }
        void breathe(){
            System.out.println("breathes");
        }
}
