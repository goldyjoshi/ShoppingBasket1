import com.company.ItemAndQyt;
import com.company.Shop;
import com.company.ShoppingBasket;
import org.junit.Assert;
import org.junit.Test;

public class TestShoppingBasket {
    private static final String itemName = "Dal";
    private static final Double itemPrice = 2.0;
    private static final Integer itemQty = 3;
    private static final String memberId = "233";
    private static final String memberName = "Dally";

    ItemAndQyt itemAndQyt = new ItemAndQyt(itemName,itemPrice,itemQty);
    Shop shop = new Shop("Co op","old Rutherglen road",true);
    ShoppingBasket shoppingBasket =new ShoppingBasket(shop);

    @Test
    public void testAddItemAndQuantity() {
        assert shoppingBasket.getItemAndQtyShoppingBasket().size() == 0;
        shoppingBasket.addItemAndQuantity(itemName,itemQty);
        assert shoppingBasket.getItemAndQtyShoppingBasket().size() == 1;

        assert itemAndQyt.getItemQuantity().equals(itemAndQyt);
        shoppingBasket.addItemAndQuantity(itemName,itemQty);
        assert !itemAndQyt.getItemQuantity().equals(itemAndQyt);
    }

    @Test
    public void testTotalCostOfItemOfShopping() {
         final Double expectedCost =  itemPrice*itemQty;
         final Double actualCost = shoppingBasket.totalCostOfItemOfShopping(itemQty);
        Assert.assertEquals("Expected cost and Actual cost are not equal", expectedCost,actualCost);
    }

    @Test
    public void testEmptyShoppingBasket() {
//        assert shoppingBasket.getItemAndQtyShoppingBasket().size() != 0;
        shoppingBasket.addItemAndQuantity(itemName,itemQty);
//        assert shoppingBasket.getItemAndQtyShoppingBasket().size() == 1;
        shoppingBasket.emptyShoppingBasket();
        assert shoppingBasket.getItemAndQtyShoppingBasket().size() ==0;

    }
}
