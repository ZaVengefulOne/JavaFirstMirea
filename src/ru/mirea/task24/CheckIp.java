package ru.mirea.task24;

public class CheckIp {
    public boolean regular(String str) {
        String reg = "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
        return str.matches(reg);
    }

    public static void main(String[] args) {
        String[] s = new String[4];
        s[0] = "127.0.0.1";
        s[1] = "255.255.255.0";
        s[2] = "1300.6.7.8";
        s[3] = "abc.def.gha.bcd";
        CheckIp ip = new CheckIp();
        for (int i = 0; i < s.length; i++) {
            if (ip.regular(s[i]))
                System.out.println("The string => '" + s[i] + "' is an IP address.");
            else
                System.out.println("The string => '" + s[i] + "' is not an IP address.");
        }
    }
}