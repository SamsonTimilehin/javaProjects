package PlayGround;

public /*abstract*/ class Player implements TestInterface {

    //An interface is a software component that facilitates an exchange of services - methods
    // between software components -- classes, interfaces, enum, methods etc.
    // An interface is also a contract/agreement between these components

    private String firstName;
    private String lastName;

    public String getFullName() {
        //perform some validation
        //perform some logic
        //call another method i.e transfer control to another method
        //fetch information from database
        String name = getFirstName() + " " + getLastName();
        return name;
    }

    //abstract  void test();

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public int getAge() {
        return 30;
    }
}

class Coach implements TestInterface {

    @Override
    public int getAge() {
        return 40;
    }

}

class Manager extends Player{

}

interface TestInterface {

    int getAge();

    default void printSomething(){
        System.out.println("Something");
    }

}

class Test {

    String name;
    TestInterface testAttribute;

    public void test(){
        name = "he";
        testAttribute = new Player();
    }

    public void test2(){
        name = "he";
        testAttribute = new Coach();
    }

    public static void main(String[] args) {
        Player playerObjectSegun = new Player();
        Coach coachObjectSegun = new Coach();
        System.out.println(playerObjectSegun.getFullName());
        printAge(playerObjectSegun);
        printAge(coachObjectSegun);

        printAge2(new Player());
        Player manager = new Manager();
        printAge2(manager);
        System.out.println(manager.getFullName());

        TestInterface testInterface = new Player();
        //ferfr
        //frf
        //ff3
        testInterface = new Coach();
    }

    public static void printAge(TestInterface testInterface) {
        System.out.println(testInterface.getAge());
    }

    public static void printAge2(Player testPlayer) {
        System.out.println(testPlayer.getAge());
    }

}