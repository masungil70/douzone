package clean.code.design6.responsibility.movie.step06;

import clean.code.design6.money.Money;

public class PercentDiscountPolicy extends DefaultDiscountPolicy  {
    private double percentAmount;

    public PercentDiscountPolicy(double percentAmount, DiscountCondition... discountConditions) {
        super(discountConditions);
        this.percentAmount = percentAmount;
    }

    @Override
    public Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percentAmount);
    }
}
