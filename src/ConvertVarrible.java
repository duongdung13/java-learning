public class ConvertVarrible {
    public static void main(String[] args) {
        int a = 100;
        int b = 2;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // ép kiểu ngầm định
        float c = (float) a;
        float d = (float) b;
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        // ép kiểu tường minh
        float e = 3.5F;
        int g = (int) e;
        System.out.println("e = " + e);
        System.out.println("g = " + g);

        // ép kiểu đối tượng nguyên thủy
        //int h = new Integer(32);
    }
}
