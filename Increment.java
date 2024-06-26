public class Increment {
    public static void main(String[] args) {
        int x = 87; 
        int value;
        int value1 = x++;
		int value2 = ++x;
        System.out.println("Post Increment Operation:" +value1);
        System.out.println("Pre Increment Operation:"+value2 );

    }
}