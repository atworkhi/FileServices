package xin.hanxx.FileService.service;

import java.util.List;

import xin.hanxx.FileService.domain.UpFile;

/**   
  * @ClassName: UpFileService
  * @Description: TODO
  * @author: 韩星星  
  * @createTime: 2017年11月9日 上午11:57:23  
  * @desc:    文件操作的方法
  */

public interface UpFileService {

	/**
	 * 保存文件
	 * @param file
	 * @return
	 */
	UpFile saveFile(UpFile file);
	
	/**
	 * 删除文件
	 * @param id
	 */
	void removeFile(String id);
	
	/**
	 * 根据ID获取文件
	 * @param id
	 * @return
	 */
	UpFile getFileById(String id);
	
	/**
	 * 获取文件列表
	 * @return
	 */
	List<UpFile> listFiles();
}
  
    