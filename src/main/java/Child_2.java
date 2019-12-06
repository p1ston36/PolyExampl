public class Child_2 extends Parent {
    @Override
    public void say() {
        System.out.println("I am Child 2");
    }

    public void say(String msg) {
        System.out.println("I am Child 2 and i say" + msg);
    }

}
