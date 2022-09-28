package clean.code.design6.responsibility.movie.step05;

import clean.code.design6.money.Money;

public class NoneDiscountPolicy extends DiscountPolicy {
    public NoneDiscountPolicy() {

    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
