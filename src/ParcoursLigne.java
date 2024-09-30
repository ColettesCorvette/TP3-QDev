public class ParcoursLigne extends Parcours
{

    public ParcoursLigne(TableauEntier tI)
    {
        super(tI);
    }

    @Override
    protected void suivant()
    {
        colonneCour++;
        if(colonneCour>=tabInt.getLargeur())
        {
            colonneCour=0;
            ligneCour++;
        }
    }


}
