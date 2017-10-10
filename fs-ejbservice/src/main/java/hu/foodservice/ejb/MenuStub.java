package hu.foodservice.ejb;

import java.util.ArrayList;
import java.util.List;

public class MenuStub {
	
	private String menuName;
	
	private List<MealStub> includedMeals;
	
	private Integer price;
	
	private Boolean isGeneric;
	
	public MenuStub() {		
		MealStub meal1 = new MealStub();
		MealStub meal2 = new MealStub();
		meal1.setMealName("DebugMeal1");
		meal1.setMealDescription("Only a technical meal for debugging purposes.");
		meal1.setIsAllergic(false);
		meal1.setPrice(600);
		
		meal2.setMealName("DebugMeal2");
		meal2.setMealDescription("Only a technical meal for debugging purposes.");
		meal2.setIsAllergic(true);
		meal2.setPrice(500);
		
		this.includedMeals = new ArrayList<MealStub>();
		
		this.price=1000;
		this.isGeneric=true;
		this.menuName="Generic Menu For Debugging";
		this.includedMeals.add(meal1);
		this.includedMeals.add(meal2);
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public List<MealStub> getIncludedMeals() {
		return includedMeals;
	}

	public void setIncludedMeals(List<MealStub> includedMeals) {
		this.includedMeals = includedMeals;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Boolean getIsGeneric() {
		return isGeneric;
	}

	public void setIsGeneric(Boolean isGeneric) {
		this.isGeneric = isGeneric;
	}
}
