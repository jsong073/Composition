public class CompositionBasics {
    public static void main(String[] args) {
        Person bobby = new Person();
        bobby.getJob().setRole("Worker");
        bobby.getJob().setId(113024);
        System.out.println(bobby.toString());
    }
}