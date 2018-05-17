package Solution.two;

import java.util.Comparator;

/**
 *
 * @author Sathishkumar T
 */
public class CardComparatorRankFirst implements Comparator<Card> {

    @Override
    public int compare(Card c1, Card c2) {
        return c1.rankDiff(c2);
    }
}
