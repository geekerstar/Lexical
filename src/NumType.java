import java.util.Vector;

/**
 * @Author: Geekerstar(QQ : 247507792)
 * @Date: 2018/8/27 23:08
 * @Description:
 */
public class NumType {

    private static int numOfN = 0;
    private static Vector<String> nums = new Vector<String>();

    /**
     *
     */
    public NumType() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @return the numOfN
     */
    public static int getNumOfN() {
        return numOfN;
    }

    public static int findNum(String s) {
        return nums.indexOf(s);
    }

    public static void insertNum(String a) {
        nums.addElement(a);
        numOfN++;
    }
}
