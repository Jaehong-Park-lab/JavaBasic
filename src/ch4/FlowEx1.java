package ch4;

public class FlowEx1 {
    public static void main(String[] args) {
        int x = 0;
        System.out.printf("x=%d 일때, 참인 것은 %n", x);

        if (x==0) System.out.println("x==0");
        if (x!=0) System.out.println("x!=0");
        if (!(x==0)) System.out.println("!(x==0)");
        if (!(x!=0)) System.out.println("!(x!=0)");

        int y= 1;
        System.out.printf("y=%d 일때, 참인 것은 %n", y);
        if (y==0) System.out.println("y==0");
        if (y!=0) System.out.println("y!=0");
        if (!(y==0)) System.out.println("!(y==0)");
        if (!(y!=0)) System.out.println("!(y!=0)");
    }
}
