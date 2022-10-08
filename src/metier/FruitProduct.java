package metier;

public class FruitProduct extends AgriculturalProduct implements Critere {

    public FruitProduct(int id, String label, double quantite, String season) {
        super(id, label, "Fruit", quantite, season);
    }

    @Override
    public boolean estFrais(String season) {
        if(this.getSeason().equals(season))
            return true;
        return false;
    }

}
