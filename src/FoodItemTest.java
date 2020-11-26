import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FoodItemTest
{
    FoodItem foodItem;
    @BeforeEach
    void setUp() {
        foodItem = new FoodItem("soup", "tomato soup", 1,100,true,false, true, false, true, true, ItemType.STARTER);
        assertEquals(foodItem.getName(), "soup");
    }

    @Test
    void getName() {
    }

    @Test
    void setName() {
    }

    @Test
    void getDescription() {
    }

    @Test
    void setDescription() {
    }

    @Test
    void getPrice() {
    }

    @Test
    void setPrice() {
    }

    @Test
    void getCalories() {
    }

    @Test
    void setCalories() {
    }

    @Test
    void isVegetarian() {
    }

    @Test
    void setVegetarian() {
    }

    @Test
    void isVegan() {
    }

    @Test
    void setVegan() {
    }

    @Test
    void isGlutenfree() {
    }

    @Test
    void setGlutenfree() {
    }

    @Test
    void isDairyfree() {
    }

    @Test
    void setDairyfree() {
    }

    @Test
    void isKosher() {
    }

    @Test
    void setKosher() {
    }

    @Test
    void isHalal() {
    }

    @Test
    void setHalal() {
    }

    @Test
    void getItemType() {
    }
}