package Design_Pattern.Factory.Document_Factory;

public class PdfDocument implements IDocument {

    @Override
    public void open() {
        System.out.println("Opening PDF document");
    }

    @Override
    public void save() {
        System.out.println("Saving PDF document");
    }


    @Override
    public void close() {
        System.out.println("Closing PDF document");
    }
}
