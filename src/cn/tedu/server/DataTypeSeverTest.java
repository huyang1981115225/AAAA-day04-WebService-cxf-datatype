package cn.tedu.server;

import javax.xml.ws.Endpoint;
import cn.tedu.ws.DataTypeWSImpl;

/**'
 * 演示CXF支持的数据类型
 * 
 * @author HY
 *
 */
public class DataTypeSeverTest {
	public static void main(String[] args) {
		String address = "http://localhost:9999/AAAA-day04-WebService-cxf-datatype/datatypews";
		
		Endpoint.publish(address, new DataTypeWSImpl());
		
		System.out.println("DataType-----WebService发布成功");
	}
}
