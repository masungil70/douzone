package clean.code.design1.modem.step2;

/*
분리된두개의 책임을 구현하는 방법
*/

public class Modem implements Connection, DataChannel {
    //아래 두개의 메서드는 연결 관리의 책임
    public void dial(String no) {

    }
    public void hangup() {

    }

    //아래 두개의 메서드는 송수신에 대한 관리 책임
    public void send(String c) {

    }
    public String recv(int length) {
        return "";
    };
}

