import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class RuntimeExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//Runtime runtime = Runtime.getRuntime();
			//runtime.exec("notepad.exe");
			
			Process p = Runtime.getRuntime().exec(new String[]{"cmd.exe"});
			BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream(), "EUC-KR"));
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(p.getOutputStream()));
			String line = null;

			out.write("dir /w\nexit\n");
			out.flush();
			
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
			System.out.println("종료 코드 = " + p.exitValue());
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
