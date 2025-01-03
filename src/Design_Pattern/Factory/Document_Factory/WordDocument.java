package Design_Pattern.Factory.Document_Factory;

public class WordDocument implements IDocument {
    @Override
    public void open() {
        System.out.println("Opening word document");
    }

    @Override
    public void save() {
        System.out.println("Saving word document");
    }

    @Override
    public void close() {
        System.out.println("Closing word document");
    }
}
