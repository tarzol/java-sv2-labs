package collectionsautoboxing;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class VoteTest {

    @Test
    void testGetResult() {
        Vote vote = new Vote();
        Map<String, VoteResult> votes = new HashMap<>();
        votes.put("John Doe", VoteResult.YES);
        votes.put("John2 Doe", VoteResult.YES);
        votes.put("John3 Doe", VoteResult.YES);
        votes.put("Jack Doe", VoteResult.NO);
        votes.put("Jill Doe", VoteResult.ABSTAIN);
        votes.put("Jill2 Doe", VoteResult.ABSTAIN);

        Map<VoteResult, Integer> result = vote.getResult(votes);
        assertEquals(6, votes.size() );
        assertEquals(3, vote.getResult(votes).size());
        assertEquals(3, result.get(VoteResult.YES));
        assertEquals(1, result.get(VoteResult.NO));
        assertEquals(2, result.get(VoteResult.ABSTAIN));
    }
}