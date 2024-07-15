package section11.practice.p02;

interface printable {
    abstract void print(String document);
}

interface scannable {
    abstract void scan(String document);
}

class MultiFuntion implements printable, scannable {
    @Override
    public void print(String document) {
        System.out.println("Printing: " + document);
    }

    @Override
    public void scan(String document) {
        System.out.println("Scanning: " + document);
    }
}

public class Practice02 {
    public static void main(String[] args) {
        MultiFuntion mfp = new MultiFuntion();

        mfp.print("Document1.pdf");
        mfp.scan("Document2.pdf");
    }
}
