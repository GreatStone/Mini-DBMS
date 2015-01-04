package DBMS.util;

import java.io.*;
import java.nio.charset.Charset;

public class BinaryFileIOTool {
	private static Object lockObj = new Object();

	public static void writeInt(int value, OutputStream os) {
		synchronized (lockObj) {
			// System.out.println("Out int " + value);
			byte bt = 0;
			byte mask = (byte) 0xFF;
			for (int i = 0; i < Integer.SIZE / 8; i++) {
				bt = (byte) (mask & value);
				try {
					os.write(bt);
				} catch (IOException e) {
					e.printStackTrace();
				}
				value >>= 8;
			}
		}
	}

	public static void writeLong(long value, OutputStream os) {
		synchronized (lockObj) {
			// System.out.println("Out long " + value);
			byte bt = 0;
			byte mask = (byte) 0xFF;
			for (int i = 0; i < Long.SIZE / 8; i++) {
				bt = (byte) (mask & value);
				try {
					os.write(bt);
				} catch (IOException e) {
					e.printStackTrace();
				}
				value >>= 8;
			}
		}
	}

	public static void writeDouble(double value, OutputStream os) {
		synchronized (lockObj) {
			// System.out.println("Out double " + value);
			writeString(String.format("%.6f", value), os);
		}
	}

	public static void writeString(String value, OutputStream os) {
		synchronized (lockObj) {
			// System.out.println("Out String " + value);
			byte[] buffer;
			buffer = value.getBytes(Charset.forName("UTF-8"));
			// System.out.print("Out bytes: " + buffer.length);
			// for(int i = 0; i < buffer.length; i++) System.out.format(" %2x",
			// buffer[i]);
			// System.out.println();
			int len = buffer.length;
			writeInt(len, os);
			try {
				os.write(buffer, 0, len);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static int readInt(InputStream is) {
		synchronized (lockObj) {
			int value = 0;
			for (int i = 0; i < Integer.SIZE / 8; i++) {
				try {
					value |= (is.read() << (i * 8));
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			// System.out.println("Read int " + value);
			return value;
		}
	}

	public static long readLong(InputStream is) {

		synchronized (lockObj) {
			long value = 0;
			for (int i = 0; i < Long.SIZE / 8; i++) {
				try {
					value |= ((long) (is.read()) << (i * 8));
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return value;
		}
	}

	public static double readDouble(InputStream is) {
		synchronized (lockObj) {
			String s = readString(is);
			return Double.parseDouble(s);
		}
	}

	public static String readString(InputStream is) {
		synchronized (lockObj) {
			int len = readInt(is);
			// System.out.println("Read String Len " + len);
			byte[] buffer = new byte[len + 10];
			try {
				is.read(buffer, 0, len);
			} catch (IOException e) {
				e.printStackTrace();
			}
			// System.out.println("Read String " + new String(buffer, 0, len,
			// Charset.forName("UTF-8")));
			return new String(buffer, 0, len, Charset.forName("UTF-8"));
		}
	}
}
