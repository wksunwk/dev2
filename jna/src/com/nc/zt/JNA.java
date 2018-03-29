package com.nc.zt;

import com.sun.jna.Memory;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.ShortByReference;
import com.sun.jna.win32.StdCallLibrary;

public class JNA {

	// ����ӿ�CLibrary���̳���com.sun.jna.Library
	public interface JNATestDll extends StdCallLibrary {
		// msvcrtΪdll����,msvcrtĿ¼��λ��Ϊ:C:\Windows\System32����,
//		testdll Instance = (testdll) Native.loadLibrary((Platform.isWindows() ? "msvcrt" : "c"),
//				testdll.class);
//		JNATestDll Instance = (JNATestDll) Native.loadLibrary("dll/TestDll", JNATestDll.class);
//		JNATestDll Instance = (JNATestDll) Native.loadLibrary("dll/LC_PHLIBS", JNATestDll.class);
//		JNATestDll Instance = (JNATestDll) Native.loadLibrary("dll/TestDll32", JNATestDll.class);
//		JNATestDll Instance = (JNATestDll) Native.loadLibrary("dll/TPH_DLL", JNATestDll.class);
//		JNATestDll Instance = (JNATestDll) Native.loadLibrary("dll2/TestDll", JNATestDll.class);
		JNATestDll Instance = (JNATestDll) Native.loadLibrary("dll4/USB7660", JNATestDll.class);
		// printfΪmsvcrt.dll�е�һ������.
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
		// ����printf��ӡ��Ϣ
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
		// ѹ���մ��ǰ�װ��һ����ά���ڼ��ϣ�ѹ���մ�����װ�˸����侵�������ⷵ��ȥ������̨�ؾʹ��ڷ��侵�ͼ�����֮��
		/*
		 * 1.��Ƭ��ͬ���ӳٲ�ͬ��ԭ��
		 * 2.����Ƭ��ͬ���ӳٲ�ͬ��ԭ��
		 * 3.�����ʱ��,���ȷ����ʼת��?
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
		 * star(WenKe) 14:35:06 ���������һ�׼������ϵͳ, �õ���USB7660�ɼ���,
		 * ����һЩԭ��,���Ƴ������java����, star(WenKe) 14:36:50
		 * ����java����USB7660.dll��ʱ��,����һЩ����,�ܷ�������ѯ?
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
