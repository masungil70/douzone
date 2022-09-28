package clean.code.design1.modem.step2;

public interface Connection {
    //아래 두개의 메서드는 연결 관리의 책임
    void dial(String no);
    void hangup();
}
