package org.example;

abstract class WordDocument {
    public abstract void createwordDocument();
}

abstract class PdfDocument {
    public abstract void pdf();
}

abstract class ExcelDocument {
    public abstract void createexcelDocument();

}
class ConcreteWord extends WordDocument {
    @Override
    public void createwordDocument() {}

}

class ConcretePdf extends PdfDocument{
    @Override
    public void pdf(){
        System.out.println("concretepdfDocument");
    }


}

class ConcreteExcel extends ExcelDocument{
    @Override
    public void createexcelDocument() {}

}

abstract class DocumentFactory{
    public abstract void createDocument();
}

class concreteDocumentFactory extends DocumentFactory{
    @Override
    public void createDocument() {
        System.out.println("concreteDocumentFactory");
    }
}
public class Main {
    public static void main(String[] args) {
        concreteDocumentFactory obj = new concreteDocumentFactory();
        obj.createDocument();



    }
}