import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // 1. Валідація телефонного номера
        String phoneNumber = "(+380)50-333-33-33";
        if (validatePhoneNumber(phoneNumber)) {
            System.out.println("1. Valid phone number");
        } else {
            System.out.println("1. Invalid phone number");
        }

        // 2. Заміна пробілів більше одного на один
        String inputString = "Я хочу    бути     програмістом";
        String resultString = inputString.replaceAll("\\s+", " ");
        System.out.println("2. " + resultString);

        // 3. Видалення HTML тегів із тексту
        String htmlText = "<div><p>Символи круглих дужок <code>'('</code> та <code>')'</code>. <br />Ці символи\n" +
                "дозволяють отримати з рядка додаткову інформацію.\n" +
                "<br/>Зазвичай, якщо парсер регулярних виразів шукає в тексті інформацію\n" +
                "за заданим виразом і знаходить її - він просто повертає\n" +
                "знайдений рядок.</p>\n" +
                "<p align=\"right\">А ось тут <a href=\"google.com\">посилання</a>, щоб життя медом не здавалося.</p>\n" +
                "</div>";
        String textWithoutHtml = htmlText.replaceAll("<[^>]*>", "");
        System.out.println("3. " + textWithoutHtml);
    }

    // Валідація телефонного номера
    private static boolean validatePhoneNumber(String phoneNumber) {
        String regex = "^\\(\\+380\\)[0-9]{2}-[0-9]{3}-[0-9]{2}-[0-9]{2}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}
