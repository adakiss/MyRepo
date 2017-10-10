package hu.foodservice.ejb;

public class MealStub {
	
	String mealName;
	
	String mealDescription;
	
	Boolean isAllergic;
	
	Integer price;

	public String getMealName() {
		return mealName;
	}

	public void setMealName(String mealName) {
		this.mealName = mealName;
	}

	public String getMealDescription() {
		return mealDescription;
	}

	public void setMealDescription(String mealDescription) {
		this.mealDescription = mealDescription;
	}

	public Boolean getIsAllergic() {
		return isAllergic;
	}

	public void setIsAllergic(Boolean isAllergic) {
		this.isAllergic = isAllergic;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
}
