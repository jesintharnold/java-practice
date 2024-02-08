package DesignPatterns.Factory.DocumentPrinter;

import DesignPatterns.Factory.DocumentProcessing.DocumentProcessor;

public class TextDocumentFactory extends DocumentFactory {
    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }

    @Override
    public DocumentPrinter createPrinter(DocumentProcessor processor) {
        return new TextDocumentPrinter(processor);
    }

    @Override
    public DocumentParser createParser(String path) {
        return new TextDocumentParser(path);
    }

    @Override
    public DocumentProcessor createProcessor(String process) {
        return TextDocumentProcessor(process);
    }
}
