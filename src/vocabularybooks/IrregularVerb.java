package vocabularybooks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class IrregularVerb extends VocabularyBook {

	private final String name = "不規則動詞";
    private final List<String> english = new ArrayList<String>(Arrays.asList(
    		"cut cut", "hit hit", "put put", "read read","set set","became become","came come","ran run","brought brought","built built",
    		"bought bought","caught caught","felt felt","found found","forgot forgot","got got","had had","heard heard",
    		"held held","kept kept","left left","lit lit","lost lost","made made","meant meant","met met","paid paid",
    		"said said","sold sold","sent sent","shone shone","shot shot","sat sat","slept slept","spent spent","stood stood",
    		"struck struck","taught taught","told told","thought thought","understood understood","won won","began begun",
    		"blew blown","broke broken","chose chosen","did done","drew drawn","drank drunk","ate eaten","fell fallen",
    		"flew flown","gave given","went gone","grew grown","knew known","lay lain","rode ridden","rang rung","saw seen",
    		"shook shaken","showed shown","sang sung","sank sunk","spoke spoken","swam swum","took taken","threw thrown",
    		"wore worn","wrote written"
    		));
    private final List<String> japanese = new ArrayList<String>(Arrays.asList(
    		"cut", "hit", "put","read","set","become","come","run","bring","build",
    		"buy","catch","feel","find","forget","get","have","hear",
    		"hold","keep","leave","light","lose","make","mean","meet","pay",
    		"say","sell","send","shine","shoot","sit","sleep","spend","stand",
    		"strike","teach","tell","think","understand","win","begin",
    		"blow","break","choose","do","draw","drink","eat","fall",
    		"fly","give","go","grow","know","lie","ride","ring","see",
    		"shake","show","sing","sink","speak","swim","take","throw",
    		"wear","write"
    		));
    private final int allWordNm = this.english.size();
    private List<String> splitEnglish;
    private List<String> splitJapanese;
    private Map<String, String> test;
    

    //getter(name)
    public String getName() {
        return this.name;
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
