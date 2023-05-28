import java.util.Dictionary;
import java.util.Hashtable;

public class Urna {
    public static Dictionary<Integer,String> eleitores = new Hashtable<>();

    public static void novoEleitor(String nomeEleitor, int idEleitor){
        Eleitor eleitor = new Eleitor();
        eleitor.nome = nomeEleitor;
        eleitor.identificacao = idEleitor;
        eleitores.put(idEleitor, nomeEleitor);
    }
    
}
