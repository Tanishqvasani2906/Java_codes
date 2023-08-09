public class Point {
    private int x_axis;
    private int y_axis;
    
    Point(int x,int y)
    {

        if(x<0 || x>100)
        {
            if(x<0)
            {
                x=0;
            }
            else if(x>100)
            {
                x=100;
            }
            else
            {
                x_axis=x;
            }
        }
        else if(y<0 || y>100)
        {
            if(y<0)
            {
                y=0;
            }
            else if(y>100)
            {
                y=100;
            }
            else
            {
                y_axis=y;
            }
        }
        this.x_axis=x;
        this.y_axis=y;
    }
    public Point move_method(int x,int y)
    {
        this.x_axis = this.x_axis+x;
        {
            if(x_axis<0)
            {
                x_axis=0;
            }
            else if(x_axis>100)
            {
                x_axis=100;
            }
        }
        this.y_axis = this.y_axis+y;
        {
            if(y_axis<0)
            {
                y=0;
            }
            else if(y_axis>100)
            {
                y_axis=100;
            }
        }

        return this;
    }
    void display_fn()
    {
    System.out.println("FINAL VALUES OF X-AXIS is : "+x_axis);
    System.out.println("FINAL VALUES OF Y-AXIS is : "+y_axis);

    }
}
