import com.company.ItemAndQyt;
import com.company.MemberDetail;
import com.company.Shop;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestItemAndQty {
    private static final String itemName = "Dal";
    private static final Double itemPrice = 2.0;
    private static final Integer itemQty = 3;
    private static final String memberId = "233";
    private static final String memberName = "Dally";



    ItemAndQyt itemAndQyt = new ItemAndQyt(itemName,itemPrice,itemQty);
    Shop shop = new Shop("kesar", "0/6,gorbals",false);
    MemberDetail dally = new MemberDetail(memberId,memberName);

    @Test
    public void testSetAndGetItemName() {
        final String expectedItemName = "Rice";
        itemAndQyt.setItemName(expectedItemName);
        final String actualIemNAme = itemAndQyt.getItemName();
        Assert.assertEquals("Actual and expected name are not same.",expectedItemName,actualIemNAme);
    }

    @Test
    public void testCostOfItem() {
        final Double expectedCost = itemQty * itemAndQyt.getItemPrice();
        final Double actualCost = itemAndQyt.costOfItem(itemQty);
        Assert.assertEquals("Actual and expected cost are not same.",expectedCost,actualCost);
    }
//
//    public void testIsRegistered() {
//        final boolean expectedRegistered = false;
//
//        assert shop.setRegistered(expectedRegistered) = true;
//
//        assert !shop.isRegistered();
//    }



    @Test
    public void testShopIsRegistered() {
        final boolean expectedRegistered = false;
        shop.setRegistered(expectedRegistered);
        final boolean actualRegistered = shop.isRegistered();
        Assert.assertTrue("Expected registered and actual registered are  not same.", expectedRegistered == actualRegistered);

    }

    @Test
    public void testAddMemberInList() {
        assert shop.getListOfMember().size() == 0;
        shop.addNewMemberInList(dally);
        assert shop.getListOfMember().size() == 1;

        // check same member can't be added again.
        shop.addNewMemberInList(dally);
        assert shop.getListOfMember().size() == 1;
    }

    @Test
    public void testAddItemAndQty(){
        assert shop.getNameOfItemAndQty().size() == 0;
        shop.addItemAndQty(itemName,itemAndQyt);
        assert shop.getNameOfItemAndQty().size() == 1;
        // check same item can't be added again
        shop.addItemAndQty(itemName,itemAndQyt);
        Integer expectedQuantity = itemAndQyt.getItemQuantity() + itemAndQyt.getItemQuantity();
        assert shop.getNameOfItemAndQty().get(itemName).getItemQuantity() == expectedQuantity ;
    }

    @Test
    public void testItemAndQtyByName() {
        shop.addItemAndQty(itemName,itemAndQyt);
        itemAndQyt.getItemName();
        shop.itemAndQytByName(itemName);
    }

    @Test
    public void testLogin() {
//        assert shop.getListOfMember().size() != 0;
        assert  shop.login(memberId, dally.getPassword()) == false;
        Assert.assertEquals(shop.getListOfMember().contains(memberName), dally.getListOfMember().contains(memberId));
        assert  shop.login(memberId, dally.getPassword()) == true;
    }
}
