package restAssuredUtil;

public class ResReq_DeSerializationSupport {
	
	private String url;
	private String text;
	
	public String getUrl() {
		return url;
	}
	public String getText() {
		return text;
	}
	
	public ResReq_DeSerializationSupport(String url, String text) {
		this.url = url;
		this.text = text;
	}
	
	public ResReq_DeSerializationSupport() {
		
	}
	@Override
	public String toString() {
		return "ResReq_DeSerializationSupport [url=" + url + ", text=" + text + "]";
	}
	
	

}
