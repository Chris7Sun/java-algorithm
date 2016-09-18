package com.sun.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by Chris on 2016/9/17.
 */
public class Client {
    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter pw = null;
        try {
            Socket socket = new Socket("localhost", 2000);
            //获取输入流与输出流
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            pw = new PrintWriter(socket.getOutputStream(), true);
            //向服务器发送数据
            pw.println("hello");
            String s = null;
            while (true) {
                s = br.readLine();
                if (s != null)
                    break;
            }
            System.out.println(s);
        } catch (UnknownHostException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }finally {
            try {
                br.close();
                pw.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
