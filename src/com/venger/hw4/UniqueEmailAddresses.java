package com.venger.hw4;

/*
Каждый действительный адрес электронной почты состоит из местного имени и имени домена, разделенных знаком «@».
Помимо строчных букв, электронное письмо может содержать один или несколько символов "." или "+".
Учитывая массив строк электронных писем, где мы отправляем по одному электронному письму на каждое электронное письмо [i],
возвращаем количество разных адресов, которые фактически получают письма.
 */

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {

    public static int numUniqueEmails(String[] emails) {
        Set<String> emailSet = new HashSet<>();
        for (String email : emails) {
            emailSet.add(getLocal(email) + email.substring(email.indexOf("@")));
        }
        return emailSet.size();
    }

    private static String getLocal(String email) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '.') {
                continue;
            }
            if (email.charAt(i) == '+' || email.charAt(i) == '@') {
                break;
            }
            sb.append(email.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] emails1 = new String[]{"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        String[] emails2 = new String[]{"a@leetcode.com", "b@leetcode.com", "c@leetcode.com"};
        System.out.println(numUniqueEmails(emails1));
        System.out.println(numUniqueEmails(emails2));
    }
}