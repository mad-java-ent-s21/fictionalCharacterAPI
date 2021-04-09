package team.util;

import team.persistence.GenericDao;

/**
 * Created by cvang on 3/31/2021.
 */
public class DaoFactory {


    private DaoFactory() {

    }

    public static GenericDao createDao(Class type) {
        return new GenericDao(type);
    }
}
