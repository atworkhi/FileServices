package xin.hanxx.FileService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import xin.hanxx.FileService.domain.UpFile;

/**   
  * @ClassName: UpFileRepository
  * @Description: TODO
  * @author: 韩星星  
  * @createTime: 2017年11月9日 上午11:55:58  
  * @desc:    资源库
  */

public interface UpFileRepository extends MongoRepository<UpFile, String>{

}
  
    