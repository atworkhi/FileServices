package xin.hanxx.FileService.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

/**   
  * @ClassName: UpFile
  * @Description: TODO
  * @author: 韩星星  
  * @createTime: 2017年11月9日 上午10:59:15  
  * @desc: 文件上传实体    
  */

//mongodb
@Document
public class UpFile implements Serializable{
	 
	    
	private static final long serialVersionUID = 1L;
	//主键
	@Id 
	private String id;
	//文件名
	private String name;
	//文件类型
	private String contentType;
	//文件大小
	private Long size;
	//上传日期
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private String uploadDate;
	//文件md5
	private String md5;
	//文件内容
	private byte[] content;
	//文件路径
	private String path;
	/**  
	 * @return the id  
	 */
	public String getId() {
		return id;
	}
	/**  
	 * @param id the id to set  
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**  
	 * @return the name  
	 */
	public String getName() {
		return name;
	}
	/**  
	 * @param name the name to set  
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**  
	 * @return the contentType  
	 */
	public String getContentType() {
		return contentType;
	}
	/**  
	 * @param contentType the contentType to set  
	 */
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	/**  
	 * @return the size  
	 */
	public Long getSize() {
		return size;
	}
	/**  
	 * @param size the size to set  
	 */
	public void setSize(Long size) {
		this.size = size;
	}
	/**  
	 * @return the uploadDate  
	 */
	public String getUploadDate() {
		return uploadDate;
	}
	/**  
	 * @param uploadDate the uploadDate to set  
	 */
	public void setUploadDate(String uploadDate) {
		this.uploadDate = uploadDate;
	}
	/**  
	 * @return the md5  
	 */
	public String getMd5() {
		return md5;
	}
	/**  
	 * @param md5 the md5 to set  
	 */
	public void setMd5(String md5) {
		this.md5 = md5;
	}
	/**  
	 * @return the content  
	 */
	public byte[] getContent() {
		return content;
	}
	/**  
	 * @param content the content to set  
	 */
	public void setContent(byte[] content) {
		this.content = content;
	}
	/**  
	 * @return the path  
	 */
	public String getPath() {
		return path;
	}
	/**  
	 * @param path the path to set  
	 */
	public void setPath(String path) {
		this.path = path;
	}
	
	//spring data jpa 规范
	protected UpFile() {
		super();
	}
	/**  
	 * @param name
	 * @param contentType
	 * @param size
	 * @param content  
	 */ 
	public UpFile(String name, String contentType, String md5,Long size, byte[] content) {
		this.name = name;
		this.contentType = contentType;
		this.size = size;
		this.content = content;
		this.md5=md5;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this==o) {
			return true;
		}
		if(o==null || getClass()!=o.getClass()) {
			return false;
		}
		
		UpFile file=(UpFile)o;
		return java.util.Objects.equals(size, file.size)
				&&java.util.Objects.equals(name, file.name)
				&&java.util.Objects.equals(contentType, file.contentType)
				&&java.util.Objects.equals(uploadDate, file.uploadDate)
				&&java.util.Objects.equals(md5, file.md5)
				&&java.util.Objects.equals(id, file.id);				
	}
	
	@Override
	public int hashCode() {
		return java.util.Objects.hash(name, contentType, size, uploadDate, md5, id);
	}
	
	@Override
    public String toString() {
        return "File{"
                + "name='" + name + '\''
                + ", contentType='" + contentType + '\''
                + ", size=" + size
                + ", uploadDate=" + uploadDate
                + ", md5='" + md5 + '\''
                + ", id='" + id + '\''
                + '}';
    }
}
  
    