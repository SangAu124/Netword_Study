package kr.hs.dgsw.client.sangau;

import java.net.Socket;

public class ClientChattingMain {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        try {
            Socket sc = new Socket("10.80.162.206",5000);

            OutputMessage om = new OutputMessage(sc);
            om.start();

            InputMessage im = new InputMessage(sc);
            im.start();
        } catch(Exception e) {
            System.out.println("연결 종료");
            e.printStackTrace();
        }
    }

}
