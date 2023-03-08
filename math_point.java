package project;
public class math_point {
    String[] the_list_numbers = {"0", "I", "II","III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    boolean convert_number_check(String number) throws Exception {

        for(int i = 0; i < the_list_numbers.length; i++){

            if(number.equals(the_list_numbers[i])) {
                    return true;
            }
        }
        return false;
    }

     int convert_number_correct(String number) throws Exception {

         for(int i = 0; i < the_list_numbers.length; i ++){

             if(number.equals(the_list_numbers[i])){
                 return i;
             }
         }
         return -1;
     }

}
