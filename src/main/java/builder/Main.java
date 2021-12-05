package builder;
public class Main {
    public static void main(String[] args) {
        User user = User.builder().name("Doja Cat").age(26).gender("female").height(165).race("biracial").occupation("singer").build();
        System.out.println(user);
    }
}
