package buildertests;
import builder.User;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void testUser() {
        User user = User.builder().name("Doja Cat").age(26).gender("female").height(165).race("biracial").occupation("singer").build();
        assertEquals(user.toString(), "User(name=Doja Cat, age=26, gender=female, height=165, race=biracial, occupations=[singer])");
    }

    @Test
    public void TestUser2(){
        User user = User.builder().name("Ariana Grande").age(28).gender("female").height(160).race("latina").occupation("singer, songwriter, actress").build();
        assertEquals(user.toString(), "User(name=Ariana Grande, age=28, gender=female, height=160, race=latina, occupations=[singer, songwriter, actress])");
    }

    @Test
    public void TestUser3(){
        User user = User.builder().name("Dzidzio").age(38).gender("male").height(180).race("eu").occupation("singer, songwriter, actor").build();
        assertEquals(user.toString(), "User(name=Dzidzio, age=38, gender=male, height=180, race=eu, occupations=[singer, songwriter, actor])");
    }
}