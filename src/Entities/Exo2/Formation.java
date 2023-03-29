package Entities.Exo2;

import java.util.ArrayList;

public class Formation
{
    private int idFormation;
    private String nomFormation;
    private int prixFormation;


    private ArrayList<Participant> lesParticipants;

    public Formation(int idFormation, String nomFormation, int prixFormation) {
        this.idFormation = idFormation;
        this.nomFormation = nomFormation;
        this.prixFormation = prixFormation;
        this.lesParticipants = new ArrayList<>();
    }

    public void AjouterParticipant(Participant unParticipant)
    {
        lesParticipants.add(unParticipant);
    }

    // Cette méthode permet de compter le nombre de participants
    // réellement présents à la formation.
    public int GetNombreDePresents()
    {
        int i = 0;
        int nbParticipant = 0;
        // A compléter ici
        for (Participant part : lesParticipants)
        {
            if (part.isEstPresent() == true)
            {
                nbParticipant = nbParticipant + 1;

            }
            i++;
        }

        return nbParticipant;
    }

    // Cette méthode permet de calculer le montant total
    // des frais kilométriques versés pour une formation
    // en ne prenant en compte que les participants présents.
    // On rembourse 1.89 du KM
    public double CalculerFraisRemboursementKilometriques()
    {
        int i = 0;
        double frais = 0;
        // A compléter ici
        for (Participant prt : lesParticipants)
        {
            if (prt.isEstPresent()==true)
            {
               frais = frais + (prt.getNbKm()*1.89);
            }
            i++;

        }

        return frais;
    }

    // Cette méthode permet de calculer le taux de présence
    // par rapport au nombre d'inscrits
    public double TauxDePresence()
    {
        // A compléter ici
        double taux =0;
        double participant = GetNombreDePresents();

        for (Participant prt: lesParticipants)
        {
            taux = participant / lesParticipants.size();
            break;
        }
        return taux;
    }

    // Cette méthode permet de calculer le bénéfice de la formation.
    // Ce dernier se détermine en multipliant le nombre de présents par le prix de la formation moins
    // les frais kilométriques versés
    public double BeneficeFormation()
    {
        // A compléter ici
        double  benef = 0;
        int i = 0;
        benef = (GetNombreDePresents() * prixFormation) - CalculerFraisRemboursementKilometriques();

        return  benef;
    }


}
