package restAssuredUtil;

import java.util.List;

public class ResReq_DeSerialization {
	
	
	private int page;
	private int per_page;
	private int total;
	private int total_pages;
	private List<ResReq_DeSerializationDataNodes> data;
	private ResReq_DeSerializationSupport support;

	public ResReq_DeSerialization() {
		
	}

	public ResReq_DeSerialization(int page, int per_page, int total, int total_pages,
			List<ResReq_DeSerializationDataNodes> data, ResReq_DeSerializationSupport support) {
		super();
		this.page = page;
		this.per_page = per_page;
		this.total = total;
		this.total_pages = total_pages;
		this.data = data;
		this.support = support;
	}

	@Override
	public String toString() {
		return "ResReq_DeSerialization [page=" + page + ", per_page=" + per_page + ", total=" + total + ", total_pages="
				+ total_pages + ", data=" + data + ", support=" + support + "]";
	}

	public int getPage() {
		return page;
	}

	public int getPer_page() {
		return per_page;
	}

	public int getTotal() {
		return total;
	}

	public int getTotal_pages() {
		return total_pages;
	}

	public List<ResReq_DeSerializationDataNodes> getData() {
		return data;
	}

	public ResReq_DeSerializationSupport getSupport() {
		return support;
	}
	
	
}
