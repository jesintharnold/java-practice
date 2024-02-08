package DesignPatterns.Factory.DocumentProcessing;


public class DocumentProcessorFactory{
    public static DocumentProcessor getProcessor(DocumentType fmt,String name){
        switch (fmt){
            case PRESENTATION: return new PresentationDocumentProcessor(name);
            case TEXT: return new TextDocumentProcessor(name);
            case SPREAD_SHEET: return new SpreadsheetDocumentProcessor(name);
        };
        return null;
    };
}
