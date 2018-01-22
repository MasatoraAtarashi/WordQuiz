package user;

import java.util.Collections;
import java.util.Date;
import java.io.*;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import bookShelf.BookShelf;
import vocabularybooks.VocabularyBook;

public class User {
	//単語帳をえらぶメソッド
	public static void selectVB(){
		int size = BookShelf.displayVBs();
		int choiceVB = new Scanner(System.in).nextInt();
		if(choiceVB < 0 || choiceVB > size){
			System.out.println("単語帳が存在しません");
			selectVB();
		}
		VocabularyBook vb = BookShelf.getVB(choiceVB - 1);
		selectMode(vb);
	}
	//モードを選ぶメソッド
	public static void selectMode(VocabularyBook vb){
		System.out.println("モードをえらんでください");
		System.out.print("1: 覚える 2: テストする");
		while(true){
			int choiceMode = new Scanner(System.in).nextInt();
			if(choiceMode == 1){
				selectRangeL(vb);
			}else if(choiceMode == 2){
				selectRangeT(vb);
			}
		}
	}
	//覚えるモード
		//範囲をきめるメソッド
	public static void selectRangeL(VocabularyBook vb){
		int choiceMax = vb.displayRangeL();
		while(true){
			int choiceRange = new Scanner(System.in).nextInt();
			if(!(choiceRange <= 0 || choiceRange > choiceMax)){
				makeQuizL(vb, choiceRange); }
		}
	}
		//問題を作成する
	public static void makeQuizL(VocabularyBook vb, int choiceRange){
		List<String> english = vb.setSplitEnglishL(choiceRange);
		List<String> japanese = vb.setSplitJapaneseL(choiceRange);
		learn(english, japanese, vb);
	}
		//覚える
	public static void learn(List<String> e, List<String> j, VocabularyBook vb){
		List<String> english = new LinkedList<String>(e);
		List<String> japanese = new LinkedList<String>(j);
		List<String> inCorrectEnglish = new LinkedList<String>();
		List<String> inCorrectJapanese = new LinkedList<String>();
		int size = japanese.size();
		int incorrect = 0;
		int roopCount = 1;
		System.out.println("終了したいときは finish と入力してください");
		while(size > 0){
			System.out.println(roopCount + "周目");
			while(size > 0){
				int random = new Random().nextInt(size);
				String question = japanese.get(random);
				String CAnswer = english.get(random);
				System.out.println("\n" + question);
				String answer = new Scanner(System.in).nextLine();
				if(answer.equals(CAnswer)){
					System.out.println("正解です！！");
				}else if(answer.equals("finish")){
					System.out.println("\nクイズを終了します");
					System.exit(1);
				}else{
					System.out.println("不正解です");
					System.out.println("正解は" + CAnswer);
					inCorrectJapanese.add(question);
					inCorrectEnglish.add(CAnswer);
					incorrect++;
				}
				japanese.remove(question);
				english.remove(CAnswer);
				size--;
			}
			japanese = inCorrectJapanese;
			english = inCorrectEnglish;
			size = japanese.size();
			roopCount++;
		}
		System.out.println("ミス : " + incorrect + "回");
		if(incorrect == 0){
			System.out.println("クリア！！次に進みましょう");
			System.out.println("次に進みますか？");
		}else{
			System.out.println("ミスが0になるまで練習しましょう");
			System.out.println("もう一度学習しますか？");
		}
		System.out.println("1: もう一度 2: 次に進む 3: 終了する");
		int select = new Scanner(System.in).nextInt();
		if(select == 1){
			learn(e, j, vb);
		}else if(select == 2){
			selectRangeL(vb);
		}
		System.out.println("終了します");
		System.exit(1);
	}
	//テストモード
		//範囲をきめる
	public static void selectRangeT(VocabularyBook vb){
		int choiceMax = vb.displayRangeT();
		while(true){
			int choiceRange = new Scanner(System.in).nextInt();
			if(!(choiceRange <= 0 || choiceRange > choiceMax)){
				makeQuizT(vb, choiceRange);
			}
		}
	}
		//問題を作成する
	public static void makeQuizT(VocabularyBook vb, int choiceRange){
		Map<String, String> test = vb.setSplitTest(choiceRange);
		test(test);
	}
		//テストする
	public static void test(Map<String, String> test){
		int size = test.size();
		double correctAnswer = 0;
		double questions = 0;
		Map<String, String> Incorrects = new LinkedHashMap<String, String>();
		System.out.println("終了したいときは finish と入力してください");
		for(String key : test.keySet()){
			String question = test.get(key);
			String CAnswer = key;
			System.out.println("\n" + question);
			String answer = new java.util.Scanner(System.in).nextLine();
			if(answer.equals(CAnswer)){
				System.out.println("正解です！！");
				correctAnswer++;
			}else if(answer.equals("finish")){
				System.out.println("\nクイズを終了します");
				break;
			}else{
				System.out.println("不正解です");
				System.out.println("正解は" + CAnswer);
				Incorrects.put(CAnswer, question);
			}
			questions++;
		}
		double rate = (correctAnswer / questions) * 100;
		System.out.println("\n正解数" + correctAnswer);
		System.out.println("正答率" + rate);
		//正答率によってランクを表示するコード
		if(rate == 100){
			System.out.println("ランク: SSS");
			System.out.println("完璧です!!すごい!!天才的!!このままのペースでいけば、鉄壁の単語力が身につくでしょう!!");
			System.exit(1);
		}else if(rate >= 97){
			System.out.println("ランク: ultrasoul");
			System.out.println("タイプミスに気をつけよう。英単語は完璧。");
		}else if(rate >= 90){
			System.out.println("ランク: SS+");
			System.out.println("惜しい!!だが天才的!!あとすこしでこの範囲は完璧です!!");
		}else if(rate >= 85){
			System.out.println("ランク: S");
			System.out.println("すさまじい程の単語力です!!あとは取りこぼしをなくすだけ!!");
		}else if(rate >= 80){
			System.out.println("ランク: AA+");
			System.out.println("驚きの英単語力!!");
		}else if(rate >= 75){
			System.out.println("ランク: A");
			System.out.println("もう一度チャレンジすれば、完璧になるでしょう!!");
		}else if(rate >= 70){
			System.out.println("ランク: BB+");
			System.out.println("もう一度覚え直してふたたびテストを受けるころには、わからない単語はなくなるでしょう");
		}else if(rate >= 65){
			System.out.println("ランク: B");
			System.out.println("これまでの努力に比べたら、残りの35%を覚える労力なんてとるに足らないもののはず");
		}else if(rate >= 60){
			System.out.println("ランク: C+");
			System.out.println("もちろん、英単語だけではだめ。だがしかし、英単語がなければ英語は話せないのだ");
		}else if(rate >= 50){
			System.out.println("ランク: C");
			System.out.println("完璧にしてやろうと気負うよりも、不完全でいいから何度も挑戦したほうがいい。というあなたの姿勢は間違っていません");
		}else if(rate >= 40){
			System.out.println("ランク: D");
			System.out.println("頑張りましょう");
		}else{
			System.out.println("ランク: F");
			System.out.println("うーん....現時点での実力はまだまだのようです。が、それは伸びる余地があるということでもあります。覚えなおしましょう!");
		}
		weakWrite(Incorrects);
		System.out.println("間違えたものだけ繰り返しますか？");
		System.out.println("1: YES 2: NO");
		int a = new Scanner(System.in).nextInt();
		if(a == 1){
			test(Incorrects);
		}
		System.exit(1);
	}
	
	//間違えた単語を書き込むメソッド
	public static void weakWrite(Map<String, String> Incorrects){
		FileWriter fwJ = null;
		FileWriter fwE = null;
		try{
			fwJ = new FileWriter("/Users/MasatoraAtarashi/WordQuiz Weak.fileJ.txt", true);
			fwE = new FileWriter("/Users/MasatoraAtarashi/WordQuiz Weak.fileE.txt", true);
			//間違えた単語を書き込む
			for(String key : Incorrects.keySet()){
				String Japanese = Incorrects.get(key);
				String English = key;
				fwJ.write(Japanese + "\n");
				fwE.write(English + "\n");
			}
			fwJ.flush(); fwE.flush();
			fwJ.close(); fwE.close();
		} catch(IOException e) {
			System.out.println("ファイル書き込みエラー");
		} finally {
			if(fwJ != null) {
				try{
					fwJ.close();
				} catch(IOException e2) {}
			}
		}
	}
}
