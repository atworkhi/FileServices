package xin.hanxx.FileService.utils;

import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**   
  * @ClassName: MD5Util
  * @Description: TODO
  * @author: 韩星星  
  * @createTime: 2017年11月9日 上午11:16:11  
  * @desc:    MD5工具类
  */

public class MD5Util {

	/**
	 * 获取该输入流md5的值
	 * @param is
	 * @return
	 * @throws NoSuchAlgorithmException
	 * @throws IOException
	 */
	public static String getMD5(InputStream is)throws NoSuchAlgorithmException,IOException{
		StringBuffer md5=new StringBuffer();
		MessageDigest md=MessageDigest.getInstance("MD5");
		byte[] dataBytes=new byte[1024];
		
		int line=0;
		while((line=is.read(dataBytes))!=-1) {
			md.update(dataBytes,0,line);
		}
		byte[] mdbyte=md.digest();
		
		for(int i=0;i<mdbyte.length;i++) {
			md5.append(Integer.toString((mdbyte[i] & 0xff) + 0x100, 16).substring(1));
		}
		return md5.toString();
		
	}
}
  
    