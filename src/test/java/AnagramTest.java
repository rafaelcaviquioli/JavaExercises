import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void getAnagrams_shouldGroupAnagramsByList() {
        var words = new ArrayList<String>() {{
            add("pear");
            add("amleth");
            add("dormitory");
            add("tinsel");
            add("dirty room");
            add("hamlet");
            add("listen");
            add("silnet");
        }};

        var result = Anagram.GetAnagrams(words);

        assertEquals(new ArrayList<String>() {
            {
                add("amleth");
                add("hamlet");
            }
        }, result.get(0));

        assertEquals(new ArrayList<String>() {
            {
                add("dirty room");
                add("dormitory");
            }
        }, result.get(1));

        assertEquals(new ArrayList<String>() {
            {
                add("listen");
                add("silnet");
                add("tinsel");
            }
        }, result.get(2));

        assertEquals(new ArrayList<String>() {{
            add("pear");
        }}, result.get(3));
    }
}