public class Main
{
    public static void main(String[] args)
    {
        TableauEntier tab = new TableauEntier(new int[][]{{1,2},{3,4}});
        ParcoursLigne parcours = new ParcoursLigne(tab);

        while(parcours.hasNext())
        {
            System.out.println(parcours.next());
        }
    }
}
