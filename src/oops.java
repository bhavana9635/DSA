public class oops {
    //class and objects
    /*public static void main(String args[]){
        Pen p1 = new Pen();
        p1.Setcolor("Green");
        //p1.color = "Blue";
        System.out.println(p1.color);
        System.out.println(p1.getColor());
        p1.Setcolor("Blue");
        System.out.println(p1.getColor());

    }
}

class Pen{
    //properties and fuctions
    int tip;
    String color;
    void Setcolor(String newcolor){
        this.color = newcolor;
    }
    void Settip(int newtip){
        this.tip = newtip;
    }
//getter and setter ... here this. is used .....
    String getColor(){
        return this.color;
    }

    void setColor(String newcolor){
        this.color  = newcolor;
    }


    // 1) encapsulation  -- it has the both data and properties like here pen has tip and color we are creating the fuctions for themmm.

    // constructors are whr we are creating them in the main fuction like pen p1 = new pen(); is constructor which must be no param,with parameter, ref calling
    //here we come across the shall copy and deep copy which is the we are doing the ref calling and another is callig them directly..

    // 2) Inheritance --  here we are using the extends word....




    public static void main(String args[]) {
        Animal horse = new Herbivorus();
        horse.eats();   // overridden method
        horse.walks();  // inherited method


    }

}
class Animal {
    void walks() {
        System.out.println("walks");
    }

    void eats() {
        System.out.println("Eats");
    }
}

class Herbivorus extends Animal {
    void eats() {
        System.out.println("eats only grass ");
    }
}

class Carnivorus extends Animal {
    void eats() {
        System.out.println(" Eats only non-veg :");
    }
}*/

    // 3) ------------------------------Abstraction ----------------------------------
    public static void main(String args[]) {
        Animal horse = new Herbivorus();
        horse.eats();   // overridden method
        horse.walks();  // inherited method
        Animal eagle = new Carnivorus();
        eagle.eats();

    }

}
class Animal {
    void walks() {
        System.out.println("walks :");
    }

    void eats() {
        System.out.println("Eats :");
    }
}

class Herbivorus extends Animal {
    void eats() {
        System.out.println("Eats only grass :");
    }
}

class Carnivorus extends Animal {
    void eats() {
        System.out.println("Eats only non-veg :");
    }
}


// 4) ---------------------------- Polymorphism -------------------------------
























































































































































































