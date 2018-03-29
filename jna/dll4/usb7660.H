#ifndef USB7660_H
#define USB7660_H

#ifdef USB7KCTRANS_EXPORTS
#define ZT_API __declspec(dllexport)
#else
#define ZT_API __declspec(dllimport)
#endif

//��������
#define ZT_SUCCESS 0  //�޴���
#define ERR_PARAMETER1 1 //����1��
#define ERR_PARAMETER2 2 //����2��
#define ERR_PARAMETER3 3 //����3��
#define ERR_PARAMETER4 4 //����4��
#define ERR_PARAMETER5 5 //����5��
#define ERR_PARAMETER6 6 //����6��
#define ERR_PARAMETER7 7 //����7��
#define ERR_PARAMETER8 8 //����8��
#define ERR_PARAMETER9 9 //����9��
#define ERR_PARAMETER10 10 //����10��
#define ERR_PARAMETER11 11 //����11��
#define ERR_PARAMETER12 12 //����12��
#define ERR_PARAMETER13 13 //����13��
#define ERR_PARAMETER14 14 //����14��
#define ERR_PARAMETER15 15 //����15��
#define ERR_PARAMETER16 16 //����16��
#define ERR_PARAMETER17 17 //����17��
#define ERR_PARAMETER18 18 //����18��
#define ERR_PARAMETER19 19 //����19��
#define ERR_PARAMETER20 20 //����20��
#define ERR_PARAMETER_BASEADDR 21 //���ISA�����忨����ַ������Χ������ַӦ��Ϊ0x100��0x3F0֮��δ��ϵͳռ�õĵ�ַ
#define ERR_PARAMETER_CARDNO 22 //���PCI�����忨�����ų�����Χ����������а忨������Ĭ�ϴ�1��ʼ
#define ERR_PARAMETER_CHMODE 23 //ͨ����ʽ��������ͨ����ʽ������Χ��һ��ֻ��0--3��4�ַ�ʽ
#define ERR_PARAMETER_CH 24 //ͨ���Ų�������ͨ���ų�����Χ
#define ERR_PARAMETER_CHIP 25 //оƬ�Ų�������оƬ�ų�����Χ
#define ERR_PARAMETER_PORT 26 //�ںŲ������󣬿ںų�����Χ
#define ERR_PARAMETER_AI_RANGE 27 //AD���̲��������˿���֧������AD��������
#define ERR_PARAMETER_AI_AMP 28 //AD���������
#define ERR_PARAMETER_AI_STARTMODE 29 //AD������ʽ������
#define ERR_PARAMETER_AO_RANGE 30 //DA���̲��������˿���֧������DA�������
#define ERR_PARAMETER_ADFREQ 31 //AD�ɼ�Ƶ��(��AD��Ƶϵ��)������
#define ERR_PARAMETER_IRQ 32 //���ж���ز������������Ǵ˿���֧�������жϷ�ʽ���жϺ�
#define ERR_PARAMETER_NULL_POINTER 33 //��ָ�����ԭ�򣺻������׵�ַΪ�ջ����û�����Ĳ����������õ���ָ��
#define ERR_AD_OVERTIME 34 //AD��ʱ������ISA��������ԭ������ǣ�δ�忨��IO��ַ��忨�����ò�ƥ�䡣���ö�ʱ����AD���ⴥ������ADʱ��һ�㲻Ӧ���AD�Ƿ�ʱ
#define ERR_OPEN_DEVICE 35 //���豸ʧ�ܣ�����PCI��������ԭ������ǣ�δ�忨��δװ��������dll��sys�汾��һ��
#define ERR_CLOSE_DEVICE 36 //�ر��豸ʧ��
#define ERR_TIMING 37 //��ʱδ�����ⴥ������δ��
#define ERR_IOADDR_DA_OVERTIME 38 //�����DAд���̳�ʱ
#define ERR_OPEN_IRQ 39 //���жϳ���
#define ERR_FUNC_CANNT_RUN 40 //�˺�����������̨�����������
#define ERR_ASYNC_FUNC_FAILED 41 //�첽��������ʧ��
#define ERR_FUNC_OPERATE 42 //�ڵ�ǰ�Ŀ�������״̬�£���Ӧ�õ��ô˺���
#define ERR_EXCHANGE_DATA 43 //��ײ�����֮�佻�����ݳ���
#define ERR_CANT_FIND_FIRST_CH 44 //�޷��ҵ���һ��ͨ���ı�־λ

extern "C" 
{
ZT_API  long _stdcall ZT7660_GetCardCount();
//�������ܣ����ص�ǰ��ʹ�õ��豸������ע��������������ڴ��豸֮ǰ����
//
//��ڲ�����
//����ֵ�� ���ڵ���0  ��ǰ��ʹ���豸����
//         -1  ��ʧ�ܣ��Ѿ����ù�ZT7660_OpenDevice����

ZT_API long _stdcall ZT7660_OpenDevice(unsigned long cardNO);
//�������ƣ�ZT7660_OpenDevice
//�������ܣ����豸�������ڵ�����������֮ǰ���á�
//          ���ڳ����ʼ��ʱ���ñȽ�ǡ����ֻ����һ�μ���
//��ڲ�����
//          cardNO��ģ��ţ�Ĭ�ϴ� 1 ��ʼ
//                    ���ϵͳ��ֻ����һ��USBģ�飬���������Ϊ1������
//����ֵ��  0  ���ɹ�
//         -1  ��ʧ�ܣ�Ӧ�ý�һ������ ZT7660_GetLastErr �жϳ���ԭ��
ZT_API long _stdcall ZT7660_CloseDevice(unsigned long cardNO);
//�������ƣ�ZT7660_CloseDevice
//�������ܣ��ر�ָ�����豸
//
//��ڲ�����
//          cardNO��ģ��ţ�Ĭ�ϴ� 1 ��ʼ
//                    ���ϵͳ��ֻ����һ��USBģ�飬���������Ϊ1������
//����ֵ��  0  ���ɹ�
//         -1  ��ʧ�ܣ�Ӧ�ý�һ������ ZT7660_GetLastErr �жϳ���ԭ��
ZT_API unsigned long _stdcall ZT7660_GetLastErr();
//�������ƣ�ZT7660_GetLastErr
//�������ܣ��õ���ǰ����š���������Ϊ0��ʾ�޴���
//����ֵ��������룬������뺬���뿴�궨��
ZT_API void _stdcall ZT7660_ClearLastErr();
//�������ƣ�ZT7660_ClearLastErr
//�������ܣ��������š�
//          ע�⣺һ����������Ϊ��ʹ������������ִ�У�������������
//����ֵ����
ZT_API void _stdcall ZT7660_SetBaseNO(unsigned long baseNO);
//�������ƣ�ZT7660_SetBaseNO
//�������ܣ����ð忨������(cardNO)��оƬ��(chipNO)���ں�(portNO)��ͨ����(chNO)��
//          ��֮����NO����׺�Ĳ����Ǵ�0��ʼ���Ǵ�1��ʼ��Ĭ��Ϊ��1��ʼ
//          ���鲻Ҫ�����������
//��ڲ�����
//          baseNO��ֻ����Ϊ0��1
//����ֵ����
ZT_API long _stdcall ZT7660_GetBaseNO();
//�������ƣ�ZT7660_GetBaseNO
//�������ܣ����ص�ǰ�忨������(cardNO)��оƬ��(chipNO)���ں�(portNO)��ͨ����(chNO)��
//          ��֮����NO����׺�Ĳ����Ǵ�0��ʼ���Ǵ�1��ʼ��Ĭ��Ϊ��1��ʼ
//����ֵ������0  ����0��ʼ
//        ����1  ����1��ʼ
ZT_API long _stdcall ZT7660_AIonce(unsigned long cardNO,
                                   unsigned long chMode,
                                   unsigned long chNO,
                                   unsigned long AIrange,
                                   unsigned long AIAmp,
                                   unsigned long ADstartMode,
                                   unsigned long ADfreq,
                                   unsigned long ABflag,
                                   unsigned long ch1Flag,
                                   unsigned long ADctrlWord,
                                   unsigned long ADoverTime);
//�������ƣ�ZT7660_AIonce
//�������ܣ���ָ��ͨ�����е������ݲɼ�������Ҫ�ȵ��� ZT7660_AIinit
//
//��ڲ�����
//          cardNO��ģ��ţ�Ĭ�ϴ� 1 ��ʼ���й������������ϸ˵������ο� ZT7660_OpenDevice ����
//          chMode��ͨ����ʽ
//                    0 = ��ʾ���ˣ��̶���ͨ����ʽ
//                    2 = ��ʾ˫�ˣ��̶���ͨ����ʽ
//            chNO��ͨ����
//                    ��chMode = 0 ʱ��Ϊͨ����(1--48)
//                    ��chMode = 2 ʱ��Ϊͨ����(1--24)
//         AIrange��ѡ��Բɼ�����ADԭ��ֵ�����ֱ任��Ӧ����AD�ɼ�����(һ��������)��ƥ�䣺
//                    AIrange = 0����ʾ����ԭ��ֵ�����п��������ַ�ʽ��
//                                 ����12λ�Ŀ����� 0~4095 ֮���ֵ
//                                 ����16λ�Ŀ����� 0~65535 ֮���ֵ
//                    AIrange = 1����ʾ��ԭ��ֵת��Ϊ 0 -- 5000mV ֮���ֵ������˿�û���������̣���Ӧѡ���ַ�ʽ
//                    AIrange = 2����ʾ��ԭ��ֵת��Ϊ 0 -- 10000mV ֮���ֵ������˿�û���������̣���Ӧѡ���ַ�ʽ
//                    AIrange = 5����ʾ��ԭ��ֵת��Ϊ -5000 -- 5000mV ֮���ֵ������˿�û���������̣���Ӧѡ���ַ�ʽ
//           AIAmp���̿�����ϵ��(0��2)��
//                    0 = 1������(������)��1 = 10�����棻2 = 100������
//     ADstartMode�����������ִ˲���Ϊ0
//          ADfreq�����������ִ˲���Ϊ0
//          ABflag������ģ��ΪA��(12bit)����B��(16bit)
//                    0 = A�ͣ�1 = B��
//         ch1Flag�����������ִ˲���Ϊ0
//      ADctrlWord��һ�㱣�ִ˲���Ϊ0��
//                    ���˲�����Ϊ0��������ֱ�������������ֵ��ʼ��AD����������Ӱ��AD��ʽ�Ĳ�����
//                    ����chMode��AIrange��AIAmp��ABflag��ch1Flag��ֵ���迼�ǡ�
//                    �˲�����˵����ο�˵�����ж� usb7660AI ������lCode������˵����
//      ADoverTime�������������������Ϊ0
//����ֵ�� ������ -1�����ɼ�����AD���
//             -1   ���� ZT7660_GetLastErr ����ֵ���� 0 ʱ����AD���
//                    �� ZT7660_GetLastErr ����ֵС�� 0 ʱ����ʧ��
ZT_API long _stdcall ZT7660_AIinit(unsigned long cardNO,
                                   unsigned long chMode,
                                   unsigned long chNO,
                                   unsigned long AIrange,
                                   unsigned long AIAmp,
                                   unsigned long ADstartMode,
                                   unsigned long ADfreq,
                                   unsigned long ABflag,
                                   unsigned long ch1Flag,
                                   unsigned long ADctrlWord,
                                   unsigned long ADoverTime);
//�������ƣ�ZT7660_AIinit
//�������ܣ���ʼ��AD
//
//��ڲ�����
//          cardNO��ģ��ţ�Ĭ�ϴ� 1 ��ʼ���й������������ϸ˵������ο� ZT7660_OpenDevice ����
//          chMode��ͨ����ʽ
//                    0 = ��ʾ���ˣ��̶���ͨ����ʽ
//                    1 = ��ʾ���ˣ���ͨ��ɨ�跽ʽ
//                    2 = ��ʾ˫�ˣ��̶���ͨ����ʽ
//                    3 = ��ʾ˫�ˣ���ͨ��ɨ�跽ʽ
//            chNO��ͨ���Ż��ͨ��ѭ�������ֹͨ����
//                    ��chMode = 0 ʱ��Ϊͨ����(1--48)
//                    ��chMode = 1 ʱ��Ϊ��ͨ��ѭ���ɼ���ֹͨ����(1--48)��������Ϊ2��ʾ���ɼ���˳��Ϊ��ͨ��1,ͨ��2,ͨ��1,ͨ��2......
//                    ��chMode = 2 ʱ��Ϊͨ����(1--24)
//                    ��chMode = 3 ʱ��Ϊ��ͨ��ѭ���ɼ���ֹͨ����(1--24)��������Ϊ2��ʾ���ɼ���˳��Ϊ��ͨ��1,ͨ��2,ͨ��1,ͨ��2......
//         AIrange��ѡ��Բɼ�����ADԭ��ֵ�����ֱ任��Ӧ����AD�ɼ�����(һ��������)��ƥ�䣺
//                    AIrange = 0����ʾ����ԭ��ֵ�����п��������ַ�ʽ��
//                                 ����12λ�Ŀ����� 0~4095 ֮���ֵ
//                                 ����16λ�Ŀ����� 0~65535 ֮���ֵ
//                    AIrange = 1����ʾ��ԭ��ֵת��Ϊ 0 -- 5000mV ֮���ֵ������˿�û���������̣���Ӧѡ���ַ�ʽ
//                    AIrange = 2����ʾ��ԭ��ֵת��Ϊ 0 -- 10000mV ֮���ֵ������˿�û���������̣���Ӧѡ���ַ�ʽ
//                    AIrange = 5����ʾ��ԭ��ֵת��Ϊ -5000 -- 5000mV ֮���ֵ������˿�û���������̣���Ӧѡ���ַ�ʽ
//           AIAmp���̿�����ϵ��(0��2)��
//                    0 = 1������(������)��1 = 10�����棻2 = 100������
//     ADstartMode�����������ִ˲���Ϊ0
//          ADfreq��ָ��AD�ܲ���Ƶ��
//                    ����USB-7660��, ����0~4���ɹ�ѡ��
//                      0 = 1KHz��1 = 10KHz��2 = 25KHz��3 = 50KHz��4 = 75KHz
//                    ����USB-7660A��, ����0~6���ɹ�ѡ��
//                      0 = 1KHz��1 = 10KHz��2 = 25KHz��3 = 50KHz��4 = 100KHz��5 = 250KHz��6 = 500KHz
//                    ����USB-7660B��, ����0~5���ɹ�ѡ��
//                      0 = 1KHz��1 = 5KHz��2 = 10KHz��3 = 25KHz��4 = 50KHz��5 = 100KHz
//                    ע�� ���������õ���AD�ܲ���Ƶ�ʣ��������Ƶ��Ϊ100KHz��
//                         ����1��ͨ����˵�����ͨ���Ĳ���Ƶ��ȷʵΪ 100KHz��
//                         ����2��ͨ����˵��ÿ��ͨ���Ĳ���Ƶ�ʱ�Ϊ  50KHz��
//                         ����4��ͨ����˵��ÿ��ͨ���Ĳ���Ƶ�ʱ�Ϊ  25KHz��
//                         ע�⣺�û�����ͨ����ѡ���ܲ���Ƶ����ͨ�������䣬�õ����ӽ��Լ���Ҫ�Ĳ���Ƶ��
//          ABflag������ģ��ΪA��(12bit)����B��(16bit)
//                    0 = A�ͣ�1 = B��
//         ch1Flag������B��(16bit)ģ�飬�����Ƿ񷵻�ͨ��1��־
//      ADctrlWord��һ�㱣�ִ˲���Ϊ0��
//                    ���˲�����Ϊ0��������ֱ�������������ֵ��ʼ��AD����������Ӱ��AD��ʽ�Ĳ�����
//                    ����chMode��AIAmp��ADstartMode��ADfreq��ABflag��ch1Flag��ֵ���迼�ǡ�
//                    �˲�����˵����ο�˵�����ж� usb7660AIInit ������lCode������˵����
//      ADoverTime�������������������Ϊ0
//����ֵ��  0  ���ɹ�
//         -1  ��ʧ�ܣ�Ӧ�ý�һ������ ZT7660_GetLastErr �жϳ���ԭ��
ZT_API long _stdcall ZT7660_FifoStatus(unsigned long cardNO);
//�������ƣ�
//�������ܣ���ȡ�ɼ�ģ����Ӳ��������(FIFO)��״̬
//
//��ڲ�����
//          cardNO��ģ��ţ�Ĭ�ϴ� 1 ��ʼ���й������������ϸ˵������ο� ZT7660_OpenDevice ����
//
//����ֵ��  0  ����
//          1  ����δ����
//          3  ����δȫ��
//          7  ȫ��
//         -1  ��ʧ�ܣ�Ӧ�ý�һ������ ZT7660_GetLastErr �жϳ���ԭ��
ZT_API long _stdcall ZT7660_ADstop(unsigned long cardNO);
//�������ƣ�
//�������ܣ�ֹͣ�����ɼ����ɼ���Ӳ��ʱ��ֹͣ��������FIFO�����
//
//��ڲ�����
//          cardNO��ģ��ţ�Ĭ�ϴ� 1 ��ʼ���й������������ϸ˵������ο� ZT7660_OpenDevice ����
//
//����ֵ��  0  ���ɹ�
//         -1  ��ʧ�ܣ�Ӧ�ý�һ������ ZT7660_GetLastErr �жϳ���ԭ��
ZT_API long _stdcall ZT7660_ClearFifo(unsigned long cardNO);
//�������ƣ�
//�������ܣ����ģ����Ӳ��������(FIFO)
//
//��ڲ�����
//          cardNO��ģ��ţ�Ĭ�ϴ� 1 ��ʼ���й������������ϸ˵������ο� ZT7660_OpenDevice ����
//
//����ֵ��  0  ���ɹ�
//         -1  ��ʧ�ܣ�Ӧ�ý�һ������ ZT7660_GetLastErr �жϳ���ԭ��
ZT_API long _stdcall ZT7660_GetSFifoDataCnt(unsigned long cardNO);
//�������ƣ�ZT7660_GetSFifoDataCnt
//�������ܣ��õ����������������ݸ���
//
//��ڲ�����
//          cardNO��ģ��ţ�Ĭ�ϴ� 1 ��ʼ���й������������ϸ˵������ο� ZT7660_OpenDevice ����
//
//����ֵ��  0  ���ɹ�
//         -1  ��ʧ�ܣ�Ӧ�ý�һ������ ZT7660_GetLastErr �жϳ���ԭ��
ZT_API long _stdcall ZT7660_AIFifo(unsigned long cardNO,
                                   unsigned long packetBytesSize,
                                   unsigned long wantReadCount,
                                   short *pResultArr);
//�������ƣ�
//�������ܣ�������ȡAD���ݡ�
//          ע�⣺�ڵ����������֮ǰ��Ӧ��ȷ���Ѿ����ù� ZT7660_AIinit ������������ȷ�ĳ�ʼ��
//                ��������ѱ� ZT7660_AIFifoEx ȡ�����ڴ˴�ֻ���ڼ���Ŀ���ṩ�˺�����
//��ڲ�����
//          cardNO��ģ��ţ�Ĭ�ϴ� 1 ��ʼ���й������������ϸ˵������ο� ZT7660_OpenDevice ����
// packetBytesSize�����Ĵ�С(�ֽڳߴ�)��������512�ı���
//   wantReadCount���û�ϣ�����������ݸ�����������ͨ�������������Ҳ��ܳ����û���������ʵ�ʴ�С
//      pResultArr���û���������һ�����ٺ��� wantReadCount �� short ��Ԫ�صĻ�������
//                    ���ڴ�Ųɼ�������� pResultArr ��������������׵�ַ��
//                    
//����ֵ�� ���ڵ���0  ���������ж�������Ч���ݵĸ���
//             -1     ��ʧ�ܣ�Ӧ�ý�һ������ ZT7660_GetLastErr �жϳ���ԭ��
ZT_API long _stdcall ZT7660_AIFifoEx(unsigned long cardNO,
                                   unsigned long wantReadCount,
                                   short *pResultArr);
//�������ܣ�������ȡAD���ݡ�
//          ע�⣺�ڵ����������֮ǰ��Ӧ��ȷ���Ѿ����ù� ZT7660_AIinit ������������ȷ�ĳ�ʼ��
//                ��������������ܹ���ZT7660_AIFifoCodeͬʱʹ�ã�Ҳ�����ڵ���ZT7660_AIinit��
//                ֻ�̶ܹ�ʹ��һ��������ȡ���ݡ�
//��ڲ�����
//          cardNO��ģ��ţ�Ĭ�ϴ� 1 ��ʼ���й������������ϸ˵������ο� ZT7660_OpenDevice ����
//   wantReadCount���û�ϣ�����������ݸ�����������ͨ�������������Ҳ��ܳ����û���������ʵ�ʴ�С
//      pResultArr���û���������һ�����ٺ��� wantReadCount �� short ��Ԫ�صĻ�������
//                    ���ڴ�Ųɼ�������� pResultArr ��������������׵�ַ��
//                    
//����ֵ�� ���ڵ���0  ���������ж�������Ч���ݵĸ���
//             -1     ��ʧ�ܣ�Ӧ�ý�һ������ ZT7660_GetLastErr �жϳ���ԭ��
ZT_API long _stdcall ZT7660_AIFifoCode(unsigned long cardNO,
                                       unsigned long wantReadCount,
                                       unsigned short *pResultArr);
//�������ܣ�������ȡADԴ��ֵ��
//          ע�⣺�ڵ����������֮ǰ��Ӧ��ȷ���Ѿ����ù� ZT7660_AIinit ������������ȷ�ĳ�ʼ��,
//                ��������������ܹ���ZT7660_AIFifoExͬʱʹ�ã�Ҳ�����ڵ���ZT7660_AIinit��
//                ֻ�̶ܹ�ʹ��һ��������ȡ���ݡ�
//��ڲ�����
//          cardNO��ģ��ţ�Ĭ�ϴ� 1 ��ʼ���й������������ϸ˵������ο� ZT7660_OpenDevice ����
//   wantReadCount���û�ϣ�����������ݸ�����������ͨ�������������Ҳ��ܳ����û���������ʵ�ʴ�С
//���ڲ�����
//      pResultArr���û���������һ�����ٺ��� wantReadCount �� unsigned short ��Ԫ�صĻ�������
//                    ���ڴ�Ųɼ�������� pResultArr ��������������׵�ַ��
//                    
//����ֵ�� ���ڵ���0  ���������ж�������Ч���ݵĸ���
//             -1     ��ʧ�ܣ�Ӧ�ý�һ������ ZT7660_GetLastErr �жϳ���ԭ��

ZT_API long _stdcall ZT7660_CTStart(unsigned long cardNO,
                                     unsigned long chNO,
                                     unsigned long CTMode,
                                     unsigned long CTinitVal);
//�������ƣ�
//�������ܣ�����ָ��8253/8254оƬ��ָ��ͨ���Ĺ�����ʽ������ͨ����ֵ
//          ע�⣺��Ӳ���ĽǶ���˵��ֻ�е��������嵽��ʱ����������ֵ�Żᱻװ��
//��ڲ�����
//          cardNO��ģ��ţ�Ĭ�ϴ� 1 ��ʼ���й������������ϸ˵������ο� ZT7660_OpenDevice ����
//            chNO��ͨ���ţ�1--3
//          CTMode��ͨ��������ʽ��0-5(������ʽֻ��0��ʼ)
//       CTinitVal������ͨ���ĳ�ֵ(0--65535)
//����ֵ��  0  ���ɹ�
//         -1  ��ʧ�ܣ�Ӧ�ý�һ������ ZT7660_GetLastErr �жϳ���ԭ��
ZT_API long _stdcall ZT7660_CTRead(unsigned long cardNO,
                                    unsigned long chNO,
                                    unsigned long lockBeforeRead);
//�������ƣ�
//�������ܣ���ȡָ��8253/8254оƬ��ָ������ͨ���ĵ�ǰֵ(����������)
//          �˺�����Ӱ��������ļ�������
//��ڲ�����
//          cardNO��ģ��ţ�Ĭ�ϴ� 1 ��ʼ���й������������ϸ˵������ο� ZT7660_OpenDevice ����
//            chNO��ͨ���ţ�1--3
//  lockBeforeRead����������Ϊ0����
//
//����ֵ��  ���ؼ�������ǰֵ
//          ������ -1 ��ʾ��������ʧ�ܣ�Ӧ�ý�һ������ ZT7660_GetLastErr �������ҳ���ԭ��
ZT_API long _stdcall ZT7660_CTStop(unsigned long cardNO,
                                    unsigned long chNO);
//�������ƣ�
//�������ܣ�ָֹͣ��8253/8254оƬ��ָ��ͨ������
//��ڲ�����
//          cardNO��ģ��ţ�Ĭ�ϴ� 1 ��ʼ���й������������ϸ˵������ο� ZT7660_OpenDevice ����
//            chNO��ͨ���ţ�1--3
//
//����ֵ��  0  ���ɹ�
//         -1  ��ʧ�ܣ�Ӧ�ý�һ������ ZT7660_GetLastErr �жϳ���ԭ��
ZT_API long _stdcall ZT7660_CTStopEx(unsigned long cardNO,
                                      unsigned long chNO,
				 	                  unsigned long CTMode);
//�������ƣ�ZT7660_CTStopEx
//�������ܣ�ָֹͣ��8253/8254оƬ��ָ��ͨ������
//��ڲ�����
//          cardNO��ģ��ţ�Ĭ�ϴ� 1 ��ʼ���й������������ϸ˵������ο� ZT7660_OpenDevice ����
//            chNO��ͨ���ţ�1--3
//          CTMode��������ʽ��0--5
//
//����ֵ��  0  ���ɹ�
//         -1  ��ʧ�ܣ�Ӧ�ý�һ������ ZT7660_GetLastErr �жϳ���ԭ��


ZT_API long _stdcall ZT7660_DIBit(unsigned long cardNO, unsigned long chNO);
//�������ƣ�
//�������ܣ��õ�ָ��ͨ���Ŀ���������״̬
//��ڲ�����
//          cardNO��ģ��ţ�Ĭ�ϴ� 1 ��ʼ���й������������ϸ˵������ο� ZT7660_OpenDevice ����
//            chNO��ͨ���ţ�1--16
//����ֵ��
//          0 ��ʾ�͵�ƽ
//          1 ��ʾ�ߵ�ƽ
//         -1 ��ʾ���ó�����Ӧ�ý�һ������ ZT7660_GetLastErr �����жϳ���ԭ��
ZT_API long _stdcall ZT7660_DIAll(unsigned long cardNO);
//�������ƣ�
//�������ܣ��õ�����ͨ���Ŀ���������״̬��
//��ڲ�����
//          cardNO��ģ��ţ�Ĭ�ϴ� 1 ��ʼ���й������������ϸ˵������ο� ZT7660_OpenDevice ����
//����ֵ��
//             0     ��ʾ����ͨ���Ŀ���������״̬Ϊ�͵�ƽ
//           0xFFFF  ��ʾ����ͨ���Ŀ���������״̬Ϊ�ߵ�ƽ
//            -1     ��ʾ���ó�����Ӧ�ý�һ������ ZT7660_GetLastErr �����жϳ���ԭ��
ZT_API long _stdcall ZT7660_DOBit(unsigned long cardNO,
							  	   unsigned long chNO,
							 	   unsigned long nState);
//�������ƣ�
//�������ܣ�ָ��ĳͨ���Ŀ��������״̬
//��ڲ�����
//             cardNO��ģ��ţ�Ĭ�ϴ� 1 ��ʼ���й������������ϸ˵������ο� ZT7660_OpenDevice ����
//               chNO��ͨ���ţ�1--16
//             nState��ָ��ĳͨ���Ŀ��������״̬��
//                       nState =    0    ��ָ������͵�ƽ
//                       nState = 1(���0)��ָ������ߵ�ƽ
//����ֵ��  
//           0      ��ʾ�ɹ�
//          -1      ��ʾ���ó�����Ӧ�ý�һ������ ZT7660_GetLastErr �����жϳ���ԭ��
ZT_API long _stdcall ZT7660_DOAll(unsigned long cardNO, unsigned long nStateAll);
//�������ƣ�
//�������ܣ�ָ������ͨ���Ŀ��������״̬��
//��ڲ�����
//          cardNO��ģ��ţ�Ĭ�ϴ� 1 ��ʼ���й������������ϸ˵������ο� ZT7660_OpenDevice ����
//       nStateAll��ָ������ͨ���Ŀ��������״̬��
//                    nStateAll =   0 ��ָ������ͨ������͵�ƽ
//                    nStateAll = 0xFFFF��ָ������ͨ������ߵ�ƽ
//����ֵ��   0      ��ʾ�ɹ�
//          -1      ��ʾ���ó�����Ӧ�ý�һ������ ZT7660_GetLastErr �����жϳ���ԭ��
ZT_API long _stdcall ZT7660N_DIBit(unsigned long cardNO, unsigned long chNO);
//�������ƣ�ZT7660N_DIBit
//�������ܣ��õ�ָ��ͨ���Ŀ���������״̬
//            ע�⣺�˺���ֻ����ͺ��д�N��ģ�飬���磺7660N��7660AN��7660BN�ȣ�
//                  �ͺ��д�N��ʾ������������������
//��ڲ�����
//          cardNO��ģ��ţ�Ĭ�ϴ� 1 ��ʼ���й������������ϸ˵������ο� ZT7660_OpenDevice ����
//            chNO��ͨ���ţ�1--16
//����ֵ��
//          0 ��ʾ�͵�ƽ
//          1 ��ʾ�ߵ�ƽ
//         -1 ��ʾ���ó�����Ӧ�ý�һ������ ZT7660_GetLastErr �����жϳ���ԭ��
ZT_API long _stdcall ZT7660N_DIAll(unsigned long cardNO);
//�������ƣ�ZT7660N_DIAll
//�������ܣ��õ�����ͨ���Ŀ���������״̬��
//            ע�⣺�˺���ֻ����ͺ��д�N��ģ�飬���磺7660N��7660AN��7660BN�ȣ�
//                  �ͺ��д�N��ʾ������������������
//��ڲ�����
//          cardNO��ģ��ţ�Ĭ�ϴ� 1 ��ʼ���й������������ϸ˵������ο� ZT7660_OpenDevice ����
//����ֵ��
//             0     ��ʾ����ͨ���Ŀ���������״̬Ϊ�͵�ƽ
//           0xFFFF  ��ʾ����ͨ���Ŀ���������״̬Ϊ�ߵ�ƽ
//            -1     ��ʾ���ó�����Ӧ�ý�һ������ ZT7660_GetLastErr �����жϳ���ԭ��
ZT_API long _stdcall ZT7660N_DOBit(unsigned long cardNO,
							  	   unsigned long chNO,
							 	   unsigned long nState);
//�������ƣ�ZT7660N_DOBit
//�������ܣ�ָ��ĳͨ���Ŀ��������״̬
//            ע�⣺�˺���ֻ����ͺ��д�N��ģ�飬���磺7660N��7660AN��7660BN�ȣ�
//                  �ͺ��д�N��ʾ������������������
//��ڲ�����
//          cardNO��ģ��ţ�Ĭ�ϴ� 1 ��ʼ���й������������ϸ˵������ο� ZT7660_OpenDevice ����
//            chNO��ͨ���ţ�1--16
//          nState��ָ��ĳͨ���Ŀ��������״̬��
//                    nState =    0    ��ָ������͵�ƽ
//                    nState = 1(���0)��ָ������ߵ�ƽ
//����ֵ��  
//           0      ��ʾ�ɹ�
//          -1      ��ʾ���ó�����Ӧ�ý�һ������ ZT7660_GetLastErr �����жϳ���ԭ��
ZT_API long _stdcall ZT7660N_DOAll(unsigned long cardNO, unsigned long nStateAll);
//�������ƣ�ZT7660N_DOAll
//�������ܣ�ָ������ͨ���Ŀ��������״̬��
//            ע�⣺�˺���ֻ����ͺ��д�N��ģ�飬���磺7660N��7660AN��7660BN�ȣ�
//                  �ͺ��д�N��ʾ������������������
//��ڲ�����
//          cardNO��ģ��ţ�Ĭ�ϴ� 1 ��ʼ���й������������ϸ˵������ο� ZT7660_OpenDevice ����
//       nStateAll��ָ������ͨ���Ŀ��������״̬��
//                    nStateAll =   0 ��ָ������ͨ������͵�ƽ
//                    nStateAll = 0xFFFF��ָ������ͨ������ߵ�ƽ
//����ֵ��   0      ��ʾ�ɹ�
//          -1      ��ʾ���ó�����Ӧ�ý�һ������ ZT7660_GetLastErr �����жϳ���ԭ��
ZT_API long _stdcall ZT7660_AOonce(unsigned long cardNO,
                                    unsigned long chNO,
                                    unsigned long AORange,
                                    long nValue);
//�������ƣ�
//�������ܣ�ָ��ĳͨ��ģ�������һ��
//��ڲ�����
//          cardNO��ģ��ţ�Ĭ�ϴ� 1 ��ʼ���й������������ϸ˵������ο� ZT7660_OpenDevice ����
//            chNO��ͨ����1--4(ͨ����Ĭ�ϴ�1��ʼ)
//         AORange�������������������nValueת��Ϊ��Ӧ��ԭ��ֵ(0-4095)
//                    ֮����Ҫת��������Ϊ��忨����Ӧ�Ĵ���д��DAֵʱ��������ԭ��ֵ��
//                    Ϊ�˽�ʡת����ʱ�䣬�����û�ֱ�Ӱ� nValue ��Ϊԭ��ֵ��
//                    ע�⣺�û�ѡ��������Χ��������Ӳ��������һ��!
//                    
//                    AORange = 0����ʾ nValue �Ѿ���ԭ��ֵ������Ҫת��
//                    AORange = 1����ʾ nValue �� 0 -- 5000mV ֮���ֵ����Ҫת��Ϊԭ��ֵ
//                                  ����˿�û�����������Χ����Ӧѡ���ַ�ʽ
//                    AORange = 2����ʾ nValue �� 0 -- 10000mV ֮���ֵ����Ҫת��Ϊԭ��ֵ
//                                  ����˿�û�����������Χ����Ӧѡ���ַ�ʽ
//                    AORange = 5����ʾ nValue �� -5000 -- 5000mV ֮���ֵ����Ҫת��Ϊԭ��ֵ
//                                  ����˿�û�����������Χ����Ӧѡ���ַ�ʽ
//                    AORange = 6����ʾ nValue �� -10000 -- 10000mV ֮���ֵ����Ҫת��Ϊԭ��ֵ
//                                  ����˿�û�����������Χ����Ӧѡ���ַ�ʽ
//                    AORange = 10����ʾ nValue �� 0 -- 20000uA ֮���ֵ����Ҫת��Ϊԭ��ֵ
//                                  ����˿�û�����������Χ����Ӧѡ���ַ�ʽ
//                    AORange = 11����ʾ nValue �� 4000 -- 20000uA ֮���ֵ����Ҫת��Ϊԭ��ֵ
//                                  ����˿�û�����������Χ����Ӧѡ���ַ�ʽ
//          nValue��Ҫ�����ֵ�����統AORange = 1ʱ��nValue=3000 ��ʾ���3V
//
//����ֵ��  0  ���ɹ�
//         -1  ��ʧ�ܣ�Ӧ�ý�һ������ ZT7660_GetLastErr �жϳ���ԭ��
ZT_API long _stdcall ZT7660_TransArr(short *pInArr,
									 short *pOutArr,
									 unsigned long dataType,
									 unsigned long chCnt,
									 unsigned long cntPerCh);
//Ϊ����labview��ʹ�÷��㣬�Ӵ˹���
//dataType = 0����float ���ݲ�֧��
//dataType = 1����short

ZT_API long _stdcall CalcEffiVal(short *pInArr,
								 unsigned long chCnt,
                                 unsigned long dataCntPerCh,
								 short *pOutArr);
//�������ܣ���������AD����һ������Ҳ��Ҫ�ȵ��� ZT7660_AIinit
//��ڲ�����
//             cardNO���忨��Ĭ�ϴ� 1 ��ʼ���й������������ϸ˵������ο� ZT7660_OpenDevice ����
//         pResultArr���û���������һ�����ٺ��� wantReadCount �� short ��Ԫ�صĻ�������
//                     ���ڴ�Ųɼ�������� pResultArr ��������������׵�ַ��
//      wantReadCount���û�ϣ�����������ݸ���������>0���Ҳ��ܳ����û���������ʵ�ʴ�С
//                    
//����ֵ��  ���ڵ���0  ����������Ч���ݵĸ���
//         -1  ��ʧ�ܣ�Ӧ�ý�һ������ ZT7660_GetLastErr �жϳ���ԭ��

ZT_API long _stdcall ZT7660_SetABFlag(unsigned long cardNO, 
									  unsigned long ABflag );
//�������ܣ�����ģ��ΪA��(12bit)����B��(16bit)
//
//��ڲ�����
//          cardNO��ģ��ţ�Ĭ�ϴ� 1 ��ʼ���й������������ϸ˵������ο� ZT7660_OpenDevice ����
//          ABflag������ģ��ΪA��(12bit)����B��(16bit)
//                    0 = A�ͣ�1 = B��
//����ֵ�� ���ڵ���0  ��ʾ�ɹ�
//         -1  ��ʧ�ܣ�Ӧ�ý�һ������ ZT7660_GetLastErr �жϳ���ԭ��

ZT_API long _stdcall ZT7660_ADGetMask( unsigned long cardNO, unsigned long abFlag );
//�������ܣ���������λ
//
//��ڲ�����
//          cardNO��ģ��ţ�Ĭ�ϴ� 1 ��ʼ���й������������ϸ˵������ο� ZT7660_OpenDevice ����
//          ABflag������ģ��ΪA��(12bit)����B��(16bit)
//                    0 = A�ͣ�1 = B��
//����ֵ�� ���ڵ���0  ��ʾ�ɹ�
//         -1  ��ʧ�ܣ�Ӧ�ý�һ������ ZT7660_GetLastErr �жϳ���ԭ��

ZT_API long _stdcall ZT7660_ADGetMaxCode( unsigned long cardNO, 
                                          unsigned long chNo,
                                          unsigned long rangeInx,
                                          unsigned long abFlag);
//�������ܣ��������Դ��ֵ
//
//��ڲ�����
//          cardNO��ģ��ţ�Ĭ�ϴ� 1 ��ʼ���й������������ϸ˵������ο� ZT7660_OpenDevice ����
//           lChNo�����������0����
//        lChRange�����������0����
//          abFlag��ָ����A�ͻ���B�ͣ�
//                  0,��ʾA��12λ
//                  1,��ʾB��16λ
//����ֵ�� ���ڵ���0  ���Դ��ֵ
//         -1  ��ʧ�ܣ�Ӧ�ý�һ������ ZT7660_GetLastErr �жϳ���ԭ��

ZT_API long _stdcall ZT7660_ADGetMinCode( unsigned long lCardNo,
                                          unsigned long chNo,
                                          unsigned long rangeInx,
                                          unsigned long abFlag);
//�������ܣ�������СԴ��ֵ
//
//��ڲ�����
//          cardNO��ģ��ţ�Ĭ�ϴ� 1 ��ʼ���й������������ϸ˵������ο� ZT7660_OpenDevice ����
//           lChNo�����������0����
//        lChRange�����������0����
//          abFlag��ָ����A�ͻ���B�ͣ�
//                  0,��ʾA��12λ
//                  1,��ʾB��16λ
//����ֵ�� ���ڵ���0  ��СԴ��ֵ
//         -1  ��ʧ�ܣ�Ӧ�ý�һ������ ZT7660_GetLastErr �жϳ���ԭ��

ZT_API double _stdcall ZT7660_ADGetMaxValue(unsigned long cardNO,
                                            unsigned long chNo,
                                            unsigned long rangeInx,
                                            unsigned long abFlag);
//�������ܣ�����ָ����Χ�����ֵ
//��ڲ�����
//          cardNO���������������������ֵ
//            chNo���������������ʹ����ֵ
//        rangeInx��ģ������Χ0~11���������Χ֮�����ֵ������Դ�����ֵ
//          abFlag��ָ����A�ͻ���B�ͣ�
//                  0,��ʾA��12λ��������rangeInxΪ0ʱ���ص����ֵ��4095
//                  1,��ʾB��16λ��������rangeInxΪ0ʱ���ص����ֵ��65535
//                    
//����ֵ��ָ����Χ�������ֵ

ZT_API double _stdcall ZT7660_ADGetMinValue(unsigned long cardNO,
											unsigned long chNo,
											unsigned long rangeInx,
											unsigned long abFlag);
//�������ܣ�����ָ����Χ�������Сֵ
//��ڲ�����
//          cardNO���������������������ֵ
//            chNo���������������ʹ����ֵ
//        rangeInx��ģ������Χ0~11���������Χ֮�����ֵ������Դ����Сֵ
//          abFlag���������������ʹ����ֵ
//����ֵ��ָ����Χ����С��ֵ

ZT_API long _stdcall ZT7660_DAGetMaxCode( unsigned long cardNO, 
										 unsigned long chNo,
										 unsigned long rangeInx);
//�������ܣ��������Դ��ֵ
//
//��ڲ�����
//          cardNO��ģ��ţ�Ĭ�ϴ� 1 ��ʼ���й������������ϸ˵������ο� ZT7660_OpenDevice ����
//           lChNo�����������0����
//        lChRange�����������0����
//          abFlag��ָ����A�ͻ���B�ͣ�
//                  0,��ʾA��12λ
//                  1,��ʾB��16λ
//����ֵ�� ���ڵ���0  ���Դ��ֵ
//         -1  ��ʧ�ܣ�Ӧ�ý�һ������ ZT7660_GetLastErr �жϳ���ԭ��

ZT_API long _stdcall ZT7660_DAGetMinCode( unsigned long lCardNo,
										 unsigned long chNo,
										 unsigned long rangeInx);
//�������ܣ�������СԴ��ֵ
//
//��ڲ�����
//          cardNO��ģ��ţ�Ĭ�ϴ� 1 ��ʼ���й������������ϸ˵������ο� ZT7660_OpenDevice ����
//           lChNo�����������0����
//        lChRange�����������0����
//          abFlag��ָ����A�ͻ���B�ͣ�
//                  0,��ʾA��12λ
//                  1,��ʾB��16λ
//����ֵ�� ���ڵ���0  ���Դ��ֵ
//         -1  ��ʧ�ܣ�Ӧ�ý�һ������ ZT7660_GetLastErr �жϳ���ԭ��

ZT_API double _stdcall ZT7660_DAGetMaxValue(unsigned long cardNO,
                                            unsigned long chNo,
                                            unsigned long rangeInx);
//�������ܣ�����ָ����Χ�����ֵ
//��ڲ�����
//          cardNO���������������������ֵ
//            chNo���������������ʹ����ֵ
//        rangeInx��ģ������Χ0~11���������Χ֮�����ֵ������Դ�����ֵ
//          abFlag��ָ����A�ͻ���B�ͣ�
//                  0,��ʾA��12λ��������rangeInxΪ0ʱ���ص����ֵ��4095
//                  1,��ʾB��16λ��������rangeInxΪ0ʱ���ص����ֵ��65535
//                    
//����ֵ��ָ����Χ�������ֵ

ZT_API double _stdcall ZT7660_DAGetMinValue(unsigned long cardNO,
											unsigned long chNo,
											unsigned long rangeInx);
//�������ܣ�����ָ����Χ�������Сֵ
//��ڲ�����
//          cardNO���������������������ֵ
//            chNo���������������ʹ����ֵ
//        rangeInx��ģ������Χ0~11���������Χ֮�����ֵ������Դ����Сֵ
//          abFlag���������������ʹ����ֵ
//����ֵ��ָ����Χ����С��ֵ

ZT_API long _stdcall ZT7660_GetName( long lCardNo, TCHAR* tcName );


ZT_API long _stdcall ZT7660_FreRead(unsigned long cardNO,
                                     unsigned long *freDataArr);
//�������ƣ�
//�������ܣ���3·��������ǰ��Ƶֵ
//��ڲ�����
//          cardNO��ģ��ţ�Ĭ�ϴ� 1 ��ʼ���й������������ϸ˵������ο� ZT7660_OpenDevice ����
//      freDataArr�����3·��������ǰ��Ƶֵ�ĵ�ַָ��
//
//����ֵ��  0  ���ɹ�
//         -1  ��ʧ�ܣ�Ӧ�ý�һ������ ZT7660_GetLastErr �жϳ���ԭ��



}
#endif
