package org.yearup.data.mysql;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.yearup.models.Category;

import static org.junit.jupiter.api.Assertions.*;

class MySqlCategoryDaoTest extends BaseDaoTestClass {

    private MySqlCategoryDao dao;

    @BeforeEach
    public void setUp() {
        dao = new MySqlCategoryDao(dataSource);
    }

    @Test
    public void getById_shouldReturn_correctCategory () {

        //arrange
        int categoryId = 3;

        Category expected = new Category()
        {{
            setCategoryId(3);
            setName("Home & Kitchen");
            setDescription("Find everything you need to decorate and equip your home.");
        }};

        // act
        var actual = dao.getById(categoryId);

        // assert
        assertEquals(expected.getName(), actual.getName(), "Just to make sure the ID entered is the ID expected");
    }

}
