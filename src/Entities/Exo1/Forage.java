package Entities.Exo1;

public class Forage extends Captage implements IVolume
{
    private int diametre;

    public Forage(int idCaptage, String nom, int hauteur, int debit, int diametre) {
        super(idCaptage, nom, hauteur, debit);
        this.diametre = diametre;
    }

    @Override
    public String GetDescription()
    {
        return super.GetDescription() + " " + " diamètres" + diametre ;
    }

    @Override
    public double GetVolume() {
        return Math.PI * diametre * hauteur;
    }
}
