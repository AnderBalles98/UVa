import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Locale;

/**
 * @author ANDERSON BALLESTEROS
 */

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        Integer cases = Integer.parseInt(leer.readLine());
        for (int i = 1; i <= cases; i++) {
            String text = leer.readLine();
            Integer month = Integer.parseInt(text.substring(0, 2));
            Integer day = Integer.parseInt(text.substring(2, 4));
            Integer year = Integer.parseInt(text.substring(4, 8));
            Calendar cal = Calendar.getInstance();
            cal.set(year, month-1, day+280);
            String sign="";
            String aux = String.format(Locale.ROOT, "%tm", cal)+"/"+
                    String.format(Locale.ROOT, "%td", cal)+"/"+
                    String.format(Locale.ROOT, "%tY", cal);
            day = Integer.parseInt(String.format(Locale.ROOT, "%td", cal));
            month = Integer.parseInt(String.format(Locale.ROOT, "%tm", cal));
            if (month.intValue()==1) {
                sign="Capricorn";
                if (day.intValue()>=21) {
                    sign="Aquarius";
                }
            }else if (month.intValue()==2) {
                sign="Aquarius";
                if (day.intValue()>=20) {
                    sign="Pisces";
                }
            }else if (month.intValue()==3) {
                sign="Pisces";
                if (day.intValue()>=21) {
                    sign="Aries";
                }
            }else if (month.intValue()==4) {
                sign="Aries";
                if (day.intValue()>=21) {
                    sign="Taurus";
                }
            }else if (month.intValue()==5) {
                sign="Taurus";
                if (day.intValue()>=22) {
                    sign="Gemini";
                }
            }else if (month.intValue()==6) {
                sign="Gemini";
                if (day.intValue()>=22) {
                    sign="Cancer";
                }
            }else if (month.intValue()==7) {
                sign="Cancer";
                if (day.intValue()>=23) {
                    sign="Leo";
                }
            }else if (month.intValue()==8) {
                sign="Leo";
                if (day.intValue()>=22) {
                    sign="Virgo";
                }
            }else if (month.intValue()==9) {
                sign="Virgo";
                if (day.intValue()>=24) {
                    sign="Libra";
                }
            }else if (month.intValue()==10) {
                sign="Libra";
                if (day.intValue()>=24) {
                    sign="Scorpio";
                }
            }else if (month.intValue()==11) {
                sign="Scorpio";
                if (day.intValue()>=23) {
                    sign="Sagittarius";
                }
            }else if (month.intValue()==12) {
                sign="Sagittarius";
                if (day.intValue()>=23) {
                    sign="Capricorn";
                }
            }
            
            System.out.println(i+" "+aux+" "+sign.toLowerCase());
            
        }
    }
}
