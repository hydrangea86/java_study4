package com.kh.hw.member.run;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;
import com.kh.hw.member.view.MemberMenu;

import java.util.Arrays;

public class Run {

    public static void main(String[] args) {
        MemberController mc = new MemberController();
/**
        Member[] members = mc.searchName("김철수");
        for (Member member : members) {
            String inform = member.inform();
            System.out.println(inform);
        }
 */

/**
        mc.delete("abc");

        Member[] members = mc.printAll();
        System.out.println(Arrays.toString(members));
        */

        MemberMenu mm = new MemberMenu();
        mm.mainMenu();

    }
}
