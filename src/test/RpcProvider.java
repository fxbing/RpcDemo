package test;

import main.RpcFramework;

/**
* @ClassName RpcProvider
* @Description ��¶����
* @author fxbing
* @date 2018��9��12��
*
*/
    
public class RpcProvider {

	public static void main (String[] args) throws Exception {
		// TODO Auto-generated method stub
		HelloService service = new HelloServiceImpl();
		RpcFramework.export(service, 1234);
	}

}
