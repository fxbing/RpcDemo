package test;

/**
* @ClassName HelloServiceImpl
* @Description 实现服务
* @author fxbing
* @date 2018年9月12日
*
*/
    
public class HelloServiceImpl implements HelloService {

	@Override
	public String hello(String name) {
		// TODO Auto-generated method stub
		return "Hello " + name;
	}

}
