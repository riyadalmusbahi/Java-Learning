package NovJavaProgramming.insuranceCompanyEmails;

import NovJavaProgramming.railwayScreenApplication.Customer;

public class InsuranceApplication {
    public static void main(String[] args) {

    Customer customer1 = new Customer("Mr.Riyad Almusbahi", "Business");
    Customer customer2 = new Customer("Mrs.married Girl", "Business");
    Customer customer3 = new Customer("Ms.Mazal Matzajetish", "Economic");
    Customer customer4 = new Customer("Mr.Riyad Hokopoko", "Business");
    Customer customer5 = new Customer("  Mrs.Tina ", "Economic");


    TemplateChooser templateChooser = new TemplateChooser();
    templateChooser.chooseTemplate(customer1);
    templateChooser.chooseTemplate(customer2);
    templateChooser.chooseTemplate(customer3);
    templateChooser.chooseTemplate(customer4);
    templateChooser.chooseTemplate(customer5);

    }

}
