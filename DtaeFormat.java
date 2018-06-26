
package dtaeformat;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class DtaeFormat {

    
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat d1 = new SimpleDateFormat("dd-mm-yyy hh:mm:ss");
        String date="26-06-2018 8:36:10";
        System.out.println(d1.parse(date));
        
        
    }

  
       
    }
    

