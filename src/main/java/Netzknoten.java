import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bro on 16.05.14.
 */
public abstract class Netzknoten <NE extends Netzelement> implements Netzelement
{
    private final List<NE > netzelemente= new ArrayList<NE>();
    public Netzknoten(List<NE> netzelemtente)
    {
        netzelemtente.addAll(netzelemtente);
    }
}
