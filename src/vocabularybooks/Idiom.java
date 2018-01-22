package vocabularybooks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Idiom extends VocabularyBook{
    private final String name = "熟語";
    private final List<String> english = new ArrayList<String>(Arrays.asList(
    		"in recent years", "in the past century", "in the cases at~", "in the charge of~", "in middle age", "in the event~", "invest in~",
    		"a surge in~", "in~", "lack in~", "in alarm~", "be rich in~", "be successful in~", "significant other", "appeal to~", "consent to~", "yield to~",
    		"faithful to~", "true to~", "obedient to~", "indifferent to~", "superior to~", "back then", "o' clock", "get off", "a lot of", "over there",
    		"human being", "quite a few", "in spite of~", "according to~", "stand for~", "powerful enough to~", "as long as~", "as if~",
    		"be late for~", "in front of~", "in those days", "be afraid of~", "at once", "be different from~", "by oneself", "be famous for~"
            ));
    private final List<String> japanese = new ArrayList<String>(Arrays.asList(
    	      "近年", "この一世紀で", "～の場合では", "～の担当", "中年になっても", "～の場合", "～に投資する", "～の急増", "～の", "～が不足している", "心配して",
    	      "～に恵まれている", "～に成功した",  "大切な人", "～にアピールする", "～に同意する", "～に屈する", "～に忠実な", "～に忠実な", "～に従順な", "～に無関心な",
    	      "～より優れている", "あの頃は", "～時", "降りる", "たくさんの", "あそこで・向こうに", "人間", "かなり多くの", "〜にもかかわらず", "〜によると", "〜を表す",
    	      "〜するのに十分強い", "〜するかぎり", "あたかも〜であるかのように", "〜に遅れる", "〜の前に", "当時", "〜を怖がる",
    	      "すぐに", "〜と違う", "自力で", "〜で有名だ"
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
