public class Cashier extends Employee {
    int numDeCaisse;

    Cashier(int id, String name, String address, int nbrHours, int numDeCaisse) {
        super(id, name, address, nbrHours);
        this.numDeCaisse = numDeCaisse;
    }
    public double salaryCashier() {
        double salaryInMonth;
        double salaryH = 5;
        salaryInMonth = nbrHours * salaryH;
        if(nbrHours > 180) {
            salaryInMonth += (nbrHours - 160) * (salaryH + (salaryH * 15 / 100));
        }
        return salaryInMonth;
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
