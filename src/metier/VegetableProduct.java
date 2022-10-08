package metier;

public class VegetableProduct extends AgriculturalProduct implements Critere {

    public VegetableProduct(int id, String label, double quantite, String season) {
        super(id, label, "Vegetable", quantite, season);
    }

    @Override
    public boolean estFrais(String season) {
        int a = rechechePosMoins(this.getSeason());
        int b = rechechePosMoins(season);
        if(a == b || b==a+1 || (a == 11 && b == 0))
            return true;
        return false;
    }
    private int rechechePosMoins(String mois) {
        String[] annee= {"Janvier","fevrier","Mars","avril","Mai","Juin","Juillet","Aout","Septembre","Octobre","November","December"};
        for (int i = 0; i < annee.length; i++)
            if (mois.equalsIgnoreCase(annee[i]))
                return i;
        return -1;
    }
}
