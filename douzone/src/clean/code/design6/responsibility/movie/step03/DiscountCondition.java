package clean.code.design6.responsibility.movie.step03;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
