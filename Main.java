import StripComments.StripComments;

public class Main {
    public static void main(String[] args) {
        String res = StripComments.stripComments("apples, pears # and bananas\ngrapes\nbananas !apples", new String[] { "#", "!" }); 
    
        System.out.printf("res: %s, equals: %B", res, res.equals("apples, pears\ngrapes\nbananas"));
    }
}