package OJ;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-01-14
 * Time: 1:30
 */
public class 截断句子 {
    public String truncateSentence(String s, int k) {
        String[] sentence = s.split(" ");
        StringBuffer ret = new StringBuffer();
        for(int i = 0; i < (k-1); i++){
            ret.append(sentence[i]);
            ret.append(" ");
        }
        ret.append(sentence[k-1]);
        return ret.toString();
    }
}
