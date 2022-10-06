package ch09.sec07.exam03;

import java.util.Calendar;

public class Chatting {
	
	class Chat {
		Calendar cal = Calendar.getInstance();
		
		void start() {
		}

		void sendMessage(String message) {
			System.out.println(message);
		}
	}

	void startChat(String chatId) {
		String nickName = chatId;
		Chat chat = new Chat() {
			@Override
			public void start() {
				//while (true) {
				for (int i=0;i<10;i++) {
					String inputData = "안녕하세요";
					String message = "[" + nickName + "] " + inputData;
					sendMessage(message);
				}
			}
		};
		chat.start();
	}
	
	public static void main(String [] args) {
		Chatting obj = new Chatting();
		obj.startChat("홍길동");
	}
}
