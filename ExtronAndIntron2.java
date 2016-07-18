
public class ExtronAndIntron2 {
	private int id;
	private String classifyID;
	private String protein_coding;
	private long start;
	private long end;
	private String orientation;
	private String transcript;
	private String codonstr;
	private String geneName;
	private String geneId;
	private int flag;/*flag=1 extron flag=0 intron*/
	private long pstart;
	private long minStart;
	private long maxEnd;
	private int line_num;
	private int name_local;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClassifyID() {
		return classifyID;
	}
	public void setClassifyID(String classifyID) {
		this.classifyID = classifyID;
	}
	
	public String getProtein_coding() {
		return protein_coding;
	}
	public void setProtein_coding(String protein_coding) {
		this.protein_coding = protein_coding;
	}
	public long getStart() {
		return start;
	}
	public void setStart(long start) {
		this.start = start;
	}
	public long getEnd() {
		return end;
	}
	public void setEnd(long end) {
		this.end = end;
	}
	
	public String getOrientation() {
		return orientation;
	}
	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}
	public String getTranscript() {
		return transcript;
	}
	public void setTranscript(String transcript) {
		this.transcript = transcript;
	}
	
	public String getCodonstr() {
		return codonstr;
	}
	public void setCodonstr(String codonstr) {
		this.codonstr = codonstr;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	public ExtronAndIntron2(int id, String classifyID,String protein_coding, long start, long end, String orientation,
			String transcript, String codonstr ,int flag,String geneName,String geneId,long pstart,int line_num,int name_local) {
		super();
		this.id = id;
		this.classifyID = classifyID;
		this.protein_coding=protein_coding;
		this.start = start;
		this.end = end;
		this.orientation=orientation;
		this.transcript = transcript;
		this.codonstr=codonstr;
		this.flag=flag;
		this.geneName=geneName;
		this.geneId=geneId;
		this.pstart=pstart;
		this.line_num=line_num;
		this.name_local=name_local;
	}
	public ExtronAndIntron2() {
		super();
	}
	public String getGeneName() {
		return geneName;
	}
	public void setGeneName(String geneName) {
		this.geneName = geneName;
	}
	public String getGeneId() {
		return geneId;
	}
	public void setGeneId(String geneId) {
		this.geneId = geneId;
	}
	public long getPstart() {
		return pstart;
	}
	public void setPstart(long pstart) {
		this.pstart = pstart;
	}
	public long getMinStart() {
		return minStart;
	}
	public void setMinStart(long minStart) {
		this.minStart = minStart;
	}
	public int getLine_num() {
		return line_num;
	}
	public void setLine_num(int line_num) {
		this.line_num = line_num;
	}
	public int getName_local() {
		return name_local;
	}
	public void setName_local(int name_local) {
		this.name_local = name_local;
	}
	
	

}
