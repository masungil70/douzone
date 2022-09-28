package clean.code.design6.data.movie.step02;

import clean.code.design6.money.Money;

import java.time.format.DateTimeFormatter;

public class Reservation {
    private Customer customer;
    private Screening screening;
    private Money fee;
    private int audienceCount;

    public Reservation(Customer customer, Screening screening, Money fee,
                       int audienceCount) {
        this.customer = customer;
        this.screening = screening;
        this.fee = fee;
        this.audienceCount = audienceCount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Screening getScreening() {
        return screening;
    }

    public void setScreening(Screening screening) {
        this.screening = screening;
    }

    public Money getFee() {
        return fee;
    }

    public void setFee(Money fee) {
        this.fee = fee;
    }

    public int getAudienceCount() {
        return audienceCount;
    }

    public void setAudienceCount(int audienceCount) {
        this.audienceCount = audienceCount;
    }

    void detailOutput()  {
        System.out.println("\n=====================================");
        System.out.println("회차 : " + screening.getSequence());
        System.out.println("상영일 : " + screening.getWhenScreened().format(DateTimeFormatter.ofPattern("YYYY-MM-dd")));
        System.out.println("시작 시간 : " + screening.getWhenScreened().format(DateTimeFormatter.ofPattern("HH:mm")));
        System.out.println("1회 요금 : " + screening.getMovie().getFee());
        System.out.println("전체요금 : " + screening.getMovie().getFee().times(audienceCount));
        System.out.println("할인요금 : " + fee);
        System.out.println("예약 인원 : " + audienceCount  + "\n");
    }

}
