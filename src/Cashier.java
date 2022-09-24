public class Cashier extends Employee {
    int numDeCaisse;

    Cashier(int id, String name, String address, int nbrHours, int numDeCaisse) {
        super(id, name, address, nbrHours);
        this.numDeCaisse = numDeCaisse;
    }

    @Override
    public String toString() {
        return "Cashier{" +
                "numDeCaisse=" + numDeCaisse +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", nbrHours=" + nbrHours +
                '}';
    }
}
