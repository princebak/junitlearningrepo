package categoriestest;

import static org.hamcrest.CoreMatchers.isA;
import static org.junit.Assert.*;

import categoriestests.implementations.EnglishSpeaker;
import categoriestests.implementations.FrenchSpeaker;
import categoriestests.implementations.RnbSinger;
import categoriestests.implementations.RockSinger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class JUnitTestCategoryExample {

    /* TEST for Speakers */
    @Test
    @Category(EnglishSpeaker.class)
    public void testEnglishSpeakerSpeaks() {
// You’re test case here: Below is just an example.
        EnglishSpeaker englishSpeaker = new EnglishSpeaker();
        System.out.println("EnglishSpeaker testSpeak");
        Assert.assertTrue(englishSpeaker.speak());
    }

    @Test
    @Category(EnglishSpeaker.class)
    public void testEnglishSpeakerNoSpeaks() {
// You’re test case here: Below is just an example.
        EnglishSpeaker englishSpeaker = new EnglishSpeaker();
        System.out.println("EnglishSpeaker testNoSpeak");
        Assert.assertFalse(englishSpeaker.notSpeak());
    }


    @Test
    @Category(FrenchSpeaker.class)
    public void testFrenchSpeakerSpeaks() {
// You’re test case here: Below is just an example.
        EnglishSpeaker englishSpeaker = new EnglishSpeaker();
        System.out.println("FrenchSpeaker testSpeak");
        Assert.assertTrue(englishSpeaker.speak());
    }

    @Test
    @Category(FrenchSpeaker.class)
    public void testFrenchSpeakerNoSpeaks() {
// You’re test case here: Below is just an example.
        EnglishSpeaker frenchSpeaker = new EnglishSpeaker();
        System.out.println("FrenchSpeaker testNoSpeak");
        Assert.assertFalse(frenchSpeaker.notSpeak());
    }

    /* Test for Singers*/

    @Test
    @Category(RnbSinger.class)
    public void testRnbSingerSings() {
// You’re test case here: Below is just an example.
        RnbSinger rnbSinger = new RnbSinger();
        System.out.println("RnbSinger testSing");
        Assert.assertTrue(rnbSinger.sing());
    }

    @Test
    @Category(RnbSinger.class)
    public void testRnbSingerNoSings() {
// You’re test case here: Below is just an example.
        RnbSinger rnbSinger = new RnbSinger();
        System.out.println("RnbSinger testNotSing");
        Assert.assertFalse(rnbSinger.notSing());
    }

    @Test
    @Category(RockSinger.class)
    public void testRockSingerSings() {
// You’re test case here: Below is just an example.
        RockSinger rockSinger = new RockSinger();
        System.out.println("RockSinger testSing");
        Assert.assertTrue(rockSinger.sing());
    }

    @Test
    @Category(RockSinger.class)
    public void testRockSingerNoSings() {
// You’re test case here: Below is just an example.
        RockSinger rockSinger = new RockSinger();
        System.out.println("RockSinger testNotSing");
        Assert.assertFalse(rockSinger.notSing());
    }
}
