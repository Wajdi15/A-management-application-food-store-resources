package metier;

public class Seller extends Employee{
    public double tauxDeVente;
    public Seller(int id, String name, String address, int nbrHours, double tauxDeVente) {
        super(id, name, address, nbrHours);
        this.tauxDeVente = tauxDeVente;
    }
    public double salary() {
        double salaryInMonth = 450;
        salaryInMonth *= tauxDeVente;
        return salaryInMonth;
    }
    @Override
    public String toString() {
        return "Seller{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", nbrHours=" + nbrHours +
                ", tauxDeVente=" + tauxDeVente +
                '}';
    }
}
