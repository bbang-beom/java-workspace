package section11.practice.p03;

interface printable {
    abstract void print(String document);
}

interface scannable {
    abstract void scan(String document);
}

interface MultiFuntionDevice extends printable, scannable {
    interface Faxable {
        abstract void fax(String document);
    }
}

class MultiFuntion implements MultiFuntionDevice {
    @Override
    public void print(String document) {
        System.out.println("Printing: " + document);
    }

    @Override
    public void scan(String document) {
        System.out.println("Scanning: " + document);
    }

    public void fax(String document) {
        System.out.println("Faxing: " + document);
    }
}

public class Practice03 {
    public static void main(String[] args) {
        MultiFuntion mfp = new MultiFuntion();

        mfp.print("Document1.pdf");
        mfp.scan("Document2.pdf");
        mfp.fax("Document3.pdf");
    }
}
