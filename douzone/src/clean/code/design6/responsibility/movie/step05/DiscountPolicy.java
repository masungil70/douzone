package clean.code.design6.responsibility.movie.step05;

import clean.code.design6.money.Money;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public abstract class DiscountPolicy {
    private List<DiscountCondition> discountConditions;

    public DiscountPolicy(DiscountCondition... discountConditions) {
        this.discountConditions = Arrays.asList(discountConditions);
    }

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
