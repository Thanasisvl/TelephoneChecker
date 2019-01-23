
public class Validations {


    //Checks if the number passed as a parameter is a valid Greek Number
    public boolean isTelephoneValid(String tel) {

        if (tel.length() != 10 && tel.length() != 14) {
            return false;
        } else {
            switch (tel.length()) {
                case 10:
                    if (!tel.startsWith("2") && !tel.startsWith("69")) {
                        return false;
                    } else break;

                case 14:
                    if (!tel.startsWith("00302") && !tel.startsWith("003069")) {
                        return false;
                    } else break;
            }
            return true;
        }
    }
}
