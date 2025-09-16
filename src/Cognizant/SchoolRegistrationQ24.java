package Cognizant;

public class SchoolRegistrationQ24 {

    public static int ValidRegistrationDate(String s, String start, String end) {
        String parts[] = s.split(",");
        int count = 0;

        String st[] = start.split("-");
        int startday = Integer.parseInt(st[0]);
        int startmonth = Integer.parseInt(st[1]);
        int startyear = Integer.parseInt(st[2]);

        String ed[] = end.split("-");
        int endday = Integer.parseInt(ed[0]);
        int endmonth = Integer.parseInt(ed[1]);
        int endyear = Integer.parseInt(ed[2]);

        for (String key : parts) {
            String date[] = key.split("-");
            int day = Integer.parseInt(date[0]);
            int month = Integer.parseInt(date[1]);
            int year = Integer.parseInt(date[2]);
            if (date.length >= 2) {
                if ((day >= startday && day <= endday) && (month >= startmonth && month <= endmonth) && (year >= startyear && year <= endyear)) {
                    count++;
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        String s = "30-11-2022,01-12-2022,05-12-2022,01-01-2023";
        String start = "01-12-2022";
        String end = "31-12-2022";
        System.out.println(ValidRegistrationDate(s, start, end));
    }
}
