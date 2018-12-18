package NovJavaProgramming.railwayScreenApplication;

public class Screen {

    public void display(Customer customer) {
        System.out.println("Name : " + modifyName(customer));
        System.out.println("Category : " + customer.getCategory());
    }

    String modifyName(Customer customer) {
        String category = customer.getCategory();
        String modifiedName = customer.getName();
        if (category.equals("Business")) {
            return modifiedName.toUpperCase();
        }
        if (category == "Economic") {
            return modifiedName.toLowerCase();
        }

        return "Invalid category , please check the customer category and try again";
    }

}

