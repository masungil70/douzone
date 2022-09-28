package clean.code.design1.modem.step2;

public interface DataChannel {
    //아래 두개의 메서드는 송수신에 대한 관리 책임
    void send(String c);
    String recv(int length);
}
