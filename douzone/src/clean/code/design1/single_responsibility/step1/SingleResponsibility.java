package clean.code.design1.single_responsibility.step1;

import java.util.ArrayList;
import java.util.List;

class Journal {
    private String title; //제목 
    private List<String> entries = new ArrayList<String>();//여러 항목

    public Journal(String title) {
    	this.title = title;
    }

    //항목 추가 
    public void add(String entry) {
        entries.add((entries.size() + 1) + " : " + entry);
    }
}

public class SingleResponsibility {

	public static void main(String[] args) {
	    Journal journal = new Journal("일기장에게...");
	    journal.add("나는 오늘 ~~을 했다");
	    journal.add("나는 ~~를 먹었다");
	}

}
