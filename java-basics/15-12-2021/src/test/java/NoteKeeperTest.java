
import com.NoteKeeper.NoteKeeper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NoteKeeperTest {
    NoteKeeper noteKeeper = new NoteKeeper();

    @BeforeEach
    public void AddItemsToTheList() {
        noteKeeper.addItemsInToDoList("Send a parcel",true);
        noteKeeper.addItemsInToDoList("Prepare power point presentation",false);
        noteKeeper.addItemsInToDoList("Dance Practice",true);
        noteKeeper.addItemsInToDoList("Watch Movie",false);
    }


    @Test
    public void AddItemsToTodoListTest() {
        String actualList = noteKeeper.checkItemAddedInToDoList("Send a parcel");
        assertEquals("Send a parcel", actualList);
    }


    @Test
    public void RemoveItemsFromTodoListTest() {
        boolean actualList = noteKeeper.removeItemsFromToDoList("Prepare power point presentation");
        assertEquals(true, actualList);
    }


    @Test
    public void unRemoveItemsFromTodoListTest() {
        boolean actualList = noteKeeper.retrieveItemsFromRemovedList("Prepare power point presentation");
        assertEquals(true, actualList);
    }


    @Nested
    public class toggleBetweenCompletedAndNotCompletedTodoListTest {

        @Test
        public void checkIfTaskIsCompleted() {
            boolean actualList = noteKeeper.listOfItemsCompletedOrNotCompleted("Send a parcel");
            assertEquals(true, actualList);
        }

        @Test
        public void checkIfTaskIsNotCompleted() {
            boolean actualList = noteKeeper.listOfItemsCompletedOrNotCompleted("Prepare power point presentation");
            assertEquals(false, actualList);
        }
    }
}
