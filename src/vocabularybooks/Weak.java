package vocabularybooks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.io.*;

public class Weak extends VocabularyBook{
	//コンストラクタ？起動時にファイル読み込み、範囲などを選択するときにどのweakを使うか選ぶ
    private final String name = "間違え直し";
    private List<String> english;
    private List<String> japanese;
    private int allWordNm;
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
  	
  	//コンストラクタ
  	public Weak() {
  		this.japanese = new ArrayList<String>();
  		this.english = new ArrayList<String>();
  		FileReader frJ = null;
  		FileReader frE = null;
  		try {
  			frJ = new FileReader("/Users/MasatoraAtarashi/WordQuiz Weak.fileJ.txt");
  			frE = new FileReader("/Users/MasatoraAtarashi/WordQuiz Weak.fileE.txt");
  			BufferedReader brJ = new BufferedReader(frJ);
  			BufferedReader brE = new BufferedReader(frE);
  			String line = null;
  			while((line = brJ.readLine()) != null) {
  				this.japanese.add(line);
  			}
  			while((line = brE.readLine()) != null) {
  				this.english.add(line);
  			}
  			this.allWordNm = this.english.size();
  		} catch(IOException e) {
  			System.out.println("ファイル読み込みエラー");
  		}
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

