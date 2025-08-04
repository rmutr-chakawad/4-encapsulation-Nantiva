public class TestPizza {
    public static void main(String[] args) {

        Pizza myPizza = new Pizza();

        myPizza.addTopping("ไส้กรอก");
        myPizza.addTopping("แฮม");
        myPizza.addTopping("เห็ด");
        myPizza.addTopping("เชดด้าชีส");
        myPizza.addTopping("มะเขือเทศ");
        myPizza.addTopping("พริก");
        myPizza.addTopping("สัปปะรด");
        myPizza.addTopping("เปปเปอโรนี");
        myPizza.addTopping("กุ้ง");
        myPizza.addTopping("เบคอน");

        myPizza.printAllTopping();
        System.out.println("จำนวน topping : " + myPizza.getTotalToppings());
        System.out.println("ราคาพิซซ่า : "+ myPizza.getPrice() + " บาท");

    }
}
