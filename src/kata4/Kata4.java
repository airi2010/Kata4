
package kata4;

import kata4.view.MailHistogramBuilder;
import kata4.view.HistogramDisplay;
import kata4.persistence.MailListReader;
import kata4.model.Histogram;
import kata4.model.Mail;
import java.util.List;

public class Kata4 {

    public static void main(String[] args) {
        // TODO code application logic here
       
        String filename =new String("email.txt");
        List<Mail> mailList=MailListReader.read(filename);

        Histogram<String> mailhistogram=  MailHistogramBuilder.build(mailList);
        HistogramDisplay histogramdis = new HistogramDisplay("Histogram",mailhistogram,0,"email domain","nº emails");
        histogramdis.execute();
    }
    
}
