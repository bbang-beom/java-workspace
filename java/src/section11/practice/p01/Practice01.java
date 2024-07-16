package section11.practice.p01;

abstract class printable {
    abstract void print(String document);
}

abstract class scannable {
    abstract void scan(String document);
}

class SamsungPrinter extends printable{
    void print(String document) {
        System.out.println("Printing: " + document);
    }
}

class SamsungScanner extends scannable{
    void scan(String document) {
        System.out.println("Scanning: " + document);
    }
}


public class Practice01 {
    public static void main(String[] args) {
        SamsungPrinter sp = new SamsungPrinter();
        SamsungScanner ss = new SamsungScanner();

        sp.print("Document1.pdf");
        ss.scan("Document2.pdf");
    }
}
