package com.company;
import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {
        private Shop shop;
        private Map<String, ItemAndQyt> itemAndQtyShoppingBasket;

        public ShoppingBasket(final Shop shop) {
            this.shop = shop;
            itemAndQtyShoppingBasket = new HashMap<>();
        }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public Map<String, ItemAndQyt> getItemAndQtyShoppingBasket() {
        return itemAndQtyShoppingBasket;
    }

    public void setItemAndQtyShoppingBasket(Map<String, ItemAndQyt> itemAndQtyShoppingBasket) {
        this.itemAndQtyShoppingBasket = itemAndQtyShoppingBasket;
    }

    public Integer addItemAndQuantity(final String name, final Integer quantity) {
            Integer quantityAdded = 0;
            ItemAndQyt itemAndQytInShop = shop.itemAndQytByName(name);
            if (itemAndQytInShop != null && itemAndQytInShop.getItemQuantity() >= quantity) {
                ItemAndQyt itemAndQytInBasket = new ItemAndQyt(name,itemAndQytInShop.getItemPrice(), quantity);
                itemAndQtyShoppingBasket.put(name, itemAndQytInBasket);
                Integer remainingQty = itemAndQytInShop.getItemQuantity() - quantity;
                itemAndQytInShop.setItemQuantity(remainingQty);
                quantityAdded = quantity;
            }
            System.out.println("\n" + quantityAdded);
            return quantityAdded;
        }

        public Double totalCostOfItemOfShopping(Integer quantity) {
            double totalCost = 0;
            for(String name : itemAndQtyShoppingBasket.keySet()) {
                totalCost = totalCost + itemAndQtyShoppingBasket.get(name).costOfItem(quantity);
            }
            System.out.println("\n" + totalCost);
            return totalCost;
        }

        public void emptyShoppingBasket() {
            itemAndQtyShoppingBasket.clear();
            System.out.println("No items in shopping basket." +"\n" + itemAndQtyShoppingBasket);
        }
}


