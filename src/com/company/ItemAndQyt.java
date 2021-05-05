package com.company;

public class ItemAndQyt {

        private String itemName;
        private Double itemPrice;
        private Integer itemQuantity;

        public ItemAndQyt(final String name, final Double price, final Integer quantity) {
            this.itemName = name;
            this.itemPrice = price;
            this.itemQuantity = quantity;
        }

        @Override
        public String toString() {
            return " \nItemAndQty {" + "\n" +
                    " name = " + itemName + '\n' +
                    " price = " + itemPrice + "\n" +
                    " quantity = " + itemQuantity + "\n" +
                    '}' + "\n";
        }

        public void printDetails() {
            System.out.println("\nDetails are:" + toString() + "\n");
        }

        public String getItemName() {
            return itemName;
        }

        public void setItemName(String itemName) {
            this.itemName = itemName;
        }

        public Double getItemPrice() {
            return itemPrice;
        }

        public void setItemPrice(Double itemPrice) {
            this.itemPrice = itemPrice;
        }

        public Integer getItemQuantity() {
            return itemQuantity;
        }

        public void setItemQuantity(Integer itemQuantity) {
            this.itemQuantity = itemQuantity;
        }

        public Double costOfItem(Integer quantity) {
            Double totalCostOfItem = this.itemPrice * quantity;
            System.out.println(totalCostOfItem);
            return totalCostOfItem;
        }


    }


