public class Seller extends Employee{
    double tauxDeVente;
    Seller(int id, String name, String address, int nbrHours, double tauxDeVente) {
        super(id, name, address, nbrHours);
        this.tauxDeVente = tauxDeVente;
    }
    public double salarySeller() {
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
