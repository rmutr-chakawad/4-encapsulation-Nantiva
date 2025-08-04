import java.util.ArrayList;

public class Pizza {
    // maxtopping เป็นค่าคงที่
    final private int maxtopping = 10;
    private ArrayList<String> toppings = new ArrayList<String>();
    private int totalToppings;

    public double getPrice() {
        if (totalToppings <= 0){
            return 100;
        } else {
            return totalToppings * 10;
        }
    }
    public int getTotalToppings(){
        return totalToppings;
    }
    public void addTopping(String topping){
        if (totalToppings < maxtopping){
            toppings.add(topping);
            totalToppings++;
            System.out.println("Added " + topping );
        } else {
            System.out.println("Cannot add more topping ");
        }
    }
    public void printAllTopping(){
        if (totalToppings == 0){
            System.out.println("Cannot add more topping ");
        } else {
            System.out.println("Toppings list : ");
            for (String topping : toppings){
                System.out.println("- " + topping );
            }
        }
    }
}

