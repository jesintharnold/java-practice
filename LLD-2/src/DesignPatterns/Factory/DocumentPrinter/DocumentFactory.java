package DesignPatterns.Factory.DocumentPrinter;


import DesignPatterns.Factory.DocumentProcessing.DocumentProcessor;

public abstract class DocumentFactory {
    public abstract DocumentType supportsType();
    public abstract DocumentPrinter createPrinter(DocumentProcessor processor);
    public abstract DocumentParser createParser(String path);
    public abstract DocumentProcessor createProcessor(String processor);
}
