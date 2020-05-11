package com.willlee.practice.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.util.concurrent.TimeUnit;

public class SimpleDatagramClient {
    private static final int PORT = 37;

    public static void main(String[] args) throws IOException, InterruptedException {
        DatagramChannel channel = DatagramChannel.open();
        int i = 0;
        while (true) {
            TimeUnit.SECONDS.sleep(1);
            ByteBuffer buffer = ByteBuffer.allocate(64);
            String str = "data from client " + i++;

            buffer.put(str.getBytes());
            InetSocketAddress sa = new InetSocketAddress("127.0.0.1", PORT);
            buffer.flip();
            channel.send(buffer, sa);
            System.out.println("send data :" + str);
        }
    }
}
