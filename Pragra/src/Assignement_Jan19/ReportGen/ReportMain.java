package Assignement_Jan19.ReportGen;

public class ReportMain {

    public static void main(String[] args){

        ReportService rp= new ReportService();
        ReportGenerator pdf = new PdfReport();
        rp.generate(pdf);

        ReportGenerator excel = new ExcelReport();
        rp.generate(excel);

    }
}
