package solidDependencyInversion;

public class TestProject {

    public static void main(String[] args) {

        Developer frontendDeveloper = new FrontendDeveloper();
        frontendDeveloper.develop();

        Developer backendDeveloper = new BackendDeveloper();
        backendDeveloper.develop();

    }
}
