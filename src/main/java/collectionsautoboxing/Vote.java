package collectionsautoboxing;

import java.util.HashMap;
import java.util.Map;

import static javax.security.auth.callback.ConfirmationCallback.YES;

public class Vote {

    public Map<VoteResult, Integer> getResult(Map<String, VoteResult> votes) {
        int numberOfNo = 0;
        int numberOfYes = 0;
        int numberofAbstain = 0;
        Map<VoteResult, Integer> result = new HashMap<>();
        for (VoteResult actual : votes.values()) {
            if (actual.equals(VoteResult.YES)) {
                numberOfYes++;
            } else if (actual.equals(VoteResult.NO)) {
                numberOfNo++;
            } else {
                numberofAbstain++;
            }
        }

        result.put(VoteResult.YES, numberOfYes);
        result.put(VoteResult.NO, numberOfNo);
        result.put(VoteResult.ABSTAIN, numberofAbstain);

        return result;
    }

    public static void main(String[] args) {
        Vote vote = new Vote();
        Map<String, VoteResult> votes = new HashMap<>();
        votes.put("John Doe", VoteResult.YES);
        votes.put("Jack Doe", VoteResult.NO);
        votes.put("Jill Doe", VoteResult.YES);
        vote.getResult(votes);
    }
}
