package builder;
import lombok.Builder;
import lombok.Getter;
import lombok.Singular;
import lombok.ToString;

import java.util.List;

@Builder(toBuilder = true) @Getter @ToString
public class User {
    String name;
    int age;
    String gender;
    int height;
    String race;
    @Singular
    private List<String> occupations;

}
