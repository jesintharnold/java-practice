package DesignPatterns.Factory.DocumentPrinter;

import DesignPatterns.Factory.DocumentProcessing.DocumentProcessor;

public class SpreadsheetDocumentFactory extends DocumentFactory {
    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREAD_SHEET;
    }

    @Override
    public DocumentPrinter createPrinter(DocumentProcessor processor) {
        return new SpreadsheetDocumentPrinter(processor);
    }

    @Override
    public DocumentParser createParser(String path) {
        return new SpreadsheetDocumentParser(path);
    }

    @Override
    public DocumentProcessor createProcessor(String process) {
        return SpreadsheetDocumentProcessor(process);
    }
}
