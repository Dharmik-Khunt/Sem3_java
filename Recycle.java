import java.util.*;
interface Recyclable
{
    default void display()
    {
        System.out.println("Give proper input");
    }
}
class Fabric implements Recyclable
{
    public String toString()
    {
        return "Bottle Recycled...";
    }
}
class Bottle implements Recyclable
{
    public String toString()
    {
        return "Bottle Recycled...";
    }
}
class Paper implements Recyclable
{
    public String toString()
    {
        return "Paper Recycled...";
    }
}
public class Recycle
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What do you want to recycle? Choose a number.");
        System.out.println("1 - Clothes");
        System.out.println("2 - Bottles");
        System.out.println("3 - Newspapers");
        System.out.println("4 - Exit");
        int choice;
        do
        {
            System.out.printf("Choose a Number: ");
            choice = input.nextInt();
            switch(choice)
            {
                case 1:
                {
                    Fabric cloth = new Fabric();
                    System.out.println(cloth);
                }
                break;
                case 2:
                {
                    Bottle bottle = new Bottle();
                    System.out.println(bottle);
                }
                break;
                case 3:
                {
                    Paper paper = new Paper();
                    System.out.println(paper);
                }
                break;
                case 4:
                {
                    System.out.println("Thanks for coming...");
                    System.exit(0);
                }
                break;
                default:
                {
                    Paper paper = new Paper();
                    paper.display();
                }
            }
        }while(choice!=4);
        System.out.println("23CE058_Dharmik Khunt");
    }
}

