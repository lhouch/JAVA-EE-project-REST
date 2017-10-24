package impriment.service.cart;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class Imprition {
	public Imprition(){}
	public String impritions(Demande d){
		
		String url="/Users/lhouch/Documents/eclipse/workspace/impriment/"+d.getMatric()+".pdf";
		Document document = new Document();
		 try
	      {
	         PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(url));
	         document.open();
	         document.add(new Paragraph("N Immatriculation"));
	         document.add(new Paragraph("A. AB "+ d.getMatric()));
	         document.add(new Paragraph("Date "));
	         document.add(new Paragraph("B. "+ d.getDateachat()));
	         document.add(new Paragraph("C .1  "+ d.getNomd()));
	         document.add(new Paragraph("C .2 Sexe  "+ d.getSexe()));
	         document.add(new Paragraph("C . 4a Est le proprietaire"));
	         document.add(new Paragraph("Adresse "+ d.getDatepm()));
	         document.add(new Paragraph("C.3 "+ d.getDenominationc()));
	         document.add(new Paragraph("D "+ d.getMarque()));
	         document.add(new Paragraph("E "+ d.getNumeroma()));
	         document.close();
	         writer.close();
	      } catch (DocumentException e)
	      {
	         e.printStackTrace();
	      } catch (FileNotFoundException e)
	      {
	         e.printStackTrace();
	      }
		 return url;
	}

	

}
