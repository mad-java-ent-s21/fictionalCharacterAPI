package team.persistence;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import team.entity.Character;
import team.testUtil.Database;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

 /**
 * This class tests the character dao
 * @author whurd
 */
 public class GenericDaoTest {

     GenericDao dao;

    /**
     * Run set up tasks before each test:
     * 1. execute sql which deletes everything from the table and inserts records)
     * 2. Create any objects needed in the tests
     */
    @BeforeEach
    void setUp() {

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");


        dao = new GenericDao(Character.class);
    }

    /**
     * Verify successful retrieval of a Character by name
     */
    @Test
    void getByNameSuccess() {
        List<Character>  characterList = dao.findByPropertyEqual("name", "Gandalf");
        for (Character retrievedCharacter: characterList) {

            assertEquals("Gandalf", retrievedCharacter.getName());
        }



    }

     @Test
     void getByIdSuccess() {

         Character retrievedCharacter = (Character) dao.getById(1);
//        assertNotNull(retrievedCharacter);
         assertEquals("Gandalf", retrievedCharacter.getName());


     }

    /**
     * Verify successful insert of a Character
     */
    @Test
    void insertSuccess() {
//        Character newCharacter = new Character("Spawn", "Comic", "Spawn", "Hellspawn", "Neutral");
//
//        int id = dao.insert(newCharacter);
//        assertNotEquals(0, id);
//        Character insertedCharacter = (Character) dao.getById(id);
//        assertEquals(newCharacter, insertedCharacter);

        Character newCharacter;
        newCharacter = new Character("Spawn", "Comic", "Spawn", "Hellspawn", "Neutral");
        int id = dao.insert(newCharacter);
        assertNotEquals(0,id);
        Character insertedCharacter = (Character) dao.getById(id);
        assertEquals(id, insertedCharacter.getId());
        assertEquals("Spawn", insertedCharacter.getName());

    }
    /**
     * Verify successful update of a Character
     */
    @Test
    void updateSuccess() {

//        Character characterToUpdate = (Character) dao.getById(1);
//        characterToUpdate.setName("mithrandir");
//        dao.saveOrUpdate(characterToUpdate);
//        Character characterAfterUpdate = (Character) dao.getById(1);
//        assertEquals(characterToUpdate, characterAfterUpdate);

        String newName = "Harry Wizard";

        Character userUpdate = (Character) dao.getById(1);
        userUpdate.setName(newName);
        dao.saveOrUpdate(userUpdate);
        Character retrieveUser = (Character) dao.getById(1);
        assertEquals(newName, retrieveUser.getName());
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


