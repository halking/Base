package com.hal.io.nio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.zip.CRC32;

import com.hal.util.FileUtils;

public class NioDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
	String path = "D:\\tmp\\net.txt";
    System.out.println("input stream  start.......");
    long start  = System.currentTimeMillis();
    long c = checkInputStream(path);
    long  end = System.currentTimeMillis();
    System.out.println(c);
    System.out.println("用时： "+(end-start)+ "   milliseconds \n");
    
    System.out.println("Buffered input stream  start.......");
    start  = System.currentTimeMillis();
     c = checkBufferedIs(path);
     end = System.currentTimeMillis();
    System.out.println(Long.toHexString(c));
    System.out.println("用时： "+(end-start)+"  milliseconds \n");
    
    System.out.println("random access file  start.......");
    start  = System.currentTimeMillis();
     c = checkRandomAccessFile(path);
     end = System.currentTimeMillis();
    System.out.println(Long.toHexString(c));
    System.out.println("用时： "+(end-start)+"  milliseconds\n");
    
    System.out.println("mapped file  start.......");
     start  = System.currentTimeMillis();
     c = checkMappedFile(path);
      end = System.currentTimeMillis();
    System.out.println(Long.toHexString(c));
    System.out.println("用时： "+(end-start)+"  milliseconds ");
	}

	public static long checkInputStream(String path) throws IOException {
		CRC32 crc32 = new CRC32();
		int c;
		try {
			InputStream is = new FileInputStream(path);
			while ((c = is.read()) != -1)
				crc32.update(c);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return crc32.getValue();
	}

	public static long checkBufferedIs(String path) throws IOException {
		InputStream is = new BufferedInputStream(new FileInputStream(path));
		CRC32 crc32 = new CRC32();
		int c;
		while ((c = is.read()) != -1)
			crc32.update(c);
		return crc32.getValue();
	}

	public static long checkRandomAccessFile(String path) throws IOException {
		RandomAccessFile  file  = new RandomAccessFile(path, "r");
		CRC32 crc32 = new CRC32();
       for (long i = 0; i < file.length(); i++) {
		 file.seek(i);
		 int c = file.readByte();
		 crc32.update(c);
	}
		return crc32.getValue();
	}

	public static long checkMappedFile(String path)  throws IOException {
       FileInputStream  is  = new FileInputStream(path);
       FileChannel channel = is.getChannel();
       
       CRC32 crc32 = new CRC32();
       
       int length = (int)channel.size();
       MappedByteBuffer  buffer = channel.map(FileChannel.MapMode.READ_ONLY, 0, length);
       
       for (int i = 0; i < length; i++) {
		int c = buffer.get(i);
		crc32.update(c);
	}
       return  crc32.getValue();
	}

}
