package metier;

public class Responsible extends Employee {
    double prime;

    public Responsible(int id, String name, String address, int nbrHours, double prime) {
        super(id, name, address, nbrHours);
        this.prime = prime;
    }

    public double salary() {
        double salaryInMonth;
        double salaryH = 10;
        salaryInMonth = (nbrHours * salaryH) + prime;
        if(nbrHours > 160) {
            salaryInMonth += (nbrHours - 160) * (salaryH + (salaryH * 20 / 100));
        }
        return salaryInMonth;
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
