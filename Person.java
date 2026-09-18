public abstract class Person {

    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public void showName() {
        System.out.println("Name : " + name);
    }

    public abstract void displayDetails();
}