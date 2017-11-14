package xin.hanxx.FileService.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xin.hanxx.FileService.domain.UpFile;
import xin.hanxx.FileService.repository.UpFileRepository;
import xin.hanxx.FileService.service.UpFileService;

/**   
  * @ClassName: UpFileServiceImpl
  * @Description: TODO
  * @author: 韩星星  
  * @createTime: 2017年11月9日 下午12:01:29  
  * @desc:  对文件增删查改进行实现  
  */

@Service
public class UpFileServiceImpl implements UpFileService {

	@Autowired
	private UpFileRepository upFileRepository;
	
	@Transactional
	@Override
	public UpFile saveFile(UpFile file) {
		//TODO  
		return upFileRepository.save(file);
	}

	@Transactional
	@Override
	public void removeFile(String id) {
		
		upFileRepository.delete(id);
	}

	@Override
	public UpFile getFileById(String id) {
		//TODO  
		return upFileRepository.findOne(id);

	}

	@Override
	public List<UpFile> listFiles() {
		//TODO  
		return upFileRepository.findAll();

	}

	@Override
	public String sfDate() {
		//格式化日期
		Date date=new Date();
		SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String sfDate=sf.format(date);
		return sfDate;        
		    
	}

}
  
    