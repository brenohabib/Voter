public class Candidate {
    private String name;
    private int id;
    private int amountVotes;

    public Candidate(String name, int id){
        this.name = name;
        this.id = id;
        this.amountVotes = 0;
    }

    public void addVote(){
        amountVotes++;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public int getAmountVotes(){
        return amountVotes;
    }
}
