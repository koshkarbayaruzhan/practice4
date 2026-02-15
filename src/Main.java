package factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите тип документа: report / resume / letter / invoice");

        String type = sc.nextLine().toLowerCase();

        DocumentCreator creator;

        switch (type) {
            case "report":
                creator = new ReportCreator();
                break;
            case "resume":
                creator = new ResumeCreator();
                break;
            case "letter":
                creator = new LetterCreator();
                break;
            case "invoice":
                creator = new InvoiceCreator();
                break;
            default:
                throw new IllegalArgumentException("Неизвестный тип документа: " + type);
        }

        creator.openDocument();
    }
}
