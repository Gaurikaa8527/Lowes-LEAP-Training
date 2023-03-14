import java.util.Scanner;

public class Product {
    int prod_id;
    String prod_name;
    int prod_quantity;
    int unit_price;
    int stock;
    int total_cost;

    void add_product(int prod_id, String prod_name, int unit_price, int stock){
        this.prod_id = prod_id;
        this.prod_name = prod_name;
        this.unit_price = unit_price;
        this.stock = stock;
    }

    void order(String prod_name, int prod_quantity){
        if(prod_quantity > stock){
            System.out.println("Out of Stock");
        }else{
            stock -= prod_quantity;
            System.out.println("Your final amount is: " + unit_price*prod_quantity);
            System.out.println("Remaining stock in inventory: " + stock);
        }
    }

    public static void main(String[] arr) {
        Scanner scn = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        int id = scn.nextInt();
        String name = scanner.nextLine();
        int quant = scn.nextInt();
        int up = scn.nextInt();

        Product shoes = new Product();
        shoes.add_product(id, name,up, quant);

        shoes.order(name, 2);

    }
}

class Prod_catalogue{
    
}