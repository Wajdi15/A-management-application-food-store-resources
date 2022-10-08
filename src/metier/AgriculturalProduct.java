package metier;

public  class AgriculturalProduct extends Product {
     private String type;
    private double quantite;
    private String season;

    public AgriculturalProduct(int id, String label, String type, double quantite, String season) {
        super(id, label);
        this.type = type;
        this.quantite = quantite;
        this.season = season;
    }

    public String getType() {
        return type;
    }

    public double getQuantite() {
        return quantite;
    }

    public String getSeason() {
        return season;
    }
}
