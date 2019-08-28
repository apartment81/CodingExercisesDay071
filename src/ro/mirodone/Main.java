package ro.mirodone;

public class Main {


    public static void main(String[] args) {

        Scramblies scramblies = new Scramblies();
        System.out.println(scramblies.scramble("scriptingjava", "javascript"));

        CleverScramblies scramblies1 = new CleverScramblies();

        System.out.println(scramblies1.scramble("scriptingjava", "javascript"));


    }
}
