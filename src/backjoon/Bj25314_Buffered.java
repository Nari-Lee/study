package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Bj25314_Buffered {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out)))
        {
            int input1 = Integer.parseInt(reader.readLine());
            ArrayList<Integer> sums = new ArrayList<>();

            for (int i = 0; i < input1; i++) {
                String[] inputs = reader.readLine().split(" ");
                int input2 = Integer.parseInt(inputs[0]);
                int input3 = Integer.parseInt(inputs[1]);
                sums.add(input2 + input3);
            }

            for (int sum : sums) {
                writer.write(sum + "\n");
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();;
        }
    }
}
