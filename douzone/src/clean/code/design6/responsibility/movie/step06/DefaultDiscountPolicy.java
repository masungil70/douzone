package clean.code.design6.responsibility.movie.step06;

import clean.code.design6.money.Money;

import java.util.Arrays;
import java.util.List;

public abstract class DefaultDiscountPolicy implements  DiscountPolicy {
    private List<DiscountCondition> discountConditions;

    public DefaultDiscountPolicy(DiscountCondition... discountConditions) {
        this.discountConditions = Arrays.asList(discountConditions);
    }

    @Override
    public Money calculateDiscountAmount(Screening screening) {
        for (DiscountCondition condition : discountConditions) {
            if (condition.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening);
            }
        }
        return Money.ZERO;
    }

    abstract protected Money getDiscountAmount(Screening screening);
}
