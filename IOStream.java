import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOStream {
    public static void main(String[] args) {
        FileInputStream in= null;
        FileOutputStream out= null;
        try{
            in= new FileInputStream("input.txt");
            out= new FileOutputStream("output.txt");
            int c;
            while((c=in.read())!=-1){   
                out.write(c);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            try{
                in.close();
                out.close();
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
