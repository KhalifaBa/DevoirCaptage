package Entities.Exo1;

public class Captage implements Comparable<Captage>
{
    protected int idCaptage;
    protected String nom;
    protected int hauteur;
    protected int debit;

    public Captage(int idCaptage, String nom, int hauteur, int debit) {
        this.idCaptage = idCaptage;
        this.nom = nom;
        this.hauteur = hauteur;
        this.debit = debit;
    }

    public String GetDescription()
    {
        return nom + " " + hauteur + " mètres" + " " + debit + " litres";
    }

    public int getIdCaptage() {
        return idCaptage;
    }

    @Override
    public int compareTo(Captage o) {
        return Integer.compare(this.debit,o.debit);
    }
}
