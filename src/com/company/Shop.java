package com.company;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shop {
        private Map<String, ItemAndQyt> nameOfItemAndQty = new HashMap<>();

    public List<MemberDetail> getListOfMember() {
        return listOfMember;
    }

    public void setListOfMember(List<MemberDetail> listOfMember) {
        this.listOfMember = listOfMember;
    }

    private String shopName;
        private String shopAddress;
        private boolean isRegistered;
    private List<MemberDetail> listOfMember = new ArrayList<>();

        public Shop(final String shopName, final String shopAddress, final boolean isRegistered) {
                this.shopName = shopName;
                this.shopAddress = shopAddress;
                this.isRegistered = false;
        }

        public Map<String, ItemAndQyt> getNameOfItemAndQty() {
            return nameOfItemAndQty;
        }

        public void setNameOfItemAndQty(Map<String, ItemAndQyt> nameOfItemAndQty) {
            this.nameOfItemAndQty = nameOfItemAndQty;
        }

    @Override
    public String toString() {
        return " Shop { " +
                " nameOfItemAndQty = " + nameOfItemAndQty + "\n" +
                " shopName =" + shopName + '\n' +
                " shopAddress = " + shopAddress + '\n' +
                "  isRegistered = " + isRegistered + "\n" +
                '}';
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public boolean isRegistered() {
        return isRegistered;
    }

    public void setRegistered(boolean registered) {
        isRegistered = registered;
    }

    public void addItemAndQty (final String name, final ItemAndQyt itemAndQty) {
            if(!nameOfItemAndQty.containsKey(name)) {
                nameOfItemAndQty.put(name,itemAndQty);
                System.out.println(nameOfItemAndQty);
            } else {
                Integer quantity = nameOfItemAndQty.get(name).getItemQuantity() + itemAndQty.getItemQuantity();
                System.out.println(quantity);
            }
        }

        public void loadInitialStock() {
            addItemAndQty("Rice", new ItemAndQyt("Rice",2.5,3));
            System.out.println("\n");
            addItemAndQty("Pasta", new ItemAndQyt("Pasta",2.0,10));
            System.out.println("\n");
            addItemAndQty("Soup", new ItemAndQyt("Soup",1.0,20));
            System.out.println("\n");
            addItemAndQty("Red Lentil", new ItemAndQyt("Red Lentil",1.5,3));
            System.out.println("\n");
        }

        public ItemAndQyt itemAndQytByName (final String name) {
            ItemAndQyt itemStatus = null;
            if (nameOfItemAndQty.containsKey(name)) {
                itemStatus = nameOfItemAndQty.get(name);
                System.out.println("\n" + " Following item present in the shop" + itemStatus);
            }
            return itemStatus;
        }

    public void addNewMemberInList(MemberDetail name) {
        if (listOfMember.contains(name)) {
            System.out.println("Please Login");
        } else {
            listOfMember.add(name);
            System.out.println("Member successfully registered");
        }
    }

    public boolean login(String memberId, String password) {
        for (MemberDetail name : listOfMember) {
            if (name.getMemberName().equals(memberId) && name.getPassword().equals(password)) {
                System.out.println("successfully login");
                return true;
            }
        }
        return  false;
    }





}


