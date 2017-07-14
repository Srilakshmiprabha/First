package programs;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import java.util.Scanner;

public class Age{

    public static int calculateAge(Date birthdate) {
        Calendar birth = Calendar.getInstance();
        birth.setTime(birthdate);
        Calendar today = Calendar.getInstance();

        int yearDifference = today.get(Calendar.YEAR)
                - birth.get(Calendar.YEAR);

        if (today.get(Calendar.MONTH) < birth.get(Calendar.MONTH)) {
            yearDifference--;
        } else {
            if (today.get(Calendar.MONTH) == birth.get(Calendar.MONTH)
                    && today.get(Calendar.DAY_OF_MONTH) < birth
                            .get(Calendar.DAY_OF_MONTH)) {
                yearDifference--;
            }

        }

        return yearDifference;
    }

    public static void main(String[] args) throws ParseException {
        
       
        SimpleDateFormat df = new SimpleDateFormat("dd-mm-yyyy");
        System.out.println("enter your birthday in dd-mm-yyyy format");
        Scanner sc=new Scanner(System.in);
       
        String dob=sc.next();
        
        Date birthdate = df.parse(dob);
        System.out.println(Age.calculateAge(birthdate));

    }
}