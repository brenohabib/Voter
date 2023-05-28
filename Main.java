import java.util.Scanner;
public class Main{
    public static void main (String[] args){
        boolean running = true;
        Scanner input = new Scanner(System.in);
        int totCandidates, vote;
        String candidateName, candidateSelected;
        System.out.println("Enter candidates names\nenter -1 when done");

        // Add Candidate
        for (int id = 0;;id++){
            candidateName = input.nextLine();
            if (candidateName.equals("-1")){
                totCandidates = id; //add last candidate number to total
                break;
            }
            Urna.newCandidate(candidateName, id);
        }
        // Show every Candidate
        for (int i = 0;i < totCandidates;i++){
            if (i == 0){
                System.out.print("|");
            }

            System.out.print(i + " = " + Urna.candidates.get(i).getName() + " | ");
            
        }
        // Starting voting
        System.out.println("\nStarting voting\nEnter -1 when done");
        while (running){
            vote = input.nextInt();
            if(vote == -1){
                running = false;
            }
            else if(vote >= totCandidates || vote > -1){
                candidateSelected = Urna.getCandidates().get(vote).getName();
                if (candidateSelected != null){
                    // Increment vote count for the selected candidate
                    Urna.getCandidates().get(vote).addVote();
                }
            }
            else{
                System.out.println("Invalid candidate number, try again");
            }

        }
        // Display vote counts for each candidate
        System.out.println("\nVote counts:");
        for (Candidate candidate : Urna.getCandidates().values()) {
            System.out.println(candidate.getName() + ": " + candidate.getAmountVotes());
        input.close();
        }
    }
}
