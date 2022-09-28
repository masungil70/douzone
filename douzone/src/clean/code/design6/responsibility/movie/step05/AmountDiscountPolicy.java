package clean.code.design6.responsibility.movie.step05;

import clean.code.design6.money.Money;

public class AmountDiscountPolicy extends DiscountPolicy {
    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition... discountConditions) {
        super(discountConditions);
        this.discountAmount = discountAmount;
    }

    // 할인 정책에 따라 할인된 금액을 리턴하게 자식클래스에서 재정의하여 구현한다
    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
