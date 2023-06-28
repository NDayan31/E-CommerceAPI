package org.yearup.data.mysql;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.yearup.configuration.TestDatabaseConfig;
import org.yearup.models.Category;

import static org.junit.jupiter.api.Assertions.*;

class MySqlCategoryDaoTest extends BaseDaoTestClass {

    private MySqlCategoryDao dao;

    @BeforeEach
    public void setUp() { dao = new MySqlCategoryDao(dataSource);}

    @Test
    public void getById_shouldReturn_correctCategory () {

        //arrange
        int categoryId = 3;
        Category expected = new Category();
        {{
            
        }}

        // act
        // assert
    }

}
