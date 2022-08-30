import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameExample {
    public static final String CLASSNAME_EXAMPLE = "^[ACP][0-9]{4}[GHIKLM]$";

    public ClassNameExample() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(CLASSNAME_EXAMPLE);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
