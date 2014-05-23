import javafx.scene.Node;

import java.util.ArrayList;

/**
 * Created by Bro on 16.05.14.
 */
public class Waermezaehler
{


    private final int maxLeistung=10000;
    private Station station;

    private ArrayList <Regelkreis> listeRegelkreis;

    public Waermezaehler(Station station)
    {
        this.station= station;
    }
    public int calculate() throws LeistungOverflowException
    {
        int x=0;

           for(int i=0; i<listeRegelkreis.size();i++)
           {
                if(x>=maxLeistung)
                {
                    throw new LeistungOverflowException();
                }
               x+=listeRegelkreis.get(i).getLeistung();

           }


        return x;

    }
    public int getMaxLeistung()
    {
        return maxLeistung;
    }
}
