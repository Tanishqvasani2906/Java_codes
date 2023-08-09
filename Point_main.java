import java.util.Scanner;
public class Point_main {
    public static void main(String[] args) {
        int x_axis,y_axis;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF X_AXIS : ");
        x_axis=sc.nextInt();
        System.out.println("ENTER THE VALUE OF Y_AXIS : ");
        y_axis=sc.nextInt();

        Point p=new Point(x_axis, y_axis);
        p.display_fn();
        p.move_method(x_axis, y_axis);
        p.display_fn();

    }
}

