package kr.hs.sangau;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ServerMain {
    public static void main(String[] args) throws Exception{
        DatagramSocket ds = new DatagramSocket(6974);

        byte[] buffer = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(buffer, buffer.length);

        while (true) {
            ds.receive(receivePacket);

            String msg = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println(msg + " ");
        }

    }
}
