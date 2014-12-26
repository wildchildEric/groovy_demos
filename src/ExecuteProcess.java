/**
 * Created by lizhe on 14/12/26.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExecuteProcess {
    public static void main(String[] args) {
        try {
            Process proc = Runtime.getRuntime().exec("svn help");
            BufferedReader result = new BufferedReader(
                    new InputStreamReader(proc.getInputStream())
            );
            String line;
            while ((line = result.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
