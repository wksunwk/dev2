package com.tvjody;

import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.Dispatch;
import com.jacob.com.Variant;

public class JacobTPH {

	public static void main(String[] args) {
		ActiveXComponent dotnetCom = null;    
        dotnetCom = new ActiveXComponent("TPH_DLL.InnerTPH");     //��Ҫ���õ�C#�����е������ռ�����������
        Variant var = Dispatch.call(dotnetCom,"LC_TPH_CalibValid");   //��Ҫ���õķ������Ͳ���ֵ
        String str  = var.toString();  //������Ҫ���ַ���    
        System.out.println(str);  //����õ����ַ�����������Ƿ���ȷ��
        
        var = Dispatch.call(dotnetCom,"LC_TPH_OpenDev");   //��Ҫ���õķ������Ͳ���ֵ
        str  = var.toString();  //������Ҫ���ַ���    
        System.out.println(str);  //����õ����ַ�����������Ƿ���ȷ��
        
        var = Dispatch.call(dotnetCom,"LC_TPH_CloseDev");   //��Ҫ���õķ������Ͳ���ֵ
        str  = var.toString();  //������Ҫ���ַ���    
        System.out.println(str);  //����õ����ַ�����������Ƿ���ȷ��
        
        var = Dispatch.call(dotnetCom,"LC_TPH_TrigOnce");   //��Ҫ���õķ������Ͳ���ֵ
        str  = var.toString();  //������Ҫ���ַ���    
        System.out.println(str);  //����õ����ַ�����������Ƿ���ȷ��
        
        var = Dispatch.call(dotnetCom,"LC_TPH_GetValue", "0");   //��Ҫ���õķ������Ͳ���ֵ
        str  = var.toString();  //������Ҫ���ַ���    
        System.out.println(str);  //����õ����ַ�����������Ƿ���ȷ��
        
        var = Dispatch.call(dotnetCom,"LC_TPH_GetVer");   //��Ҫ���õķ������Ͳ���ֵ
        str  = var.toString();  //������Ҫ���ַ���    
        System.out.println(str);  //����õ����ַ�����������Ƿ���ȷ��
        
        var = Dispatch.call(dotnetCom,"LC_TPH_GetSN");   //��Ҫ���õķ������Ͳ���ֵ
        str  = var.toString();  //������Ҫ���ַ���    
        System.out.println(str);  //����õ����ַ�����������Ƿ���ȷ��
	}
}
