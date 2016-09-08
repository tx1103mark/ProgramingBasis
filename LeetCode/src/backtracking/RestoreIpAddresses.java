package backtracking;

import java.util.ArrayList;
import java.util.List;

/*
 * 给一个由数字组成的字符串。求出其可能恢复为的所有IP地址。
 */
public class RestoreIpAddresses {

	public List<String> restoreIpAddresses(String s) {
        List<String> ret = new ArrayList<String>();
        // Bug 1: not length, but length().
        if (s == null || s.length() < 4 || s.length() > 12) {
            return ret;
        }
        
        dfs(s, new ArrayList<String>(), ret, 0);
        return ret;
    }
    
    public void dfs(String s, List<String> path, List<String> ret, int index) {
        // THE BASE CASE:
        int len = s.length();
        if (path.size() == 4) {
            // Create a solution.
            if (index == len) {
                StringBuilder sb = new StringBuilder();
                for (String str: path) {
                    sb.append(str);
                    sb.append(".");
                }
                sb.deleteCharAt(sb.length() - 1);
                
                // bug 3: forget this statement.
                ret.add(sb.toString());
            }
            
            return;
        }
        
        // 2/ 25 / 255
        // bug 2: i should < len.
        for (int i = index; i < index + 3 && i < len; i++) {
            String sub = s.substring(index, i + 1);
            if (s.charAt(index) == '0' && i != index) {
                // only allow 0, not 02, 022
                break;
            }
            
            if (!isValid(sub)) {
                continue;
            }
            
            path.add(sub);
            dfs(s, path, ret, i + 1);
            path.remove(path.size() - 1);
        }
    }
    public boolean isValid(String s) {
        int num = Integer.parseInt(s);
        return num >= 0 && num <= 255;
    }
    
    public static void main(String[] args) {
    	RestoreIpAddresses re=new RestoreIpAddresses();
    	System.out.println(re.restoreIpAddresses("25525511135"));
	}
}
