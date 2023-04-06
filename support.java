package morelikes;

import java.util.Random;
import java.util.UUID;

public class support implements response_list{

    boolean information_giver = true; // 0/1 - Information list at the end
    static String name_of_customer_list;
    static String message_responsed;
    static String support_of_id;
    static int age_of_support;
    static int give_age_of_customer;
    static int give_number_of_ticket;

    static String city_of_customer_d;
    Random random = new Random();

    support(String response, String message_response, int age_of_customer, int number_of_ticket, String city_of_customer) {
       name_of_customer_list = response;
       message_responsed = message_response;
       give_age_of_customer = age_of_customer;
       give_number_of_ticket = number_of_ticket;
       city_of_customer_d = city_of_customer;

       // Random-ID for Support (as name)
       support_of_id = UUID.randomUUID().toString().replace("-", "");

       // Random-Age for Support (as age)
       age_of_support = random.nextInt(100);

       // Call information give is customer and support
       information_list_at_all(information_giver);
    }

    static boolean information_list_at_all(boolean information){
        if(information == false){
            System.exit(1);
        }

        System.out.println("*Customer information: ");
        System.out.println("Customer name: " + name_of_customer_list + " | Age: " + give_age_of_customer + " | City: " + city_of_customer_d  + " | Ticket: #" + give_number_of_ticket);
        System.out.println(">Response: " + message_responsed);

        System.out.println("\t\t\t\t ---- >>");

        System.out.println("*Support information: ");
        System.out.println("Support name: " + support_of_id + " | Age: " + age_of_support);
        System.out.println("Working in --> | Ticket: #" + give_number_of_ticket);

        // Give message by Support
        message_of_response();

        return true; // check true / false - if you know
    }
    static void message_of_response() {
        // Message by Support
        String message_of_response_all = "Thanks for sharing of information! Have a good day #!";
        System.out.println(message_of_response_all);
    }

    @Override
    public void get_customer_id(String cust_id) {
        // If you call only one
        name_of_customer_list = cust_id;
    }

    @Override
    public void get_customer_response(String response) {
        // If you call only one
        message_responsed = response;
    }

    @Override
    public void get_support_id(String sup_id) {
        // If you call only one
        support_of_id = sup_id;
    }
}
