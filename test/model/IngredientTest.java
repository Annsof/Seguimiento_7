package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IngredientTest {

    private Ingredient ingri;
    public void setupStage1(){
        ingri = new Ingredient("Tomate",245);
    }
    @Test
    public void addWeightTest1(){
        setupStage1();
        ingri.addWeight(54);
        assertEquals(299,ingri.getWeight());
    }
    @Test
    public void addWeightTest2(){
        setupStage1();
        try {
            ingri.addWeight(-100);
        }catch (NegativeArraySizeException ex){
            ex.printStackTrace();
        }
        assertEquals(245,ingri.getWeight());
    }
    @Test
    public void removeWeight1(){
        setupStage1();
        ingri.removeWight(45);
        assertEquals(200,ingri.getWeight());
    }
    @Test
    public void removeWeight2(){
        setupStage1();
        try {
            ingri.removeWight(-100);
        }catch (NegativeArraySizeException ex){
            ex.printStackTrace();
        }
        assertEquals(245,ingri.getWeight());
    }


}