package TEST;

import java.util.Arrays;
import java.util.Scanner;

public class _09_MemberMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean run = true;
        _09_Member[] member = new _09_Member[0];
        int count = 0;

        while (run) {
            System.out.println();
            System.out.println("======================================");
            System.out.println("1. 정보입력 2. 정보출력 3. 정보수정 4. 종료");
            System.out.println("======================================");
            System.out.print("메뉴 선택 : ");
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    member=Arrays.copyOf(member,member.length+1);
                    _09_Member mem = new _09_Member();
                    System.out.println(member.length + "번째 정보 입력");
                    System.out.print("ID 입력 : ");
                    mem.setId(sc.next());
                    if (member.length > 1) {
                        count = member.length - 1;
                        while (count != 0) {
                            count = member.length - 1;
                            for (int i = 0; i < member.length - 1; i++) {
                                if (!mem.getId().equals(member[i].getId())) {
                                    count--;
                                }
                            }
                            if (count != 0) {
                                System.out.println("동일한 ID가 존재합니다 다시 입력하세요");
                                System.out.print("ID 입력 : ");
                                mem.setId(sc.next());
                            }
                        }
                    }
                    System.out.print("PW 입력 : ");
                    mem.setPw(sc.next());
                    System.out.print("NAME 입력 : ");
                    mem.setName(sc.next());
                    System.out.print("BIRTH 입력 : ");
                    mem.setBirth(sc.next());
                    System.out.print("EMAIL 입력 : ");
                    mem.setEmail(sc.next());
                    System.out.print("PHONE 입력 : ");
                    mem.setPhone(sc.next());
                    member[member.length-1]=mem;
                    break;
                case 2:
                    for (int i = 0; i < member.length; i++) {
                        System.out.println(member[i].toString());
                    }
                    break;
                case 3:
                    count=0;

                    while (count == 0) {
                        int count2 = 0;
                        System.out.print("ID 입력 : ");
                        String input = sc.next();
                        for (int i = 0; i < member.length; i++) {
                            if (input.equals(member[i].getId())) {
                                while (count2 == 0) {
                                    System.out.print("PW 입력 : ");
                                    input = sc.next();
                                    if (input.equals(member[i].getPw())) {
                                        System.out.print("NAME 입력 : ");
                                        member[i].setName(sc.next());
                                        System.out.print("BIRTH 입력 : ");
                                        member[i].setBirth(sc.next());
                                        System.out.print("EMAIL 입력 : ");
                                        member[i].setEmail(sc.next());
                                        System.out.print("PHONE 입력 : ");
                                        member[i].setPhone(sc.next());
                                        count++;
                                        count2++;
                                    }
                                    if (count2 == 0) {
                                        System.out.println("패스워드를 확인해 주세요");
                                    }
                                }

                            }
                        }
                        if (count == 0) {
                            System.out.println("일치하는 ID가 존재하지 않습니다");
                        }

                    }
                    break;
                case 4:
                    System.out.println("이용해 주셔서 감사합니다");
                    run = false;
                    break;
                default:
                    System.out.println("잘못 입력했습니다 다시 입력하세요");
                    break;

            }

        }

    }
}
