/**
 * Created by Bro on 16.05.14.
 */
public class LeistungNegativException extends RuntimeException
{
    public LeistungNegativException()
    {
        super("Die Leistung darf keine negative Zahl sein");
    }
}
