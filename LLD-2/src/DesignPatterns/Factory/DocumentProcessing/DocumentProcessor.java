package DesignPatterns.Factory.DocumentProcessing;

public abstract class DocumentProcessor {
    protected String documentName;

    public DocumentProcessor(String name){
        this.documentName=name;
    };

    public abstract DocumentType supportsType();
    public abstract void processDocument();
    public abstract String getDocumentName();
}

