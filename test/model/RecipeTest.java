package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {

    private Recipe rece;

    public void setupStage1(){
        rece = new Recipe();
    }
    public void setupStage2(){
        rece = new Recipe();
        rece.addIngredient("Cebolla",315);
        rece.addIngredient("Ajo",58);
        rece.addIngredient("Arroz",520);
    }
    @Test
    public void addIngridientTest1(){
        setupStage1();
        rece.addIngredient("Sal",12);
        assertEquals(rece.getIngredients().get(0).getName(),"Sal");
        assertEquals(rece.getIngredients().get(0).getWeight(),12);
    }
    @Test
    public void addIngridientTest2(){
        setupStage2();
        rece.addIngredient("Pimienta",6);
        assertEquals(rece.getIngredients().get(3).getName(),"Pimienta");
        assertEquals(rece.getIngredients().get(3).getWeight(),6);
    }
    @Test
    public void addIngridientTest3(){
        setupStage2();
        rece.addIngredient("Ajo",21);
        //assertEquals(rece.getIngredients().get(4),null);
        assertEquals(rece.getIngredients().get(1).getWeight(),79);
    }
    @Test
    public void removeIngridientTest3(){
        setupStage2();
        rece.removeIngridient("Ajo");
        assertEquals(rece.getIngredients().size(),2);
        assertEquals(rece.getIngredients().get(0).getName(),"Cebolla");
        assertEquals(rece.getIngredients().get(1).getName(),"Arroz");
    }
}