package com.tvjody;

import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.Dispatch;
import com.jacob.com.Variant;

public class JacobTPH {

	public static void main(String[] args) {
		ActiveXComponent dotnetCom = null;    
        dotnetCom = new ActiveXComponent("TPH_DLL.InnerTPH");     //需要调用的C#代码中的命名空间名和类名。
        Variant var = Dispatch.call(dotnetCom,"LC_TPH_CalibValid");   //需要调用的方法名和参数值
        String str  = var.toString();  //返回需要的字符串    
        System.out.println(str);  //输出得到的字符串。检查结果是否正确。
        
        var = Dispatch.call(dotnetCom,"LC_TPH_OpenDev");   //需要调用的方法名和参数值
        str  = var.toString();  //返回需要的字符串    
        System.out.println(str);  //输出得到的字符串。检查结果是否正确。
        
        var = Dispatch.call(dotnetCom,"LC_TPH_CloseDev");   //需要调用的方法名和参数值
        str  = var.toString();  //返回需要的字符串    
        System.out.println(str);  //输出得到的字符串。检查结果是否正确。
        
        var = Dispatch.call(dotnetCom,"LC_TPH_TrigOnce");   //需要调用的方法名和参数值
        str  = var.toString();  //返回需要的字符串    
        System.out.println(str);  //输出得到的字符串。检查结果是否正确。
        
        var = Dispatch.call(dotnetCom,"LC_TPH_GetValue", "0");   //需要调用的方法名和参数值
        str  = var.toString();  //返回需要的字符串    
        System.out.println(str);  //输出得到的字符串。检查结果是否正确。
        
        var = Dispatch.call(dotnetCom,"LC_TPH_GetVer");   //需要调用的方法名和参数值
        str  = var.toString();  //返回需要的字符串    
        System.out.println(str);  //输出得到的字符串。检查结果是否正确。
        
        var = Dispatch.call(dotnetCom,"LC_TPH_GetSN");   //需要调用的方法名和参数值
        str  = var.toString();  //返回需要的字符串    
        System.out.println(str);  //输出得到的字符串。检查结果是否正确。
	}
}
