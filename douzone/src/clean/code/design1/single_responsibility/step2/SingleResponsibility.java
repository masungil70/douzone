package clean.code.design1.single_responsibility.step2;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

////////////////////////////////////////
//고객의 요구 사항 추가 
//메모장의 내용을 파일에 저장 기능 추가 요구 


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
    
    //파일 저장 기능 
    public void save(String filename) throws Exception {
        FileOutputStream ofs = new FileOutputStream(new File(filename));
        for (String entry : entries) {
            ofs.write(entry.getBytes());
        }
        ofs.close();
    }
    
}

public class SingleResponsibility {

	public static void main(String[] args) throws Exception {
	    Journal journal = new Journal("일기장에게...");
	    journal.add("나는 오늘 ~~을 했다");
	    journal.add("나는 ~~를 먹었다");
	    journal.save("save.txt");
	}

}
