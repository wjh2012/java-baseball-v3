package baseball;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumberGenerator implements NumberGenerator {

    private static final int NUMBER_START_INCLUSIVE = 1;
    private static final int NUMBER_END_INCLUSIVE = 9;

    @Override
    public int generate() {
        return Randoms.pickNumberInRange(NUMBER_START_INCLUSIVE, NUMBER_END_INCLUSIVE);
    }
}
