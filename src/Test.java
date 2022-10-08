import java.text.ParseException;

public class Test {
    public static void main(String[] args) throws ParseException {
        //partie : I
        Product[] products = new Product[50];
        products[0] = new Product();
        products[1] = new Product(1021, "Lait", "Delice", 1, "15/12/2022");
        products[2] = new Product(2510, "Yaourt", "Vitalait", 0, "15/12/2022");
        products[3] = new Product(3250, "Tomate", "Sicam", 1.200, "15/12/2022");
        //show products
        System.out.println("###Products###");
        showAllProducts(products);
        // add prices for the rest of products
        products[1].setPrice(0.700);
        products[2].setPrice(0.400);
        System.out.println("\n###Products after update###");
        showAllProducts(products);

        //partie : II
        //create our first store
        Store store1 = new Store(17, "mg", "sbz");
        //add product to the store1
        for (int i = 0; i < 4; i++) {
            store1.addProduct(products[i]);
        }

        //create our first store
        Store store2 = new Store(17, "mg", "sbz");
        //add product to the store1
        for (int i = 0; i < 4; i++) {
            store2.addProduct(products[i]);
        }
        System.out.println(store1.toString());
        System.out.println(Store.getNbrTotalOfProducts());
        store1.deleteProduct(products[1]);
        System.out.println(store1.toString());

        //partie IV :
        Employee[] employeesA = new Employee[20];
        Employee[] employeesB = new Employee[20];

        Store storeA = new Store(1, "Carrefour", "Centre-Ville");
        Store storeB = new Store(2, "Monoprix", "Menzah 6");

        employeesA[0] = new Cashier(1, "Itachi", "sbz", 100, 1);
        employeesA[1] = new Cashier(2, "Itachi", "sbz", 100, 2);
        employeesA[2] = new Cashier(3, "Itachi", "sbz", 100, 3);
        employeesA[3] = new Responsible(5, "Wajdi", "sbz", 100, 15);
        employeesA[4] = new Seller(9, "Itachi", "sbz", 100, 15);

        employeesB[0] = new Cashier(3, "Naruto", "Tokyo", 50, 3);
        employeesB[1] = new Seller(13, "Madara", "Paris", 100, 17);
        employeesB[2] = new Seller(4, "Itachi", "sbz", 100, 1.2);
        employeesB[3] = new Seller(7, "L", "sbz", 100, 17);
        employeesB[4] = new Responsible(1, "Salma", "sbz", 100, 17.5);

        //add product to the storeA
        for (int i = 0; i < 4; i++) {
            storeA.addProduct(products[i]);
        }
        //add product to the storeB
        for (int i = 0; i < 4; i++) {
            storeB.addProduct(products[i]);
        }

        for (int i = 0; i < 5; i++) {
            storeA.addEmployee(employeesA[i]);
            storeB.addEmployee(employeesB[i]);
        }
        //Show store A AND B details
        System.out.println(storeA);
        System.out.println(storeB);
        // salary of responsible
        System.out.println("salary of responsible :"+employeesB[4].salary());
        // salary of  seller
        System.out.println("salary of  seller :"+employeesB[2].salary());
    }

    public static void showAllProducts(Product[] products) {
        for (int i = 0; i < 4; i++) {
            System.out.println(products[i]);
        }
    }
}
