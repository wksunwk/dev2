package com.tvjody;

import org.xvolks.jnative.JNative;
import org.xvolks.jnative.exceptions.NativeException;
import org.xvolks.jnative.util.Kernel32.SystemTime;

public class JNativeTest {
	public static SystemTime GetSystemTime() throws NativeException, IllegalAccessException {
		// Kernel32.dll为dll名称,Kernel32目录的位置为:C:\Windows\System32下面,
		// GetSystemTime为Kernel32.dll中的一个方法.
		JNative nGetSystemTime = new JNative("Kernel32", "GetSystemTime");
		SystemTime systemTime = new SystemTime();
		// 设置参数
		nGetSystemTime.setParameter(0, systemTime.getPointer());
		nGetSystemTime.invoke();
		// 解析结构指针内容
		return systemTime.getValueFromPointer();
	}

	public static void main(String[] args) throws NativeException, IllegalAccessException {
		System.err.println(GetSystemTime());
		System.exit(0);
	}
}

