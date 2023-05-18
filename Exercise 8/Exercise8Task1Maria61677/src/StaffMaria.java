import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class StaffMaria extends PersonMaria
{
    String Maria61677education;
    String Maria61677position;

    public  void  initialize() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        initialize();
        System.out.println("Input your education");
        Maria61677education = br.readLine();
        System.out.println("Input your position");
        Maria61677position = br.readLine();
    }
    public void MariaDisplayData(){
        MariaDisplayData();
        System.out.println("Education :" + Maria61677education);
        System.out.println("Position :" + Maria61677position);
    }
}