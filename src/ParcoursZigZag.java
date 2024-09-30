public class ParcoursZigZag extends Parcours
{
    public ParcoursZigZag(TableauEntier tI)
    {
        super(tI);
    }

    public void suivant()
    {
        if (ligneCour % 2 == 0) {

            colonneCour++;
            if (colonneCour >= tabInt.getLargeur()) {
                colonneCour = tabInt.getLargeur() - 1;
                ligneCour++;
            }
        } else {

            colonneCour--;
            if (colonneCour < 0) {
                colonneCour = 0;
                ligneCour++;
            }
        }
    }
}
