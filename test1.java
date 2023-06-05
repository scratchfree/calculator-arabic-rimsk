package project;

import java.util.Scanner;



public class test1{

    public static void main(String[] args) throws Exception {
        
        int number_int;
        int number_int2;
        int result;

        math_point dmath_point = new math_point();
        Scanner scanner = new Scanner(System.in);
        String line_for_user = scanner.nextLine();
        String[] spam_method_check = line_for_user.split("[+\\-*/]");
        // -=>
        if (spam_method_check.length != 2) {throw new Exception("ERROR 1005# - Only + - * /");}
        // <=-
        String math_method_spell = math_detect_method(line_for_user); // + - * /

        try{

          number_int = Integer.parseInt(spam_method_check[0]);
          number_int2 = Integer.parseInt(spam_method_check[1]);
          math_lab_for_result(number_int, number_int2, math_method_spell);
        }catch (Exception e){

          number_int = dmath_point.convert_number_correct(spam_method_check[0]);
          number_int2 = dmath_point.convert_number_correct(spam_method_check[1]);
          math_lab_for_result(number_int, number_int2, math_method_spell);
        }
    }

    public static int math_lab_for_result(int a, int b, String math_method) throws Exception {
        int result;

        if(a < -1 || a > 10 || b < -1 || b > 10){
            throw new Exception("Число меньше 0 или больше 10");
        }if(math_method.contains("+")){
            result = a + b;
            System.out.println(result);return result;
        }if (math_method.contains("-")){
            result = a - b;
            System.out.println(result);return result;
        }if(math_method.contains("*")){
            result = a * b;
            System.out.println(result);return result;
        }if(math_method.contains("/")){
            result = a / b;
            System.out.println(result);return result;
        }else throw new Exception("Числа в разных форматах!! ");

    }

    public static String math_detect_method(String lineForUser) {

        if(lineForUser.contains("+")){return "+";}
        else if (lineForUser.contains("-")){return "-";}
        else if (lineForUser.contains("*")){return "*";}
        else if (lineForUser.contains("/")){return "/";}
        else return null;
    }
}
