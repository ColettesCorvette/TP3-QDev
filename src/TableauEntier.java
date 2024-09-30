public class TableauEntier
{

    private int[][] tab;

    public TableauEntier(int[][] t)
    {
        this.tab=t;
    }

    public int valeurA(int l, int c)
    {
        return tab[l][c];
    }

    public int getLargeur()
    {
        return this.tab[0].length;
    }

    public int getHauteur()
    {
        return this.tab.length;
    }


    public ParcoursLigne iterateurLigne()
    {
        return new ParcoursLigne(this);
    }



}
