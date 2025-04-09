public class Main {

    public static void greet(){
        System.out.println("Hello World. I am in a method/function");
    }
    public static int add(int a, int b){
        return a + b;
    }
    public static String fullName(String first, String last){
        return last + ", " + first;
    }
    public static String agePhrase(int age){
        return "Your age is: " + age;
    }
    public static void main(String[] args) {
       greet();
        greet();
        int sum = add(6,7) ; //call/invoke the function above
        System.out.println(sum);
        System.out.println(add(11,22));
        System.out.println(fullName("Kevin", "Long"));
        System.out.println(agePhrase(57));
    }

}