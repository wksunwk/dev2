package com.nc.zt;

import com.sun.jna.Memory;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.ShortByReference;
import com.sun.jna.win32.StdCallLibrary;

public class JNA {

	// 定义接口CLibrary，继承自com.sun.jna.Library
	public interface JNATestDll extends StdCallLibrary {
		// msvcrt为dll名称,msvcrt目录的位置为:C:\Windows\System32下面,
//		testdll Instance = (testdll) Native.loadLibrary((Platform.isWindows() ? "msvcrt" : "c"),
//				testdll.class);
//		JNATestDll Instance = (JNATestDll) Native.loadLibrary("dll/TestDll", JNATestDll.class);
//		JNATestDll Instance = (JNATestDll) Native.loadLibrary("dll/LC_PHLIBS", JNATestDll.class);
//		JNATestDll Instance = (JNATestDll) Native.loadLibrary("dll/TestDll32", JNATestDll.class);
//		JNATestDll Instance = (JNATestDll) Native.loadLibrary("dll/TPH_DLL", JNATestDll.class);
//		JNATestDll Instance = (JNATestDll) Native.loadLibrary("dll2/TestDll", JNATestDll.class);
		JNATestDll Instance = (JNATestDll) Native.loadLibrary("dll4/USB7660", JNATestDll.class);
		// printf为msvcrt.dll中的一个方法.
//		void printf(String format, Object... args);
//		public void hello();
//		public int SumNumbers(int a, int b);
//		public void LC_Init();
//		public long LC_TPH_OpenDev();
//		public String LC_GetVersion();
		
//		public int test();
		
//		public int auto_set();
//		
//		public int get_sys_ver(LongByReference major, LongByReference minor1, LongByReference minor2);
//		
//		public int con_line2(int ch1, long pos1, int ch2, long pos2);
//		
//		public int get_axe(int board_no);
		
//		public int get_sys_ver(long major, long minor1, long minor2);
		
		public long ZT7660_GetCardCount();
		
		public long ZT7660_OpenDevice(long cardNO);
		
		public long ZT7660_GetBaseNO();
		
		public long ZT7660_AIFifoEx(long cardNO, long wantReadCount, ShortByReference pResultArr);
		
//		public long ZT7660_AIFifoEx(long cardNO, long wantReadCount, short[] pResultArr);
		
//		public long ZT7660_AIFifoEx(long cardNO, long wantReadCount, ShortBuffer pResultArr);
		
//		public long ZT7660_AIFifoEx(long cardNO, long wantReadCount, byte[] pResultArr);
		
//		public long ZT7660_AIFifoEx(long cardNO, long wantReadCount, PointerByReference pResultArr);
		
//		public long ZT7660_AIFifoEx(long cardNO, long wantReadCount, Pointer pResultArr);
		
//		public long ZT7660_AIFifoEx(long cardNO, long wantReadCount, short pResultArr);
		
		public long ZT7660_AOonce(long cardNO, long chNO, long AORange, long nValue);
		
		public long ZT7660_AIonce(long cardNO, long chMode, long chNO, long AIrange, long AIAmp, long ADstartMode, long ADfreq, long ABflag, long ch1Flag, long ADctrlWord, long ADoverTime);
		
		public long ZT7660_FreRead(long cardNO, long[] freDataArr);
		
		public long ZT7660_FreReadx(String cardNO, long[] freDataArr);
		
//		public long ZT7660_FreRead(long cardNO, long freDataArr);
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
//		System.out.println("i: " + i + ", major: " + major);
		
//		int i = JNATestDll.Instance.get_sys_ver(1, 1, 1);
//		System.out.println("i: " + i + ", major: ");
		
//		System.out.println(JNATestDll.Instance.con_line2(1, 100, 2, 200));
		
//		int i = JNATestDll.Instance.get_axe(1);
//		System.out.println(i);
		
//		int i = JNATestDll.Instance.con_line2(1, 100L, 2, 2000L);
//		System.out.println(i);
		// 压电陶瓷是安装在一个二维调节架上，压电陶瓷上面装了个反射镜，将激光返回去，工作台呢就处于反射镜和激光器之间
		/*
		 * 1.波片不同点延迟不同的原因
		 * 2.玻璃片不同点延迟不同的原因
		 * 3.找轴的时候,如果确定初始转向?
		 */
//		long i = JNATestDll.Instance.ZT7660_GetCardCount();
//		System.out.println(i & 0x0FFFF);
//		
//		i = JNATestDll.Instance.ZT7660_OpenDevice(1L);
//		System.out.println((i & 0x0FFFF));
//		
//		i = JNATestDll.Instance.ZT7660_GetBaseNO();
//		System.out.println((i & 0x0FFFF));
//		
//		long a = System.currentTimeMillis();
//		int count = 2500;
//		for (int i = 0; i < count; i++) {
//			System.out.println(i);			
//		}
//		long b = System.currentTimeMillis();
//		System.out.println((b - a));
		
//		System.setProperty("jna.protected","true");
		
//		short[] pResultArr = new short[1000];
//		short[] pResultArr = new short[100];
//		pResultArr[0] = (short)100;
//		byte[] pResultArr = new byte[1000];
		
		/*
		 * star(WenKe) 14:35:06 我们这边做一套激光回馈系统, 用到了USB7660采集卡,
		 * 出于一些原因,控制程序采用java开发, star(WenKe) 14:36:50
		 * 基于java调用USB7660.dll的时候,遇到一些问题,能否向您咨询?
		 */
		
//		PointerByReference pResultArr = new PointerByReference();
//		Pointer pResultArr = new Pointer(0);
		
//		ShortBuffer pResultArr = ShortBuffer.allocate(512);
//		ShortBuffer pResultArr = ShortBuffer.wrap(new short[512]);
		ShortByReference pResultArr = new ShortByReference();
		Memory m = new Memory(512);
//		m.write(bOff, buf, index, length);
		pResultArr.setPointer(m);
//		try {
//			long i = JNATestDll.Instance.ZT7660_AIFifoEx(1, 512, pResultArr);
		long[] freDataArr = new long[3];
//		long i = JNATestDll.Instance.ZT7660_FreRead(1, freDataArr);
//		long i = JNATestDll.Instance.ZT7660_FreRead(0, 3);
		
		long i = JNATestDll.Instance.ZT7660_FreReadx("avc", freDataArr);
			System.out.println(i & 0x0FF);
//		} catch (Throwable e) {
//			e.printStackTrace();
//		}
		
//		System.out.println(pResultArr);
		
//		long i = JNATestDll.Instance.ZT7660_AOonce(1, 1, 1, 100);
//		System.out.println(i & 0x0FFFF);
		
//		long i = JNATestDll.Instance.ZT7660_AIonce(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
//		System.out.println(i);
	}

}
