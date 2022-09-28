package clean.code.design6.data.movie.step02;

import clean.code.design6.money.Money;

public class ReservationAgency {
    public static Reservation reserve(Screening screening, Customer customer, int audienceCount) {
        Money fee = screening.calculateFee(audienceCount);
        return new Reservation(customer, screening, fee, audienceCount);
    }
}
