import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(in);
        String input;
        while((input=br.readLine())!=null)
        {
            String[] inputarr=input.split("\\s");
            int velocity= Integer.parseInt(inputarr[0]);
            int time=Integer.parseInt(inputarr[1]);
            int distance=2*(velocity*time);
            System.out.println(distance);
        }
    }
}
