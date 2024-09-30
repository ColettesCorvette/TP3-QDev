import java.util.Iterator;

public abstract class Parcours implements Iterator<Integer>
{

    protected TableauEntier tabInt;
    protected int ligneCour;
    protected int colonneCour;
    protected int nbParcourus;

    public Parcours(TableauEntier tI)
    {
        this.tabInt=tI;
        this.ligneCour=0;
        this.colonneCour=0;
        this.nbParcourus=0;
    }

    @Override
    public boolean hasNext()
    {
        return nbParcourus < (tabInt.getLargeur() * tabInt.getHauteur());
    }

    @Override
    public Integer next()
    {
        if(!hasNext())
        {
            throw new java.util.NoSuchElementException();
        }

        int val = tabInt.valeurA(ligneCour, colonneCour);
        suivant();
        nbParcourus++;
        return val;
    }

    protected abstract void suivant();

}
