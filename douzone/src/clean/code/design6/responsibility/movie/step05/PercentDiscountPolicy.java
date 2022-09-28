package clean.code.design6.responsibility.movie.step05;

import clean.code.design6.money.Money;

public class PercentDiscountPolicy extends DiscountPolicy {
    private double percentAmount;

    public PercentDiscountPolicy(double percentAmount, DiscountCondition... discountConditions) {
        super(discountConditions);
        this.percentAmount = percentAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percentAmount);
    }
}
