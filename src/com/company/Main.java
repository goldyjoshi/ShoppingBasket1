package com.company;

public class Main {

    public static void main(String[] args) {
	ItemAndQyt itemAndQyt = new ItemAndQyt("Rice",2.0,5);
	Shop shop = new Shop("Kesar Food", ")\2 37 queen elizabeth garden", true);
	ShoppingBasket shoppingBasket =new ShoppingBasket(shop);
	itemAndQyt.setItemQuantity(2);
	itemAndQyt.getItemQuantity();
	itemAndQyt.toString();
	itemAndQyt.costOfItem(2);
	shop.addItemAndQty("PasTA",itemAndQyt);
	shop.itemAndQytByName("rice");
	shop.loadInitialStock();
	shoppingBasket.totalCostOfItemOfShopping(4);
	shoppingBasket.addItemAndQuantity("Pasta",2);
	shoppingBasket.addItemAndQuantity("REd Lentil",3);
	shoppingBasket.emptyShoppingBasket();
	MemberDetail goldy = new MemberDetail("233", "goldy");
	MemberDetail nilesh = new MemberDetail("345","nilesh");
	shop.addNewMemberInList(goldy);
	shop.addNewMemberInList(nilesh);
	shop.setShopName("Krishna");
		System.out.println(shop.getShopName());


    }

}
