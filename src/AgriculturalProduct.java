public abstract class AgriculturalProduct extends Product{
    String type;
    double quantite;
    String season;

    public AgriculturalProduct(int id, String label, String type, double quantite, String season) {
        super(id, label);
        this.type = type;
        this.quantite = quantite;
        this.season = season;
    }
    abstract String determinerTypeProduit();


}
