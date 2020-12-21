public class Kata {
  public static boolean validPhoneNumber(String phoneNumber) {
    String valid = "(123) 456-7890";
    return (valid.equals(phoneNumber))? true : false;
  }
}
//OR
public class Kata {
  public static boolean validPhoneNumber(String phoneNumber) {
    if (phoneNumber == null) {
      return false;
    }
    return phoneNumber.matches("\\(\\d{3}\\) \\d{3}-\\d{4}");
  }
}
