import java.util.Map;
import java.util.HashMap;

public class Urna {
    public static Map<Integer,Candidate> candidates = new HashMap<>();

    public static void newCandidate(String candidateName, int candidateId){
        Candidate candidate = new Candidate(candidateName, candidateId);
        candidates.put(candidateId, candidate);

    }
    public static Map<Integer,Candidate> getCandidates(){
        return candidates;
    }
    
}
