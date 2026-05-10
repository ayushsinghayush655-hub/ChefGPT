import java.util.List;
import java.util.stream.Collectors;

// 1. Data Models
record Nutrition(int calories, String protein) {}

record Recipe(
    String id,
    String title,
    List<String> ingredients,
    List<String> steps,
    Nutrition nutrition,
    List<String> tags
) {}

record FilterOptions(boolean vegOnly, boolean kettleOnly) {}

// 2. The Filter Logic
class RecipeFilter {
    public static List<Recipe> filterRecipes(List<Recipe> recipes, FilterOptions filters) {
        return recipes.stream()
            .filter(recipe -> {
                List<String> safeTags = recipe.tags().stream()
                    .map(String::toLowerCase)
                    .collect(Collectors.toList());

                if (filters.vegOnly() && !safeTags.contains("vegetarian")) {
                    return false;
                }

                if (filters.kettleOnly() && !safeTags.contains("kettle")) {
                    return false;
                }

                return true;
            })
            .collect(Collectors.toList()); 
    }
}
