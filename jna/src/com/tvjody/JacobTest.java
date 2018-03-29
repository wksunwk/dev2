package com.tvjody;

import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.Dispatch;
import com.jacob.com.Variant;

public class JacobTest {

    /**    
     * @param args    
     */    
    public static void main(String[] args) {    
        // TODO Auto-generated method stub  
  
//        try{    
//            ActiveXComponent dotnetCom = null;    
//            dotnetCom = new ActiveXComponent("TestDLL.TTT");     //需要调用的C#代码中的命名空间名和类名。
//            Variant var = Dispatch.call(dotnetCom,"SumNumbers","3","5");   //需要调用的方法名和参数值
//            String str  = var.toString();  //返回需要的字符串    
//            System.out.println(str);  //输出得到的字符串。检查结果是否正确。
//            
//            Dispatch.call(dotnetCom,"hello");   //需要调用的方法名和参数值
////            String str  = var.toString();  //返回需要的字符串    
////            System.out.println(str);  //输出得到的字符串。检查结果是否正确。
//            } catch (Exception ex) {    
//                ex.printStackTrace();    
//            }    LC_PHLIBS.dll LC_Init
    	
//    	try{    
//            ActiveXComponent dotnetCom = null;    
//            dotnetCom = new ActiveXComponent("LC_PHLIBS.PHLIBS");     //需要调用的C#代码中的命名空间名和类名。
//            Variant var = Dispatch.call(dotnetCom,"LC_GetVersion");   //需要调用的方法名和参数值
//            String str  = var.toString();  //返回需要的字符串    
//            System.out.println(str);  //输出得到的字符串。检查结果是否正确。
//            System.out.println(var.getString() + "******");
//            
//            var = Dispatch.call(dotnetCom,"LC_Init");   //需要调用的方法名和参数值
//            str  = var.toString();  //返回需要的字符串    
//            System.out.println(str);  //输出得到的字符串。检查结果是否正确。
//            
//            
//            var = Dispatch.call(dotnetCom,"LC_OpenDevice");   //需要调用的方法名和参数值
//            str  = var.toString();  //返回需要的字符串    
//            System.out.println(str);  //输出得到的字符串。检查结果是否正确。
//            
//            var = Dispatch.call(dotnetCom,"LC_GetDeviceCount");   //需要调用的方法名和参数值
//            str  = var.toString();  //返回需要的字符串    
//            System.out.println(str);  //输出得到的字符串。检查结果是否正确。
//            System.out.println(var.getInt() + "----");
//            
//            var = Dispatch.call(dotnetCom,"LC_SelectDevice", 0L);   //需要调用的方法名和参数值
//            str  = var.toString();  //返回需要的字符串    
//            System.out.println(str);  //输出得到的字符串。检查结果是否正确。
//            
//            var = Dispatch.call(dotnetCom,"LC_SelectChannel", "0");   //需要调用的方法名和参数值
//            str  = var.toString();  //返回需要的字符串    
//            System.out.println(str);  //输出得到的字符串。检查结果是否正确。
//            
//            var = Dispatch.call(dotnetCom,"LC_SetTrigMode", "0");   //需要调用的方法名和参数值
//            str  = var.toString();  //返回需要的字符串    
//            System.out.println(str);  //输出得到的字符串。检查结果是否正确。
//            
//            var = Dispatch.call(dotnetCom,"LC_GetTrigMode");   //需要调用的方法名和参数值
//            str  = var.toString();  //返回需要的字符串    
//            System.out.println(str);  //输出得到的字符串。检查结果是否正确。
//            
//            var = Dispatch.call(dotnetCom,"LC_GetBufferSize");   //需要调用的方法名和参数值
//            str  = var.toString();  //返回需要的字符串    
//            System.out.println(str);  //输出得到的字符串。检查结果是否正确。
//            
//            var = Dispatch.call(dotnetCom,"LC_SetMeaUnit", "0");   //需要调用的方法名和参数值
//            str  = var.toString();  //返回需要的字符串    
//            System.out.println(str);  //输出得到的字符串。检查结果是否正确。
//            
//            var = Dispatch.call(dotnetCom,"LC_GetMeaUnit");   //需要调用的方法名和参数值
//            str  = var.toString();  //返回需要的字符串    
//            System.out.println(str);  //输出得到的字符串。检查结果是否正确。
//            
//            var = Dispatch.call(dotnetCom,"LC_TrigAcq");   //需要调用的方法名和参数值
//            str  = var.toString();  //返回需要的字符串    
//            System.out.println(str);  //输出得到的字符串。检查结果是否正确。
//            
//            var = Dispatch.call(dotnetCom,"LC_GetAverageData");   //需要调用的方法名和参数值
//            str  = var.toString();  //返回需要的字符串    
//            System.out.println(str);  //输出得到的字符串。检查结果是否正确。
//            System.out.println(var.getDouble() + "======");
//            
//            var = Dispatch.call(dotnetCom,"LC_GetOneResult", "0");   //需要调用的方法名和参数值
//            str  = var.toString();  //返回需要的字符串    
//            System.out.println(str);  //输出得到的字符串。检查结果是否正确。
//            
//            var = Dispatch.call(dotnetCom,"LC_GetStrength");   //需要调用的方法名和参数值
//            str  = var.toString();  //返回需要的字符串    
//            System.out.println(str);  //输出得到的字符串。检查结果是否正确。
//            
//            var = Dispatch.call(dotnetCom,"LC_SetOptics", "0");   //需要调用的方法名和参数值
//            str  = var.toString();  //返回需要的字符串    
//            System.out.println(str);  //输出得到的字符串。检查结果是否正确。
//            
//            var = Dispatch.call(dotnetCom,"LC_GetOptics");   //需要调用的方法名和参数值
//            str  = var.toString();  //返回需要的字符串    
//            System.out.println(str);  //输出得到的字符串。检查结果是否正确。
//            
//            var = Dispatch.call(dotnetCom,"LC_SetParameter", "0", 0.0d);   //需要调用的方法名和参数值
//            str  = var.toString();  //返回需要的字符串    
//            System.out.println(str);  //输出得到的字符串。检查结果是否正确。
//            
//            var = Dispatch.call(dotnetCom,"LC_GetParameter", "0");   //需要调用的方法名和参数值
//            str  = var.toString();  //返回需要的字符串    
//            System.out.println(str);  //输出得到的字符串。检查结果是否正确。
//            System.out.println(var.getFloat() + "++++++++");
//            
//            var = Dispatch.call(dotnetCom,"LC_ResetDevice");   //需要调用的方法名和参数值
//            str  = var.toString();  //返回需要的字符串    
//            System.out.println(str);  //输出得到的字符串。检查结果是否正确。
//            
//            var = Dispatch.call(dotnetCom,"LC_LastError");   //需要调用的方法名和参数值
//            str  = var.toString();  //返回需要的字符串    
//            System.out.println(str);  //输出得到的字符串。检查结果是否正确。
//            
//            var = Dispatch.call(dotnetCom,"LC_CloseDevice");   //需要调用的方法名和参数值
//            str  = var.toString();  //返回需要的字符串    
//            System.out.println(str);  //输出得到的字符串。检查结果是否正确。
//            
//            var = Dispatch.call(dotnetCom,"LC_GetMacID");   //需要调用的方法名和参数值
//            str  = var.toString();  //返回需要的字符串    
//            System.out.println(str);  //输出得到的字符串。检查结果是否正确。
//            
//            var = Dispatch.call(dotnetCom,"LC_GetRealWLen");   //需要调用的方法名和参数值
//            str  = var.toString();  //返回需要的字符串    
//            System.out.println(str);  //输出得到的字符串。检查结果是否正确。
//            } catch (Exception ex) {    
//                ex.printStackTrace();    
//            }
    	
    	try{    

    		ActiveXComponent dotnetCom = null;   
    		dotnetCom = new ActiveXComponent("LC_PHLIBS.PHLIBS");     //需要调用的C#代码中的命名空间名和类名。
    		Variant var = Dispatch.call(dotnetCom,"LC_Init");   //需要调用的方法名和参数值
            String str  = var.toString();  //返回需要的字符串  
            System.out.println("LC_Init: " + str);
//            System.out.println(str);  //输出得到的字符串。检查结果是否正确。
            
            
            var = Dispatch.call(dotnetCom,"LC_OpenDevice");   //需要调用的方法名和参数值
            str  = var.toString();  //返回需要的字符串    
            System.out.println("LC_OpenDevice: " + str);  //输出得到的字符串。检查结果是否正确。
            
//            var = Dispatch.call(dotnetCom,"LC_GetDeviceCount");   //需要调用的方法名和参数值
//            str  = var.toString();  //返回需要的字符串    
//            System.out.println("LC_GetDeviceCount: " + str);  //输出得到的字符串。检查结果是否正确。
////            System.out.println(var.getInt() + "----");
//            
            var = Dispatch.call(dotnetCom,"LC_SelectDevice", 1L);   //需要调用的方法名和参数值
            str  = var.toString();  //返回需要的字符串    
            System.out.println("LC_SelectDevice: " + str);  //输出得到的字符串。检查结果是否正确。
            
            var = Dispatch.call(dotnetCom,"LC_SelectChannel", "1");   //需要调用的方法名和参数值
            str  = var.toString();  //返回需要的字符串    
            System.out.println("LC_SelectChannel: " + str);  //输出得到的字符串。检查结果是否正确。
//            

            
//			var = Dispatch.call(dotnetCom,"LC_GetTrigMode");   //需要调用的方法名和参数值
//			str  = var.toString();  //返回需要的字符串    
//			System.out.println("LC_GetTrigMode: " + str);  //输出得到的字符串。检查结果是否正确。
            
//            var = Dispatch.call(dotnetCom,"LC_SetTrigMode", "1");   //需要调用的方法名和参数值
//            str  = var.toString();  //返回需要的字符串    
//            System.out.println("LC_SetTrigMode: " + str);  //输出得到的字符串。检查结果是否正确。
            
            var = Dispatch.call(dotnetCom,"LC_ResetDevice");   //需要调用的方法名和参数值
            str  = var.toString();  //返回需要的字符串    
            System.out.println("LC_ResetDevice: " + str);  //输出得到的字符串。检查结果是否正确。
//            
//            var = Dispatch.call(dotnetCom,"LC_GetTrigMode");   //需要调用的方法名和参数值
//            str  = var.toString();  //返回需要的字符串    
//            System.out.println("LC_GetTrigMode: " + str);  //输出得到的字符串。检查结果是否正确。
//            
            var = Dispatch.call(dotnetCom,"LC_GetBufferSize");   //需要调用的方法名和参数值
            str  = var.toString();  //返回需要的字符串    
            System.out.println("LC_GetBufferSize: " + str);  //输出得到的字符串。检查结果是否正确。
            
//            var = Dispatch.call(dotnetCom,"LC_SetMeaUnit", "0");   //需要调用的方法名和参数值
//            str  = var.toString();  //返回需要的字符串    
//            System.out.println("LC_SetMeaUnit: " + str);  //输出得到的字符串。检查结果是否正确。
            
//            var = Dispatch.call(dotnetCom,"LC_GetMeaUnit");   //需要调用的方法名和参数值
//            str  = var.toString();  //返回需要的字符串    
//            System.out.println("LC_GetMeaUnit: " + str);  //输出得到的字符串。检查结果是否正确。
            
            var = Dispatch.call(dotnetCom,"LC_GetStrength");   //需要调用的方法名和参数值
            str  = var.toString();  //返回需要的字符串    
            System.out.println("LC_GetStrength: " + str);  //输出得到的字符串。检查结果是否正确。
            
            var = Dispatch.call(dotnetCom,"LC_TrigAcq");   //需要调用的方法名和参数值
            str  = var.toString();  //返回需要的字符串    
            System.out.println("LC_TrigAcq: " + str);  //输出得到的字符串。检查结果是否正确。
            
            var = Dispatch.call(dotnetCom,"LC_LastError");   //需要调用的方法名和参数值
            str  = var.toString();  //返回需要的字符串    
            System.out.println("LC_LastError: " + str);  //输出得到的字符串。检查结果是否正确。
            
            
            var = Dispatch.call(dotnetCom,"LC_GetAverageData");   //需要调用的方法名和参数值
            str  = var.toString();  //返回需要的字符串    
            System.out.println("LC_GetAverageData: " + str);  //输出得到的字符串。检查结果是否正确。
//            System.out.println(var.getDouble() + "======");
            
//            var = Dispatch.call(dotnetCom,"LC_GetOneResult", "0");   //需要调用的方法名和参数值
//            str  = var.toString();  //返回需要的字符串    
//            System.out.println("LC_GetOneResult: " + str);  //输出得到的字符串。检查结果是否正确。
            
           
            
//            var = Dispatch.call(dotnetCom,"LC_SetOptics", "0");   //需要调用的方法名和参数值
//            str  = var.toString();  //返回需要的字符串    
//            System.out.println("LC_SetOptics: " + str);  //输出得到的字符串。检查结果是否正确。
            
//            var = Dispatch.call(dotnetCom,"LC_GetOptics");   //需要调用的方法名和参数值
//            str  = var.toString();  //返回需要的字符串    
//            System.out.println("LC_GetOptics: " + str);  //输出得到的字符串。检查结果是否正确。
            
//            var = Dispatch.call(dotnetCom,"LC_SetParameter", "0", 0.0d);   //需要调用的方法名和参数值
//            str  = var.toString();  //返回需要的字符串    
//            System.out.println("LC_SetParameter: " + str);  //输出得到的字符串。检查结果是否正确。
            
//            var = Dispatch.call(dotnetCom,"LC_GetParameter", "0");   //需要调用的方法名和参数值
//            str  = var.toString();  //返回需要的字符串    
//            System.out.println("LC_GetParameter: " + str);  //输出得到的字符串。检查结果是否正确。
//            System.out.println(var.getFloat() + "++++++++");
            
            var = Dispatch.call(dotnetCom,"LC_ResetDevice");   //需要调用的方法名和参数值
            str  = var.toString();  //返回需要的字符串    
            System.out.println("LC_ResetDevice: " + str);  //输出得到的字符串。检查结果是否正确。
            
            
//            var = Dispatch.call(dotnetCom,"LC_GetMacID");   //需要调用的方法名和参数值
//            str  = var.toString();  //返回需要的字符串    
//            System.out.println("LC_GetMacID: " + str);  //输出得到的字符串。检查结果是否正确。
//            
//            var = Dispatch.call(dotnetCom,"LC_GetRealWLen");   //需要调用的方法名和参数值
//            str  = var.toString();  //返回需要的字符串    
//            System.out.println("LC_GetRealWLen: " + str);  //输出得到的字符串。检查结果是否正确。
//            
//            var = Dispatch.call(dotnetCom,"LC_GetVersion");   //需要调用的方法名和参数值
//            str  = var.toString();  //返回需要的字符串    
//            System.out.println("LC_GetVersion: " + str);  //输出得到的字符串。检查结果是否正确。
////            System.out.println(var.getString() + "******");
//            
//            var = Dispatch.call(dotnetCom,"LC_CloseDevice");   //需要调用的方法名和参数值
//            str  = var.toString();  //返回需要的字符串    
//            System.out.println("LC_CloseDevice: " + str);  //输出得到的字符串。检查结果是否正确。
            
            } catch (Exception ex) {    
                ex.printStackTrace();    
            }
    }      
}
