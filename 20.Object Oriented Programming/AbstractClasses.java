public class AbstractClasses{
    public static void main(String[] args) {
      //Horse h = new Horse();
      //h.eat();
      //h.walk();
      
      //Chicken c = new Chicken();
      //c.eat();
      //c.walk();

      //System.out.println(h.color);
      //h.ChangeColor();
      //System.out.println(h.color);
      //System.out.println(c.color);
      //c.ChangeColor();
      //System.out.println(c.color);

      //Cannot create a instance of this ABSTRACT class
      //Animal a = new Animal

      Mustang myHorse = new Mustang();
      //Heirarchy: "Animal -> Horse-> Mustang"
    }
}

abstract class Animal{
    String color;
    Animal(){
        System.out.println("Animal Constructor is called");
        //color = "Brown";
    }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse Constructor is called");
    }
    void ChangeColor(){
        color = "Dark Brown";
    }
        
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal{
    Chicken(){
        System.out.println("Chicken Constructor is called");
    }
    void ChangeColor(){
        color = "Yellow";
    }
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang Constructor is called");
    }
}