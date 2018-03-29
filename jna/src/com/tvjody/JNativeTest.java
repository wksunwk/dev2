package com.tvjody;

import org.xvolks.jnative.JNative;
import org.xvolks.jnative.exceptions.NativeException;
import org.xvolks.jnative.util.Kernel32.SystemTime;

public class JNativeTest {
	public static SystemTime GetSystemTime() throws NativeException, IllegalAccessException {
		// Kernel32.dllΪdll����,Kernel32Ŀ¼��λ��Ϊ:C:\Windows\System32����,
		// GetSystemTimeΪKernel32.dll�е�һ������.
		JNative nGetSystemTime = new JNative("Kernel32", "GetSystemTime");
		SystemTime systemTime = new SystemTime();
		// ���ò���
		nGetSystemTime.setParameter(0, systemTime.getPointer());
		nGetSystemTime.invoke();
		// �����ṹָ������
		return systemTime.getValueFromPointer();
	}

	public static void main(String[] args) throws NativeException, IllegalAccessException {
		System.err.println(GetSystemTime());
		System.exit(0);
	}
}

