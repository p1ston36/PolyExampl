public class Main {
    public static void main(String[] args){
        Parent iAm;
        iAm = new Parent();
        iAm.say();
        iAm = new Child_1();
        iAm.say();
        iAm = new Child_2();
        iAm.say();
        ((Child_2) iAm).say("blablabla");
    }
}
