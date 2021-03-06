package al132.atmrockhounding.compat.jei.analyzer;

import java.util.ArrayList;
import java.util.List;

import al132.atmrockhounding.recipes.ModRecipes;
import al132.atmrockhounding.recipes.machines.MineralAnalyzerRecipe;

public class AnalyzerRecipeMaker {

	private AnalyzerRecipeMaker() {
	}

	public static List<AnalyzerRecipeWrapper> getRecipes() {
		List<AnalyzerRecipeWrapper> recipes = new ArrayList<>();
		for (MineralAnalyzerRecipe recipe : ModRecipes.analyzerRecipes) {
			recipes.add(new AnalyzerRecipeWrapper(recipe));
		}
		return recipes;
	}
}