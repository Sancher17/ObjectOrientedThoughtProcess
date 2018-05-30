public class PizzaShop extends Shop implements Nameable {
String companyName;
String[] foodOfferings = {
"Пицца",
"Спагетти",
"Овощной салат",
"Антипасто",
"Кальцоне"
}
public String[] getInventory() {
return foodOfferings;
}

public void buyInventory(String item) {
System.out.println("\nВы только что приобрели " + item);
}
public String getName(){
return companyName;
}
public void setName(String name){
companyName = name;
}
}
