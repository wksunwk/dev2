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
//            dotnetCom = new ActiveXComponent("TestDLL.TTT");     //��Ҫ���õ�C#�����е������ռ�����������
//            Variant var = Dispatch.call(dotnetCom,"SumNumbers","3","5");   //��Ҫ���õķ������Ͳ���ֵ
//            String str  = var.toString();  //������Ҫ���ַ���    
//            System.out.println(str);  //����õ����ַ�����������Ƿ���ȷ��
//            
//            Dispatch.call(dotnetCom,"hello");   //��Ҫ���õķ������Ͳ���ֵ
////            String str  = var.toString();  //������Ҫ���ַ���    
////            System.out.println(str);  //����õ����ַ�����������Ƿ���ȷ��
//            } catch (Exception ex) {    
//                ex.printStackTrace();    
//            }    LC_PHLIBS.dll LC_Init
    	
//    	try{    
//            ActiveXComponent dotnetCom = null;    
//            dotnetCom = new ActiveXComponent("LC_PHLIBS.PHLIBS");     //��Ҫ���õ�C#�����е������ռ�����������
//            Variant var = Dispatch.call(dotnetCom,"LC_GetVersion");   //��Ҫ���õķ������Ͳ���ֵ
//            String str  = var.toString();  //������Ҫ���ַ���    
//            System.out.println(str);  //����õ����ַ�����������Ƿ���ȷ��
//            System.out.println(var.getString() + "******");
//            
//            var = Dispatch.call(dotnetCom,"LC_Init");   //��Ҫ���õķ������Ͳ���ֵ
//            str  = var.toString();  //������Ҫ���ַ���    
//            System.out.println(str);  //����õ����ַ�����������Ƿ���ȷ��
//            
//            
//            var = Dispatch.call(dotnetCom,"LC_OpenDevice");   //��Ҫ���õķ������Ͳ���ֵ
//            str  = var.toString();  //������Ҫ���ַ���    
//            System.out.println(str);  //����õ����ַ�����������Ƿ���ȷ��
//            
//            var = Dispatch.call(dotnetCom,"LC_GetDeviceCount");   //��Ҫ���õķ������Ͳ���ֵ
//            str  = var.toString();  //������Ҫ���ַ���    
//            System.out.println(str);  //����õ����ַ�����������Ƿ���ȷ��
//            System.out.println(var.getInt() + "----");
//            
//            var = Dispatch.call(dotnetCom,"LC_SelectDevice", 0L);   //��Ҫ���õķ������Ͳ���ֵ
//            str  = var.toString();  //������Ҫ���ַ���    
//            System.out.println(str);  //����õ����ַ�����������Ƿ���ȷ��
//            
//            var = Dispatch.call(dotnetCom,"LC_SelectChannel", "0");   //��Ҫ���õķ������Ͳ���ֵ
//            str  = var.toString();  //������Ҫ���ַ���    
//            System.out.println(str);  //����õ����ַ�����������Ƿ���ȷ��
//            
//            var = Dispatch.call(dotnetCom,"LC_SetTrigMode", "0");   //��Ҫ���õķ������Ͳ���ֵ
//            str  = var.toString();  //������Ҫ���ַ���    
//            System.out.println(str);  //����õ����ַ�����������Ƿ���ȷ��
//            
//            var = Dispatch.call(dotnetCom,"LC_GetTrigMode");   //��Ҫ���õķ������Ͳ���ֵ
//            str  = var.toString();  //������Ҫ���ַ���    
//            System.out.println(str);  //����õ����ַ�����������Ƿ���ȷ��
//            
//            var = Dispatch.call(dotnetCom,"LC_GetBufferSize");   //��Ҫ���õķ������Ͳ���ֵ
//            str  = var.toString();  //������Ҫ���ַ���    
//            System.out.println(str);  //����õ����ַ�����������Ƿ���ȷ��
//            
//            var = Dispatch.call(dotnetCom,"LC_SetMeaUnit", "0");   //��Ҫ���õķ������Ͳ���ֵ
//            str  = var.toString();  //������Ҫ���ַ���    
//            System.out.println(str);  //����õ����ַ�����������Ƿ���ȷ��
//            
//            var = Dispatch.call(dotnetCom,"LC_GetMeaUnit");   //��Ҫ���õķ������Ͳ���ֵ
//            str  = var.toString();  //������Ҫ���ַ���    
//            System.out.println(str);  //����õ����ַ�����������Ƿ���ȷ��
//            
//            var = Dispatch.call(dotnetCom,"LC_TrigAcq");   //��Ҫ���õķ������Ͳ���ֵ
//            str  = var.toString();  //������Ҫ���ַ���    
//            System.out.println(str);  //����õ����ַ�����������Ƿ���ȷ��
//            
//            var = Dispatch.call(dotnetCom,"LC_GetAverageData");   //��Ҫ���õķ������Ͳ���ֵ
//            str  = var.toString();  //������Ҫ���ַ���    
//            System.out.println(str);  //����õ����ַ�����������Ƿ���ȷ��
//            System.out.println(var.getDouble() + "======");
//            
//            var = Dispatch.call(dotnetCom,"LC_GetOneResult", "0");   //��Ҫ���õķ������Ͳ���ֵ
//            str  = var.toString();  //������Ҫ���ַ���    
//            System.out.println(str);  //����õ����ַ�����������Ƿ���ȷ��
//            
//            var = Dispatch.call(dotnetCom,"LC_GetStrength");   //��Ҫ���õķ������Ͳ���ֵ
//            str  = var.toString();  //������Ҫ���ַ���    
//            System.out.println(str);  //����õ����ַ�����������Ƿ���ȷ��
//            
//            var = Dispatch.call(dotnetCom,"LC_SetOptics", "0");   //��Ҫ���õķ������Ͳ���ֵ
//            str  = var.toString();  //������Ҫ���ַ���    
//            System.out.println(str);  //����õ����ַ�����������Ƿ���ȷ��
//            
//            var = Dispatch.call(dotnetCom,"LC_GetOptics");   //��Ҫ���õķ������Ͳ���ֵ
//            str  = var.toString();  //������Ҫ���ַ���    
//            System.out.println(str);  //����õ����ַ�����������Ƿ���ȷ��
//            
//            var = Dispatch.call(dotnetCom,"LC_SetParameter", "0", 0.0d);   //��Ҫ���õķ������Ͳ���ֵ
//            str  = var.toString();  //������Ҫ���ַ���    
//            System.out.println(str);  //����õ����ַ�����������Ƿ���ȷ��
//            
//            var = Dispatch.call(dotnetCom,"LC_GetParameter", "0");   //��Ҫ���õķ������Ͳ���ֵ
//            str  = var.toString();  //������Ҫ���ַ���    
//            System.out.println(str);  //����õ����ַ�����������Ƿ���ȷ��
//            System.out.println(var.getFloat() + "++++++++");
//            
//            var = Dispatch.call(dotnetCom,"LC_ResetDevice");   //��Ҫ���õķ������Ͳ���ֵ
//            str  = var.toString();  //������Ҫ���ַ���    
//            System.out.println(str);  //����õ����ַ�����������Ƿ���ȷ��
//            
//            var = Dispatch.call(dotnetCom,"LC_LastError");   //��Ҫ���õķ������Ͳ���ֵ
//            str  = var.toString();  //������Ҫ���ַ���    
//            System.out.println(str);  //����õ����ַ�����������Ƿ���ȷ��
//            
//            var = Dispatch.call(dotnetCom,"LC_CloseDevice");   //��Ҫ���õķ������Ͳ���ֵ
//            str  = var.toString();  //������Ҫ���ַ���    
//            System.out.println(str);  //����õ����ַ�����������Ƿ���ȷ��
//            
//            var = Dispatch.call(dotnetCom,"LC_GetMacID");   //��Ҫ���õķ������Ͳ���ֵ
//            str  = var.toString();  //������Ҫ���ַ���    
//            System.out.println(str);  //����õ����ַ�����������Ƿ���ȷ��
//            
//            var = Dispatch.call(dotnetCom,"LC_GetRealWLen");   //��Ҫ���õķ������Ͳ���ֵ
//            str  = var.toString();  //������Ҫ���ַ���    
//            System.out.println(str);  //����õ����ַ�����������Ƿ���ȷ��
//            } catch (Exception ex) {    
//                ex.printStackTrace();    
//            }
    	
    	try{    

    		ActiveXComponent dotnetCom = null;   
    		dotnetCom = new ActiveXComponent("LC_PHLIBS.PHLIBS");     //��Ҫ���õ�C#�����е������ռ�����������
    		Variant var = Dispatch.call(dotnetCom,"LC_Init");   //��Ҫ���õķ������Ͳ���ֵ
            String str  = var.toString();  //������Ҫ���ַ���  
            System.out.println("LC_Init: " + str);
//            System.out.println(str);  //����õ����ַ�����������Ƿ���ȷ��
            
            
            var = Dispatch.call(dotnetCom,"LC_OpenDevice");   //��Ҫ���õķ������Ͳ���ֵ
            str  = var.toString();  //������Ҫ���ַ���    
            System.out.println("LC_OpenDevice: " + str);  //����õ����ַ�����������Ƿ���ȷ��
            
//            var = Dispatch.call(dotnetCom,"LC_GetDeviceCount");   //��Ҫ���õķ������Ͳ���ֵ
//            str  = var.toString();  //������Ҫ���ַ���    
//            System.out.println("LC_GetDeviceCount: " + str);  //����õ����ַ�����������Ƿ���ȷ��
////            System.out.println(var.getInt() + "----");
//            
            var = Dispatch.call(dotnetCom,"LC_SelectDevice", 1L);   //��Ҫ���õķ������Ͳ���ֵ
            str  = var.toString();  //������Ҫ���ַ���    
            System.out.println("LC_SelectDevice: " + str);  //����õ����ַ�����������Ƿ���ȷ��
            
            var = Dispatch.call(dotnetCom,"LC_SelectChannel", "1");   //��Ҫ���õķ������Ͳ���ֵ
            str  = var.toString();  //������Ҫ���ַ���    
            System.out.println("LC_SelectChannel: " + str);  //����õ����ַ�����������Ƿ���ȷ��
//            

            
//			var = Dispatch.call(dotnetCom,"LC_GetTrigMode");   //��Ҫ���õķ������Ͳ���ֵ
//			str  = var.toString();  //������Ҫ���ַ���    
//			System.out.println("LC_GetTrigMode: " + str);  //����õ����ַ�����������Ƿ���ȷ��
            
//            var = Dispatch.call(dotnetCom,"LC_SetTrigMode", "1");   //��Ҫ���õķ������Ͳ���ֵ
//            str  = var.toString();  //������Ҫ���ַ���    
//            System.out.println("LC_SetTrigMode: " + str);  //����õ����ַ�����������Ƿ���ȷ��
            
            var = Dispatch.call(dotnetCom,"LC_ResetDevice");   //��Ҫ���õķ������Ͳ���ֵ
            str  = var.toString();  //������Ҫ���ַ���    
            System.out.println("LC_ResetDevice: " + str);  //����õ����ַ�����������Ƿ���ȷ��
//            
//            var = Dispatch.call(dotnetCom,"LC_GetTrigMode");   //��Ҫ���õķ������Ͳ���ֵ
//            str  = var.toString();  //������Ҫ���ַ���    
//            System.out.println("LC_GetTrigMode: " + str);  //����õ����ַ�����������Ƿ���ȷ��
//            
            var = Dispatch.call(dotnetCom,"LC_GetBufferSize");   //��Ҫ���õķ������Ͳ���ֵ
            str  = var.toString();  //������Ҫ���ַ���    
            System.out.println("LC_GetBufferSize: " + str);  //����õ����ַ�����������Ƿ���ȷ��
            
//            var = Dispatch.call(dotnetCom,"LC_SetMeaUnit", "0");   //��Ҫ���õķ������Ͳ���ֵ
//            str  = var.toString();  //������Ҫ���ַ���    
//            System.out.println("LC_SetMeaUnit: " + str);  //����õ����ַ�����������Ƿ���ȷ��
            
//            var = Dispatch.call(dotnetCom,"LC_GetMeaUnit");   //��Ҫ���õķ������Ͳ���ֵ
//            str  = var.toString();  //������Ҫ���ַ���    
//            System.out.println("LC_GetMeaUnit: " + str);  //����õ����ַ�����������Ƿ���ȷ��
            
            var = Dispatch.call(dotnetCom,"LC_GetStrength");   //��Ҫ���õķ������Ͳ���ֵ
            str  = var.toString();  //������Ҫ���ַ���    
            System.out.println("LC_GetStrength: " + str);  //����õ����ַ�����������Ƿ���ȷ��
            
            var = Dispatch.call(dotnetCom,"LC_TrigAcq");   //��Ҫ���õķ������Ͳ���ֵ
            str  = var.toString();  //������Ҫ���ַ���    
            System.out.println("LC_TrigAcq: " + str);  //����õ����ַ�����������Ƿ���ȷ��
            
            var = Dispatch.call(dotnetCom,"LC_LastError");   //��Ҫ���õķ������Ͳ���ֵ
            str  = var.toString();  //������Ҫ���ַ���    
            System.out.println("LC_LastError: " + str);  //����õ����ַ�����������Ƿ���ȷ��
            
            
            var = Dispatch.call(dotnetCom,"LC_GetAverageData");   //��Ҫ���õķ������Ͳ���ֵ
            str  = var.toString();  //������Ҫ���ַ���    
            System.out.println("LC_GetAverageData: " + str);  //����õ����ַ�����������Ƿ���ȷ��
//            System.out.println(var.getDouble() + "======");
            
//            var = Dispatch.call(dotnetCom,"LC_GetOneResult", "0");   //��Ҫ���õķ������Ͳ���ֵ
//            str  = var.toString();  //������Ҫ���ַ���    
//            System.out.println("LC_GetOneResult: " + str);  //����õ����ַ�����������Ƿ���ȷ��
            
           
            
//            var = Dispatch.call(dotnetCom,"LC_SetOptics", "0");   //��Ҫ���õķ������Ͳ���ֵ
//            str  = var.toString();  //������Ҫ���ַ���    
//            System.out.println("LC_SetOptics: " + str);  //����õ����ַ�����������Ƿ���ȷ��
            
//            var = Dispatch.call(dotnetCom,"LC_GetOptics");   //��Ҫ���õķ������Ͳ���ֵ
//            str  = var.toString();  //������Ҫ���ַ���    
//            System.out.println("LC_GetOptics: " + str);  //����õ����ַ�����������Ƿ���ȷ��
            
//            var = Dispatch.call(dotnetCom,"LC_SetParameter", "0", 0.0d);   //��Ҫ���õķ������Ͳ���ֵ
//            str  = var.toString();  //������Ҫ���ַ���    
//            System.out.println("LC_SetParameter: " + str);  //����õ����ַ�����������Ƿ���ȷ��
            
//            var = Dispatch.call(dotnetCom,"LC_GetParameter", "0");   //��Ҫ���õķ������Ͳ���ֵ
//            str  = var.toString();  //������Ҫ���ַ���    
//            System.out.println("LC_GetParameter: " + str);  //����õ����ַ�����������Ƿ���ȷ��
//            System.out.println(var.getFloat() + "++++++++");
            
            var = Dispatch.call(dotnetCom,"LC_ResetDevice");   //��Ҫ���õķ������Ͳ���ֵ
            str  = var.toString();  //������Ҫ���ַ���    
            System.out.println("LC_ResetDevice: " + str);  //����õ����ַ�����������Ƿ���ȷ��
            
            
//            var = Dispatch.call(dotnetCom,"LC_GetMacID");   //��Ҫ���õķ������Ͳ���ֵ
//            str  = var.toString();  //������Ҫ���ַ���    
//            System.out.println("LC_GetMacID: " + str);  //����õ����ַ�����������Ƿ���ȷ��
//            
//            var = Dispatch.call(dotnetCom,"LC_GetRealWLen");   //��Ҫ���õķ������Ͳ���ֵ
//            str  = var.toString();  //������Ҫ���ַ���    
//            System.out.println("LC_GetRealWLen: " + str);  //����õ����ַ�����������Ƿ���ȷ��
//            
//            var = Dispatch.call(dotnetCom,"LC_GetVersion");   //��Ҫ���õķ������Ͳ���ֵ
//            str  = var.toString();  //������Ҫ���ַ���    
//            System.out.println("LC_GetVersion: " + str);  //����õ����ַ�����������Ƿ���ȷ��
////            System.out.println(var.getString() + "******");
//            
//            var = Dispatch.call(dotnetCom,"LC_CloseDevice");   //��Ҫ���õķ������Ͳ���ֵ
//            str  = var.toString();  //������Ҫ���ַ���    
//            System.out.println("LC_CloseDevice: " + str);  //����õ����ַ�����������Ƿ���ȷ��
            
            } catch (Exception ex) {    
                ex.printStackTrace();    
            }
    }      
}
