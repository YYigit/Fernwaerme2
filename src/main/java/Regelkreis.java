import java.awt.*;

/**
 * Created by Bro on 16.05.14.
 */
public class Regelkreis extends Component
{


    private int leistung;
    private Waermezaehler waermezaehler;
    public Regelkreis(int leistung)
    {
        setLeistung(leistung);
    }

    public int getLeistung()
    {
        return leistung;
    }

    public final void setLeistung(int leistung) throws LeistungNegativException
    {
        if(leistung>=0)
        {
            this.leistung = leistung;
        }
        else
        {
            throw new LeistungNegativException();
        }
    }


}
