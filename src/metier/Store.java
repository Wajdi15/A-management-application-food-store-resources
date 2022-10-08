package metier;

public class Store {
    private int id;
    private String name;
    private String address;
    private final int capacity = 50;
    private  Product[] products = new Product[50];
    private  Employee[] employees = new Employee[20];
    private int productIndex = 0;
    private int employeeIndex = 0;

    private static int nbrTotalOfProducts = 0;

    public Store (int id,String name,String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductIndex() {
        return productIndex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Product[] getProducts() {
        return products;
    }

    public void addProduct (Product product) {
        if(findProductIndex(product) == -1){
            products[productIndex++] = product;
            nbrTotalOfProducts++;;
        } else {
            throw new Error("this product already exist !");
        }

    }

    public void addEmployee(Employee employee) {
        if(findEmployeeIndex(employee) == -1){
            employees[employeeIndex++] = employee;
        } else {
            throw new Error("employee already exist !");
        }

    }

    public static int getNbrTotalOfProducts() {
        return nbrTotalOfProducts;
    }
    public String productsAff () {
        StringBuilder productsAff = new StringBuilder();
        for (int i = 0; i < productIndex; i++) {
            productsAff.append("###").append(products[i]).append("###\n");
        }
        return productsAff.toString();
    }
    public String employeeAff () {
        StringBuilder employeeAff = new StringBuilder();
        for (int i = 0; i < employeeIndex; i++) {
            employeeAff.append("###").append(employees[i]).append("###\n");
        }
        return employeeAff.toString();
    }

    public int findProductIndex(Product product) {
        int index = -1 ;
        for (int i = 0; i < productIndex; i++) {
            if(products[i].getId() == product.getId()){
                index = i;
                break;
            }
        }
        return index;
    }

    public int findEmployeeIndex(Employee employee) {
        int index = -1 ;
        for (int i = 0; i < employeeIndex; i++) {
            if(employees[i].id == employee.id){
                index = i;
                break;
            }
        }
        return index;
    }

    public void deleteProduct (Product product) {
        int index = findProductIndex(product);
        if(index!= -1){
            for (int i = index; i < productIndex - 1; i++) {
                products[i] = products[i+1];
            }
            products[productIndex - 1] = null;
            productIndex--;
            nbrTotalOfProducts--;
        }
    }
    public static void comparerStores (Store store1, Store store2) {
        if(store1.getProductIndex() > store2.getProductIndex()){
            System.out.println(store1);
        }else {
            System.out.println(store2);
        }
    }

    public float calculStock() {
        float sum = 0;
        for (int i = 0; i < productIndex; i++) {
            if(products[i] instanceof FruitProduct)
                sum += ((FruitProduct)products[i]).getQuantite();
        }
        return sum;
    }
    @Override
    public String toString() {
        return "Store{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", capacity=" + capacity +
                ", products=" + productsAff() +
                ", employees=" + employeeAff() +
                '}';
    }
}