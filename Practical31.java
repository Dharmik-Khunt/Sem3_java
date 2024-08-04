import java.util.*;

class  GasMeter{
 private  float aoctainfule;
 private float boctainfule;
 private  float disel;
 private float total;
public void refule(int n,float ref){
   
    if(n==1){
        aoctainfule+=ref;
        total+=ref;
    }
  else  if(n==2){
        boctainfule+=ref;
        total+=ref;
    }
    else if(n==3){
        disel+=ref;
         total+=ref;
    }
    else{
        display();
    }
    
    
}
public int  reloop(int n){
    if(1==n||2==n||3==n){
        return 1;
    }
    else 
    return 0;

}
public void display(){
    System.out.println("total fule :"+total);
    System.out.println("Total used 95 octane fuel:"+aoctainfule);
    System.out.println("Total used 98 octane fuel:"+boctainfule);
    System.out.println("Total used diesel fuel:"+disel);
}

}

public class Practical31 {
    public static void main(String[] args) {
        GasMeter G=new GasMeter();
        int y;
        do{
        int n;
        float ref=0;
        Scanner sr=new Scanner(System.in);
        System.out.print("what do you want: 1=95, 2=98, 3=Diesel (type any other number to quit):");
        n=sr.nextInt();
        y=G.reloop(n);
        if(1==y){
        System.out.print("How much do you want to refuel: ");
        ref=sr.nextFloat();
      }  G.refule(n, ref);
        }while(1==y);

    }

}

