import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Bro on 16.05.14.
 */
public class Station
{
    private final int maxLeistung=100000;
    private ArrayList <Waermezaehler> listeWaermezaehler;

    public int summeLeistung()
    {
        int x=0;

        for(int i=0; i<listeWaermezaehler.size();i++)
        {
            if(x>=maxLeistung)
            {
                throw new LeistungOverflowException();
            }
            x+=listeWaermezaehler.get(i).getMaxLeistung();

        }


        return x;
    }


}
