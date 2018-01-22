package vocabularybooks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class EnglishTest4 extends VocabularyBook {
	 private final String name = "英検４級";
	    private final List<String> english = new ArrayList<String>(Arrays.asList(
	    		"actor", "address", "airport", "amusementpark", "apartment", "artist", "Australia", "badminton", "bank",
				"beach", "birthday", "boat", "bookstore", "brush", "butter", "cafeteria", "calendar", "camp",
				"Canada", "care", "center", "centimeter", "cherry", "chicken", "children", "China", "chopstick", "class", "clothes",
				"clothing", "club", "coat", "college", "comedy", "comic", "company", "computer", "concert", "contest",
				"cook", "corner", "country", "couple", "course", "cycling", "date", "dentist", "dessert", "dictionary",
				"dish", "dollar", "dolphin", "doughnut", "drama", "dream", "dress", "driver", "east", "elementary school",
				"elevator", "e-mail", "entrance", "eraser", "example", "face", "farm", "floor", "flute", "food", "fruit", "fun",
				"future", "game", "garden", "gate", "gift", "golf", "group", "guest", "guitar", "gym", "haircut", "Hawaii",
				"history", "hobby", "holiday", "hometown", "horse", "hospital", "hotel", "husband", "idea", "information",
				"instrument", "key", "king", "lake", "language", "lemon", "lesson", "library", "life", "London", "luck", "map", "match",
				"meeting", "member", "money", "monster", "moon", "mountain", "museum", "music", "musician", "newspaper", "noodle", "north",
				"notebook", "office", "onion", "oven", "parade", "parent", "part", "passport", "phone", "piano", "pilot", "pizza",
				"plane", "police officer", "pond", "pool", "postcard", "poster", "price", "problem", "puppy", "question",
				"quiz", "racket", "radio", "restaurant", "road", "rose", "salad", "sale", "salesclerk",
				"salt", "sandwich", "sausage", "schoolyard", "science", "scientist", "sea", "season", "sheep", "ship", "shirt",
				"shoes", "shopping", "shoulder", "shower", "singer", "size", "skirt", "snack", "socks", "sofa", "sound",
				"south", "spaghetti", "stadium", "stamp", "star", "stationery shop", "steak", "stew", "story",
				"strawberry", "subject", "subway", "sugar", "supermarket", "sweater", "taxi", "tent", "test", "theater",
				"thing", "ticket", "tie", "title", "toast", "tooth", "top", "towel", "town", "toy",
				"trip", "trumpet", "tulip", "umbrella", "uniform", "vacation", "video", "violin", "volleyball", "volunteer",
				"wallet", "watch", "watermelon", "weather", "weekend", "west", "whale", "wife", "world", "writer",
				"zebra", "answer", "arrive", "ask", "become", "begin", "borrow", "bring", "call",
				"carry", "catch", "check", "clean", "cut", "draw", "drive", "drop", "end", "feel", "find",
				"finish", "forget", "give", "grow", "hope", "hurry", "invite", "keep", "laugh",
				"learn", "leave", "lend", "paint", "practice", "receive", "remember", "ride", "sell", "show", "sleep",
				"smile", "start", "stay", "take", "tell", "think", "try", "understand", "visit",
				"wait", "wash", "wear", "win", "worry", "busy", "cheap", "clever", "dear", "delicious", "different",
				"difficult", "dirty", "expensive", "famous", "favorite", "free", "full", "great", "heavy",
				"hungry", "interesting", "kind", "near", "next", "noisy", "only", "professional", "quiet", "rainy", "ready",
				"sick", "sleepy", "special", "strong", "sunny", "sweet", "thirsty", "tired", "again",
				"ago", "always", "early", "easily", "hard", "later", "maybe", "now", "often", "once", "outside",
				"really", "someday", "together", "tonight", "usually", "arrive at~", "look for~", "wait for~", "work for~",
				"get on~", "get off~", "talk about~", "hurry up~", "pick up~", "give up~", "have a good time",
				"have a headache", "have a cold", "take a bath", "take a shower",
				"take a walk", "take medicine", "go to bed", "go on a trip", "go shopping", "see a doctor", "answer the phone",
				"do one's homework", "help~with...", "make friends with~", "say hello to~", "be absent from~",
				"be late for~", "be sick in bed", "be good at~", "be interested in~", "enjoy ~ing", "begin to V",
				"would like~", "would like to V",
				"a lot of~", "lots of~", "in front of~", "next to~", "over there", "at once", "in the future",
				"for the first time", "after school", "once again", "again and again", "from~to...", "for example",
				"by the way", "Just a moment.", "Good idea."
	            ));
	    private final List<String> japanese = new ArrayList<String>(Arrays.asList(
	    		"俳優", "住所", "空港", "遊園地", "アパート", "芸術家", "オーストラリア", "バドミントン", "銀行", "ビーチ", "誕生日",
				"ボート", "書店", "ブラシ", "バター", "カフェテリア", "カレンダー", "キャンプ", "カナダ", "注意/世話",
				"中央", "センチメートル", "桜", "鶏肉", "子どもたち", "中国", "はし", "授業", "服",
				"衣類", "クラブ", "コート", "大学", "喜劇", "漫画", "会社", "コンピューター", "コンサート", "コンテスト",
				"料理人", "角", "国", "夫婦", "コース/科目", "サイクリング", "日付", "歯科医", "デザート", "辞書",
				"皿", "ドル", "イルカ", "ドーナツ", "劇", "夢", "ドレス/洋服", "運転手", "東", "小学校", "エレベーター",
				"Eメール", "入口", "消しゴム", "例", "顔", "農場", "階/床", "フルート", "食べ物",
				"果物", "楽しみ", "将来", "試合", "庭", "門", "贈り物", "ゴルフ", "集団", "客", "ギター",
				"体育館", "散髪", "ハワイ", "歴史", "趣味", "休日", "生まれ故郷", "馬", "病院",
				"ホテル", "夫", "考え", "情報", "楽器", "カギ", "王様", "湖", "言葉", "レモン", "レッスン",
				"図書館", "生活", "ロンドン", "運", "地図", "試合", "会議", "メンバー", "お金", "怪物",
				"月", "山", "博物館/美術館", "音楽", "音楽家", "新聞", "めん類", "北", "ノート", "事務所",
				"玉ねぎ", "オーブン", "パレード", "親", "部分", "パスポート", "電話", "ピアノ", "パイロット",
				"ピザ", "飛行機", "警察官", "池", "プール", "郵便はがき", "ポスター", "価格", "問題", "子犬", "質問",
				"クイズ", "ラケット", "ラジオ", "レストラン", "道路", "バラ", "サラダ", "販売", "店員", "塩",
				"サンドイッチ", "ソーセージ", "校庭", "化学/理科", "科学者", "海", "季節", "羊", "船", "シャツ",
				 "靴", "買い物", "肩", "シャワー", "歌手", "大きさ", "スカート", "おやつ", "靴下", "ソファ",
				"音", "南", "スパゲティ", "スタジアム", "切手", "星", "文房具店", "ステーキ", "シチュー", "物語",
				"イチゴ", "科目", "地下鉄", "砂糖", "スーパーマーケット", "セーター", "タクシー", "テント", "テスト", "劇場",
				"もの/こと", "切符", "ネクタイ", "タイトル", "トースト", "歯", "頂上", "タオル", "町", "おもちゃ",
				"旅行", "トランペット", "チューリップ", "傘", "制服", "休暇", "ビデオ", "バイオリン", "バレーボール", "ボランティア",
				"財布", "腕時計/見る", "スイカ", "天気", "週末", "西", "クジラ", "妻", "世界", "作家",
				"シマウマ", "答える", "着く", "たずねる", "なる", "始める", "借りる", "持ってくる", "呼ぶ/電話する",
				"運ぶ", "捕らえる", "確認する", "掃除する", "切る", "描く", "運転する", "落とす/落ちる", "終わる", "感じる", "見つける",
				"終える", "忘れる", "与える", "育てる/育つ", "希望する", "急ぐ", "招く", "保つ", "笑う",
				"学ぶ", "去る", "貸す", "（絵具で絵を）描く", "練習する", "受け取る", "覚えている", "乗る", "売る", "見せる", "眠る",
				"ほほえむ", "始める", "滞在する", "持っていく/取る", "話す", "考える/思う", "試す", "理解する", "訪れる",
				"待つ", "洗う", "身に着けている", "勝つ", "心配する", "忙しい", "安い", "賢い", "親愛なる", "おいしい", "違う",
				"難しい", "汚い", "（金額が）高い", "有名な", "大好きな", "自由な", "いっぱいの/満腹の", "すばらしい", "重い",
				"空腹の", "おもしろい", "親切な/種類", "近くの/～の近くに", "次の", "うるさい", "唯一の", "プロの", "静かな", "雨の",
				"準備完了して", "病気の", "眠い", "特別な", "強い", "天気のよい", "甘い", "のどが渇いた", "疲れた", "再び",
				"～前", "いつも", "早く", "簡単に", "一生懸命", "あとで", "たぶん", "今/さて", "よく", "一度", "外に/外側に",
				"本当に", "いつか", "いっしょに", "今夜", "たいてい", "～に到着する", "～を探す", "～を待つ", "～で働く",
				"～に乗る", "～から降りる", "～について語る", "急ぐ", "～を拾う", "～をあきらめる", "楽しい時を過ごす", "頭痛がする",
				"かぜをひいている", "お風呂に入る", "シャワーを浴びる", "散歩に出かける", "薬を飲む", "寝る", "旅行する", "買い物に行く",
				"医者に診てもらう", "電話に出る", "宿題をする", "～の・・・を手伝う", "～と友だちになる", "～によろしくと言う", "～を休む",
				"～に遅れる", "病気で寝ている", "～が得意だ", "～に興味がある", "～を楽しむ", "～し始める", "～が欲しい", "～したい",
				"たくさんの", "たくさんの", "～の前に", "～のとなりに", "向こうに", "すぐに", "将来", "はじめて", "放課後に",
				"もう一度", "何度も", "～から・・・まで", "たとえば", "ところで", "ちょっと待って。", "よい考えです。"
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
