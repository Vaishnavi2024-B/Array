public class MultiplicationTable {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9,10}; 
		int mul=1;
        for (int i = 0; i<num.length;i++) {
		mul= mul+2;
            System.out.println("print the num:"+mul);
        }
    }
}