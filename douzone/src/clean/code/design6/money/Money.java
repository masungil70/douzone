package clean.code.design6.money;

import java.util.Objects;

public class Money {
    public static final Money ZERO = Money.wons(0.0);

    private final double amount;

    public static Money wons(double amount) {
        return new Money(amount);
    }

    Money(double  amount) {
        this.amount = amount;
    }

    public Money plus(Money amount) {
        return new Money(this.amount + amount.amount);
    }

    public Money minus(Money amount) {
        return new Money(this.amount - amount.amount);
    }

    public Money times(double percent) {
        return new Money(this.amount * percent);
    }

    public boolean isLessThan(Money other) {
        return amount < other.amount;
    }

    public boolean isGreaterThanOrEqual(Money other) {
        return amount >= other.amount;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (!(object instanceof Money)) {
            return false;
        }

        Money other = (Money)object;
        return amount == other.amount;
    }

    public int hashCode() {
        return Objects.hashCode(amount);
    }

    public String toString() {
        return amount + "원";
    }
}
