import java.util.Objects;

public class FruitProduct extends AgriculturalProduct implements Critere{

    public FruitProduct(int id, String label, double quantite, String season) {
        super(id, label, "Fruit", quantite, season);
    }

    @Override
    String determinerTypeProduit() {
        return type;
    }

    @Override
    public boolean estFrais(String season) {
        if(this.season.equals(season))
            return true;
        return false;
    }

}
