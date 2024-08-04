import java.util.*;
interface Recyclable
{
    default void display()
    {
        System.out.println("Bottle returned for recycling");
    }
}
class Bottle implements Recyclable
{
    private double Volume;
    public void setVolume(double vol)
    {
        Volume = vol;
    }
    public double returnVolume()
    {
        return Volume;
    }
}
class SodaBottle extends Bottle implements Recyclable
{
    String Name;
    public void setName(String name)
    {
        Name = name;
    }
    public String toString()
    {
        return Name + ", " + returnVolume() + " litres";
    }
    public void Recyclye()
    {
        display();
    }
}
public class Prac_3of3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        SodaBottle sodabottle = new SodaBottle();
        System.out.printf("Type in the name of the soda: ");
        String name = input.nextLine();
        sodabottle.setName(name);
        System.out.printf("Type in the volume of the bottle: ");
        double vol = input.nextDouble();
        sodabottle.setVolume(vol);
        System.out.println(sodabottle);
        sodabottle.Recyclye();
        System.out.println("23CE058_Dharmik Khunt");
    }
}
