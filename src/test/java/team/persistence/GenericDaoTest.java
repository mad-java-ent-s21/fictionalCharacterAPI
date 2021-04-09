package team.persistence;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import team.util.Database;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

 /**
 * This class tests the character dao
 * @author whurd
 */
 public class GenericDaoTest {

    GenericDao<Character> dao;

    /**
     * Run set up tasks before each test:
     * 1. execute sql which deletes everything from the table and inserts records)
     * 2. Create any objects needed in the tests
     */
    @BeforeEach
    void setUp() {

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");

        dao = new GenericDao<>();
    }

    /**
     * Verify successful retrieval of a Character
     */
    @Test
    void getByIdSuccess() {

        Character retrievedCharacter = dao.getById(1);
        assertNotNull(retrievedCharacter);
       // assertEquals("Gandalf", retrievedCharacter.getName());


    }

    /**
     * Verify successful insert of a Character
     */
    @Test
    void insertSuccess() {
        /*Character newCharacter = new Character("1", "2", "3", "4", "5");


        int id = dao.insert(newCharacter);
        assertNotEquals(0, id);
        Character insertedCharacter = dao.getById(id);
        assertEquals(newCharacter, insertedCharacter);*/

    }
    /**
     * Verify successful update of a Character
     */
    @Test
    void updateSuccess() {

      /*  Character characterToUpdate = dao.getById(1);
        characterToUpdate.setName("mithrandir");
        dao.saveOrUpdate(characterToUpdate);
        Character characterAfterUpdate = dao.getById(1);
        assertEquals(characterToUpdate, characterAfterUpdate);*/
    }

    /**
     * Verify successful delete of Character
     */
    @Test
    void deleteSuccess() {

        dao.delete(dao.getById(3));
        assertNull(dao.getById(3));

    }

    /**
     * Verify successful retrieval of all Characters
     */
    @Test
    void getAllSuccess() {
        List<Character> characters = dao.getAll();
        assertEquals(4, characters.size());
    }
}


