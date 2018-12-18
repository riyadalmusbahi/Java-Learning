package NovJavaProgramming.insuranceCompanyEmails;

import NovJavaProgramming.railwayScreenApplication.Customer;

public class TemplateChooser {


     String chooseTemplate(Customer customer){
        String name = customer.getName().trim();
        if (name.contains("Hokopoko")){
            System.out.println("this customer " + customer.getName() + " has to have the privileged template Email");
            return "Privileged";
        }
        if (name.startsWith("Mrs")|| name.startsWith("Ms")){
            System.out.println("this customer " + customer.getName() + " has to have the women template Email");
            return "Women";
        }
        if (name.startsWith("Mr")){
            System.out.println("this customer " + customer.getName() + " has to have the man template Email");
            return "Man";
        }

        else {
            System.out.println("this customer " + customer.getName() + " has to have the default template Email");
            return "Default";
        }





    }
}
