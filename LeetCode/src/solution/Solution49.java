package solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.omg.CORBA.PUBLIC_MEMBER;

/*
49. Group Anagrams  QuestionEditorial Solution  My Submissions
Total Accepted: 85228
Total Submissions: 293447
Difficulty: Medium
Given an array of strings, group anagrams together.

For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"], 
Return:

[
  ["ate", "eat","tea"],
  ["nat","tan"],
  ["bat"]
]
*/



public class Solution49 {
	
	
	  public List<List<String>> groupAnagrams(String[] strs) {
		  List<List<String>> tst=new ArrayList<List<String>>();
		  for(int i=0;i<strs.length;i++){
			  boolean isContain=false;
			  for(List<String> he:tst){
				  if(hashEquals(he.get(0), strs[i])){
					  he.add(strs[i]);
					  isContain=true;
					  break;
				  }
			  }
			  if(!isContain){
				  List<String> newList=new ArrayList<String>();
				  newList.add(strs[i]);
				  tst.add(newList);
			  }
		  }
		  return tst;
			  
	  }
	  public boolean hashEquals(String s1,String s2){
		  //比较s1，s2 hashcode是否相等
		  int[] a=new int[256];
		  for(int i=0;i<s1.length();i++)
			  	a[s1.charAt(i)]++;
		  for(int i=0;i<s2.length();i++)
			  a[s2.charAt(i)]--;
		  for(int st:a)
			  if(st!=0)
				  return false;
		  return true;
	  }
	  public static void main(String[] args) {
		  Solution49 solution49=new Solution49();
	  String[] sts={"incentive","countersink","pickaxing","explicit","unethical","seoul","gyrates","dismounting","dartboard","socialism","sissiest","radiotherapist","sprawl","hems","raggedier","conscripted","repealed","implanted","coverage","traitorous","barmaid","pointier","huntress","summers","finnish","mouthed","mamore","lemur","osteoporosis","frowziest","sop","comical","speedup","oasis","peon","testers","stances","chuckles","childes","consensuses","rastafarian","battlement","christies","urbanized","penitence","replenishment","disperse","kibosh","combatting","repealing","guise","grassiest","grafts","waddle","pigsties","moneymaking","polite","reprogramming","audaciously","gorier","blaze","yaqui","racially","inc","reupholstering","fez","lemaitre","nineties","pedal","deferred","tranquil","surveyor","narrow","hopper","solemnize","federate","trisecting","cravat","lille","biography","land","jazzing","rhomboids","nudes","mundanely","greenbacks","chattel","deceleration","devoting","itemizing","routing","jukebox","passkey","infants","prerecorded","fuzzing","gandhi","roseate","bandit","prong","bowels","bounciest","misdeeds","unseemliness","emceed","later","hailed","crotchet","steepness","jot","improves","eucharistic","natalia","exalt","performers","predictor","voyeurism","fedex","activate","crypt","magics","treats","viewed","chauffeur","ladybug","peppiest","seismic","microscopes","liners","wraps","footman","tape","daubers","aerial","sparer","politic","shamed","decal","ayrshire","ruggeder","washcloths","neurologists","singsong","kaitlin","conn","monopolizes","sunroof","zonked","overall","celsius","fins","caparison","imus","enfranchises","microns","promulgates","aspartame","fails","decamps","spiciness","impieties","starring","receded","skying","suetonius","pornographers","intellectualized","truckled","abdications","openness","principally","sellers","complaining","jeopardizing","concerto","fibula","cliffs","aorta","inhale","transgressions","copywriter","understands","coccis","disperses","fraying","strengths","macaulay","mitigation","competences","ides","linked","tawnier","hallucinate","dairymen","puffier","matchless","wheeling","drily","nephews","clandestinely","tsingtao","disarraying","headier","experts","yippee","repellent","tributary","clannish","dumpsters","genealogies","ballooned","denouements","hymned","length","sasses","uncontrollably","fortune","wastefully","overproducing","sickening","headboard","burrs","prohibits","keogh","outs","lamer","repressed","rowdyism","transgressed","euros","amenity","garfunkel","rather","noseys","lampoons","raja","impermanence","heaters","shakespeareans","judiciaries","tweaked","extrapolations","succeeded","jowls","vociferation","roadways","herb","inactivity","registrars","checks","deservedly","heehaws","apologetics","fatness","aced","promote","atriums","deidre","redound","litterbug","barehanded","scheduled","flakiest","twirler","graduated","coccus","gadfly","unforeseeable","emendation","woodsman","wiriest","tangelo","weakening","intimidating","sternness","reiteration","wicca","heresies","inches","encodes","sidebar","starking","wastelands","pepsi","emigrate","stuttgart","shindigs","pansy","chintzy","limbo","disbarred","gallivant","hallmarked","respiratory","eminences","unabated","affirms","twinned","wordiness","installing","donn","westerly","interfaces","benton","mussy","identical","sulfates","starvings","woodwork","hyphenated","catechizing","transition","dramatist","demilitarize","buber","spoonful","laconic","undervaluing","inestimably","severer","improvidence","stoneware","cholera","peru","rearm","recluses","diaz","tablespoonsful","sandals","cinderella","insubordination","sires","stern","jeremiah","snowbound","ramifies","lexicographer","skimpiest","predetermining","lapidary","dentists","upbeats","marketplace","ploughs","esteem","miserably","overreaction","unlikelihood","kinswoman","averts","remonstrating","asinine","amortize","wasps","coal","tenderfoot","subplot","coyotes","sauntering","rices","fraughts","decoded","millipedes","knocking","homework","furor","expansionists","j","emergency","sharon","provisoes","president","assuaging","curtail","indigestion","liming","cryptozoic","auguring","indenture","magisterially","groped","ensue","steaming","mutinous","incomplete","yuletide","nomenclatures","hundredth","jimmies","irk","common","wetly","volley","summary","obsequies","granola","forests","allege","informal","shapeless","earplugs","disunite","insinuations","junked","riverbeds","georgian","brushed","sequenced","bucketfuls","spiel","humors","screwed","capitulating","downturns","intimidates","refueling","mingled","arisen","dragnet","aftereffects","practised","obduracy","canon","penning","inflammatory","wisher","actuate","kari","actuating","reupholstered","successes","inborn","canvasbacks","incapacitated","aristocratic","britt","lazying","hymnals","tyroes","tamper","graduate","franc","seasons","pompom","throeing","deviate","leveling","inaccurate","impaling","trouping","restoring","deduces","perforating","artie","alleghenies","crusader","rosemary","chastest","educational","caveatting","ablest","doorstepped","strange","eccentricities","sublimity","afire","humbugging","jots","ordinary","foyer","kayak","snake","wheal","dispensations","transponders","zing","pit","meowing","improved","crowd","nonfatal","epsilon","nodding","cyclones","imbibed","rebroadcasting","quibbles","moisturizes","zippy","braille","visaing","abetters","lurked","snafus","moppet","lemon","wifeliest","stuarts","boyish","reapportion","kneecaps","stymying","villagers","obscenity","bumble","zeroing","objectionably","connolly","memorial","clanging","gallstones","dibbled","outlasting","mendez","reproaching","antagonized","sisterhoods","hunchbacks","superimposed","siphon","professionally","spermicides","lebanon","facing","pierces","philosophically","mcdowell","rotated","tic","correspondents","nonplussed","litchi","ascots","millennial","booked","immunize","prefabricate","spumoni","odyssey","fey","bunched","olen","regularizing","superconductors","aside","infirmary","allaying","saturdays","caucasian","doreen","france","speeding","wretched","slovakia","chiselled","peseta","tho","gales","loincloths","shock","readers","boarder","entryway","toning","transitively","preponderances","internships","rating","pelleting","audition","amusement","theed","cocked","toddler","rusty","kinfolk","frames","gorgonzola","overrate","lightweight","bayous","populists","insensible","bandoliers","travelogs","tactically","weatherproofs","sleigh","develops","oxygenate","relaid","mimi","wheezier","chill","salween","theatre","vitalizes","nun","olives","offings","tricycling","tipper","kindly","bellies","sixteenths","ganglia","recombining","eastward","minestrone","fairgrounds","undelivered","scapula","breadth","groupie","ophelia","adrenaline","dork","autographing","watersides","sent","socks","somnolence","systematize","signings","rachmaninoff","santa","snacks","leno","spurs","heliotropes","silenced","roundhouses","illegitimacy","hedgehog","wet","depressed","eris","pure","pouncing","obtuseness","caulk","openly","kerosene","grille","buccaneers","oar","modals","playacts","shroud","plowshares","iciness","retort","jaunt","identities","mellower","redesigning","molest","forlorner","guacamole","cohan","refocus","dossier","interrogating","cants","diligence","stomps","enjoy","awe","loggerhead","csonka","inversions","den","lunged","alkaid","palming","delivers","proprietorship","groveler","choreographs","instals","merton","cyclops","augmentation","manipulated","nasal","trousseaux","critiques","arenas","stale","suspect","behoove","propose","cellulite","purification","leah","polestar","potato","gladlier","sunders","entreat","herbalist","filthier","skinflints","asseverating","insulted","mildly","modulate","charges","libyans","weekended","rodeos","allegedly","tarawa","valedictorians","spacy","spontaneously","yore","classify","centigrade","videoing","airdropping","dejection","pierce","imagined","isabel","reiterates","blazing","stuck","deceasing","netherlands","citric","tormented","monotoning","bestowals","betrayals","adoptions","scrolls","sex","idol","whaler","telephotos","conjugation","abductions","bundestag","disruptions","nouakchott","stuffiest","goodly","dissatisfying","anglicize","flowing","identifying","depots","stoicism","thessalonian","hundred","whetstone","defroster","headwaiter","feisty","inhibited","reamed","demonstrator","accursed","hector","interchanges","erotically","sportscaster","gentlewomen","teabag","smelts","disorganization","conveniently","maugham","hatchery","regards","arguably","govern","boulevards","niches","gristlier","obtrude","catharses","throughway","stoppered","drinkers","indeterminacy","vacuums","plainest","acuff","eases","defined","splurge","severing","griddles","thermoplastics","dilution","vinegary","straights","testament","sticks","shanghai","childproofing","clobbers","taco","castro","arrests","fetter","discomposing","timbres","wondrous","pullmans","amusements","telephonic","manning","inhabiting","finery","admires","defensively","fiord","incriminate","oust","collapse","deliquescent","bulwark","consciousness","roguery","beefburger","amounted","pheasants","archdioceses","vote","gujarati","forwards","waggling","tanned","liberalization","chap","finishing","catawba","anus","farina","butterflying","folks","crumple","criticize","unswerving","snack","gentrification","enthroning","drearies","marietta","farley","recede","incise","electrodes","dirac","corn","livest","coughs","noreen","rapscallion","codeine","acidly","confiscates","dislikes","administrators","valid","prep","legated","wherewithal","subjugating","wallabies","boning","creakiest","erotica","neophytes","drowses","bushmen","basis","regattas","melancholy","clubfeet","there","generalized","rotunding","condone","hemlines","bantered","vertebral","ruby","companions","postmarked","aping","finalized","prado","mutilations","partied","isiah","desk","calcines","agreeing","bode","cygnet","downsizing","naiads","preambled","recife","randall","gillespie","convalescent","victories","obsessed","leaders","strips","parmesan","germicide","clarion","pictograph","nutshells","bungalows","hagged","colosseum","ferraro","recapitulations","labored","acrostic","dynamics","bucked","betaking","pragmatically","gobbed","glossy","congresses","rewindable","trout","renovates","mattered","davenport","stenographer","nudism","deduced","unattributed","equally","wrestled","sequoia","measurable","lamb","babe","concourses","creamer","fascination","steroids","deplaned","germinated","progressed","swashbuckling","pools","officemax","brewers","banjul","thong","periodic","grub","typescript","lemurs","excreta","seeps","clearinghouses","isolating","particularized","thallium","waistcoat","misread","extensiveness","violations","insistent","zany","newses","predominate","enunciating","ultras","burlap","dowelled","elision","person","minneapolis","edification","endued","asseverates","meeter","iceberg","mexican","end","wale","veronese","ida","earshot","tunnels","debuting"};
////		  for(String st:solution49.FullSort("eat".toCharArray(), 0, new ArrayList<String>()))
////				  System.out.println(st);
		for(List<String> st:solution49.groupAnagrams(sts))
			System.out.println(st.toString());
		  
	  }
}
