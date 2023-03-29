package Entities.Exo1;

public class Cuve extends Captage implements IVolume
{
    private int longueur;
    private int largeur;

    public Cuve(int idCaptage, String nom, int hauteur, int debit,int longueur, int largeur) {
        super(idCaptage, nom, hauteur, debit);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public String GetDescription()
    {
        return super.GetDescription() + " " + longueur + " mètres" + " " + largeur + " mètres";
    }

    @Override
    public double GetVolume() {
        return largeur * longueur;
    }
}
