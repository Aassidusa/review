package com.cjw.demo.oop;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.List;

public class NioClient {



    public static void main(String[] args) {
//        try {
//            // 创建一个SocketChannel对象，并连接服务器
//            SocketChannel socketChannel = SocketChannel.open();
//            socketChannel.connect(new InetSocketAddress("localhost", 8080));
//
//            // 发送数据到服务器
//            String message = "Hello, server!";
//            ByteBuffer buffer = ByteBuffer.wrap(message.getBytes());
//            socketChannel.write(buffer);
//
//            // 接收来自服务器的响应
//            ByteBuffer responseBuffer = ByteBuffer.allocate(1024);
//            int bytesRead = socketChannel.read(responseBuffer);
//            String response = new String(responseBuffer.array(), 0, bytesRead);
//            System.out.println("Response from server: " + response);
//
//            // 关闭连接
//            socketChannel.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        List list = new ArrayList<>();

        list.add("1");
        list.add("2");
        List list1 = new ArrayList(list);
        list.add("3");
        System.out.println(list1.size());

    }
}
