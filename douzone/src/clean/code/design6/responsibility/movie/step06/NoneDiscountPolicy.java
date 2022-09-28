package clean.code.design6.responsibility.movie.step06;

import clean.code.design6.money.Money;

public class NoneDiscountPolicy implements DiscountPolicy {
    public NoneDiscountPolicy() {

    }

    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return Money.ZERO;
    }

}
