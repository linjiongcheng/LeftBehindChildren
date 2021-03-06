package XmlData;

import java.util.List;

import Object.News;

/**  
*  
* 定义XML文档建立与解析的接口  
*/   
public interface XmlDocument {   
	//初始化xml
	public void initXml(String fileName);
	/**  
	* 修改XML文档  
	* @param fileName 文件全路径名称  
	*/   
	public void modifyXml(News modifiedNews, String fileName);   
	/**  
	* 解析XML文档  
	* @param fileName 文件全路径名称  
	*/   
	public void parserXml(String fileName,List<News> newsList);   
}   