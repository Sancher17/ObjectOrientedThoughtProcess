public class DonutShop extends Shop implements Nameable {
String companyName;

String[] menuItems = {
"Пончики",
"Маффины",
"Пирожное из слоеного теста",
"Кофе",
"Чай"
}
public String[] getInventory() {
return menuItems;
}
public void buyInventory(String item) {
System.out.println("\nВы только что приобрели" + item);
}
public String getName(){
return companyName;
}
public void setName(String name){
companyName = name;
}
}
