
import java.awt.AWTException;
import java.io.IOException;
import javax.swing.UIManager;

/**
 *
 * @author Negin Firouzian
 *
 * The main class
 */
public class CalandarMain {

    public static void main(String[] args) throws AWTException, IOException {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        /*
      FileCreate f=new FileCreate(1,31);
      f.stringConvert();
      FileCreate o=new FileCreate(2,31);
      o.stringConvert();
      FileCreate k=new FileCreate(3,31);
      k.stringConvert();
      FileCreate t=new FileCreate(4,31);
      t.stringConvert();
      FileCreate m=new FileCreate(5,31);
      m.stringConvert();
      FileCreate s=new FileCreate(6,31);
      s.stringConvert();
       FileCreate me=new FileCreate(7,30);
      me.stringConvert();
      FileCreate a=new FileCreate(8,30);
      a.stringConvert();
       FileCreate az=new FileCreate(9,30);
      az.stringConvert();
       FileCreate d=new FileCreate(10,30);
      d.stringConvert();
       FileCreate b=new FileCreate(11,30);
      b.stringConvert();
       FileCreate e=new FileCreate(12,30);
      e.stringConvert();
         */

        ParsiCalendar gridLayoutFrame = new ParsiCalendar();

        // gridLayoutFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        gridLayoutFrame.setSize(700, 500);
        gridLayoutFrame.setVisible(true);

    }

}
