package Design_Pattern.Factory.Document_Factory;

public abstract class DocumentFactory implements IDocument
{
    public static  IDocument createDocument(documentType type) {
        return switch (type) {
            case Word -> new WordDocument();
            case PDF -> new PdfDocument();
            default -> null;
        };
    }
}
