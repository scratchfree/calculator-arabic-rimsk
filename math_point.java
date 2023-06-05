package project;
public class math_point {
    
    String[] the_list_numbers = {"0", "I", "II","III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    String l = the_list_numbers.length;
     int convert_number_correct(String n) throws Exception {
         for(int i = 0; i < l; i ++){
             if(n.equals(l[i])){
                 return i;
             }
         }
         return -1;
     }
}
