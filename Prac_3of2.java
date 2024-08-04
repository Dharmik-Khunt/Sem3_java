import java.util.*;
 class Point{
    private int x;
    private int y;
    public Point(){
        x=0;
        y=0;
    }
    public Point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    public void  move(int xd,int yd){
        x=x+xd;
        y=y+yd;
        if(x<0){
            x=0;
        }
        else if(x>100)x=100;
        if(y<0)y=0;
        else if(y>100)y=100;

    }
    public String toString(){
      return x+" "+y;        
    } 

}
public class  Prac_3of2{
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        System.out.print("enter x :");
        int x=sr.nextInt();
        System.out.print("enter y :");
        int y=sr.nextInt();
 
       Point p=new Point(x,y);
       System.out.print("enter move forwed x :");
       int xd=sr.nextInt();
       System.out.print("enter move forwed y :");
       int yd=sr.nextInt();

       p.move(xd, yd);
       System.out.println("forwed value x and y :"+p.toString());

    }
}
