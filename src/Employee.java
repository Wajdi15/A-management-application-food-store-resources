public abstract class Employee {
    int id;
    String name;
    String address;
    int nbrHours;

    Employee(int id, String name, String address, int nbrHours) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.nbrHours = nbrHours;
    }

    abstract double salary();

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", nbrHours=" + nbrHours +
                '}';
    }
}
