package vocabularybooks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class MyStudyWord1 extends VocabularyBook{
    private final String name = "MyStudyWord1";
    private final List<String> english = new ArrayList<String>(Arrays.asList(
            "Thursday", "change", "Friday", "sometimes", "sport", "between", "leave", "June", "Tuesday", "January", "of", "February",
            "eighteen", "eighty", "September", "July", "too", "to", "forty", "zero", "take", "both", "in", "well",
            "hall", "which", "there", "help ~ with...", "Saturday", "really", "rabbit", "cereal", "soon",
            "nothing", "That's right.", "appeal", "consent", "yield", "faithful", "obedient", "indifferent", "superior", "truth", "rescue",
			"attach", "significant",  "recent", "charge", "middle", "invest", "surge", "lack", "successful", "enrollment", "contribute",
			"health", "alarm", "born", "bear", "far", "angry", "golf", "then", "so", "who", "whose", "what", "which", "when", "where", "why", "how", "around",
			"excuse", "weak", "look", "knife", "way", "towel", "right", "patient", "improve", "courage", "disappear", "actually", "let", "aim",
			"endangered", "foundation", "committee", "dominant", "acquire", "approximately", "enthusiasm", "stuck", "satellite", "glacier", "arrange",
			"competitive"
            ));
    private final List<String> japanese = new ArrayList<String>(Arrays.asList(
    	      "木曜日", "つり銭、小銭", "金曜日", "ときどき、時には", "スポーツ、運動", "〜の間に（で）", "出発する、去る", "６月", "火曜日",
    	      "１月", "〜の（所属・所有を表す）、〜の（主題を表す）", "２月", "１８、１８の", "８０、８０の", "９月", "７月", "〜もまた/あまりに〜すぎる",
    	      "〜に、〜へ、〜の方へ（方向・目的地を表す）/〜に（対象を表す）/〜まで（時間を表す）", "４０、４０の", "０、０の", "（乗り物に）乗る/（時間が）かかる", "両方", "〜の中に、〜に、〜で/〜に（時を表す）",
    	      "上手に/さて・ええと", "会館・役所", "どの・どちらの", "そこに（で）", "〜が...するのを手伝う", "土曜日", "本当に/とても", "ウサギ", "シリアル", "すぐ・まもなく",
    	      "何も〜ない", "その通りです。", "訴える アピールする", "同意する", "生産する 屈する", "義務を遂行する 忠実な", "従順な", "無関心な", "優れている", "真実",
    	      "救助する", "取り付ける", "重要な", "近頃の", "請求する", "中間の", "投資する", "波のように押し寄せる", "不足", "成功した", "入学/入会", "寄付する/与える",
    	      "健康", "不安/目覚まし", "bearの過去分詞形", "支える/産む/耐える", "遠くへ", "怒った", "ゴルフ", "その時", "そのように", "だれ", "だれの", "何/どんな", 
    	      "どちら/どちらの", "いつ", "どこで/どこに", "なぜ", "どのような/どのように", "～のまわりに", "～の言い訳をする/許す", "弱い", "見える(見るではない）",
    	      "ナイフ", "道・方法", "タオル", "右・正しい・権利", "患者", "改善する", "勇気", "消える", "実際に", "〜させる", "目指す", "絶滅危惧の", "基礎", "委員会", "優勢な",
    	      "得る", "おおよそ", "熱意", "行きづまって", "衛星", "氷河", "整える", "競争的な"
    	       ));
    private final int allWordNm = this.english.size();
    private List<String> splitEnglish;
    private List<String> splitJapanese;
    private Map<String, String> test;

    //getter(name)
    public String getName() {
        return this.name;
    }
    //getter(splitEnglish)
  	public List<String> getSplitE(){
  		return this.splitEnglish;
  	}
  	//getter(splitJapanese)
  	public List<String> getSplitJ(){
  		return this.splitJapanese;
  	}
    //範囲を表示（覚える）
    public int displayRangeL() {
        if(this.allWordNm == 0){
            System.out.println("単語データが存在しません。単語データを入力してください。");
            System.out.println("終了します");
            System.exit(0);
        }
        int a = this.allWordNm / 20;
        if(!(this.allWordNm % 20 == 0)){ a++; }
        System.out.println("範囲をえらんでください");
        System.out.println("1 ~ " + a);
        return a;
    }
    //範囲を表示（テスト）
    public int displayRangeT() {
        if(this.allWordNm == 0){
            System.out.println("単語データが存在しません。単語データを入力してください。");
            System.out.println("終了します");
            System.exit(0);
        }
        int a = this.allWordNm / 100;
        if(!(this.allWordNm % 100 == 0)){ a++; }
        System.out.println("範囲をえらんでください");
        System.out.println("1 ~ " + a);
        return a;
    }
  //setter(splitEnglish)(覚える)
    public List<String> setSplitEnglishL(int range){
        range = (range - 1) * 20;
        this.splitEnglish = new LinkedList<String>();
        for(int i=range+20; range<i; range++){
            try{
                splitEnglish.add(english.get(range));
            }catch(IndexOutOfBoundsException e){
            	break;
            }
        }
        return splitEnglish;
    }
    //setter(splitJapanese)（覚える）
    public List<String> setSplitJapaneseL(int range){
        range = (range - 1) * 20;
        this.splitJapanese = new LinkedList<String>();
        for(int i=range+20; range<i; range++){
            try{
                splitJapanese.add(japanese.get(range));
            }catch(IndexOutOfBoundsException e){
            	break;
            }
        }
        return splitJapanese;
    }
    //setter(splitEnglish, splitJapanese)(テスト)
    public Map setSplitTest(int range){
    	range = (range - 1) * 100;
        this.splitEnglish = new LinkedList<String>();
        this.splitJapanese = new LinkedList<String>();
        for(int t=range+100; range<t; range++){
            try{
                splitEnglish.add(english.get(range));
                splitJapanese.add(japanese.get(range));
            }catch(IndexOutOfBoundsException e){
            	break;
            }
        }
    	this.test = new LinkedHashMap<>();
    	int all = this.splitEnglish.size();
        while(all!=0){
        	int num = new Random().nextInt(all);
            test.put(splitEnglish.get(num), splitJapanese.get(num));
            this.splitEnglish.remove(num);
            this.splitJapanese.remove(num);
            all--;
        }
        return this.test;
    }


}
