package vocabularybooks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class EnglishTest3 extends VocabularyBook{
    private final String name = "英検３級";
    private final List<String> english = new ArrayList<String>(Arrays.asList(
            "a couple of", "a day", "a little", "a week", "about", "across from", "actually", "against",
            "agree with", "air ticket", "alone", "already", "also", "an hour", "another", "anyone", "anything else",
            "anytime", "aquarium", "area", "as", "as if", "as usual", "at one time", "attack", "bake", "baker",
            "bamboo", "barn", "be able to", "be absent from", "be born", "be interested in", "because", "become",
            "beginner", "behave", "believe", "belong", "beside", "borrow", "bought", "bring", "building", "built",
            "by", "by oneself", "carry", "center", "century", "chase", "close", "clothes", "collect", "college",
            "confident", "contact", "cost", "country", "cousin", "cozy", "creative", "cross", "crowded", "culture",
            "dad", "decide", "die", "difference", "different", "direct", "do one's best", "each week", "easily",
            "either", "engine", "enough", "enter", "entrance", "environment", "even", "everything", "excited",
            "expensive", "face", "fair", "famous", "far", "fence", "field", "fill", "finally", "find", "find out",
            "fine", "fit", "follow", "for", "for example", "for many years", "for the first time", "forest", "forget",
            "free", "fresh", "future", "get home", "get old", "get sick", "get to", "gift", "glad", "go ahead",
            "grade", "graduate", "grandparents", "group", "grow up", "gym", "habit", "happen", "hard", "health",
            "healthy", "hear", "heard", "heavy", "height", "history", "hobby", "hockey", "hold", "hometown",
            "hundreds of", "hurry up", "ice-skating rink", "I'd", "I'm afraid", "important", "in front of",
            "in trouble", "information", "interest", "invite", "join", "journey", "just on time", "kind", "lake",
            "large", "large number of", "last", "late", "later", "learn", "lend", "life", "like", "little sister",
            "live long", "look forward to", "look like", "lose", "lots of", "magazine", "magic", "mall", "manager",
            "matter", "maybe", "meaning", "medicine", "miss", "mom", "more", "more than", "movie director", "nature",
            "need to", "newspaper", "on one's way to", "once", "opinion", "order", "other", "others", "outside of",
            "oversleep", "paper", "parachute", "parents", "part", "part-time job", "pay", "perfectly", "personality",
            "pick you up", "place", "plant", "poor", "popular", "positive", "practice hard", "price", "priest",
            "prize", "probably", "problem", "promise", "protect", "race", "reach", "reason", "receive", "recently",
            "recipe", "remember", "reporter", "rest area", "return", "rise", "rule", "run away", "sad", "safe",
            "said", "same", "save", "save money", "saw", "schedule", "scientist", "sell", "shade", "shake hands",
            "share", "shook", "should", "shout", "sick in bed", "silent", "since", "size", "smart", "so", "someone",
            "something", "sometimes", "soon", "sound", "space", "spent", "station", "stay", "stay up late",
            "stew", "straight", "such as", "suddenly", "suit you", "take", "take a bath", "take a seat",
            "take care of", "take part in", "take the train", "taught", "than usual", "thanks to",
            "the Olympic Games", "then", "there", "thing", "thought", "thousands of", "ticket", "together", "tourist",
            "travel", "twice", "understand", "university", "until", "upset", "village", "visitor", "volunteer",
            "wake up", "wear", "weather", "wedding", "while", "why", "wide", "wild", "without", "work part-time",
            "would like to", "wrong"
            ));
    private final List<String> japanese = new ArrayList<String>(Arrays.asList(
    	      "2、3の〜", "1日につき", "少し", "1週間につき", "～について", "～の向かいに", "実際は", "～に反対して", "～に賛成する",  "航空券", "独りで", "すでに",
    	      "～もまた", "1時間につき", "別の", "誰でも", "何か他のもの", "いつでも", "水族館", "地域", "～として", "まるで～みたいに", "いつもどおりに",
    	      "一度に", "～を襲う", "～を焼く", "パン職人", "竹", "納屋", "～できる", "～を欠席する", "生まれる", "～に興味がある", "なぜなら", "～になる",
    	      "初心者", "ふるまう", "～を信じる", "～に所属する", "～のそばに", "～を借りる", "buyの過去形", "～を連れてくる", "建物", "buildの過去形", "～までに",
    	      "独力で", "～を運ぶ", "真ん中", "世紀", "追いかける", "近い", "服", "～を集める", "大学", "自信に満ちた", "接触", "(費用)がかかる", "国", "いとこ", 
    	      "居心地のよい", "独創的な", "～を渡る", "混雑した", "文化", "お父さん", "～を決める", "死ぬ", "違い", "いろいろな", "率直な", "ベストを尽くす", "毎週",
    	      "簡単に", "(否定文で)～もまた", "エンジン", "十分な", "～にエントリーする", "入口", "環境", "さらに", "全ての物", "わくわくしている", "費用が高い",
    	      "～に直面する", "品評会", "有名な", "遠い", "フェンス", "野原", "～を満たす", "ついに", "～を見つける", "～を探り出す", "大丈夫な", "～にぴったり合う",
    	      "～に従う", "～のために", "たとえば", "何年も、長年", "初めて", "森林", "～を忘れる", "無料の", "新鮮な", "将来", "家に帰る", "年をとる", "病気になる",
    	      "～に到着する", "贈り物", "嬉しい", "どうぞお先に", "成績", "卒業する", "祖父母", "集団", "育つ", "体育館", "習慣", "起こる", "難しい", "健康", "健康な",
    	      "便りをもらう", "hearの過去形", "重い", "高さ", "歴史", "趣味", "ホッケー", "～を開催する", "故郷", "数百の", "急ぐ", "アイススケート場",
    	      "I wouldの短縮形", "～を申し訳なく思う", "重要な", "～の前で", "困っている", "情報", "興味", "～を招く", "～に加わる", "旅", "時間きっかりに", "種類",
    	      "湖", "大きい", "多数の", "最後の", "遅い", "あとで", "～を学ぶ", "～を貸す", "生活", "～のように", "妹", "長生きする", "～を楽しみに待つ",
    	      "～のように見える", "失う", "たくさんの", "雑誌", "魔法の", "ショッピングモール", "管理人", "問題", "たぶん", "意味", "薬", "～がいなくて寂しい",
    	       "お母さん", "もっと", "～以上", "映画監督", "自然界", "～する必要がある", "新聞", "～へ行く途中で", "一度", "意見", "～を注文する", "他の", "他人",
    	       "～の外で", "寝過ごす", "新聞", "パラシュート", "両親", "一員", "アルバイト", "～を支払う", "完璧に", "性格", "あなたを迎えに行く", "場所",
    	       "植物", "貧しい", "人気がある", "積極的な", "熱心に練習する", "料金", "牧師", "賞品", "たぶん", "問題", "約束する", "～を守る", "レース", "～を伸ばす",
    	       "理由", "～を受け取る", "最近は", "レシピ", "～を覚えている", "リポーター", "休憩所", "戻る、戻す", "上がる", "規則", "逃げ出す", "悲しい", "安全な",
    	       "sayの過去形", "同じ", "～を救う", "貯金する", "seeの過去形", "スケジュール", "科学者", "～を売る", "日陰", "握手する", "～を分け合う", "shakeの過去形", 
    	       "～すべきだ", "叫ぶ", "病気で寝ている", "静かな", "～以来", "サイズ", "頭がいい", "だから", "誰か", "あるもの、何か", "時々", "すぐに", "～な音がする",
    	       "空間", "spendの過去形", "駅", "滞在する", "夜更かしする", "シチュー", "まっすぐに", "～のような", "突然", "あなたに似合う", "(時間)がかかる", "風呂に入る",
    	       "席をとる", "～の世話をする", "～に参加する", "電車に乗る", "teachの過去形", "いつもより", "～のおかげで", "オリンピック", "それから、その時", "そこで",
    	       "物", "thinkの過去形", "数千の", "切符", "一緒に", "旅行者", "旅行する", "二回", "理解する", "大学", "～までは", "腹を立てている", "村", "訪問者",
    	       "ボランティア", "目覚める", "～を着る", "天候", "結婚式", "～している間に", "なぜ", "幅広い", "野生の", "～なしで", "アルバイトする", "～したい", "間違った" 
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
