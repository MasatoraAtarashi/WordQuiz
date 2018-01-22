package bookShelf;
import java.util.Arrays;
import java.util.List;

import vocabularybooks.CORPUS;
import vocabularybooks.EnglishTest3;
import vocabularybooks.EnglishTest4;
import vocabularybooks.Idiom;
import vocabularybooks.IrregularVerb;
import vocabularybooks.MyStudyWord1;
import vocabularybooks.VocabularyBook;
import vocabularybooks.Weak;

public class BookShelf {

	private static final List<VocabularyBook> VBs = Arrays.asList(new EnglishTest3(), new EnglishTest4(), new IrregularVerb(), new MyStudyWord1(),
			new Idiom(), new CORPUS(), new Weak()
			);
	private static final int VBsNm = VBs.size();

	//選択肢を表示
	public static int displayVBs(){
		if(VBsNm == 0){
			System.out.println("単語帳データが存在しません。単語帳データを入力してください。");
			System.out.println("終了します");
			System.exit(0);
		}
		final String FORMAT = "%d: %s";
		System.out.println("単語帳をえらんでください");
		for(int n=0; n<VBsNm; n++){
			String choiceVB = String.format(FORMAT, n+1, VBs.get(n).getName());
			System.out.println(choiceVB);
		}
		return VBsNm;
	}
	//getter(VB)
	public static VocabularyBook getVB(int choiceVB){
		//もしこのメソッドがuserのselectVB以外から利用されるようになった場合、エラー対策が必要
		return VBs.get(choiceVB);
	}
}
