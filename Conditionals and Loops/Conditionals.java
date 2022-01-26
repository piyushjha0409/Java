/**
 * Main
 * You have to give the increment to the salary oid it is greator than 10k then increment = 2k
 * Otherwise give increment of 1k
 */
public class Conditionals {

    public static void main(String[] args) {
        
        int salary = 25400;
        if(salary>10000){
            salary = salary + 2000;
        }else{
            salary = salary + 1000;
        }
        System.out.println(salary);
    }
}