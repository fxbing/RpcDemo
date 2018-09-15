package test;

import main.RpcFramework;

/**
* @ClassName RpcConsumer
* @Description ���÷���
* @author fxbing
* @date 2018��9��12��
*
*/
    
public class RpcConsumer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(HelloService.class.isInterface());
		HelloService service = RpcFramework.refer(HelloService.class, "127.0.0.1", 1234);
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			String hello = service.hello("World " + i);
			System.out.println(hello);
			Thread.sleep(1000);
		}
	}

}
