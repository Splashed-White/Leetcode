package Clock_in;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: TL
 * Date: 2022-01-09
 * Time: 2:52
 */
public class 按键持续时间最长的键 {
    /**
     设置变量maxChar指向字符，value指向当前差值，time存储最大差值，
     遍历数组更新变量，如果value>time，更新time，如果value=time。比较对应的字符

     */
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        char[] array = keysPressed.toCharArray();
        char maxChar = array[0];;
        int value = releaseTimes[0];
        int time = releaseTimes[0];
        for(int i = 1; i < releaseTimes.length; i++){
            char ch = array[i];
            value = releaseTimes[i] - releaseTimes[i-1];
            if(value > time){
                time = value;
                maxChar = ch;
            }else if(value == time){
                if((ch-'0') > (maxChar-'0')){
                    time = value;
                    maxChar = ch;
                }
            }
        }
        return maxChar;
    }
}
