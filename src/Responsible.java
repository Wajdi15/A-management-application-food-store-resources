public class Responsible extends Employee {
    double prime;

    Responsible(int id, String name, String address, int nbrHours, double prime) {
        super(id, name, address, nbrHours);
        this.prime = prime;
    }

    @Override
    public String toString() {
        return "Responsible{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", nbrHours=" + nbrHours +
                ", prime=" + prime +
                '}';
    }
}
