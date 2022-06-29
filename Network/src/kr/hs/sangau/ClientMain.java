package kr.hs.sangau;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

public class ClientMain {
    public static void main(String[] args) throws Exception{
        InetAddress inetaddr = InetAddress.getByName("10.80.163.255");

        DatagramSocket ds = new DatagramSocket();

        for (int i = 1; i <= 1000; i++) {
            String str =    "██████████▀▀▀▀▀▀▀▀▀▀▀▀▀██████████\n" +
                            "█████▀▀░░░░░░░░░░░░░░░░░░░▀▀█████\n" +
                            "███▀░░░░░░░░░░░░░░░░░░░░░░░░░▀███\n" +
                            "██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██\n" +
                            "█░░░░░░▄▄▄▄▄▄░░░░░░░░▄▄▄▄▄▄░░░░░█\n" +
                            "█░░░▄██▀░░░▀██░░░░░░██▀░░░▀██▄░░█\n" +
                            "█░░░██▄░░▀░░▄█░░░░░░█▄░░▀░░▄██░░█\n" +
                            "██░░░▀▀█▄▄▄██░░░██░░░██▄▄▄█▀▀░░██\n" +
                            "███░░░░░░▄▄▀░░░████░░░▀▄▄░░░░░███\n" +
                            "██░░░░░█▄░░░░░░▀▀▀▀░░░░░░░█▄░░░██\n" +
                            "██░░░▀▀█░█▀▄▄▄▄▄▄▄▄▄▄▄▄▄▀██▀▀░░██\n" +
                            "███░░░░░▀█▄░░█░░█░░░█░░█▄▀░░░░███\n" +
                            "████▄░░░░░░▀▀█▄▄█▄▄▄█▄▀▀░░░░▄████\n" +
                            "███████▄▄▄▄░░░░░░░░░░░░▄▄▄███████\n";
            String j = Integer.toString(i);
            DatagramPacket sendPacket =
                    new DatagramPacket(str.getBytes(), str.getBytes().length, inetaddr, 6974);
            ds.send(sendPacket);
        }
    }
}
