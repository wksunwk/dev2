package com.nc.leetro;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.NativeLong;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.LongByReference;

public class JNA {

	// 定义接口CLibrary，继承自com.sun.jna.Library
	public interface JNATestDll extends Library {
		// msvcrt为dll名称,msvcrt目录的位置为:C:\Windows\System32下面,
//		testdll Instance = (testdll) Native.loadLibrary((Platform.isWindows() ? "msvcrt" : "c"),
//				testdll.class);
//		JNATestDll Instance = (JNATestDll) Native.loadLibrary("dll/TestDll", JNATestDll.class);
//		JNATestDll Instance = (JNATestDll) Native.loadLibrary("dll/LC_PHLIBS", JNATestDll.class);
//		JNATestDll Instance = (JNATestDll) Native.loadLibrary("dll/TestDll32", JNATestDll.class);
//		JNATestDll Instance = (JNATestDll) Native.loadLibrary("dll/TPH_DLL", JNATestDll.class);
//		JNATestDll Instance = (JNATestDll) Native.loadLibrary("dll2/TestDll", JNATestDll.class);
		JNATestDll Instance = (JNATestDll) Native.loadLibrary("dll3/MPC07.dll", JNATestDll.class);
		// printf为msvcrt.dll中的一个方法.
//		void printf(String format, Object... args);
//		public void hello();
//		public int SumNumbers(int a, int b);
//		public void LC_Init();
//		public long LC_TPH_OpenDev();
//		public String LC_GetVersion();
		
//		public int test();
		
		public int auto_set();
		
		public int get_sys_ver(LongByReference major, LongByReference minor1, LongByReference minor2);
		
		public int get_sys_ver(IntByReference major, IntByReference minor1, IntByReference minor2);
		
		public int con_line2(int ch1, NativeLong  pos1, int ch2, NativeLong pos2);
		
		public int con_line2(int ch1, int  pos1, int ch2, int pos2);
		
		public int get_axe(int board_no);
		
//		public int get_sys_ver(long major, long minor1, long minor2);
	}

	public static void main(String[] args) {
		// 调用printf打印信息
//		testdll.Instance.printf("yyyyMMdd");
//		JNATestDll.Instance.hello();
//		System.out.println(JNATestDll.Instance.SumNumbers(83, 8));
//		JNATestDll.Instance.test();
//		JNATestDll.Instance.LC_Init();
//		JNATestDll.Instance.LC_TPH_OpenDev();
//		JNATestDll.Instance.LC_GetVersion();
		
		// ================================
//		int i = JNATestDll.Instance.auto_set();
//		System.out.println(i);
		
//		LongByReference major = new LongByReference();
//		LongByReference minor1 = new LongByReference();
//		LongByReference minor2 = new LongByReference();
//		int i = JNATestDll.Instance.get_sys_ver(major, minor1, minor2);
//		System.out.println("i: " + i + ", major: " + major.getValue());
		
//		IntByReference major = new IntByReference();
//		IntByReference minor1 = new IntByReference();
//		IntByReference minor2 = new IntByReference();
//		int i = JNATestDll.Instance.get_sys_ver(major, minor1, minor2);
//		System.out.println("i: " + i + ", major: " + major.getValue());
		
//		int i = JNATestDll.Instance.get_sys_ver(1, 1, 1);
//		System.out.println("i: " + i + ", major: ");
		
//		System.out.println(JNATestDll.Instance.con_line2(1, 100, 2, 200));
		
//		int i = JNATestDll.Instance.get_axe(1);
//		System.out.println(i);
		
//		NativeLong pos1 = new NativeLong(100);
//		NativeLong pos2 = new NativeLong(2000);
//		int i = JNATestDll.Instance.con_line2(1, pos1, 2, pos2);
//		System.out.println(i);
		
		int i = JNATestDll.Instance.con_line2(1, 1000, 2, 2000);
		System.out.println(i);
		
//		int i = JNATestDll.Instance.get_sys_ver(1, 1, 1);
//		System.out.println(i);
	}

}
