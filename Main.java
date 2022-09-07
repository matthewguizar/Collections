import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(10);
        nums.add(5);
        nums.add(8);
        nums.add(2);
        nums.add(3);

        // Collections.reverse(nums);

        // System.out.println("Minimum: "+ Collections.min(nums));
        // System.out.println("Maximum: "+ Collections.max(nums));

        
        // System.out.println("Normal: " + nums);
        // System.out.print("Shuffle: ");
        // Collections.shuffle(nums);
        // System.out.println(nums);

        // int distance = 5;
        // Collections.rotate(nums, distance);
        // System.out.println("rotated by " + distance + ": " + nums);

        Collections.replaceAll(nums, 1, 69);
        System.out.println(nums);
    }
}