package com.sun.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Chris on 2016/9/17.
 */
public class Server {
    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter pw = null;
        try {
            ServerSocket server = new ServerSocket(2000);
            Socket socket = server.accept();
            //获取输入流
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            //获取输出流
            pw = new PrintWriter(socket.getOutputStream(), true);
            String s = br.readLine(); // 获取接收的数据
            pw.println(s); //发送相同的数据给客户端
        }catch (Exception e) {
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
