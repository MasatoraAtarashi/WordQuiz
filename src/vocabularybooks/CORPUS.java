package vocabularybooks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class CORPUS extends VocabularyBook{
    private final String name = "コーパス";
    private final List<String> english = new ArrayList<String>(Arrays.asList(
    		 "imagine" ,"produce"  ,"choice"  ,"quality", "ready" ,"project"  ,"total" ,"contact", "except"  ,"sign" ,"society" ,"sentence"
		    ,"surface" ,"material" ,"protect" ,"attitude", "source" ,"reduce"   ,"forward" ,"normal", "female" ,"correct" ,"expert"  ,"positive"
			,"forest" ,"immediately" ,"progress" ,"plant", "loss" ,"pain" ,"appropriate" ,"exercise", "pollution" ,"genetic" ,"opinion" ,"trade"
		    ,"none" ,"supply" ,"generation" ,"goods" ,"movement" ,"recognize" ,"related" ,"instance" ,"worth"  ,"demand" ,"central" ,"miss" ,"patient"
		    ,"doubt"  ,"responsible" ,"customer","approach" ,"decision" ,"danger" ,"prevent" ,"warm"  ,"mental"  ,"allow"  ,"labor" ,"current" 
		    ,"factor"  ,"climate"  ,"revolution" ,"range"  ,"receive"  ,"million"  ,"figure" ,"familiar"  ,"realize"  ,"guess"  ,"field"
		    ,"product"  ,"aware"  ,"essential"  ,"appear" ,"mile"  ,"express"  ,"prefer"  ,"citizen" ,"standard"  ,"remain"  ,"intelligence"  ,"object"
			,"advertise"  ,"condition"  ,"sir"  ,"freedom" ,"sight"  ,"abroad"  ,"policy"  ,"ordinary" ,"sort"  ,"literature"  ,"emotional"  ,"solve"
		    ,"hurt"  ,"effort"  ,"issue"  ,"waste" ,"include"  ,"pleasure"  ,"temperature"  ,"provide" ,"phone"  ,"response"  ,"arrive"  ,"extremely"
			,"service"  ,"effective"  ,"audience"  ,"clerk" ,"potential"  ,"compare"  ,"race"  ,"follow" ,"career"  ,"department"  ,"notice"  ,"concern"
			,"equal"   ,"invent"   ,"opportunity" ,"fresh" ,"mobile"  ,"continue" ,"unique"  ,"disease" ,"survive" ,"degree"   ,"professional" ,"atmosphere"
			,"twice"   ,"bear"  ,"plane"  ,"survey","terrible" ,"law"  ,"advice" ,"cell" ,"moral"  ,"obvious"  ,"ocean"  ,"exist" ,"excuse"  ,"universe"  ,"nuclear"  ,"specific" ,"suggest"  ,"impact"  ,"planet"  ,"require"
			,"opposite"  ,"account"  ,"advantage"  ,"flight" ,"negative" ,"comfortable" ,"encourage" ,"frequently"
			,"describe"  ,"crop"  ,"pick"  ,"majority" ,"organization"  ,"church"  ,"violence"  ,"government" ,"experiment"  ,"method"  ,"task"  ,"establish"
			,"creature"  ,"search"  ,"belief"  ,"significant" ,"event"  ,"tiny"  ,"exchange"  ,"income" ,"statement"  ,"contrast"  ,"friendly"  ,"military" ,"publish"  ,"join"  ,"direct"  ,"fuel" ,"subject"  ,"access"  ,"favorite"  ,"function"
			,"thought"  ,"practical"  ,"mass"  ,"gas" ,"diet"  ,"explain"  ,"fact"  ,"peace"
			,"offer"  ,"ought to"  ,"rate"  ,"childhood" ,"performance"  ,"associate"  ,"surprise"  ,"desire" ,"conflict"  ,"entire"  ,"introduce"  ,"structure"
			,"mistake"  ,"relatively"  ,"fully"  ,"shape" ,"character"  ,"employee"  ,"separate"  ,"financial"
			,"elderly"  ,"enter"  ,"independent"  ,"experience" ,"fat"  ,"court"  ,"fail"  ,"nervous" ,"official"  ,"status"  ,"otherwise"  ,"regular"
			,"maintain"  ,"suffer"  ,"apart"  ,"measure" ,"phrase"  ,"concept"  ,"marriage"  ,"decade"
			,"discover"  ,"drug"  ,"advance"  ,"situation" ,"regional"  ,"improve"  ,"unfortunately"  ,"occur" ,"former"  ,"possibility"  ,"suitable"  ,"destroy"
			,"weapon"  ,"false"  ,"custom"  ,"basis" ,"content"  ,"affect"  ,"escape"  ,"equipment"
			,"soil"  ,"chemical"  ,"household"  ,"farm" ,"circumstance"  ,"decline"  ,"raise"  ,"consumer" ,"identity"  ,"rapid"  ,"extra"  ,"moreover"
			,"benefit"  ,"poverty"  ,"educational"  ,"enormous" ,"message"  ,"interest"  ,"competition"  ,"seriously"
			,"in spite of"  ,"complicated"  ,"afford"  ,"claim" ,"appreciate"  ,"religion"  ,"tool"  ,"wealth" ,"crime"  ,"depend"  ,"square"  ,"focus"
			,"habit"  ,"primary"  ,"achieve"  ,"replace" ,"suppose"  ,"treat"  ,"strength"  ,"willing"
			,"blank"  ,"legal"  ,"vacation"  ,"largely" ,"series"  ,"prove"  ,"gradually"  ,"vocabulary" ,"nearby"  ,"attend"  ,"previous"  ,"increase"
			,"academic"  ,"leisure"  ,"agriculture"  ,"press" ,"drop"  ,"carbon"  ,"besides"  ,"charge"
			,"Ms,"  ,"adapt"  ,"argument"  ,"community" ,"philosophy"  ,"ideal"  ,"technique"  ,"vast" ,"unlike"  ,"discuss"  ,"merely"  ,"aspect"
			,"critical"  ,"capacity"  ,"mention"  ,"biological" ,"note"  ,"add"  ,"trust"  ,"unknown"
			,"attempt"  ,"anger"  ,"closely"  ,"force" ,"security"  ,"view"  ,"gender"  ,"plastic" ,"meal"  ,"regard"  ,"apply"  ,"flow"
			,"skill"  ,"rare"  ,"capital"  ,"fundamental" ,"seldom"  ,"nevertheless"  ,"spirit"  ,"item"
			,"indicate"  ,"conscious"  ,"formal"  ,"evolution" ,"gain"  ,"draw"  ,"electric"  ,"meter" ,"solar"  ,"credit"  ,"matter"  ,"vision"
			,"brain"  ,"judge"  ,"authority"  ,"depression" ,"civilization"  ,"proper"  ,"cheap"  ,"constantly"
			,"lead"  ,"youth"  ,"consequence"  ,"impression" ,"limit"  ,"manage"  ,"resident"  ,"master" ,"upset"  ,"harmful"  ,"determine"  ,"excellent"
			,"domestic"  ,"prepare"  ,"personality"  ,"engine" ,"funny"  ,"stomach"  ,"technology"  ,"ancestor" ,"weak",
			"scholar", "context", "frightened", "decrease", "period", "breathe", "somewhat", "Antarctica", "cellular", "disappointed", "predict", "grammar",
			"threat"
			 ));
    
    private final List<String> japanese = new ArrayList<String>(Arrays.asList(
    		"想像する"  ,"生産する" ,"選択"   ,"質", "準備完了して" ,"計画"  ,"全体の" ,"接触", "除いて" ,"記号"  ,"社会"   ,"文", "表面"  ,"材料"  ,"防御する","態度"
			,"起源"  ,"減らす" ,"前へ" ,"普通の" ,"女性の"  ,"正しい"  ,"専門家"  ,"肯定的な", "森"  ,"直接的に"  ,"進歩"  ,"植える" ,"損失"  ,"苦痛"  ,"適当な"  ,"運動" ,"汚染"  ,"遺伝の"  ,"意見"  ,"貿易"
			,"一つもない"  ,"供給"  ,"世代"  ,"商品","動き"  ,"認識する"  ,"関係した"  ,"実例","価値がある"  ,"要求"  ,"中央の"  ,"逃す","忍耐強い"  ,"疑い"  ,"責任ある"  ,"客" ,"接近する"  ,"決定"  ,"危険性"  ,"妨げる"
			,"温かい"  ,"精神の"  ,"許す"  ,"労働","現在の"  ,"要因"  ,"気候"  ,"革命" ,"範囲"  ,"受け取る"  ,"百万"  ,"形" ,"親しい"  ,"実現する"  ,"推測する"  ,"野原"
			,"製品"  ,"気づいて"  ,"重要な"  ,"出現する" ,"マイル"  ,"表現する"  ,"〜をより好む" ,"市民", "基準" ,"残る"  ,"知性"  ,"対象" ,"広告する"  ,"条件"  ,"敬称だんな様"  ,"自由" ,"光景"  ,"外国へ"  ,"政策"  ,"普通の"
			,"種類"  ,"文学"  ,"感情的な"  ,"溶解する" ,"傷つける"  ,"努力"  ,"問題"  ,"廃棄物", "含む"  ,"喜び"  ,"温度"  ,"提供する" ,"電話"  ,"応答"  ,"到着する"  ,"極端に" ,"奉仕"  ,"効果的な"  ,"聴衆"  ,"係員"
	     	,"潜在的な"  ,"比較する"  ,"競走"  ,"後続する" ,"職歴"  ,"部門"  ,"通知"  ,"関係" ,"等しい"  ,"作り出す"  ,"機会"  ,"新鮮な" ,"可動性の"  ,"続ける"  ,"唯一の"  ,"病気" ,"生き残る"  ,"程度"  ,"専門職の"  ,"大気"
			,"二度"  ,"耐える"  ,"平らな"  ,"概観" ,"恐ろしい"  ,"法律"  ,"助言"  ,"細胞" ,"道徳" ,"明らかな" ,"海" ,"存在する" ,"許す" ,"宇宙" ,"核の" ,"特定の" ,"示唆する" ,"衝撃" ,"惑星" ,"要求する"
			,"反対の" ,"計算書" ,"有利" ,"飛行" ,"否定的な" ,"快適な" ,"励ます" ,"頻繁に" ,"描写する"  ,"作物"  ,"つまむ"  ,"大多数" ,"組織"  ,"教会"  ,"暴力"  ,"政府" ,"実験"  ,"方法"  ,"作業"  ,"設立する"
			,"生き物"  ,"探す"  ,"信念"  ,"重要な" ,"出来事"  ,"小さい"  ,"交換する" ,"収入" ,"発言"  ,"対比コントラスト"  ,"親しげな"  ,"軍隊の" ,"出版する"  ,"加わる"  ,"直接的な"  ,"燃料" ,"主題"  ,"接近"  ,"お気に入りの"  ,"機能"
			,"思考"  ,"実際的な"  ,"集団"  ,"ガス" ,"食事"  ,"説明する"  ,"事実" ,"平和" ,"提供する"  ,"〜すべきだ"  ,"率"  ,"子ども時代" ,"上演"  ,"連想する"  ,"驚き"  ,"願望" ,"闘争"  ,"全体の"  ,"紹介する"  ,"構造"
			,"誤り"  ,"比較的に"  ,"十分に"  ,"姿形" ,"個性"  ,"社員"  ,"分ける"  ,"金融の" ,"老年の"  ,"入る"  ,"独立した"  ,"経験" ,"太った"  ,"裁判所"  ,"失敗する"  ,"神経質な" ,"公式な"  ,"地位"  ,"さもなくば"  ,"普通の"
			,"維持管理する"  ,"苦しむ"  ,"離れて"  ,"測定する" ,"語句"  ,"概念"  ,"結婚"  ,"１年間" ,"発見する"  ,"薬"  ,"前進"  ,"状況" ,"地域の"  ,"改善する"  ,"残念なことに"  ,"起こる" ,"前の"  ,"可能性"  ,"適した"  ,"破壊する"
			,"武器" ,"誤った"  ,"習慣"  ,"基礎" ,"中身"  ,"影響する"  ,"脱走する"  ,"装備" ,"土壌"  ,"化学的な"  ,"家族の"  ,"農場" ,"状況"  ,"低下"  ,"〜を上げる"  ,"消費者" ,"自己"  ,"速い"  ,"余分の"  ,"さらに" ,"利点"  ,"貧困"  ,"教育的な"  ,"巨大な"
			,"伝言" ,"関心" ,"競争" ,"深刻に" ,"〜にも関わらず"  ,"複雑な"  ,"余裕がある"  ,"主張" ,"認識する"  ,"宗教"  ,"道具"  ,"富" ,"犯罪"  ,"頼る"  ,"四角"  ,"焦点"
			,"習慣" ,"主要な"  ,"達成する"  ,"取って代わる" ,"仮定する"  ,"扱う"  ,"力"  ,"進んで", "空白の"  ,"法律の"  ,"休暇"  ,"主に" ,"連続"  ,"証明する"  ,"徐々に"  ,"語彙" ,"近くで"  ,"出席する"  ,"以前の"  ,"増やす"
			,"学術的な"  ,"余暇"  ,"農業"  ,"押す" ,"落とす"  ,"炭素"  ,"〜の他に"  ,"代金", "〜さん"  ,"適合させる"  ,"議論"  ,"共同体" ,"哲学"  ,"理想的な"  ,"技術"  ,"広大な" ,"〜とは違って"  ,"論じる"  ,"単に"  ,"面"
			,"批判的な"  ,"能力"  ,"言う"  ,"生物学の","メモ"  ,"加える"  ,"信用"  ,"未知の", "試みる"  ,"怒り"  ,"綿密に"  ,"力" ,"安全"  ,"視界"  ,"性別"  ,"プラスチック" ,"食事"  ,"見なす"  ,"適用する"  ,"流れ"
			,"技術"  ,"まれな"  ,"首都"  ,"基本的な" ,"ほとんど〜ない"  ,"にも関わらず〜する"  ,"精神" ,"項目" ,"さし示す"  ,"意識的な"  ,"形式的な"  ,"発展" ,"得る"  ,"引く"  ,"電気の"  ,"メートル" ,"太陽の"  ,"信用"  ,"問題" 
			,"視覚" ,"脳"  ,"裁判官"  ,"権威"  ,"不景気" ,"文明"  ,"適切な"  ,"安い"  ,"絶えず" ,"導く" ,"青春時代"  ,"結果"  ,"印象" ,"限界"  ,"管理する"  ,"居住者"  ,"支配者" ,"動揺して"  ,"有害な"  ,"決心する"  ,"すばらしい"
			,"家庭内の"  ,"準備する"  ,"個性"  ,"エンジン" ,"おもしろい"  ,"胃"  ,"工業技術"  ,"祖先", "弱い"
			,"学者", "状況", "怖がった", "減少させる", "期間", "呼吸する", "いくぶん", "南極", "携帯式の", "失望した", "予言する", "文法",
			"脅威"
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
