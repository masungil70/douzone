package clean.code.design1.modem.step1;

/*
아래의 인터페이스는 상황에 따라 Single Responsibility Principle를 위반 한 것일 수 도 있고 아닐 수도 있다

하위 클래스에 연결관리 또는 송수신에 관련된 것이 변경 된다면 연결관리와 데이터 송수신에 대한 두개의 인터페이스로 분리하는 것이 좋음
그러나 두가지의 책임이 변경되지 않는다면 두개의 인터페이스 보다는 한개의 인터페이스로 관리하는 것이 좋다(두개로 변경시 불필요한 복잡성 증가)
 */
public interface Modem {
    //아래 두개의 메서드는 연결 관리의 책임
    void dial(String no);
    void hangup();

    //아래 두개의 메서드는 송수신에 대한 관리 책임
    void send(String c);
    String recv(int length);
}

