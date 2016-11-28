package ht_3_1;

/**
 * Created by admin on 28.11.2016.
 */
public class Bird {

    Bird(){
        System.out.println("I am Bird");
    }
    void sing(){
        System.out.println("I am singing");
    }
    void walking(){
        System.out.println("I am walking");
    }
    void flying(){
        System.out.println("I am flying");
    }

    public static void main(String[] args) {
        Bird a = new Bird();
        a.sing();
        a.flying();
        a.walking();
    }
}
