package test;

import main.RpcFramework;

/**
* @ClassName RpcProvider
* @Description 暴露服务
* @author fxbing
* @date 2018年9月12日
*
*/
    
public class RpcProvider {

	public static void main (String[] args) throws Exception {
		// TODO Auto-generated method stub
		HelloService service = new HelloServiceImpl();
		RpcFramework.export(service, 1234);
	}

}
