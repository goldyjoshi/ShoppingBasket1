package com.company;

import java.util.ArrayList;
import java.util.List;

public class MemberDetail {
    private String memberName;
    private String memberId;
    private List<String> listOfMember = new ArrayList<>();
    private String password;

    public MemberDetail(final String memberId, final String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public void addNewMemberInList(String memberName) {
        if (listOfMember.contains(memberName)) {
            System.out.println("Member already in list");
        } else {
            listOfMember.add(memberName);
            System.out.println("Member successfully added in list.");
        }
    }

    public List<String> getListOfMember() {
        return listOfMember;
    }

    public void setListOfMember(List<String> listOfMember) {
        this.listOfMember = listOfMember;
    }
}
