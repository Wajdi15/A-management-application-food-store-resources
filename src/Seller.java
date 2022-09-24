public class Seller extends Employee{
    int tauxDeVente;
    Seller(int id, String name, String address, int nbrHours, int tauxDeVente) {
        super(id, name, address, nbrHours);
        this.tauxDeVente = tauxDeVente;
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
