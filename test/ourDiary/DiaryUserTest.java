package ourDiary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryUserTest {
    User joy;
    Diary relationshipDiary;

    @BeforeEach
    void startEachTestWithThis(){
        relationshipDiary = new Diary();
        joy = new User("Joy",relationshipDiary);
    }
//   @Test
//   void userHasADiary(){
//        assertNotNull(joy.getDiary());
//   }
//   @Test
//    void userCanWriteOnTheDiary(){
//        joy.createEntry("Today I was heartbroken, I bought ice-cream and chicken, after tasting the ice-cream, I discovered that my account was empty");

  // }
}
