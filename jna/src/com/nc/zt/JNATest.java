package com.nc.zt;

import java.nio.ShortBuffer;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.NativeLong;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.ShortByReference;

public class JNATest {

	// 定义接口CLibrary，继承自com.sun.jna.Library
	public interface JNATestDll extends Library {
		// msvcrt为dll名称,msvcrt目录的位置为:C:\Windows\System32下面,
//		testdll Instance = (testdll) Native.loadLibrary((Platform.isWindows() ? "msvcrt" : "c"),
//				testdll.class);
		JNATestDll Instance = (JNATestDll) Native.loadLibrary("dll5/MyDLL", JNATestDll.class);
		// printf为msvcrt.dll中的一个方法.
		
		public long ZT7660_AIFifoEx(int cardNO, int wantReadCount, ShortByReference pResultArr);
		
		public long ZT7660_AIFifoEx(int cardNO, int wantReadCount, short[] pResultArr);
		
		public long ZT7660_AIFifoEx(int cardNO, int wantReadCount, ShortBuffer pResultArr);
		
		public long ZT7660_AIFifoEx(NativeLong cardNO, NativeLong wantReadCount, short[] pResultArr);
		
//		public long ZT7660_AIFifoEx(int cardNO, int wantReadCount);
		
		public void addPrt(int a, IntByReference ret);
		
		public void addShort(short a, ShortByReference ret);
		
		public void addShort2(int b, ShortByReference ret);
		
		public void addShort3(short b, ShortByReference ret);
		
		public long addShort4(short b, int a);
		
		public long addShort5(short b, long a);
		
		public long addShort6(int b, long a);
		
//		public long ZT7660_AIFifoEx(long cardNO, long wantReadCount, byte[] pResultArr);
		
//		public long ZT7660_AIFifoEx(long cardNO, long wantReadCount, PointerByReference pResultArr);
		
//		public long ZT7660_AIFifoEx(long cardNO, long wantReadCount, Pointer pResultArr);
		
//		public long ZT7660_AIFifoEx(long cardNO, long wantReadCount, short pResultArr);
	}

	public static void main(String[] args) {
		// 调用printf打印信息
		
//		System.setProperty("jna.protected","true");
		
//		short[] pResultArr = new short[1000];
		int wantReadCount = 1024;
		short[] pResultArr = new short[wantReadCount];
//		pResultArr[0] = (short)100;
//		byte[] pResultArr = new byte[1000];
		
//		PointerByReference pResultArr = new PointerByReference();
//		Pointer pResultArr = new Pointer(0);
		
//		ShortBuffer pResultArr = ShortBuffer.allocate(512);
//		short[] arr = new short[10];
//		ShortBuffer pResultArr = ShortBuffer.wrap(arr);
//		ShortByReference pResultArr = new ShortByReference();
//		Memory m = new Memory(10);
//		m.write(bOff, buf, index, length);
//		pResultArr.setPointer(m);
		long i = JNATestDll.Instance.ZT7660_AIFifoEx(10, wantReadCount, pResultArr);
		for (int j = 0; j < pResultArr.length; j++) {
			System.out.print(pResultArr[j] + " ");			
		}
		System.out.println();
		i = JNATestDll.Instance.ZT7660_AIFifoEx(new NativeLong(10), new NativeLong(wantReadCount), pResultArr);
		for (int j = 0; j < pResultArr.length; j++) {
			System.out.print(pResultArr[j] + " ");			
		}
//		System.out.println(pResultArr.getValue() & 0xFF);
//		System.out.println(pResultArr[1]);
//		System.out.println(i & 0xFFFF);
//		System.out.println(JNATestDll.Instance);
//		System.out.println(new String[0]);
		
//		IntByReference ret = new IntByReference();
//		JNATestDll.Instance.addPrt(5, ret);
//		System.out.println(ret.getValue());
		
//		ShortByReference retShort = new ShortByReference();
//		JNATestDll.Instance.addShort((short) 7, retShort);
//		System.out.println(retShort.getValue());
		
//		ShortByReference retShort = new ShortByReference();
//		JNATestDll.Instance.addShort2((short)7, retShort);
//		System.out.println(retShort.getValue());
		
//		ShortByReference retShort = new ShortByReference();
//		JNATestDll.Instance.addShort3((short)7, retShort);
//		System.out.println(retShort.getValue());
		
//		System.out.println(0xFFFF & JNATestDll.Instance.addShort4((short)3, 4));
		
//		System.out.println(0xFFFF & JNATestDll.Instance.addShort5((short)3, 4));
		
//		System.out.println(0xFFFF & JNATestDll.Instance.addShort6((short)3, 4));
	}
}
