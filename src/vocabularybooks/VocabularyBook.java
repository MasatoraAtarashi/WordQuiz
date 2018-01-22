package vocabularybooks;
import java.util.List;
import java.util.Map;
public abstract class VocabularyBook {
	private String name;
	private int allWordNm;
	private List<String> english;
	private List<String> japanese;
	private List<String> splitEnglish;
	private List<String> splitJapanese;
	private Map<String, String> test;

	//getter(name)
	public abstract String getName();
	//範囲の選択肢を表示(覚える）
	public abstract int displayRangeL();
	//範囲の選択肢を表示（テスト）
	public abstract int displayRangeT();
	//setter(splitEnglish)(覚える)
	public abstract List<String> setSplitEnglishL(int range);
	//setter(splitJapanese)（おぼえる）
	public abstract List<String> setSplitJapaneseL(int range);
	//setter(splitEnglish, splitJapanese)(テスト)
	public abstract Map setSplitTest(int range);
}
