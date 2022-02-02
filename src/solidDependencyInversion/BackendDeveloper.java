package solidDependencyInversion;

public class BackendDeveloper implements Developer{

    //BackendDeveloper depending on abstraction which is develop method
    @Override
    public void develop() {
        this.writeJava();
    }

    public void writeJava(){
        System.out.println("Write Java");
    }
}
