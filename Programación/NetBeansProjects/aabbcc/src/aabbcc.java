
import gnu.jpdf.PDFJob;
import java.awt.Graphics;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.io.IOException;


public class aabbcc {
    public static void main(String args[]) {
       
        try{
            PDFJob pdf = new PDFJob("Downloads");
            PageFormat pf = new PageFormat();
            pdf.getGraphics(pf);
            pf.setOrientation(PageFormat.PORTRAIT);
            Paper p = new Paper();
            p.setSize(595, 842);
            p.setImageableArea(20, 30, 555, 782);
            pf.setPaper(p);
            pdf.end();
        }catch(IOException e){
            System.out.println(e);
        }
        
    }
}
