package model;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
	private List<Ingredient> ingredients;
	
	public Recipe() {
		ingredients = new ArrayList<>();
	}
	
	public void addIngredient(String n, double w) {
		Ingredient searched = null;
		for (int i = 0; i < ingredients.size() && searched==null; i++) {
			Ingredient current = ingredients.get(i);
			if(current.getName().equals(n)) {
				searched = current;
			}
		}
		//Si existe entonces solo se le añade el peso
		if(searched!=null) {
			searched.addWeight(w);
		}else {
			//Si no existe entonces se crea el ingrediente
			Ingredient newIngredient = new Ingredient(n, w);
			ingredients.add(newIngredient);
		}		
	}
	public void removeIngridient(String toRemove){
		boolean flag=true;
		for (int i = 0; i < ingredients.size() && flag; i++) {
			if(toRemove.equals(ingredients.get(i).getName())){
				ingredients.remove(i);
				flag=false;
			}
		}
	}

	public List<Ingredient> getIngredients(){
		return ingredients;
	}
}
