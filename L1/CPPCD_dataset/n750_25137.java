import java.lang.*;
import java.io.*;
import java.util.*;

/*********************************************************************************
*	Benchmark driver program. 
*
*	Completely defines the experimental setup of the benchmark. Mostly format
*	episodic/continuing, online/batch/train&test.
*
*	TEMPLATE
*********************************************************************************/
public class main {

    public static void main(String[] args) throws IOException {
        int num_episodes = 1000;
        pipes_main.RL_init();
        RL_util.initStats(num_episodes);
        System.out.println("Beggining experiment!!!");
        for (int x = 0; x < num_episodes; x++) {
            pipes_main.RL_episode();
            System.out.print(".");
            RL_util.collectStats();
        }
        System.out.println();
        RL_util.endStats(num_episodes);
        pipes_main.RL_cleanup();
    }
}
