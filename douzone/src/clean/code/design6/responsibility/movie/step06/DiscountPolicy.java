package clean.code.design6.responsibility.movie.step06;

import clean.code.design6.money.Money;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
