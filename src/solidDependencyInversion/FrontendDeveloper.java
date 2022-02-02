package solidDependencyInversion;

public class FrontendDeveloper implements Developer{

  //FrontendDeveloper depending on abstraction which is develop method
    @Override
    public void develop() {
        this.writeJavaScript();
    }

    public void writeJavaScript(){
        System.out.println("Write JavaScript");
    }
}
