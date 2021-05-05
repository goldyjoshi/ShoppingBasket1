import com.company.MemberDetail;
import org.junit.Assert;
import org.junit.Test;

public class TestMemberDetail {
    MemberDetail memberDetail = new MemberDetail("1234","Himansh");

    @Test
    public void testMemberName() {
        final String expectedName = "Himansh";
        memberDetail.setMemberName(expectedName);
        final String actualName = memberDetail.getMemberName();
        Assert.assertEquals("Expected and actual name of member are different.",expectedName,actualName);
    }


    @Test
    public void testMemberId() {
        final String expectedId = "25636";
        memberDetail.setMemberId(expectedId);
        final String actualId = memberDetail.getMemberId();
        Assert.assertEquals("Expected and actual id of member are different.",expectedId,actualId);
    }

    @Test
    public void testListOfMember() {
        assert memberDetail.getListOfMember().size() == 0;
        memberDetail.addNewMemberInList("Himansh");
        assert memberDetail.getListOfMember().size() == 1;

        //check if already available then method will not add
        memberDetail.addNewMemberInList("Himansh");
        assert memberDetail.getListOfMember().size() == 1;
    }
}
