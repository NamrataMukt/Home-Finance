package in.cjctech.wonderhomeapp.app.utility;

import java.io.ByteArrayOutputStream;

import org.springframework.beans.factory.annotation.Autowired;

import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.CMYKColor;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import in.cjctech.wonderhomeapp.app.model.SanctionLetter;
import in.cjctech.wonderhomeapp.app.service.SanctionLetterService;

public class SanctionLetterPdf 
{
	@Autowired
	private  SanctionLetterService sls;
	
	

	public static ByteArrayOutputStream generatePdf(SanctionLetter letter) 
	{
		String title="Wonder Home Finance";
		
		String text="Dear, \n"+letter.getApplicantName()+" \n We are pleased to inform you that home loan of Rs."+letter.getLoanAmountSanctioned()+" Has Been Sanctioned.";
		
		Document document=new Document();
		
		ByteArrayOutputStream output=new ByteArrayOutputStream();
		
		PdfWriter.getInstance(document, output);
		
		document.open();
		
        Font titleFont=FontFactory.getFont(FontFactory.TIMES_ITALIC,24,CMYKColor.BLUE);
		
		
		Paragraph para=new Paragraph(title,titleFont);
		
		para.setAlignment("Center");
		
		document.add(para);
		
		Paragraph textPara=new Paragraph(text);
		
		textPara.setSpacingBefore(20);
		
		document.add(textPara);
		

		
		Font phraseFont=FontFactory.getFont(FontFactory.HELVETICA_BOLD);
		
		PdfPTable table=new PdfPTable(2);
		
		table.setSpacingBefore(30);
		table.setWidths(new int[] {3,4});
		
		PdfPCell cell1=new PdfPCell();
		cell1.setPadding(6);
		cell1.setPaddingLeft(10);
		cell1.setPhrase(new Phrase("Applicant Name",phraseFont));
		table.addCell(cell1);
		cell1.setPhrase(new Phrase(letter.getApplicantName(),phraseFont));
		table.addCell(cell1);
		
		PdfPCell cell2=new PdfPCell();
		cell2.setPadding(6);
		cell2.setPaddingLeft(10);
		cell2.setPhrase(new Phrase("contactDetails",phraseFont));
		table.addCell(cell2);
		cell2.setPhrase(new Phrase(letter.getContactDetails(),phraseFont));
		table.addCell(cell2);
		
		PdfPCell cell3=new PdfPCell();
		cell3.setPadding(6);
		cell3.setPaddingLeft(10);
		cell3.setPhrase(new Phrase("applicantemailid",phraseFont));
		table.addCell(cell3);
		cell3.setPhrase(new Phrase(letter.getApplicantemailid(),phraseFont));
		table.addCell(cell3);
		
		PdfPCell cell4=new PdfPCell();
		cell4.setPadding(6);
		cell4.setPaddingLeft(10);
		cell4.setPhrase(new Phrase("tokenamountForHome",phraseFont));
		table.addCell(cell4);
		cell4.setPhrase(new Phrase(String.valueOf(letter.getTokenamountForHome()),phraseFont));
		table.addCell(cell4);
		
		PdfPCell cell5=new PdfPCell();
		cell5.setPadding(6);
		cell5.setPaddingLeft(10);
		cell5.setPhrase(new Phrase("loanAmountSanctioned",phraseFont));
		table.addCell(cell5);
		cell5.setPhrase(new Phrase(String.valueOf(letter.getLoanAmountSanctioned()),phraseFont));
		table.addCell(cell5);
		
		PdfPCell cell6=new PdfPCell();
		cell6.setPadding(6);
		cell6.setPaddingLeft(10);
		cell6.setPhrase(new Phrase("rateOfInterest",phraseFont));
		table.addCell(cell6);
		cell6.setPhrase(new Phrase(String.valueOf(letter.getRateOfInterest()),phraseFont));
		table.addCell(cell6);
		
		PdfPCell cell7=new PdfPCell();
		cell7.setPadding(6);
		cell7.setPaddingLeft(10);
		cell7.setPhrase(new Phrase("loanTenure",phraseFont));
		table.addCell(cell7);
		cell7.setPhrase(new Phrase(String.valueOf(letter.getLoanTenure()),phraseFont));
		table.addCell(cell7);
		
		
		PdfPCell cell8=new PdfPCell();
		cell8.setPadding(6);
		cell8.setPaddingLeft(10);
		cell8.setPhrase(new Phrase("monthlyEmiAmount",phraseFont));
		table.addCell(cell8);
		cell8.setPhrase(new Phrase(String.valueOf(letter.getMonthlyEmiAmount()),phraseFont));
		table.addCell(cell8);
		
		PdfPCell cell9=new PdfPCell();
		cell9.setPadding(6);
		cell9.setPaddingLeft(10);
		cell9.setPhrase(new Phrase("sanctionstatus",phraseFont));
		table.addCell(cell9);
		cell9.setPhrase(new Phrase(letter.getSanctionstatus(),phraseFont));
		table.addCell(cell9);
		
		document.add(table);
		
		String text1="Thank You, For Choosing  Wonder-Home Finance. Based on application and Information provided therein,"
				+ "We are pleased to offer you a loan as per the preliminary terms and Conditons.";
		
        Paragraph text1Para=new Paragraph(text1);
		
        text1Para.setSpacingBefore(20);
		
		document.add(text1Para);
		
		
		
		
		document.close();
		
		return output;
	}

}
